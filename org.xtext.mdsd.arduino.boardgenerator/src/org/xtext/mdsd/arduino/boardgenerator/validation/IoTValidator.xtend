/*
 * generated by Xtext 2.21.0
 */
package org.xtext.mdsd.arduino.boardgenerator.validation

import org.eclipse.xtext.validation.Check
import org.xtext.mdsd.arduino.boardgenerator.ioT.ExternalSensor
import org.xtext.mdsd.arduino.boardgenerator.ioT.Sensor
import org.xtext.mdsd.arduino.boardgenerator.ioT.OnboardSensor
import com.sun.org.apache.xpath.internal.operations.Variable
import org.xtext.mdsd.arduino.boardgenerator.ioT.SensorVariables
import org.xtext.mdsd.arduino.boardgenerator.ioT.IoTPackage

import static extension org.eclipse.xtext.EcoreUtil2.*

/**
 * This class contains custom validation rules. 
 *
 * See https://www.eclipse.org/Xtext/documentation/303_runtime_concepts.html#validation
 */
class IoTValidator extends AbstractIoTValidator {
	
	@Check 
	def validateExternalSensor(ExternalSensor externalSensor){
		val sensor = externalSensor.eContainer as Sensor; 
		System.out.println(sensor.vars); 
		//if (sensor.pins.size() != vars.ids.size()){
		//	error("number of vars must equal number of pins", IoTPackage.eINSTANCE.sensor_Vars); 
		//}
	}
	
	@Check
	def dispatch validateSensor(OnboardSensor sensor){
		System.out.println("----");
		System.out.println(sensor);
	}
	
}
