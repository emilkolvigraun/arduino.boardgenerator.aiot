/*
 * generated by Xtext 2.21.0
 */
package org.xtext.mdsd.arduino.boardgenerator.validation

import org.xtext.mdsd.arduino.boardgenerator.ioT.ExternalSensor
import org.xtext.mdsd.arduino.boardgenerator.ioT.Sensor
import org.xtext.mdsd.arduino.boardgenerator.ioT.OnboardSensor
import org.xtext.mdsd.arduino.boardgenerator.ioT.IoTPackage
import org.xtext.mdsd.arduino.boardgenerator.ioT.Board

import org.eclipse.xtext.validation.Check
import static extension org.eclipse.xtext.EcoreUtil2.*
import org.xtext.mdsd.arduino.boardgenerator.ioT.Model
import org.xtext.mdsd.arduino.boardgenerator.ioT.Pipeline
import org.xtext.mdsd.arduino.boardgenerator.ioT.Expression

/**
 * This class contains custom validation rules. 
 *
 * See https://www.eclipse.org/Xtext/documentation/303_runtime_concepts.html#validation
 */
class IoTValidator extends AbstractIoTValidator {
	
	@Check 
	def validateExternalSensor(Sensor sensor){
		val externalSensor = sensor.sensortype;
		if (externalSensor instanceof ExternalSensor){
			if (externalSensor.pins.size() != sensor.vars.ids.size()){
				error("number of vars must equal number of pins", IoTPackage.Literals.SENSOR__VARS); 
			}    
			val vcc = sensor.getVcc();    
			if (vcc < 1){
				error("this declaration of sensor needs vcc", IoTPackage.eINSTANCE.sensor_Name); 
			}
		}
	} 
		
	@Check
	def validatePipeLine(Expression expression){
	}
		
	@Check 
	def validateOnboardSensor(Model model){ 
		
		//val boards = model.abstractBoard;
		  
		//System.out.println(boards); 
		
		// https://blogs.itemis.com/en/in-five-minutes-to-transitive-imports-within-a-dsl-with-xtext
		
		
	}
	
}
