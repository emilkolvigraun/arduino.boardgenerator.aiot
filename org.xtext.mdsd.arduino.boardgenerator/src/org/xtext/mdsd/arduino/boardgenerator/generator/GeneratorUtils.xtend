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

class GeneratorUtils extends EcoreUtil { 
	     
	 def BoardVersion getBoardVersion(Board board){
	 	if (board instanceof NewBoard) 
	 		return (board as NewBoard).version 
	 	if (board instanceof ExtendsBoard)
	 		return (board as ExtendsBoard).abstractBoard.version
	 }
	   
	 def Set<Channel> getChannelsInBoard(Board board){
	 	var contains = board instanceof ExtendsBoard ? board.abstractBoard.eContents.includesTypes(SensorImpl)+board.eContents.includesTypes(Sensor) : board.eContents.includesTypes(SensorImpl) 
	 	contains = contains.toList.forEachIncludeTypes(SensorOutputImpl)   
	 	contains.toList.extractChannelsFromSensorOutput     	   
	 }    
	  
	 @Deprecated // not currently in use, but might use later, thus deprecated mark
	 def boolean andGate(boolean first, boolean second){
	 	if (first && second){
	 		return true
	 	}
	 	return false
	 } 
	 
	 def Set<Channel> extractChannelsFromSensorOutput(List<EObject> sensors){
	 	val channels = newArrayList() 
	 	sensors.forEach[ s | (s as SensorOutputImpl).channel.forall[c | channels.add(c)]]
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

