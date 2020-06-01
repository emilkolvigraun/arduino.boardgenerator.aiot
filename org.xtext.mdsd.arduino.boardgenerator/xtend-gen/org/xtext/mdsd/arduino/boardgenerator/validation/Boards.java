package org.xtext.mdsd.arduino.boardgenerator.validation;

import com.google.common.base.Objects;
import java.util.Map;
import java.util.Set;
import org.eclipse.xtend2.lib.StringConcatenation;
import org.xtext.mdsd.arduino.boardgenerator.ioT.BoardVersion;
import org.xtext.mdsd.arduino.boardgenerator.validation.SDParams;
import org.xtext.mdsd.arduino.boardgenerator.validation.SupportedBoards;

@SuppressWarnings("all")
public class Boards {
  private String type;
  
  private String model;
  
  private Map<String, Integer> sensors;
  
  private Map<String, Integer> sd;
  
  public static Boards getBoardSupported(final BoardVersion board) {
    Boards _xblockexpression = null;
    {
      if ((board == null)) {
        return Boards.getBoardSupported("", "");
      }
      _xblockexpression = Boards.getBoardSupported(board.getType(), board.getModel());
    }
    return _xblockexpression;
  }
  
  public static Boards getBoardSupported(final String type, final String model) {
    return new Boards(type, model);
  }
  
  public Boards(final String type, final String model) {
    String _lowerCase = type.toLowerCase();
    boolean _equals = Objects.equal(_lowerCase, "esp32");
    if (_equals) {
      String _lowerCase_1 = model.toLowerCase();
      if (_lowerCase_1 != null) {
        switch (_lowerCase_1) {
          case "wrover":
            this.sensors = SupportedBoards.WROVER;
            this.sd = SDParams.WROVER;
            break;
          default:
            this.sensors = null;
            break;
        }
      } else {
        this.sensors = null;
      }
    }
    this.type = type;
    this.model = model;
  }
  
  public Set<String> getSensors() {
    Map<String, Integer> _sensors = this.sensors;
    Set<String> _keySet = null;
    if (_sensors!=null) {
      _keySet=_sensors.keySet();
    }
    return _keySet;
  }
  
  public boolean supportsSensor(final String sensor) {
    boolean _xblockexpression = false;
    {
      Set<String> sensors = this.getSensors();
      if ((sensors != null)) {
        boolean _contains = sensors.contains(sensor);
        if (_contains) {
          return true;
        }
      }
      _xblockexpression = false;
    }
    return _xblockexpression;
  }
  
  public int getSDMapping(final String param) {
    Integer _xifexpression = null;
    if ((this.sd == null)) {
      _xifexpression = Integer.valueOf((-1));
    } else {
      _xifexpression = this.sd.getOrDefault(param, Integer.valueOf((-1)));
    }
    return (_xifexpression).intValue();
  }
  
  public int getVariableCount(final String sensor) {
    Integer _xifexpression = null;
    if ((this.sensors == null)) {
      _xifexpression = Integer.valueOf((-1));
    } else {
      _xifexpression = this.sensors.getOrDefault(sensor, Integer.valueOf((-1)));
    }
    return (_xifexpression).intValue();
  }
  
  @Override
  public String toString() {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("Board(");
    _builder.append(this.type);
    _builder.append(":");
    _builder.append(this.model);
    _builder.append(")");
    return _builder.toString();
  }
}
