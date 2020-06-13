/*  
* Generated Code AIOT
* Model : uno
* Type  : arduino
* 
* If you are using another board than ESP32 wrover
* and you are using a significant number of channels
* and or servers, please assert that your board 
* has enough memory to support it during runtime.
*/
 
 
// library is needed to load JSON data
#include <ArduinoJson.h>
// setup requires SD card
#include "SD.h"
 
// configuration file
File file;
StaticJsonDocument<60> configJsonFile;
 
// used to verify whether the device booted correctly 
bool booted = false; 
 
 
bool init_SD_card () {
	SPI.begin(14, 56, 76, 8);
	if (!SD.begin(-1)) {
		return false;
	}
	return load_configurations();
}
 
String convertIntArrayToString(int array[]){
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
 
struct humidityTuple {
	int tuple[1];
};
 
struct humidityTuple get_humidity(){
	struct humidityTuple tbl;
	tbl.tuple[0] = analogRead(0);
	return tbl;
}
 
void setup () {
 
	if (init_SD_card()) {
		booted = true;
		unsigned int baudRate = configJsonFile["serial"]["baud"];
		Serial.begin(baudRate);
		delay(1);
		
		pinMode(1, OUTPUT);
		
		
	}
}
 
void loop () {
	if (booted){
 
		humidityTuple x = get_humidity();
		transmitSerial(convertIntArrayToString(x.tuple));
		 
	}
}
