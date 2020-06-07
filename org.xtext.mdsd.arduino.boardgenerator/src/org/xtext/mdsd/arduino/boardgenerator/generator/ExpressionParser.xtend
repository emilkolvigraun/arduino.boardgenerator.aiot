package org.xtext.mdsd.arduino.boardgenerator.generator

import org.xtext.mdsd.arduino.boardgenerator.ioT.Expression
import org.xtext.mdsd.arduino.boardgenerator.ioT.Conditional
import org.xtext.mdsd.arduino.boardgenerator.ioT.Reference
import org.xtext.mdsd.arduino.boardgenerator.ioT.Or
import org.xtext.mdsd.arduino.boardgenerator.ioT.And
import org.xtext.mdsd.arduino.boardgenerator.ioT.Equal
import org.xtext.mdsd.arduino.boardgenerator.ioT.Unequal
import org.xtext.mdsd.arduino.boardgenerator.ioT.LessThan
import org.xtext.mdsd.arduino.boardgenerator.ioT.LessThanEqual
import org.xtext.mdsd.arduino.boardgenerator.ioT.GreaterThan
import org.xtext.mdsd.arduino.boardgenerator.ioT.GreaterThanEqual
import org.xtext.mdsd.arduino.boardgenerator.ioT.Plus
import org.xtext.mdsd.arduino.boardgenerator.ioT.Minus
import org.xtext.mdsd.arduino.boardgenerator.ioT.Mul
import org.xtext.mdsd.arduino.boardgenerator.ioT.Div
import org.xtext.mdsd.arduino.boardgenerator.ioT.Negation
import org.xtext.mdsd.arduino.boardgenerator.ioT.Exponent
import org.xtext.mdsd.arduino.boardgenerator.ioT.Not
import org.xtext.mdsd.arduino.boardgenerator.ioT.NumberLiteral
import org.xtext.mdsd.arduino.boardgenerator.ioT.BooleanLiteral
import org.xtext.mdsd.arduino.boardgenerator.ioT.StringLiteral
import java.util.HashMap

class ExpressionParser {
	
	def dispatch String getExpression(Expression expression, HashMap<String, String> env){
		expression.getExpression(env).toString
	}
	 
	def dispatch String getExpression(Conditional condition, HashMap<String, String> env){
		condition.condition.getExpression(env)+"?"+condition.correct.getExpression(env)+":"+condition.incorrect.getExpression(env)
	}
	
	def dispatch String getExpression(Or or, HashMap<String, String> env){
		or.left.getExpression(env)+"||"+or.right.getExpression(env)
	}
	
	def dispatch String getExpression(And and, HashMap<String, String> env){
		and.left.getExpression(env)+"&&"+and.right.getExpression(env)
	}
	
	def dispatch String getExpression(Equal equal, HashMap<String, String> env){
		equal.left.getExpression(env)+"=="+equal.right.getExpression(env)
	}
	
	def dispatch String getExpression(Unequal unequal, HashMap<String, String> env){
		unequal.left.getExpression(env)+"!="+unequal.left.getExpression(env)
	}
	
	def dispatch String getExpression(LessThan less, HashMap<String, String> env){
		less.left.getExpression(env)+"<"+less.right.getExpression(env)
	}
	
	def dispatch String getExpression(LessThanEqual less, HashMap<String, String> env){
		less.left.getExpression(env)+"<="+less.right.getExpression(env)
	}
	
	def dispatch String getExpression(GreaterThan greater, HashMap<String, String> env){
		greater.left.getExpression(env)+">"+greater.right.getExpression(env)	
	}
	
	def dispatch String getExpression(GreaterThanEqual greater, HashMap<String, String> env){
		greater.left.getExpression(env)+">="+greater.right.getExpression(env)
	}
	
	def dispatch String getExpression(Plus plus, HashMap<String, String> env){
		plus.left.getExpression(env)+"+"+plus.right.getExpression(env)
	}
	
	def dispatch String getExpression(Minus minus, HashMap<String, String> env){
		minus.left.getExpression(env)+"-"+minus.right.getExpression(env)
	}
	
	def dispatch String getExpression(Mul mul, HashMap<String, String> env){
		mul.left.getExpression(env)+"*"+mul.right.getExpression(env)
	}
	
	def dispatch String getExpression(Div div, HashMap<String, String> env){
		div.left.getExpression(env)+"/"+div.right.getExpression(env)
	}
	
	def dispatch String getExpression(Negation neg, HashMap<String, String> env){
		"-"+neg.value.getExpression(env)
	}
	
	def dispatch String getExpression(Exponent exponent, HashMap<String, String> env){
		exponent.base.getExpression(env)+"**"+exponent.power.getExpression(env)
	}
	
	def dispatch String getExpression(Not not, HashMap<String, String> env){
		"!"+not.value.getExpression(env)
	} 
	
	def dispatch String getExpression(Reference reference, HashMap<String, String> env){
		env.get(reference.ref.toString).toString
	}
	
	def dispatch String getExpression(NumberLiteral number, HashMap<String, String> env){
		number.numb.toString
	}
	
	def dispatch String getExpression(BooleanLiteral bool, HashMap<String, String> env){
		bool.bool.toString
	}
	  
	def dispatch String getExpression(StringLiteral str, HashMap<String, String> env){
		'"'+str.str.toString+'"'
	}
}