/*  
* Generated Code AIOT
* Model : wrover
* Type  : esp32
* 
* If you are using another board than ESP32 wrover
* and you are using a significant number of channels
* and or servers, please assert that your board 
* has enough memory to support it during runtime.
*
* Similarly, if you are using long and complicated
* pipelines, you should consider some memory management.
*/
 
#include <WiFi.h>
 
// library is needed to load JSON data
#include <ArduinoJson.h>
 
// includes PubSubClient library for MQTT
#include <PubSubClient.h>
 
// the sensor manager includes code for interacting with embedded sensors
#include "src/sensor_manager.h"
 
// setup requires SD card
#include "SD.h"
 
// configuration file
File file;
StaticJsonDocument<252> configJsonFile;
 
// system time function   
#define milliseconds()(millis())
 
double systemTime = 0.0;
 
// used to verify whether the device booted correctly 
bool booted = false; 
 
const double temperatureUpdateTimer = 10000;
double temperatureLastUpdate = 0.0; 
 
WiFiClient mqttWifiClient;
PubSubClient clientClient(mqttWifiClient);
 
 
bool init_SD_card () {
	SPI.begin(14, 2, 15, 13);
	if (!SD.begin(13)) {
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
 
void init_wifi() {
	// Establishing a connection to home-network
	const char* ssid = configJsonFile["wifi"]["ssid"];
	const char* pwd = configJsonFile["wifi"]["pass"];
	WiFi.begin(ssid, pwd);
	while(WiFi.status() != WL_CONNECTED){
		delay(500);
	}
}
 
void connectClient(){
	while(!clientClient.connected()){
		const char* clientId = configJsonFile["client"]["id"];
		if(clientClient.connect(clientId)){
			break;
		} 
		delay(500);
	}
}
 
void transmitClient(String message){
	const char* topic = configJsonFile["client"]["topic"];
	clientClient.publish(topic, message.c_str());
}
 
void transmitSerial(String message){
	Serial.println(message);
}
 
struct wearableTuple {
	int tuple[2];
};
 
struct wearableTuple get_wearable(){
	struct wearableTuple tbl;
	tbl.tuple[0] = analogRead(12);
	tbl.tuple[1] = analogRead(18);
	return tbl;
}
 
// EXTERNAL FUNCTION : BEGIN
struct processTuple {
	float tuple[2];
};

struct processTuple process(float x0, float x1, String x2){
	// REQUIRES IMPLEMENTATION OR RETURNS EMPTY STRUCT
	struct processTuple tbl;
	return tbl;
}
// EXTERNAL FUNCTION : END
// EXTERNAL FUNCTION : BEGIN
struct externalTuple {
	float tuple[1];
};

struct externalTuple external(float x0, bool x1){
	// REQUIRES IMPLEMENTATION OR RETURNS EMPTY STRUCT
	struct externalTuple tbl;
	return tbl;
}
// EXTERNAL FUNCTION : END
float wearableMWindowWindowArray[45];
int wearableMWindowWindowOldestIndex = 0;
float wearableMWindow(externalTuple data){
	for (int i = 0; i < sizeof(data.tuple); i++){
		wearableMWindowWindowArray[wearableMWindowWindowOldestIndex] = data.tuple[i];
		wearableMWindowWindowOldestIndex += 1;
		if (wearableMWindowWindowOldestIndex >= 45-1){
			wearableMWindowWindowOldestIndex = 0;
		}
	}
	float sum = 0;
	for (int i = 0; i < sizeof(wearableMWindowWindowArray); i++){
		sum += wearableMWindowWindowArray[i];
	}
	return sum/sizeof(wearableMWindowWindowArray);
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
		
		pinMode(0, OUTPUT);
		digitalWrite(0, HIGH);
		
		init_wifi();
		
		const char*  clientIp   = configJsonFile["client"]["broker"];
		unsigned int clientPort = configJsonFile["client"]["port"];
		clientClient.setServer(clientIp, clientPort);
		connectClient();
		 
	}
}
 
void loop () {
	if (booted){
 
		systemTime = milliseconds();
		
		wearableTuple m = get_wearable();
		externalTuple exM0 = external(m.tuple[0]+m.tuple[1], m.tuple[0]>m.tuple[1]);
		float wearableWindow = wearableMWindow(exM0);
		transmitClient(((String)wearableWindow));
		 
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
		 
		humidityTuple x = get_humidity();
		processTuple exX0 = process(x.tuple[0], x.tuple[1], "test");
		bool jX0 = exX0.tuple[0]+exX0.tuple[1]>100;
		transmitClient(((String)jX0));
		 
	}
}
