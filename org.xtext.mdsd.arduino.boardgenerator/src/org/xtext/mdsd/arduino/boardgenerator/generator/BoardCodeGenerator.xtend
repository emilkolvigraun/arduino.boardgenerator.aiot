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

class BoardCodeGenerator { 
	
	@Inject
	extension GeneratorUtils 
	 
	@Inject 
	TypeChecker typeChecker 
		
	def String generateBoardCode(Board board, List<Channel> channels, int configLength, int embeddedSensorsLength){
		var env = new HashMap<Channel, String>();
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
		 
		// used to verify whether the device booted correctly 
		bool booted = false;
		 
		«channels.generateInitChannels(env)»
		«board.generateInitializeSDCard»
		 
		«generateLoadConfigurationFile»
		 
		«board.wifiSelect?.generateInitializeWifi»
		 
		«env.generateChannelsConnect»
		void setup () {
		 
			if (init_SD_card()) {
				booted = true;
				«channels.getSerialBegin»
				
				«IF board.wifiSelect !== null»
				init_wifi();
				«ENDIF»
				
				«env.keySet().toList.generateInitConnectChannels»
			}
		}
		 
		void loop () {
			«board.boardSensors.generateLoop(env)»
		}
		''' 
	}   
	
	def String generateLoop(List<Sensor> sensors, HashMap<Channel, String> env){
		for (Sensor s : sensors){
			System.out.println(s.output.toString)
		}
		
		''''''
	}
	
	def String generateChannelsConnect(HashMap<Channel, String> env){
		'''
		«FOR key : env.keySet()»
			«env.get(key)»
			 
		«ENDFOR»
		'''
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
	 
	def String generateInitChannels(List<Channel> channels, HashMap<Channel, String> env){		
		'''
		«FOR channel : channels»
		«channel.initChannel(env)»
		 
		«ENDFOR»
		'''
	} 
	
	def String initChannel(Channel channel, HashMap<Channel, String> env){
		val config = channel.config
		if (config instanceof Wifi || typeChecker.ifServerType(channel)) {
			env.put(channel, 
			'''
			void connect«channel.name.toFirstUpper»(){
				while(!«channel.name»Client.connected()){
					unsigned int «channel.name»Port  = configJsonFile["«channel.name»"]["port"];
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