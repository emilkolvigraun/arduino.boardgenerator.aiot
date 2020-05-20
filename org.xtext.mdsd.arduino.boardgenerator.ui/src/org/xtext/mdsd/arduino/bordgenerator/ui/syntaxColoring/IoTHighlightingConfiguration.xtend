package org.xtext.mdsd.arduino.bordgenerator.ui.syntaxColoring

import org.eclipse.xtext.ui.editor.syntaxcoloring.DefaultHighlightingConfiguration
import org.eclipse.xtext.ui.editor.utils.TextStyle
import org.eclipse.swt.graphics.RGB
import org.eclipse.swt.SWT import org.eclipse.xtext.ui.editor.syntaxcoloring.IHighlightingConfigurationAcceptor

class IoTHighlightingConfiguration extends DefaultHighlightingConfiguration {
		    
 	 public static final String EXTERNAL_ID = "ExternalFunctionUsage"; 
 	 public static final String EXTERNAL_TYPE_ID = "ExternalFunctionVariableType"; 
		     
	 override configure(IHighlightingConfigurationAcceptor acceptor){
	 	acceptor.acceptDefaultHighlighting(KEYWORD_ID, "Keyword", keywordTextStyle());
		acceptor.acceptDefaultHighlighting(PUNCTUATION_ID, "Punctuation character", punctuationTextStyle());
		acceptor.acceptDefaultHighlighting(COMMENT_ID, "Comment", commentTextStyle());
		acceptor.acceptDefaultHighlighting(TASK_ID, "Task Tag", taskTextStyle());
		acceptor.acceptDefaultHighlighting(STRING_ID, "String", stringTextStyle());  
		acceptor.acceptDefaultHighlighting(NUMBER_ID, "Number", numberTextStyle());
		acceptor.acceptDefaultHighlighting(DEFAULT_ID, "Default", defaultTextStyle());
		acceptor.acceptDefaultHighlighting(INVALID_TOKEN_ID, "Invalid Symbol", errorTextStyle());
		acceptor.acceptDefaultHighlighting(EXTERNAL_ID, "External", externalTextStyle());
		acceptor.acceptDefaultHighlighting(EXTERNAL_TYPE_ID, "External Variable Type", typeTextStyle());
	}
		  
		 
	override TextStyle defaultTextStyle() {
		val textStyle = new TextStyle();
		textStyle.setColor(new RGB(42, 0, 255));
		textStyle;
	}
	 
	def TextStyle externalTextStyle() { 
		val textStyle = new TextStyle();
		textStyle.setColor(new RGB(34, 188, 198));
		textStyle.setStyle(SWT.BOLD);
		textStyle;
	}
	 
	def TextStyle typeTextStyle() { 
		val textStyle = new TextStyle();
		textStyle.setColor(new RGB(196, 17, 144));
		textStyle.setStyle(SWT.BOLD);
		textStyle;
	}
	
	override TextStyle errorTextStyle() {
		val textStyle = defaultTextStyle().copy();
		textStyle.setColor(new RGB(1, 1, 1));
		textStyle; 
	} 
	 
	override TextStyle numberTextStyle() {
		val textStyle = defaultTextStyle().copy();
		textStyle.setColor(new RGB(0, 168, 45));
		textStyle;
	}

	override TextStyle stringTextStyle() {
		val textStyle = defaultTextStyle().copy();
		textStyle.setColor(new RGB(249, 141, 19));
		textStyle;
	}

	override TextStyle commentTextStyle() {
		val textStyle = defaultTextStyle().copy();
		textStyle.setColor(new RGB(52, 73, 94));
		textStyle.setStyle(SWT.ITALIC); 
		textStyle;
	}
 
	override TextStyle taskTextStyle() {
		val textStyle = defaultTextStyle().copy(); 
		textStyle.setColor(new RGB(41, 128, 185));
		textStyle.setStyle(SWT.BOLD);
		textStyle;
	}

	override TextStyle keywordTextStyle() {
		val textStyle = defaultTextStyle().copy();
		textStyle.setColor(new RGB(150, 0, 12));
		textStyle.setStyle(SWT.BOLD);
		textStyle; 
	}

	override TextStyle punctuationTextStyle() { 
		val textStyle = defaultTextStyle().copy();
		textStyle.setColor(new RGB(137, 0, 115));
		textStyle;
	}
}