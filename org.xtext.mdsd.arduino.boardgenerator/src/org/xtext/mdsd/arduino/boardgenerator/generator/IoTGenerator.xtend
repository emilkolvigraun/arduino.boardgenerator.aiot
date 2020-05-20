/*
 * generated by Xtext 2.21.0
 */
package org.xtext.mdsd.arduino.boardgenerator.generator

import org.eclipse.emf.ecore.resource.Resource
import org.eclipse.xtext.generator.AbstractGenerator
import org.eclipse.xtext.generator.IFileSystemAccess2
import org.eclipse.xtext.generator.IGeneratorContext 
import org.xtext.mdsd.arduino.boardgenerator.ioT.Board
import com.google.inject.Inject
import java.util.List
import org.xtext.mdsd.arduino.boardgenerator.ioT.Channel
import static extension org.eclipse.xtext.EcoreUtil2.*
import org.xtext.mdsd.arduino.boardgenerator.ioT.Wifi
import org.xtext.mdsd.arduino.boardgenerator.ioT.Serial
import org.xtext.mdsd.arduino.boardgenerator.ioT.MqttClient

/* Generates code from your model files on save.
 * 
 * See https://www.eclipse.org/Xtext/documentation/303_runtime_concepts.html#code-generation
 */

class IoTGenerator extends AbstractGenerator {
	
	@Inject  
	extension GeneratorUtils
	 
	IFileSystemAccess2 fsa

	override void doGenerate(Resource resource, IFileSystemAccess2 fsa, IGeneratorContext context) {
		this.fsa = fsa 
		resource.allContents.filter(Board).toList.exportBoards 
	}
	  
	def exportBoards(List<Board> boards){ 
		for (Board board : boards){   
		 	val currentBoard = board.name.toFirstUpper 
		 	var channels = board.getChannelsInBoard  
			val content = '''  
							/*  
							* Generated Code  
							* Model : «board.boardVersion.model»
							* Type  : «board.boardVersion.type»
							*/
							 
							«board.generatorBoardCode(channels.toList)»
						 '''
			fsa.generateFile('''«currentBoard»/Device.ino''',  content)	 
			fsa.generateFile('''«currentBoard»/config.json''', channels.toList.generateConfigFile)	 
		}
	}  
	
	def String generateConfigFile(List<Channel> channels){
		 '''
		 	{ 
		 	«FOR channel : channels»
		 	"«channel.name»":{
		 			«channel.channelConfiguration»
		 		} 
		 	«ENDFOR»
		 	} 
		 '''
	}
	 
	def String getChannelConfiguration(Channel channel){
		val type = channel.config  
		if (type instanceof Wifi){
			return  '''
					'''		
		} else if (type instanceof Serial){
			
		} else if (type instanceof MqttClient){
			
		}
	}
	
	def String generatorBoardCode(Board board, List<Channel> channels){
		""
	}
}
