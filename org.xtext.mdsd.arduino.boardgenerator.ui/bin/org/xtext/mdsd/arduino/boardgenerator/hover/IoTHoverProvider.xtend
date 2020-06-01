package org.xtext.mdsd.arduino.boardgenerator.hover

import java.util.List 
import org.eclipse.emf.ecore.EObject
import org.eclipse.jface.internal.text.html.HTMLPrinter
import org.eclipse.jface.text.IRegion
import org.eclipse.swt.graphics.RGB
import org.eclipse.xtext.ui.editor.hover.html.DefaultEObjectHoverProvider
import org.eclipse.xtext.ui.editor.hover.html.XtextBrowserInformationControlInput
import org.xtext.mdsd.arduino.boardgenerator.ioT.AbstractBoard
import org.xtext.mdsd.arduino.boardgenerator.ioT.BoardVersion
import org.xtext.mdsd.arduino.boardgenerator.ioT.Channel 
import org.xtext.mdsd.arduino.boardgenerator.ioT.Command
import org.xtext.mdsd.arduino.boardgenerator.ioT.ExtendsBoard
import org.xtext.mdsd.arduino.boardgenerator.ioT.ExternalSensor
import org.xtext.mdsd.arduino.boardgenerator.ioT.Frequency
import org.xtext.mdsd.arduino.boardgenerator.ioT.Function
import org.xtext.mdsd.arduino.boardgenerator.ioT.Map
import org.xtext.mdsd.arduino.boardgenerator.ioT.NewBoard
import org.xtext.mdsd.arduino.boardgenerator.ioT.OnboardSensor
import org.xtext.mdsd.arduino.boardgenerator.ioT.Reference
import org.xtext.mdsd.arduino.boardgenerator.ioT.Sampler
import org.xtext.mdsd.arduino.boardgenerator.ioT.Sensor
import org.xtext.mdsd.arduino.boardgenerator.ioT.SensorType
import org.xtext.mdsd.arduino.boardgenerator.ioT.SensorVariables
import org.xtext.mdsd.arduino.boardgenerator.ioT.Variable
import org.xtext.mdsd.arduino.boardgenerator.validation.Boards

import static extension org.eclipse.xtext.EcoreUtil2.*
import org.xtext.mdsd.arduino.boardgenerator.ioT.Wifi
import org.xtext.mdsd.arduino.boardgenerator.ioT.Serial
import org.xtext.mdsd.arduino.boardgenerator.ioT.MqttClient
import org.xtext.mdsd.arduino.boardgenerator.ioT.WifiConfig

class IoTHoverProvider extends DefaultEObjectHoverProvider {
	 
	
	def String getBoardString(String name, BoardVersion version, EObject object){
		var str = '''<b>«name»</b> -> «Boards.getBoardSupported(version)»'''
		 
		if (object instanceof ExtendsBoard) 
			str += '''<br> Extends: <b>«object.abstractBoard.name»</b>''' 
			
		str + '''<br> Class: <b>«object.eClass().getName()»</b>''' 
	} 
	
	def String getSensorString(Sensor sensor){
		var str = '''<b>«sensor.name»</b> -> «sensor.sensortype.name» <br> Type: <b>«sensor.sensortype.eClass().getName()»</b> <br> Class: <b>«sensor.eClass().getName()»</b>'''
		if(sensor.sensortype instanceof ExternalSensor){
			str += '''<br>vcc: «sensor.vcc»'''
		} 
		str
	}
	
	def String getSensorVariablesAssociation(SensorVariables sensorVariables){
		var sensor = sensorVariables.getContainerOfType(Sensor)  
		var str = ''''''
		var header = '''<b>«sensorVariables.name»</b> -> ( '''
		 
		for (i : 0 ..< sensorVariables.ids.size){ 
			var sensorType = sensor.sensortype 
		    var name = sensorVariables.ids.get(i).name 
			header += name != "_" ? "<b>" +name + "</b> " : ""
			if(sensorType instanceof ExternalSensor){    
				val pin = sensorType.pins.get(i).toString   
				str += "<b>" + name + "</b> -> pin: <b>" + pin + "</b><br>"				
			}  
			
			if (sensorType instanceof OnboardSensor && name != "_"){
				str += "Output: <b>"+ name + "</b> -> index: <b>" + i.toString + "</b><br>"
			}
		}   
		   
		header + ")<br>" + str
	} 
	
	def String getVariableString(Variable variable){
		
		var map = variable.getContainerOfType(Map)
		if (map !== null)  
			return '''map -> «variable.name»<br>Class: <b>«map.expression.eClass().getName()»</b>''' 
		 
		var sensor = variable.getContainerOfType(Sensor)
		sensor.vars.getSensorVariablesAssociation  
	} 
	
	def String getReferenceString(Reference reference){
		
		var map = reference.getContainerOfType(Map)
		
		if(map !== null && map.output.name.toString == reference.ref.toString){
			return map.output.getVariableString
		}
		 
		var sensor = reference.getContainerOfType(Sensor) 
		sensor.vars.getSensorVariablesAssociation   
	}
	  
	def List<Integer> getPins(SensorType sensor){
		(sensor as ExternalSensor).pins
	}
	
	def String getChannelString(Channel channel){
		var str = '''«channel.name» -> '''
		val config = channel.config
		if (config !== null){
			switch (config){
				case (config instanceof Wifi): str += "<b>cloud</b>"
				case (config instanceof Serial): str += "<b>serial</b>"
				case (config instanceof MqttClient): str += "<b>mqtt</b>" 
			}
		} else {  
			val type = channel.ctype.name 
			switch (type){
				case "cloud": str += "<b>cloud</b>"
				case "serial": str += "<b>serial</b>"
				case "mqtt": str += "<b>mqtt</b>" 
			} 
		}
		str + '''<br> Class: <b>«channel.eClass().getName()»</b>'''
	}
	
	def String getFunctionString(Function function){ 
		'''Function: <b>«function.name»</b> <br>Class: <b>«function.eClass().getName()»</b><br>Input #: <b>«function.input.size().toString»</b><br>Ouput #: <b>«function.output.size().toString»</b>'''
	} 
	 
	def String getOnboardSensorString(OnboardSensor sensor){
		'''Sensor: <b>«sensor.name»</b> <br>Class: <b>«sensor.eClass().getName()»</b>'''
	}  
	  
	def String getExternalSensorString(ExternalSensor sensor){
		'''Sensor: <b>«sensor.name»</b> <br>Class: <b>«sensor.eClass().getName()»</b><br>Pins: <b>«sensor.pins.toString.replace(']', '').replace('[', '')»</b>'''
	} 
	 
	def String getSampleString(Sampler sampler){
		if (sampler instanceof Frequency) 
			return '''frequency'''   
		if (sampler instanceof Command)
			return '''command''' 
		''''''
	} 
	
	def String getWifiConfigString(WifiConfig config){
		'''Class: <b>«config.eClass().getName()»</b><br>ssid: <b>«config.ssid»</b>'''
	}
	
	def String getInstanceStr(EObject object){
		if (object instanceof NewBoard){  
			var board = object as NewBoard 
			return board.name.getBoardString(board.version, object)	}
		if (object instanceof AbstractBoard){  
			var board = object as AbstractBoard 
			return board.name.getBoardString(board.version, object)	} 
		if (object instanceof ExtendsBoard){  
			var board = object as ExtendsBoard 
			return board.name.getBoardString(board.abstractBoard.version, object) }
		if (object instanceof Sensor){   
			return (object as Sensor).sensorString }
		if (object instanceof SensorVariables){
			return (object as SensorVariables).sensorVariablesAssociation }
		if (object instanceof Variable){ 
			return (object as Variable).variableString } 
		if (object instanceof Channel){  
			return (object as Channel).channelString }
		if (object instanceof Reference){
			return (object as Reference).referenceString }
		if (object instanceof OnboardSensor){
			return (object as OnboardSensor).onboardSensorString }
		if (object instanceof ExternalSensor){  
			return (object as ExternalSensor).externalSensorString }
		if (object instanceof Function){ 
			return (object as Function).functionString }
		if (object instanceof WifiConfig){ 
			return (object as WifiConfig).wifiConfigString }
		if (object instanceof BoardVersion){ 
			return '''Version: <b>«Boards.getBoardSupported((object as BoardVersion)).toString»</b>''' }
		'''Class: <b>«object.eClass().getName()»</b>'''  
	}
	
	override String getHoverInfoAsHtml(EObject o) {
		o.getInstanceStr 
	} 	  
	
	// Overwritten to manipulate backgroundcolor
	override XtextBrowserInformationControlInput getHoverInfo(EObject element, IRegion hoverRegion,
			XtextBrowserInformationControlInput previous) {
		var html = getHoverInfoAsHtml(element);
		if (html != null) {   
			var buffer = new StringBuffer(html); 
			HTMLPrinter.insertPageProlog(buffer, 0, new RGB(236, 240, 241), new RGB(23, 32, 42), getStyleSheet());
			HTMLPrinter.addPageEpilog(buffer);
			html = buffer.toString(); 
			return new XtextBrowserInformationControlInput(previous, element, html, labelProvider);
		}
		return null;
	}
	
}