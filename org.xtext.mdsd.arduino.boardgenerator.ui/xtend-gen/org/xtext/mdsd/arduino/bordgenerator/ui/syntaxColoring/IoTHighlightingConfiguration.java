package org.xtext.mdsd.arduino.bordgenerator.ui.syntaxColoring;

import org.eclipse.swt.SWT;
import org.eclipse.swt.graphics.RGB;
import org.eclipse.xtext.ui.editor.syntaxcoloring.DefaultHighlightingConfiguration;
import org.eclipse.xtext.ui.editor.syntaxcoloring.IHighlightingConfigurationAcceptor;
import org.eclipse.xtext.ui.editor.utils.TextStyle;

@SuppressWarnings("all")
public class IoTHighlightingConfiguration extends DefaultHighlightingConfiguration {
  public static final String EXTERNAL_ID = "ExternalFunctionUsage";
  
  public static final String EXTERNAL_TYPE_ID = "ExternalFunctionVariableType";
  
  public static final String CHANNEL_TYPE_ID = "ChannelType";
  
  @Override
  public void configure(final IHighlightingConfigurationAcceptor acceptor) {
    acceptor.acceptDefaultHighlighting(DefaultHighlightingConfiguration.KEYWORD_ID, "Keyword", this.keywordTextStyle());
    acceptor.acceptDefaultHighlighting(DefaultHighlightingConfiguration.PUNCTUATION_ID, "Punctuation character", this.punctuationTextStyle());
    acceptor.acceptDefaultHighlighting(DefaultHighlightingConfiguration.COMMENT_ID, "Comment", this.commentTextStyle());
    acceptor.acceptDefaultHighlighting(DefaultHighlightingConfiguration.TASK_ID, "Task Tag", this.taskTextStyle());
    acceptor.acceptDefaultHighlighting(DefaultHighlightingConfiguration.STRING_ID, "String", this.stringTextStyle());
    acceptor.acceptDefaultHighlighting(DefaultHighlightingConfiguration.NUMBER_ID, "Number", this.numberTextStyle());
    acceptor.acceptDefaultHighlighting(DefaultHighlightingConfiguration.DEFAULT_ID, "Default", this.defaultTextStyle());
    acceptor.acceptDefaultHighlighting(DefaultHighlightingConfiguration.INVALID_TOKEN_ID, "Invalid Symbol", this.errorTextStyle());
    acceptor.acceptDefaultHighlighting(IoTHighlightingConfiguration.EXTERNAL_ID, "External", this.externalTextStyle());
    acceptor.acceptDefaultHighlighting(IoTHighlightingConfiguration.EXTERNAL_TYPE_ID, "External Variable Type", this.typeTextStyle());
    acceptor.acceptDefaultHighlighting(IoTHighlightingConfiguration.CHANNEL_TYPE_ID, "Channel Type", this.typeTextStyle());
  }
  
  @Override
  public TextStyle defaultTextStyle() {
    TextStyle _xblockexpression = null;
    {
      final TextStyle textStyle = new TextStyle();
      RGB _rGB = new RGB(42, 0, 255);
      textStyle.setColor(_rGB);
      _xblockexpression = textStyle;
    }
    return _xblockexpression;
  }
  
  public TextStyle externalTextStyle() {
    TextStyle _xblockexpression = null;
    {
      final TextStyle textStyle = new TextStyle();
      RGB _rGB = new RGB(34, 188, 198);
      textStyle.setColor(_rGB);
      textStyle.setStyle(SWT.BOLD);
      _xblockexpression = textStyle;
    }
    return _xblockexpression;
  }
  
  public TextStyle typeTextStyle() {
    TextStyle _xblockexpression = null;
    {
      final TextStyle textStyle = new TextStyle();
      RGB _rGB = new RGB(196, 17, 144);
      textStyle.setColor(_rGB);
      textStyle.setStyle(SWT.BOLD);
      _xblockexpression = textStyle;
    }
    return _xblockexpression;
  }
  
  @Override
  public TextStyle errorTextStyle() {
    TextStyle _xblockexpression = null;
    {
      final TextStyle textStyle = this.defaultTextStyle().copy();
      RGB _rGB = new RGB(1, 1, 1);
      textStyle.setColor(_rGB);
      _xblockexpression = textStyle;
    }
    return _xblockexpression;
  }
  
  @Override
  public TextStyle numberTextStyle() {
    TextStyle _xblockexpression = null;
    {
      final TextStyle textStyle = this.defaultTextStyle().copy();
      RGB _rGB = new RGB(0, 168, 45);
      textStyle.setColor(_rGB);
      _xblockexpression = textStyle;
    }
    return _xblockexpression;
  }
  
  @Override
  public TextStyle stringTextStyle() {
    TextStyle _xblockexpression = null;
    {
      final TextStyle textStyle = this.defaultTextStyle().copy();
      RGB _rGB = new RGB(249, 141, 19);
      textStyle.setColor(_rGB);
      _xblockexpression = textStyle;
    }
    return _xblockexpression;
  }
  
  @Override
  public TextStyle commentTextStyle() {
    TextStyle _xblockexpression = null;
    {
      final TextStyle textStyle = this.defaultTextStyle().copy();
      RGB _rGB = new RGB(52, 73, 94);
      textStyle.setColor(_rGB);
      textStyle.setStyle(SWT.ITALIC);
      _xblockexpression = textStyle;
    }
    return _xblockexpression;
  }
  
  @Override
  public TextStyle taskTextStyle() {
    TextStyle _xblockexpression = null;
    {
      final TextStyle textStyle = this.defaultTextStyle().copy();
      RGB _rGB = new RGB(41, 128, 185);
      textStyle.setColor(_rGB);
      textStyle.setStyle(SWT.BOLD);
      _xblockexpression = textStyle;
    }
    return _xblockexpression;
  }
  
  @Override
  public TextStyle keywordTextStyle() {
    TextStyle _xblockexpression = null;
    {
      final TextStyle textStyle = this.defaultTextStyle().copy();
      RGB _rGB = new RGB(150, 0, 12);
      textStyle.setColor(_rGB);
      textStyle.setStyle(SWT.BOLD);
      _xblockexpression = textStyle;
    }
    return _xblockexpression;
  }
  
  @Override
  public TextStyle punctuationTextStyle() {
    TextStyle _xblockexpression = null;
    {
      final TextStyle textStyle = this.defaultTextStyle().copy();
      RGB _rGB = new RGB(137, 0, 115);
      textStyle.setColor(_rGB);
      _xblockexpression = textStyle;
    }
    return _xblockexpression;
  }
}
