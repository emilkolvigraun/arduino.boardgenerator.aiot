package org.xtext.mdsd.arduino.boardgenerator.hover;

import com.google.common.base.Objects;
import java.util.List;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.jface.internal.text.html.HTMLPrinter;
import org.eclipse.jface.text.IRegion;
import org.eclipse.jface.viewers.ILabelProvider;
import org.eclipse.swt.graphics.RGB;
import org.eclipse.xtend2.lib.StringConcatenation;
import org.eclipse.xtext.EcoreUtil2;
import org.eclipse.xtext.ui.editor.hover.html.DefaultEObjectHoverProvider;
import org.eclipse.xtext.ui.editor.hover.html.XtextBrowserInformationControlInput;
import org.eclipse.xtext.xbase.lib.ExclusiveRange;
import org.xtext.mdsd.arduino.boardgenerator.ioT.AbstractBoard;
import org.xtext.mdsd.arduino.boardgenerator.ioT.BoardVersion;
import org.xtext.mdsd.arduino.boardgenerator.ioT.Channel;
import org.xtext.mdsd.arduino.boardgenerator.ioT.ChannelType;
import org.xtext.mdsd.arduino.boardgenerator.ioT.Command;
import org.xtext.mdsd.arduino.boardgenerator.ioT.ExtendsBoard;
import org.xtext.mdsd.arduino.boardgenerator.ioT.ExternalSensor;
import org.xtext.mdsd.arduino.boardgenerator.ioT.Frequency;
import org.xtext.mdsd.arduino.boardgenerator.ioT.Function;
import org.xtext.mdsd.arduino.boardgenerator.ioT.MQTT;
import org.xtext.mdsd.arduino.boardgenerator.ioT.Map;
import org.xtext.mdsd.arduino.boardgenerator.ioT.NewBoard;
import org.xtext.mdsd.arduino.boardgenerator.ioT.OnboardSensor;
import org.xtext.mdsd.arduino.boardgenerator.ioT.Reference;
import org.xtext.mdsd.arduino.boardgenerator.ioT.Sampler;
import org.xtext.mdsd.arduino.boardgenerator.ioT.Sensor;
import org.xtext.mdsd.arduino.boardgenerator.ioT.SensorType;
import org.xtext.mdsd.arduino.boardgenerator.ioT.SensorVariables;
import org.xtext.mdsd.arduino.boardgenerator.ioT.SerialConfig;
import org.xtext.mdsd.arduino.boardgenerator.ioT.Variable;
import org.xtext.mdsd.arduino.boardgenerator.ioT.WifiConfig;
import org.xtext.mdsd.arduino.boardgenerator.validation.Boards;

@SuppressWarnings("all")
public class IoTHoverProvider extends DefaultEObjectHoverProvider {
  public String getBoardString(final String name, final BoardVersion version, final EObject object) {
    String _xblockexpression = null;
    {
      StringConcatenation _builder = new StringConcatenation();
      _builder.append("<b>");
      _builder.append(name);
      _builder.append("</b> -> ");
      Boards _boardSupported = Boards.getBoardSupported(version);
      _builder.append(_boardSupported);
      String str = _builder.toString();
      if ((object instanceof ExtendsBoard)) {
        String _str = str;
        StringConcatenation _builder_1 = new StringConcatenation();
        _builder_1.append("<br> Extends: <b>");
        String _name = ((ExtendsBoard)object).getAbstractBoard().getName();
        _builder_1.append(_name);
        _builder_1.append("</b>");
        str = (_str + _builder_1);
      }
      StringConcatenation _builder_2 = new StringConcatenation();
      _builder_2.append("<br> Class: <b>");
      String _name_1 = object.eClass().getName();
      _builder_2.append(_name_1);
      _builder_2.append("</b>");
      _xblockexpression = (str + _builder_2);
    }
    return _xblockexpression;
  }
  
  public String getSensorString(final Sensor sensor) {
    String _xblockexpression = null;
    {
      StringConcatenation _builder = new StringConcatenation();
      _builder.append("<b>");
      String _name = sensor.getName();
      _builder.append(_name);
      _builder.append("</b> -> ");
      String _name_1 = sensor.getSensortype().getName();
      _builder.append(_name_1);
      _builder.append(" <br> Type: <b>");
      String _name_2 = sensor.getSensortype().eClass().getName();
      _builder.append(_name_2);
      _builder.append("</b> <br> Class: <b>");
      String _name_3 = sensor.eClass().getName();
      _builder.append(_name_3);
      _builder.append("</b>");
      String str = _builder.toString();
      SensorType _sensortype = sensor.getSensortype();
      if ((_sensortype instanceof ExternalSensor)) {
        String _str = str;
        StringConcatenation _builder_1 = new StringConcatenation();
        _builder_1.append("<br>vcc: ");
        int _vcc = sensor.getVcc();
        _builder_1.append(_vcc);
        str = (_str + _builder_1);
      }
      _xblockexpression = str;
    }
    return _xblockexpression;
  }
  
  public String getSensorVariablesAssociation(final SensorVariables sensorVariables) {
    String _xblockexpression = null;
    {
      Sensor sensor = EcoreUtil2.<Sensor>getContainerOfType(sensorVariables, Sensor.class);
      StringConcatenation _builder = new StringConcatenation();
      String str = _builder.toString();
      StringConcatenation _builder_1 = new StringConcatenation();
      _builder_1.append("<b>");
      String _name = sensorVariables.getName();
      _builder_1.append(_name);
      _builder_1.append("</b> -> ( ");
      String header = _builder_1.toString();
      int _size = sensorVariables.getIds().size();
      ExclusiveRange _doubleDotLessThan = new ExclusiveRange(0, _size, true);
      for (final Integer i : _doubleDotLessThan) {
        {
          SensorType sensorType = sensor.getSensortype();
          String name = sensorVariables.getIds().get((i).intValue()).getName();
          String _header = header;
          String _xifexpression = null;
          boolean _notEquals = (!Objects.equal(name, "_"));
          if (_notEquals) {
            _xifexpression = (("<b>" + name) + "</b> ");
          } else {
            _xifexpression = "";
          }
          header = (_header + _xifexpression);
          if ((sensorType instanceof ExternalSensor)) {
            final String pin = ((ExternalSensor)sensorType).getPins().get((i).intValue()).toString();
            String _str = str;
            str = (_str + (((("<b>" + name) + "</b> -> pin: <b>") + pin) + "</b><br>"));
          }
          if (((sensorType instanceof OnboardSensor) && (!Objects.equal(name, "_")))) {
            String _str_1 = str;
            String _string = i.toString();
            String _plus = ((("Output: <b>" + name) + "</b> -> index: <b>") + _string);
            String _plus_1 = (_plus + "</b><br>");
            str = (_str_1 + _plus_1);
          }
        }
      }
      _xblockexpression = ((header + ")<br>") + str);
    }
    return _xblockexpression;
  }
  
  public String getVariableString(final Variable variable) {
    String _xblockexpression = null;
    {
      Map map = EcoreUtil2.<Map>getContainerOfType(variable, Map.class);
      if ((map != null)) {
        StringConcatenation _builder = new StringConcatenation();
        _builder.append("map -> ");
        String _name = variable.getName();
        _builder.append(_name);
        _builder.append("<br>Class: <b>");
        String _name_1 = map.getExpression().eClass().getName();
        _builder.append(_name_1);
        _builder.append("</b>");
        return _builder.toString();
      }
      Sensor sensor = EcoreUtil2.<Sensor>getContainerOfType(variable, Sensor.class);
      _xblockexpression = this.getSensorVariablesAssociation(sensor.getVars());
    }
    return _xblockexpression;
  }
  
  public String getReferenceString(final Reference reference) {
    String _xblockexpression = null;
    {
      Map map = EcoreUtil2.<Map>getContainerOfType(reference, Map.class);
      if (((map != null) && Objects.equal(map.getOutput().getName().toString(), reference.getRef().toString()))) {
        return this.getVariableString(map.getOutput());
      }
      Sensor sensor = EcoreUtil2.<Sensor>getContainerOfType(reference, Sensor.class);
      _xblockexpression = this.getSensorVariablesAssociation(sensor.getVars());
    }
    return _xblockexpression;
  }
  
  public List<Integer> getPins(final SensorType sensor) {
    return ((ExternalSensor) sensor).getPins();
  }
  
  public String getChannelString(final Channel channel) {
    String _xblockexpression = null;
    {
      StringConcatenation _builder = new StringConcatenation();
      String _name = channel.getName();
      _builder.append(_name);
      _builder.append(" -> ");
      String str = _builder.toString();
      ChannelType _channeltype = channel.getChanneltype();
      boolean _matched = false;
      if (_channeltype instanceof WifiConfig) {
        _matched=true;
        String _str = str;
        str = (_str + "<b>wifi</b>");
      }
      if (!_matched) {
        if (_channeltype instanceof SerialConfig) {
          _matched=true;
          String _str = str;
          str = (_str + "<b>serial</b>");
        }
      }
      if (!_matched) {
        if (_channeltype instanceof MQTT) {
          _matched=true;
          String _str = str;
          str = (_str + "<b>mqtt</b>");
        }
      }
      StringConcatenation _builder_1 = new StringConcatenation();
      _builder_1.append("<br> Class: <b>");
      String _name_1 = channel.eClass().getName();
      _builder_1.append(_name_1);
      _builder_1.append("</b>");
      _xblockexpression = (str + _builder_1);
    }
    return _xblockexpression;
  }
  
  public String getFunctionString(final Function function) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("Function: <b>");
    String _name = function.getName();
    _builder.append(_name);
    _builder.append("</b> <br>Class: <b>");
    String _name_1 = function.eClass().getName();
    _builder.append(_name_1);
    _builder.append("</b><br>Input #: <b>");
    String _string = Integer.valueOf(function.getInput().size()).toString();
    _builder.append(_string);
    _builder.append("</b><br>Ouput #: <b>");
    String _string_1 = Integer.valueOf(function.getOutput().size()).toString();
    _builder.append(_string_1);
    _builder.append("</b>");
    return _builder.toString();
  }
  
  public String getOnboardSensorString(final OnboardSensor sensor) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("Sensor: <b>");
    String _name = sensor.getName();
    _builder.append(_name);
    _builder.append("</b> <br>Class: <b>");
    String _name_1 = sensor.eClass().getName();
    _builder.append(_name_1);
    _builder.append("</b>");
    return _builder.toString();
  }
  
  public String getExternalSensorString(final ExternalSensor sensor) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("Sensor: <b>");
    String _name = sensor.getName();
    _builder.append(_name);
    _builder.append("</b> <br>Class: <b>");
    String _name_1 = sensor.eClass().getName();
    _builder.append(_name_1);
    _builder.append("</b><br>Pins: <b>");
    String _replace = sensor.getPins().toString().replace("]", "").replace("[", "");
    _builder.append(_replace);
    _builder.append("</b>");
    return _builder.toString();
  }
  
  public String getSampleString(final Sampler sampler) {
    String _xblockexpression = null;
    {
      if ((sampler instanceof Frequency)) {
        StringConcatenation _builder = new StringConcatenation();
        _builder.append("frequency");
        return _builder.toString();
      }
      if ((sampler instanceof Command)) {
        StringConcatenation _builder_1 = new StringConcatenation();
        _builder_1.append("command");
        return _builder_1.toString();
      }
      StringConcatenation _builder_2 = new StringConcatenation();
      _xblockexpression = _builder_2.toString();
    }
    return _xblockexpression;
  }
  
  public String getInstanceStr(final EObject object) {
    String _xblockexpression = null;
    {
      if ((object instanceof NewBoard)) {
        NewBoard board = ((NewBoard) object);
        return this.getBoardString(board.getName(), board.getVersion(), object);
      }
      if ((object instanceof AbstractBoard)) {
        AbstractBoard board_1 = ((AbstractBoard) object);
        return this.getBoardString(board_1.getName(), board_1.getVersion(), object);
      }
      if ((object instanceof ExtendsBoard)) {
        ExtendsBoard board_2 = ((ExtendsBoard) object);
        return this.getBoardString(board_2.getName(), board_2.getAbstractBoard().getVersion(), object);
      }
      if ((object instanceof Sensor)) {
        return this.getSensorString(((Sensor) object));
      }
      if ((object instanceof SensorVariables)) {
        return this.getSensorVariablesAssociation(((SensorVariables) object));
      }
      if ((object instanceof Variable)) {
        return this.getVariableString(((Variable) object));
      }
      if ((object instanceof Channel)) {
        return this.getChannelString(((Channel) object));
      }
      if ((object instanceof Reference)) {
        return this.getReferenceString(((Reference) object));
      }
      if ((object instanceof OnboardSensor)) {
        return this.getOnboardSensorString(((OnboardSensor) object));
      }
      if ((object instanceof ExternalSensor)) {
        return this.getExternalSensorString(((ExternalSensor) object));
      }
      if ((object instanceof Function)) {
        return this.getFunctionString(((Function) object));
      }
      if ((object instanceof BoardVersion)) {
        StringConcatenation _builder = new StringConcatenation();
        _builder.append("Version: <b>");
        String _string = Boards.getBoardSupported(((BoardVersion) object)).toString();
        _builder.append(_string);
        _builder.append("</b>");
        return _builder.toString();
      }
      StringConcatenation _builder_1 = new StringConcatenation();
      _builder_1.append("Class: <b>");
      String _name = object.eClass().getName();
      _builder_1.append(_name);
      _builder_1.append("</b>");
      _xblockexpression = _builder_1.toString();
    }
    return _xblockexpression;
  }
  
  @Override
  public String getHoverInfoAsHtml(final EObject o) {
    return this.getInstanceStr(o);
  }
  
  @Override
  public XtextBrowserInformationControlInput getHoverInfo(final EObject element, final IRegion hoverRegion, final XtextBrowserInformationControlInput previous) {
    String html = this.getHoverInfoAsHtml(element);
    boolean _notEquals = (!Objects.equal(html, null));
    if (_notEquals) {
      StringBuffer buffer = new StringBuffer(html);
      RGB _rGB = new RGB(236, 240, 241);
      RGB _rGB_1 = new RGB(23, 32, 42);
      HTMLPrinter.insertPageProlog(buffer, 0, _rGB, _rGB_1, this.getStyleSheet());
      HTMLPrinter.addPageEpilog(buffer);
      html = buffer.toString();
      ILabelProvider _labelProvider = this.getLabelProvider();
      return new XtextBrowserInformationControlInput(previous, element, html, _labelProvider);
    }
    return null;
  }
}
