package org.xtext.mdsd.arduino.boardgenerator.generator

import org.xtext.mdsd.arduino.boardgenerator.ioT.Board
import org.xtext.mdsd.arduino.boardgenerator.ioT.Channel
import org.xtext.mdsd.arduino.boardgenerator.ioT.WifiConfig
import org.xtext.mdsd.arduino.boardgenerator.ioT.ChannelConfig
import com.google.inject.Inject
import java.util.List
import org.xtext.mdsd.arduino.boardgenerator.typeChecker.TypeChecker
import org.xtext.mdsd.arduino.boardgenerator.validation.Boards
import org.xtext.mdsd.arduino.boardgenerator.ioT.Wifi
import org.xtext.mdsd.arduino.boardgenerator.ioT.MqttClient
import java.util.HashMap
import org.xtext.mdsd.arduino.boardgenerator.ioT.Sensor
import java.util.HashSet
import org.xtext.mdsd.arduino.boardgenerator.ioT.Serial
import org.xtext.mdsd.arduino.boardgenerator.ioT.Frequency
import org.xtext.mdsd.arduino.boardgenerator.ioT.Command
import org.xtext.mdsd.arduino.boardgenerator.ioT.SensorOutput
import org.xtext.mdsd.arduino.boardgenerator.ioT.ExternalSensor
import org.xtext.mdsd.arduino.boardgenerator.ioT.SensorType
import org.xtext.mdsd.arduino.boardgenerator.ioT.Function
import org.xtext.mdsd.arduino.boardgenerator.ioT.FunctionInputType
import org.xtext.mdsd.arduino.boardgenerator.ioT.External
import org.xtext.mdsd.arduino.boardgenerator.ioT.SensorVariables
import org.xtext.mdsd.arduino.boardgenerator.ioT.Map 
import org.xtext.mdsd.arduino.boardgenerator.ioT.Expression
import org.xtext.mdsd.arduino.boardgenerator.ioT.Window
import org.xtext.mdsd.arduino.boardgenerator.ioT.ExecutePipeline
import org.xtext.mdsd.arduino.boardgenerator.ioT.Mean
import org.xtext.mdsd.arduino.boardgenerator.ioT.Median
import org.xtext.mdsd.arduino.boardgenerator.ioT.Min
import org.xtext.mdsd.arduino.boardgenerator.ioT.Max

class BoardCodeGenerator {  
	
	@Inject
	extension GeneratorUtils 
	
	@Inject
	extension ExpressionParser
	 
	@Inject 
	TypeChecker typeChecker 
	
	HashMap<Channel, String> env;
	HashMap<String, Window> windows; 
		 
	def String generateBoardCode(Board board, List<Channel> channels, int configLength, int embeddedSensorsLength){
		env = new HashMap<Channel, String>();
		windows = new HashMap<String, Window>();
		val globalChannels = newArrayList();
		val sensors = board.boardSensors
		sensors.forEach[s|s.output.toList.uniqueChannelsFromSensorOutput.toList.forEach[c | globalChannels.add(c)]]
		var globalUniqueChannels = new HashSet<Channel>(globalChannels);
		val frequencySensors = sensors.getSensorsSampleByFrequency
		val commandSensors = sensors.getSensorsSampleByCommand 
		val externals = board.getExternalsInBoard
		
		val sampleLoop = sensors.generateLoop
		'''
		«IF board.wifiSelect !== null»
		#include <WiFi.h>
		«ENDIF»
		 
		// library is needed to load JSON data
		#include <ArduinoJson.h>
		«IF channels.getIfMQTTChannelImplemented»
		 
		// includes PubSubClient library for MQTT
		#include <PubSubClient.h>
		 
		«ENDIF»
		«IF embeddedSensorsLength > 0»
		// the sensor manager includes code for interacting with embedded sensors
		#include "src/sensor_manager.h"
		 
		«ENDIF»
		// setup requires SD card
		#include "SD.h"
		 
		// configuration file
		File file;
		StaticJsonDocument<«configLength+10»> configJsonFile;
		«IF frequencySensors.length > 0»
		 
		// system time function   
		#define milliseconds()(millis())
		 
		double systemTime = 0.0;
		«ENDIF»
		 
		// used to verify whether the device booted correctly 
		bool booted = false; 
		 
		«FOR sensor : frequencySensors»
		const double «sensor.name»UpdateTimer = «(sensor.sampler as Frequency).frequency.toString»;
		double «sensor.name»LastUpdate = 0.0;
		 
		«ENDFOR»
		«FOR sensor : commandSensors»
		String «sensor.name»Command = "«(sensor.sampler as Command).command.toString»";
		 
		«ENDFOR»
		«channels.generateInitChannels»
		«board.generateInitializeSDCard»
		 
		«IF sensors.anySensorExternal»
		String convertIntArrayToString(int array[]){
			char message[(sizeof(array)*2)];
			for (int i = 0; i < sizeof(array); i++){
				message[i] = (char) array[i];
				message[i+1] = ',';
			}
			return (String) message;
		}
		«ENDIF»
		«IF embeddedSensorsLength > 0»
		String convertFloatArrayToString(float array[]){
			char message[(sizeof(array)*2)];
			for (int i = 0; i < sizeof(array); i++){
				message[i] = (char) array[i];
				message[i+1] = ',';
			}
			return (String) message;
		}
		«ENDIF»
		«generateLoadConfigurationFile»
		 
		«board.wifiSelect?.generateInitializeWifi»
		 
		«FOR key : env.keySet()»
			«env.get(key)»
			 
		«ENDFOR»
		«FOR s : windows.keySet()»
		«s.generateWindowFunctions(windows.get(s))»
		 
		«ENDFOR»
		«globalUniqueChannels.generateTransferFunctions»
		«sensors.generateExternalSensorsGet»
		«externals.toList.generateExternalFunctions»
		void setup () {
		 
			if (init_SD_card()) {
				booted = true;
				«channels.getSerialBegin»
				
				«sensors.initExternalSensors»
				
				«IF board.wifiSelect !== null»
				init_wifi();
				«ENDIF»
				
				«env.keySet().toList.generateInitConnectChannels»
			}
		}
		 
		void loop () {
			if (booted){
				«IF commandSensors.length > 0»
				// read the incoming data as string
				String command = Serial.readString(); 
				command.remove(command.length()-1, 1);
				«ENDIF»
		 
				«IF frequencySensors.length > 0»
				systemTime = milliseconds();
				
				«ENDIF»
				«sampleLoop»
			}
		}
		''' 
	}    
	
	 def String getExecuteFunction(ExecutePipeline pipe, String type, String name){
	 	switch (pipe){ 
	 		Mean: {return '''
	 				float sum = 0;
	 				for (int i = 0; i < sizeof(«name»WindowArray); i++){
	 					sum += «name»WindowArray[i];
	 				}
	 				return sum/sizeof(«name»WindowArray);'''
	 		}
	 		Median: {
	 			return '''
	 			int median = (sizeof(«name»WindowArray)/2)+0.5;
	 			return «name»WindowArray[median];
	 			'''
	 		}
	 		Min: {
	 			return '''
	 				float minimal = 999999.0;
	 				for (int i = 0; i < sizeof(«name»WindowArray); i++){
	 					if («name»WindowArray[i] < minimal){
	 						minimal = «name»WindowArray[i];
	 					}	
	 				}
	 				return minimal;'''
	 		} 
	 		Max: {
	 			return '''
	 				float maximal = 0.0;
	 				for (int i = 0; i < sizeof(«name»WindowArray); i++){
	 					if («name»WindowArray[i] > maximal){
	 						maximal = «name»WindowArray[i];
	 					}
	 				}
	 				return maximal;'''
	 		} 
	 	}
	 }
	    
   	def String insertValuesIntoWindow(String type, String name, int width){
   		if (type.toLowerCase.contains('tuple')){
   			return '''
   			for (int i = 0; i < sizeof(data.tuple); i++){
   				«name»WindowArray[«name»WindowOldestIndex] = data.tuple[i];
   				«name»WindowOldestIndex += 1;
   				if («name»WindowOldestIndex >= «width»-1){
   					«name»WindowOldestIndex = 0;
   				}
   			}''' 
			}	     
   					
   		'''
   		«name»WindowArray[«name»WindowOldestIndex] = data;
   		«name»WindowOldestIndex += 1;
   		
   		if («name»WindowOldestIndex >= «width»-1){
   			«name»WindowOldestIndex = 0;
   		}'''
   	}
	
	def String generateWindowFunctions(String nameAndType, Window window){
		var nAt = nameAndType.split(',')
		var name = nAt.get(0) 
		var type = nAt.get(1)  
		'''
		float «name»WindowArray[«window.width»];
		int «name»WindowOldestIndex = 0;
		float «name»(«type» data){
			«type.insertValuesIntoWindow(name, window.width)»
			«window.execute.getExecuteFunction(type, name)»
		}''' 
	}      
	
	def String getFunctionInput(Function function){
		var input = ""
		var counter = 0
		for (FunctionInputType inp : function.input){
			
			if (inp.name == 'num')
				input += "float x"+counter.toString+", "
			if (inp.name == 'str')
				input += "String x"+counter.toString+", "
			if (inp.name == 'bool')
				input += "bool x"+counter.toString+", "
			counter+=1
		} 
		input.substring(0, input.length-2)  
	}
	   
	def String generateExternalFunctions(List<External> externals){
		'''
		«FOR external : externals»
		struct «external.function.name»Tuple {
			float tuple[«external.function.output.size»];
		};
		
		struct «external.function.name»Tuple «external.function.name»(«external.function.functionInput»){
			// REQUIRES IMPLEMENTATION OR RETURNS EMPTY STRUCT
			struct «external.function.name»Tuple tbl;
			return tbl;
		}
		«ENDFOR»
		'''
	}
	 
	def String generateExternalSensorsGet(List<Sensor> sensors){
		'''«FOR sensor : sensors»
		«IF sensor.sensortype instanceof ExternalSensor»
		struct «sensor.name»Tuple {
			int tuple[«(sensor.sensortype as ExternalSensor).pins.size»];
		};
		 
		struct «sensor.name»Tuple get_«sensor.name»(){
			struct «sensor.name»Tuple tbl;
			«FOR i : (sensor.sensortype as ExternalSensor).pins»
			tbl.tuple[«(sensor.sensortype as ExternalSensor).pins.indexOf(i)»] = analogRead(«i»);
			«ENDFOR»
			return tbl;
		}
		 
		«ENDIF»
		«ENDFOR»'''
	}   
	 
	def String initExternalSensors(List<Sensor> sensors){ 
		var initStr = ""
		for (Sensor sensor : sensors){
			if(sensor.sensortype instanceof ExternalSensor){
				initStr += 	'''
							pinMode(«sensor.vcc.toString», OUTPUT);
							digitalWrite(«sensor.vcc.toString», HIGH);
							'''
			}
		}  
		initStr
	} 
	
	 
	def String generateLoop(List<Sensor> sensors){
		'''
		«FOR sensor : sensors»
		«sensor.generateSensorDataSample»
		 
		«ENDFOR»
		'''
	}   
	
	def String executePipeline(List<SensorOutput> sensorOutputs, SensorType sensor, String sensorName, String varId, SensorVariables vars){
		val env = new HashMap<String, String>()
		vars.ids.forEach[v | v.name != "_" ? env.put(v.name, varId+".tuple["+vars.ids.indexOf(v)+"]") ]
		
		var pipeStr = newArrayList() 
		var prevIdentifier = varId
		var externalCounter = 0
		var mapCounter = 0 
		var lastIsExternal = false  
		var prevType = '''«sensorName»Tuple'''
		for (SensorOutput sensorOutput : sensorOutputs){
			var pipeline = sensorOutput.output.pipeline
	 		while (pipeline !== null){ 
	 			switch (pipeline){ 
	 				Window: {
	 					pipeStr.add('''float «sensorName»Window = «sensorName»«varId.toFirstUpper»Window(«prevIdentifier»);''')
	 					prevIdentifier = sensorName+"Window" 
	 					windows.put(sensorName+varId.toFirstUpper+"Window"+","+prevType, pipeline) 
	 					prevType = "float"
	 					lastIsExternal = false  
	 				}
	 				Map: {  
	 					var exp = pipeline.expression
	 					prevType = typeChecker.ctype(typeChecker.type(exp)) 
	 					env.put(pipeline.output.name, pipeline.output.name+varId.toFirstUpper+mapCounter.toString)
	 					pipeStr.add('''«typeChecker.ctype(typeChecker.type(exp))» «pipeline.output.name»«varId.toFirstUpper»«mapCounter» = «exp.getExpression(env)»;''')
	 					prevIdentifier = pipeline.output.name+varId.toFirstUpper+mapCounter.toString 
	 					mapCounter+=1  
	 					lastIsExternal = false
	 				}
	 				External: { 
	 					var externalInput = ""
	 					for (Expression exp : pipeline.input){
	 						externalInput += exp.getExpression(env).toString+", "
	 					}
	 					val outputs = pipeline.function.output
	 					for (String out : outputs){ 
	 						env.put(out.toString, "ex"+varId.toFirstUpper+externalCounter.toString+".tuple["+outputs.indexOf(out)+"]")
	 					} 
	 					prevType = pipeline.function.name+"Tuple"
	 					pipeStr.add('''«pipeline.function.name»Tuple ex«varId.toFirstUpper»«externalCounter.toString» = «pipeline.function.name»(«externalInput.substring(0, externalInput.length-2)»);''')
	 					prevIdentifier = "ex"+varId.toFirstUpper+externalCounter.toString
	 					externalCounter+=1
	 					lastIsExternal = true 
	 				} 
	 			}
				pipeline = pipeline.next	 			
	 		}  
		}  		 
		'''
		«sensorName»Tuple «varId» = get_«sensorName»();
		«FOR pipe : pipeStr»
		«pipe»
		«ENDFOR»
		«FOR chan : sensorOutputs.uniqueChannelsFromSensorOutput»
		«prevIdentifier.parseTransmit(lastIsExternal, sensor, chan.name.toFirstUpper, prevType)»
		«ENDFOR»'''  
	}   
	
	def String parseTransmit(String identifier, boolean lastIsExternal, SensorType sensor, String channelName, String type){
		var variable = identifier+".tuple" 
		if (type.toLowerCase.contains('tuple')){    
			variable = identifier+".tuple"
			return '''transmit«channelName»(«IF lastIsExternal»convertFloatArrayToString(«variable»)«ELSEIF sensor instanceof ExternalSensor»convertIntArrayToString(«variable»)«ELSE»convertFloatArrayToString(«variable»)«ENDIF»);'''
		}
		return '''transmit«channelName»(((String)«identifier»));'''
	}
	  
	def String generateSensorDataSample(Sensor sensor){		
		val sampler = sensor.sampler
		if (sampler !== null && sampler instanceof Frequency){
			return '''
					if (systemTime - «sensor.name»LastUpdate >= «sensor.name»UpdateTimer){
						
						«sensor.output.executePipeline(sensor.sensortype, sensor.name, sensor.vars.name, sensor.vars)»
						double timeTaken = milliseconds();
						«sensor.name»LastUpdate = timeTaken - (systemTime - timeTaken); 
					}'''
		} else if (sampler !== null && sampler instanceof Command){ 
			return '''
					if (command == «sensor.name»Command){
						
						«sensor.output.executePipeline(sensor.sensortype, sensor.name, sensor.vars.name, sensor.vars)»
					}'''
		} else {
			return '''«sensor.output.executePipeline(sensor.sensortype, sensor.name, sensor.vars.name, sensor.vars)»'''
		} 
	} 
	 
	def String generateTransferFunctions(HashSet<Channel> channels){ 
		'''
		«FOR channel : channels»
		«channel.correctTransferMethod»
		 
		«ENDFOR»
		'''
	} 
	
	def String getCorrectTransferMethod(Channel channel){
		val config = channel.config
		if (config instanceof Wifi || typeChecker.ifServerType(channel)) {
			return '''
			void transmit«channel.name.toFirstUpper»(String message){				
				connect«channel.name.toFirstUpper»();
				const char* route = configJsonFile["«channel.name»"]["route"];
				String header = "POST " + ((String)route) + " HTTP/1.1\r\nHost: " + get«channel.name.toFirstUpper»IPAddress().toString() +"\r\nConnection: close\r\nContent-Length: " + message.length() + "\r\nContent-Type: text/plain\r\n\r\n";
				«channel.name»Client.print(header);
				«channel.name»Client.write_P(message.c_str(), message.length());
			}
			'''
		} else if(channel instanceof MqttClient || typeChecker.ifMQTTType(channel)){
			return '''
			void transmit«channel.name.toFirstUpper»(String message){
				const char* topic = configJsonFile["«channel.name»"]["topic"];
				«channel.name»Client.publish(topic, message.c_str());
			}
			'''
		} else if(channel instanceof Serial || typeChecker.ifSerialType(channel)){
			return '''
			void transmit«channel.name.toFirstUpper»(String message){
				Serial.println(message);
			}
			'''
		}
		''''''
	}
	
	def String generateInitConnectChannels(List<Channel> env){
		'''
		«FOR channel : env»
		«channel.correctChannelFunctionCallOnInit»
		 
		«ENDFOR»
		'''
	}
	
	def boolean getIfMQTTChannelImplemented(List<Channel> channels){
		for (Channel channel : channels){
			if (typeChecker.ifMQTTType(channel))
				return true
		}
		false
	}
	
	def String getCorrectChannelFunctionCallOnInit(Channel channel){
		val config = channel.config
		if (config instanceof Wifi || typeChecker.ifServerType(channel)) {
			return '''connect«channel.name.toFirstUpper»();'''
		} else if(channel instanceof MqttClient || typeChecker.ifMQTTType(channel)){
			return '''
						const char*  «channel.name»Ip   = configJsonFile["«channel.name»"]["broker"];
						unsigned int «channel.name»Port = configJsonFile["«channel.name»"]["port"];
						«channel.name»Client.setServer(«channel.name»Ip, «channel.name»Port);
						connect«channel.name.toFirstUpper»();'''
		}
		''''''
	}    
	 
	def String generateInitChannels(List<Channel> channels){		
		'''
		«FOR channel : channels»
		«channel.initChannel»
		 
		«ENDFOR»
		'''
	} 
	
	def String initChannel(Channel channel){
		val config = channel.config
		if (config instanceof Wifi || typeChecker.ifServerType(channel)) {
			env.put(channel, 
			'''
			IPAddress get«channel.name.toFirstUpper»IPAddress(){
				const char* «channel.name»IpChar = configJsonFile["«channel.name»"]["ip"];
				String «channel.name»IpStr = (String) «channel.name»IpChar;
				int a = -1;
				int b = -1;
				int c = -1;
				int d = -1;
				int li = 0;
				
				for (int i = 0; i < «channel.name»IpStr.length(); i++) {
					if («channel.name»IpStr.substring(i, i+1) == ",") {
						if (a == -1) {
						    a = «channel.name»IpStr.substring(li, i).toInt();
							li = i;
						} else if (b == -1) {
							b = «channel.name»IpStr.substring(li, i).toInt();
							li = 1;
						} else if (c == -1) {
							c = «channel.name»IpStr.substring(li, i).toInt();
							d = «channel.name»IpStr.substring(i+1).toInt();
						}
				  }
				}
				
				IPAddress «channel.name»Ip(a, b, c, d);
				return «channel.name»Ip;
			}
			 
			void connect«channel.name.toFirstUpper»(){
				IPAddress «channel.name»Ip = get«channel.name.toFirstUpper»IPAddress();
				unsigned int «channel.name»Port  = configJsonFile["«channel.name»"]["port"];
				while(!«channel.name»Client.connected()){
					if («channel.name»Client.connect(«channel.name»Ip, «channel.name»Port)){
						break;
					}
					delay(500);
				}
			}
			''')  
			
			return ''' 
			WiFiClient «channel.name»Client;'''
		} else if(channel instanceof MqttClient || typeChecker.ifMQTTType(channel)){ 
			env.put(channel, 
			'''
			void connect«channel.name.toFirstUpper»(){
				while(!«channel.name»Client.connected()){
					const char* clientId = configJsonFile["«channel.name»"]["id"];
					if(«channel.name»Client.connect(clientId)){
						break;
					} 
					delay(500);
				}
			}
			''')
			return '''
			WiFiClient mqttWifiClient;
			PubSubClient «channel.name»Client(mqttWifiClient);'''
		}  
		'''''' 
	}
	
	def String getSerialBegin(List<Channel> channels){
		for (Channel channel : channels){
			if (typeChecker.ifSerialType(channel)){
				if (channel.config !== null){ 
					return '''
							unsigned int baudRate = configJsonFile["«channel.name»"]["baud"];
							Serial.begin(baudRate);
							delay(1);
							'''
				}
			}
		}   
		''''''		
	} 
	
	def String generateInitializeWifi(WifiConfig config){
		''' 
		void init_wifi() {
			// Establishing a connection to «config.name»-network
			const char* ssid = configJsonFile["wifi"]["ssid"];
			const char* pwd = configJsonFile["wifi"]["pass"];
			WiFi.begin(ssid, pwd);
			while(WiFi.status() != WL_CONNECTED){
				delay(500);
			}
		}
		'''
	}
	
	def String generateLoadConfigurationFile(){
		'''
		bool load_configurations() {
			
			// make sure to place the config file in the root folder
			file = SD.open("/config.json");
			
			if (file) {
				char content[file.size()];
				int i = 0;
				
				while (file.available()) {
					int currentByte = file.read();
					char character = (char) currentByte;
					
					content[i] = character;
					i += 1;
					
					if (currentByte == -1){
						break;
					}
				}
			
				if (deserializeJson(configJsonFile, content)) {
				    return false;
			  	}
			} 
			
			file.close();
			return true;
		}
		''' 
	}
	
	def String generateInitializeSDCard(Board board){ 
		val supportedBoard = Boards.getBoardSupported(board.boardVersion)
		
		'''
		bool init_SD_card () {
			SPI.begin(«supportedBoard.getSDMapping("sd_clk")», «supportedBoard.getSDMapping("sd_do")», «supportedBoard.getSDMapping("sd_di")», «supportedBoard.getSDMapping("sd_cs")»);
			if (!SD.begin(«supportedBoard.getSDMapping("sd_cs")»)) {
				return false;
			}
			return load_configurations();
		}
		'''
	}
}