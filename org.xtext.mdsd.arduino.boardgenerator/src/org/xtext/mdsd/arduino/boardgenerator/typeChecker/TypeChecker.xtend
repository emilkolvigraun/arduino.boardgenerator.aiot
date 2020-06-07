package org.xtext.mdsd.arduino.boardgenerator.typeChecker
 
//import org.eclipse.xtext.util.OnChangeEvictingCache
import org.xtext.mdsd.arduino.boardgenerator.ioT.NumberLiteral
import org.xtext.mdsd.arduino.boardgenerator.ioT.StringLiteral
import org.xtext.mdsd.arduino.boardgenerator.ioT.BooleanLiteral
import org.xtext.mdsd.arduino.boardgenerator.ioT.Expression  
import org.xtext.mdsd.arduino.boardgenerator.ioT.Conditional 
import org.xtext.mdsd.arduino.boardgenerator.ioT.Pipeline
import org.xtext.mdsd.arduino.boardgenerator.ioT.Map
import org.xtext.mdsd.arduino.boardgenerator.ioT.Plus
import org.xtext.mdsd.arduino.boardgenerator.ioT.Minus 
import org.xtext.mdsd.arduino.boardgenerator.ioT.Mul 
import org.xtext.mdsd.arduino.boardgenerator.ioT.Div
import org.xtext.mdsd.arduino.boardgenerator.ioT.Negation
import org.xtext.mdsd.arduino.boardgenerator.ioT.Exponent
import org.xtext.mdsd.arduino.boardgenerator.ioT.Reference
import org.xtext.mdsd.arduino.boardgenerator.ioT.FunctionInputType

import static extension org.eclipse.xtext.EcoreUtil2.* import org.eclipse.emf.ecore.EObject
import org.xtext.mdsd.arduino.boardgenerator.ioT.External
import org.xtext.mdsd.arduino.boardgenerator.ioT.Channel
import org.xtext.mdsd.arduino.boardgenerator.ioT.Wifi
import org.xtext.mdsd.arduino.boardgenerator.ioT.Serial
import org.xtext.mdsd.arduino.boardgenerator.ioT.MqttClient

class TypeChecker {

	enum Type { 
		INT,
		DOUBLE,
		BOOLEAN,
		STRING,
		NUMBER,
		INVALID
	}
	
	enum ChannelType {
		MQTT,
		SERIAL,
		CLOUD,
		INVALID
	}

	def dispatch Type type(NumberLiteral number) {
		try { 
			val value = number.numb  
			switch (value) {   
				case value.contains('.'):
					return Type.DOUBLE
				case value.contains('0x'):
					return Type.INT
				case value.toLowerCase.contains('e'):
					return Type.DOUBLE
				default:
					return Type.INT
			} 
		} catch (Exception e){ 
			return Type.INVALID 
		}
	}

	def dispatch Type type(StringLiteral str) {
		Type.STRING
	}

	def dispatch Type type(BooleanLiteral bool) {
		Type.BOOLEAN
	}

	def dispatch Type type(Expression expression) {
		Type.BOOLEAN
	}
	
	def dispatch Type type(Conditional conditional) {
		val correctType = conditional.correct.type
		val incorrectType = conditional.incorrect.type
		val numberType = evaluateNumeralTypes(correctType, incorrectType)

		if (numberType == Type.INVALID) {
			if (correctType == incorrectType) {
				correctType
			} else {
				Type.INVALID
			}
		} else {
			numberType
		}
	}
 
	def isNumberType(Type type) {
		return type == Type.INT || type == Type.DOUBLE || type == Type.NUMBER
	}

	def evaluateNumeralTypes(Type type1, Type type2) {
		if (! (type1.isNumberType && type2.isNumberType)) { 
			Type.INVALID
		} else if (type1 == Type.DOUBLE || type2 == Type.DOUBLE || type1 == Type.NUMBER || type2 == Type.NUMBER) { 
			Type.DOUBLE
		} else {
			Type.INT
		}
	}
	
	def Type lastType(Pipeline pipeline){	
		var type = Type.INT
		var pipe = pipeline
		while(pipe !== null){ 
			if (pipe instanceof Map) {
				val mapPipeline = (pipe as Map)
				type = mapPipeline.expression.type
			} else {
				type = Type.DOUBLE
			}
			pipe = pipe.next
		}
		return type
	}
	
	def dispatch Type type(Plus plus) {
		try {
			if (plus.left.type == Type.STRING || plus.right.type == Type.STRING) {
				Type.STRING
			} else {
				evaluateNumeralTypes(plus.left.type, plus.right.type)
			}
		} catch (Exception e){ 
			return Type.INVALID
		}
	}

	def dispatch Type type(Minus minus) {
		try {
			evaluateNumeralTypes(minus.left.type, minus.right.type)
		} catch (Exception e){ 
			return Type.INVALID
		} 
	}

	def dispatch Type type(Mul multiply) {
		try {
			evaluateNumeralTypes(multiply.left.type, multiply.right.type)
		} catch (Exception e){
			return Type.INVALID
		}
	}

	def dispatch Type type(Div division) {
		try {
			evaluateNumeralTypes(division.left.type, division.right.type)
		} catch (Exception e){
			return Type.INVALID
		}
	}

	def dispatch Type type(Negation negation) {
		try {
			if (! negation.value.type.isNumberType) {
				Type.INVALID
			} else {
				negation.value.type
			} 
		} catch (Exception e){
			return Type.INVALID
		}
	} 
 
	def dispatch Type type(Exponent exponent) {
		try {
			if (evaluateNumeralTypes(exponent.base.type, exponent.power.type) == Type.INVALID) {
				Type.INVALID
			} else {
				Type.DOUBLE
			}
		} catch (Exception e){
			return Type.INVALID
		}
	}
	
	def EObject getPipelineChildOf(EObject pipeline){
		var parent = pipeline.eContainer
		while (parent instanceof Pipeline){
			switch (parent){
					Map: return parent  
					External: return parent
					default: parent = parent.eContainer
				} 
		} 
		return null;
	}    
	 
	def dispatch Type type(Reference reference){  
		var type = Type.NUMBER
		var parent = reference.getContainerOfType(Pipeline).pipelineChildOf
		if (parent instanceof Map) { 
			var map = parent as Map
			var expression = map.expression 
			if (expression !== null || map.output !== null)  
				type = expression.type			
		}
			 
		type 
	}
	 
	def dispatch Type type(FunctionInputType functionType){
		val name = functionType.name.toString
		switch (name){   
			case "num" : return Type.NUMBER
			case "str" : return Type.STRING 
			case "bool": return Type.BOOLEAN
			default: return Type.INVALID
		}
	}
	
	def String ctype(Type type){
		if (type == Type.BOOLEAN)
			return "bool"
		if (type == Type.INT)
			return "int"
		return "float"
	}
	
	def dispatch boolean ifInvalid(Type type){
		if (type == Type.INVALID)
			return true
		false 
	}  
	
	def dispatch boolean ifInvalid(ChannelType type){
		if (type == ChannelType.INVALID)
			return true
		false 
	}   
	
	def boolean ifSerialType(Channel channel){
		if (channel.getChannelType == ChannelType.SERIAL)
			return true
		false
	} 
	
	def boolean ifMQTTType(Channel channel){
		if (channel.getChannelType == ChannelType.MQTT)
			return true
		false
	} 
	
	def boolean ifServerType(Channel channel){
		if (channel.getChannelType == ChannelType.CLOUD)
			return true
		false
	} 
	
	def ChannelType getChannelType(Channel channel){
		 val type = channel.ctype?.name
		 if (type !== null){
		 	if (type == "mqtt")
		 		return ChannelType.MQTT
	 		else if (type == "cloud")
	 			return ChannelType.CLOUD
 			else if (type == "serial")
 				return ChannelType.SERIAL
			else
				return ChannelType.INVALID
		 } else {
		 	val config = channel.config
		 	 
		 	if(config instanceof Wifi)
		 		return ChannelType.CLOUD
	 		else if (config instanceof Serial)
	 			return ChannelType.SERIAL
 			else if (config instanceof MqttClient)
 				return ChannelType.MQTT
			else 
				return ChannelType.INVALID
		 }
	}
	 
	def boolean xOr (boolean first, boolean second){
		if (first == second ){
			return false
		}  
		return true
	} 
}