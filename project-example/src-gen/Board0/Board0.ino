/*  
* Generated Code AIOT
* Model : wrover
* Type  : esp32
* 
* If you are using another board than ESP32 wrover
* and you are using a significant number of channels
* and or servers, please assert that your board 
* has enough memory to support it during runtime.
*/
 
 
// library is needed to load JSON data
#include <ArduinoJson.h>
// the sensor manager includes code for interacting with embedded sensors
#include "src/sensor_manager.h"
 
// setup requires SD card
#include "SD.h"
 
// configuration file
File file;
StaticJsonDocument<60> configJsonFile;
 
// system time function   
#define milliseconds()(millis())
 
double systemTime = 0.0;
 
// used to verify whether the device booted correctly 
bool booted = false; 
 
const double temperatureUpdateTimer = 10000;
double temperatureLastUpdate = 0.0; 
 
String humidityCommand = "ON";
 
 
bool init_SD_card () {
	SPI.begin(14, 2, 15, 13);
	if (!SD.begin(13)) {
		return false;
	}
	return load_configurations();
}
 
String convertFloatArrayToString(float array[]){
	char message[(sizeof(array)*2)];
	for (int i = 0; i < sizeof(array); i++){
		message[i] = (char) array[i];
		message[i+1] = ',';
	}
	return (String) message;
}
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
 
 
void transmitSerial(String message){
	Serial.println(message);
}
 
float lightLWindowWindowArray[10];
int lightLWindowWindowOldestIndex = 0;
float lightLWindow(lightTuple data){
	for (int i = 0; i < sizeof(data.tuple); i++){
		lightLWindowWindowArray[lightLWindowWindowOldestIndex] = data.tuple[i];
		lightLWindowWindowOldestIndex += 1;
		if (lightLWindowWindowOldestIndex >= 10-1){
			lightLWindowWindowOldestIndex = 0;
		}
	}
	float sum = 0;
	for (int i = 0; i < sizeof(lightLWindowWindowArray); i++){
		sum += lightLWindowWindowArray[i];
	}
	return sum/sizeof(lightLWindowWindowArray);
}
 
void setup () {
 
	if (init_SD_card()) {
		booted = true;
		unsigned int baudRate = configJsonFile["serial"]["baud"];
		Serial.begin(baudRate);
		delay(1);
		
		
		
	}
}
 
void loop () {
	if (booted){
		// read the incoming data as string
		String command = Serial.readString(); 
		command.remove(command.length()-1, 1);
 
		systemTime = milliseconds();
		
		lightTuple l = get_light();
		float lightWindow = lightLWindow(l);
		transmitSerial(((String)lightWindow));
		 
		if (systemTime - temperatureLastUpdate >= temperatureUpdateTimer){
			
			temperatureTuple k = get_temperature();
			float oK0 = k.tuple[0]<1?k.tuple[0]:k.tuple[0]+1;
			transmitSerial(((String)oK0));
			double timeTaken = milliseconds();
			temperatureLastUpdate = timeTaken - (systemTime - timeTaken); 
		}
		 
		if (command == humidityCommand){
			
			humidityTuple x = get_humidity();
			transmitSerial(convertFloatArrayToString(x.tuple));
		}
		 
	}
}
