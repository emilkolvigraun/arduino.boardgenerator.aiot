package org.xtext.mdsd.arduino.bordgenerator.ui.syntaxColoring

import org.eclipse.xtext.ui.editor.syntaxcoloring.DefaultHighlightingConfiguration
import org.eclipse.xtext.ui.editor.utils.TextStyle
import org.eclipse.swt.graphics.RGB
import org.eclipse.swt.SWT

class IoTHighlightingConfiguration extends DefaultHighlightingConfiguration {
	 
	override TextStyle defaultTextStyle() {
		val textStyle = new TextStyle();
		textStyle.setColor(new RGB(42, 0, 255));
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