package org.xtext.mdsd.arduino.bordgenerator.ui.syntaxColoring

import org.eclipse.xtext.ui.editor.syntaxcoloring.DefaultSemanticHighlightingCalculator
import org.eclipse.xtext.ui.editor.syntaxcoloring.IHighlightedPositionAcceptor
import org.eclipse.xtext.resource.XtextResource 
import org.eclipse.xtext.EcoreUtil2
import org.xtext.mdsd.arduino.boardgenerator.ioT.Function
import org.eclipse.xtext.nodemodel.util.NodeModelUtils
import org.eclipse.xtext.nodemodel.INode
import org.xtext.mdsd.arduino.boardgenerator.ioT.IoTPackage
import org.xtext.mdsd.arduino.boardgenerator.ioT.External
import org.xtext.mdsd.arduino.boardgenerator.ioT.FunctionInputType
import org.xtext.mdsd.arduino.boardgenerator.ioT.Channel

class IoTSemanticHighlightConfiguration extends DefaultSemanticHighlightingCalculator{
	
	override doProvideHighlightingFor(XtextResource resource, IHighlightedPositionAcceptor acceptor) {
	  
	  	//
		var rootObject = resource.getParseResult().getRootASTElement();
		  
		for (External ext : EcoreUtil2.getAllContentsOfType(rootObject, External)){  
			for (INode node : NodeModelUtils.findNodesForFeature(ext, IoTPackage.Literals.EXTERNAL__FUNCTION)){
				acceptor.addPosition(node.getOffset(), node.getLength(), IoTHighlightingConfiguration.EXTERNAL_ID)
			} 
		}    
		
		for (Function fun : EcoreUtil2.getAllContentsOfType(rootObject, Function)){  
			for (INode node : NodeModelUtils.findNodesForFeature(fun, IoTPackage.Literals.FUNCTION__NAME)){
				acceptor.addPosition(node.getOffset(), node.getLength(), IoTHighlightingConfiguration.EXTERNAL_ID)
			}  
		}  
		  
		for (FunctionInputType typ : EcoreUtil2.getAllContentsOfType(rootObject, FunctionInputType)){  
			for (INode node : NodeModelUtils.findNodesForFeature(typ, IoTPackage.Literals.FUNCTION_INPUT_TYPE__NAME)){
				acceptor.addPosition(node.getOffset(), node.getLength(), IoTHighlightingConfiguration.EXTERNAL_TYPE_ID)
			}  
		} 
		
		for (Channel chan : EcoreUtil2.getAllContentsOfType(rootObject, Channel)){  
			for (INode node : NodeModelUtils.findNodesForFeature(chan, IoTPackage.Literals.CHANNEL__CTYPE)){
				acceptor.addPosition(node.getOffset(), node.getLength(), IoTHighlightingConfiguration.CHANNEL_TYPE_ID)
			}   
		}
		
		super.doProvideHighlightingFor(resource, acceptor);
	}
	
}