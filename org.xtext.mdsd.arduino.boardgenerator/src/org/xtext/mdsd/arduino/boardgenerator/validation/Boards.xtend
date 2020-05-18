package org.xtext.mdsd.arduino.boardgenerator.validation;

import org.xtext.mdsd.arduino.boardgenerator.ioT.BoardVersion;
import java.util.Map
import java.util.Set

class Boards {
	
	String type
	String model
	Map<String, Integer> sensors

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
				case "wrover": sensors = SupportedBoards.WROVER
				default: sensors = null
			}
		} 
		
		this.type = type
		this.model = model
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
	
	// this is exactly the same as in the group project
	def int getVariableCount(String sensor){
		if (this.sensors === null) {
			-1
		} else {
			this.sensors.getOrDefault(sensor, -1)
		}
	}
	 
	override toString(){
		'''Board(«type»:«model»)'''
	}
	
}
