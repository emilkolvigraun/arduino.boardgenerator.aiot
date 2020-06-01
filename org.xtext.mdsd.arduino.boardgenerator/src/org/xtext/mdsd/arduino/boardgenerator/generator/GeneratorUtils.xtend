package org.xtext.mdsd.arduino.boardgenerator.generator

import org.xtext.mdsd.arduino.boardgenerator.ioT.Board
import org.xtext.mdsd.arduino.boardgenerator.ioT.NewBoard
import org.xtext.mdsd.arduino.boardgenerator.ioT.ExtendsBoard
import org.xtext.mdsd.arduino.boardgenerator.ioT.BoardVersion
import org.eclipse.emf.ecore.util.EcoreUtil
import org.xtext.mdsd.arduino.boardgenerator.ioT.Channel
import org.eclipse.emf.ecore.EObject
import java.util.List
import org.xtext.mdsd.arduino.boardgenerator.ioT.Sensor
import org.xtext.mdsd.arduino.boardgenerator.ioT.impl.SensorImpl
import org.xtext.mdsd.arduino.boardgenerator.ioT.impl.SensorOutputImpl
import java.util.Set
import java.util.HashSet
import org.xtext.mdsd.arduino.boardgenerator.ioT.StopChar
import org.xtext.mdsd.arduino.boardgenerator.ioT.Serial
import org.xtext.mdsd.arduino.boardgenerator.ioT.StopByte
import java.util.HashMap
import org.xtext.mdsd.arduino.boardgenerator.ioT.Variable

class GeneratorUtils extends EcoreUtil { 
	 
	def String getStopCharName(Serial ser){
		var stop = ser.stopType 
		if (stop instanceof StopByte) 
			return stop.name.toString
		if (stop instanceof StopChar)  
			return stop.name.toString
		''''''
	}
	       
 	def BoardVersion getBoardVersion(Board board){
	 	if (board instanceof NewBoard) 
	 		return (board as NewBoard).version 
	 	if (board instanceof ExtendsBoard)
	 		return (board as ExtendsBoard).abstractBoard.version 
	 }
	 
	def List<Integer> getVariablesIndexes(List<Variable> variables){
		val indexes = newArrayList()
		val svars = newArrayList()
		variables.forEach [v | svars.add(v.name)]
		variables.forEach[v | v.name != "_" ? indexes.add(svars.indexOf(v.name)) ]
		indexes
	} 
	   
   	def List<Sensor> getBoardSensors(Board board){
   		
   		if (board instanceof NewBoard) 
			return board.sensors   	
		else if (board instanceof ExtendsBoard){
			val abSensors = (board as ExtendsBoard).abstractBoard.sensors
			val map = new HashMap<String, Sensor>();
			abSensors.forEach[s | map.put(s.name, s)]
			(board as ExtendsBoard).sensors?.forEach[s | map.put(s.name, s)]
			map.values.toList
		} else
			newArrayList()		 
   	}
	   
	 def Set<Channel> getChannelsInBoard(Board board){
	 	var contains = board instanceof ExtendsBoard ? board.abstractBoard.eContents.includesTypes(SensorImpl)+board.eContents.includesTypes(SensorImpl) : board.eContents.includesTypes(SensorImpl) 
	 	contains = contains.toList.forEachIncludeTypes(SensorOutputImpl)   
	 	var chans = contains.toList.extractChannelsFromSensorOutput     
	 	
	 	chans	   
	 }    
	 
	 def Set<Channel> extractChannelsFromSensorOutput(List<EObject> sensors){
	 	val channels = newArrayList()  
	 	sensors.forEach[ s | (s as SensorOutputImpl).channel.forall[c | channels.add(c) ]] 
	 	new HashSet<Channel>(channels)  
	 } 
	 
	 def List<EObject> forEachIncludeTypes(List<EObject> objects, Class<? extends EObject> cls){
	 	var classes = newArrayList()
	 	for(EObject object : objects){     
	 		classes += object.eContents.includesTypes(cls) 
	 	}   
	 	classes
	 }
	 
	 def List<EObject> includesTypes(List<EObject> objects, Class<? extends EObject> cls){
	 	var classes = newArrayList()
	 	for(EObject object : objects){     
	 		if (object.class === cls){ 
	 			classes.add(object)    
	 		}  
	 	}  
	 	classes
	 }	

}

