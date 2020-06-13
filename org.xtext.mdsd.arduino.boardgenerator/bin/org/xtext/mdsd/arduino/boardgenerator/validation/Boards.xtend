package org.xtext.mdsd.arduino.boardgenerator.validation;

import org.xtext.mdsd.arduino.boardgenerator.ioT.BoardVersion;
import java.util.Map
import java.util.Set
import java.util.List

class Boards {
	
	String type
	String model
	Map<String, Integer> sensors
	Map<String, String>  info
	Map<String, Integer> sd

	def static getBoardSupported(BoardVersion board) {
		if (board === null){ 
			return getBoardSupported("", "") 
		}
		getBoardSupported(board.type, board.model) 
	}
	
	def static getBoardSupported(String type, String model) {
		new Boards(type, model)
	}
	
	new (String type, String model) {
		
		if (type.toLowerCase() == "esp32"){
			 
			switch (model.toLowerCase()){
				case "wrover":{
					sensors = SupportedBoards.WROVER
					info = SupportedBoards.WROVER_INFO				
					sd = SDParams.WROVER	 
				}  
				default: {
					sensors = null
					sd = null
					info = null	
				}
			}
		} 
		
		this.type = type
		this.model = model
	}
	 
	def List<Integer> getSDParameters(){
		this.sd?.values.toList
	}
	
	def Set<String> getSensors(){
		this.sensors?.keySet
	}
	
	def boolean supportsSensor(String sensor){
		var sensors = getSensors()
		if (sensors !== null){
			if(sensors.contains(sensor)){
				return true
			}
		} 
		false
	}  
	
	def int getSDMapping(String param){
		if (this.sd === null) {
			-1 
		} else {
			this.sd.getOrDefault(param, -1)
		}
	}
	
	// this is exactly the same as in the group project
	def int getVariableCount(String sensor){
		if (this.sensors === null) {
			-1
		} else {
			this.sensors.getOrDefault(sensor, -1)
		}
	}
	 
	def boolean isNull(){
		if (sd === null && sensors === null){
			return true
		}
		false
	}
	
	def String infoMessage(){
		var _info = ""
		for (String key : info.keySet){
			_info += key+":"+info.get(key).toString+", "
		}
		_info.substring(0, _info.length()-2) 
	} 
	 
	override toString(){
		'''Board(«type»:«model»)'''
	}
	
}
