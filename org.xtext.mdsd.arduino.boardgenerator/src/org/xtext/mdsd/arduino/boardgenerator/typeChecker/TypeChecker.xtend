package org.xtext.mdsd.arduino.boardgenerator.typeChecker
 
//import org.eclipse.xtext.util.OnChangeEvictingCache
import org.xtext.mdsd.arduino.boardgenerator.ioT.NumberLiteral
import org.xtext.mdsd.arduino.boardgenerator.ioT.StringLiteral
import org.xtext.mdsd.arduino.boardgenerator.ioT.BooleanLiteral
import org.xtext.mdsd.arduino.boardgenerator.ioT.Expression  
import org.xtext.mdsd.arduino.boardgenerator.ioT.Conditional 
import org.xtext.mdsd.arduino.boardgenerator.ioT.Pipeline
import org.xtext.mdsd.arduino.boardgenerator.ioT.Map
import org.xtext.mdsd.arduino.boardgenerator.ioT.Count
import org.xtext.mdsd.arduino.boardgenerator.ioT.Max
import org.xtext.mdsd.arduino.boardgenerator.ioT.Mean
import org.xtext.mdsd.arduino.boardgenerator.ioT.Median
import org.xtext.mdsd.arduino.boardgenerator.ioT.Min
import org.xtext.mdsd.arduino.boardgenerator.ioT.StDev
import org.xtext.mdsd.arduino.boardgenerator.ioT.Var
import org.xtext.mdsd.arduino.boardgenerator.ioT.WindowPipeline
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

class TypeChecker {

	enum Type { 
		INT,
		DOUBLE,
		BOOLEAN,
		STRING,
		NUMBER,
		INVALID
	}

	def dispatch Type type(NumberLiteral number) {
		val value = number.numb  
		switch (value) {   
			case value.contains('.'):
				Type.DOUBLE
			case value.contains('0x'):
				Type.INT
			case value.toLowerCase.contains('e'):
				Type.DOUBLE
			default:
				Type.INT
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
				switch(pipe){
					case Max, Mean, Median, Min, StDev, Var, WindowPipeline:
						type = Type.DOUBLE
					case Count:
						type = Type.INT
				}
			}
			pipe = pipe.next
		}
		return type
	}
	
	def dispatch Type type(Plus plus) {
		if (plus.left.type == Type.STRING || plus.right.type == Type.STRING) {
			Type.STRING
		} else {
			evaluateNumeralTypes(plus.left.type, plus.right.type)
		}
	}

	def dispatch Type type(Minus minus) {
		evaluateNumeralTypes(minus.left.type, minus.right.type)
	}

	def dispatch Type type(Mul multiply) {
		evaluateNumeralTypes(multiply.left.type, multiply.right.type)
	}

	def dispatch Type type(Div division) {
		evaluateNumeralTypes(division.left.type, division.right.type)
	}

	def dispatch Type type(Negation negation) {
		if (! negation.value.type.isNumberType) {
			Type.INVALID
		} else {
			negation.value.type
		} 
	} 
 
	def dispatch Type type(Exponent exponent) {
		if (evaluateNumeralTypes(exponent.base.type, exponent.power.type) == Type.INVALID) {
			Type.INVALID
		} else {
			Type.DOUBLE
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
		switch (functionType){ 
			org.xtext.mdsd.arduino.boardgenerator.ioT.Number: return Type.NUMBER
			org.xtext.mdsd.arduino.boardgenerator.ioT.String: return Type.STRING
			org.xtext.mdsd.arduino.boardgenerator.ioT.Bool: return Type.BOOLEAN
			default: return Type.INVALID
		}
	}
	
	
}