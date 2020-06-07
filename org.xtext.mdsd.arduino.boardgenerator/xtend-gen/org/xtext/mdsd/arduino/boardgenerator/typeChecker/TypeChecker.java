package org.xtext.mdsd.arduino.boardgenerator.typeChecker;

import com.google.common.base.Objects;
import java.util.Arrays;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.EcoreUtil2;
import org.eclipse.xtext.xbase.lib.Exceptions;
import org.xtext.mdsd.arduino.boardgenerator.ioT.BooleanLiteral;
import org.xtext.mdsd.arduino.boardgenerator.ioT.Channel;
import org.xtext.mdsd.arduino.boardgenerator.ioT.ChannelConfig;
import org.xtext.mdsd.arduino.boardgenerator.ioT.Conditional;
import org.xtext.mdsd.arduino.boardgenerator.ioT.Div;
import org.xtext.mdsd.arduino.boardgenerator.ioT.Exponent;
import org.xtext.mdsd.arduino.boardgenerator.ioT.Expression;
import org.xtext.mdsd.arduino.boardgenerator.ioT.External;
import org.xtext.mdsd.arduino.boardgenerator.ioT.FunctionInputType;
import org.xtext.mdsd.arduino.boardgenerator.ioT.Map;
import org.xtext.mdsd.arduino.boardgenerator.ioT.Minus;
import org.xtext.mdsd.arduino.boardgenerator.ioT.MqttClient;
import org.xtext.mdsd.arduino.boardgenerator.ioT.Mul;
import org.xtext.mdsd.arduino.boardgenerator.ioT.Negation;
import org.xtext.mdsd.arduino.boardgenerator.ioT.NumberLiteral;
import org.xtext.mdsd.arduino.boardgenerator.ioT.Pipeline;
import org.xtext.mdsd.arduino.boardgenerator.ioT.Plus;
import org.xtext.mdsd.arduino.boardgenerator.ioT.Reference;
import org.xtext.mdsd.arduino.boardgenerator.ioT.Serial;
import org.xtext.mdsd.arduino.boardgenerator.ioT.StringLiteral;
import org.xtext.mdsd.arduino.boardgenerator.ioT.Wifi;

@SuppressWarnings("all")
public class TypeChecker {
  public enum Type {
    INT,
    
    DOUBLE,
    
    BOOLEAN,
    
    STRING,
    
    NUMBER,
    
    INVALID;
  }
  
  public enum ChannelType {
    MQTT,
    
    SERIAL,
    
    CLOUD,
    
    INVALID;
  }
  
  protected TypeChecker.Type _type(final NumberLiteral number) {
    try {
      final String value = number.getNumb();
      boolean _matched = false;
      boolean _contains = value.contains(".");
      if (_contains) {
        _matched=true;
        return TypeChecker.Type.DOUBLE;
      }
      if (!_matched) {
        boolean _contains_1 = value.contains("0x");
        if (_contains_1) {
          _matched=true;
          return TypeChecker.Type.INT;
        }
      }
      if (!_matched) {
        boolean _contains_2 = value.toLowerCase().contains("e");
        if (_contains_2) {
          _matched=true;
          return TypeChecker.Type.DOUBLE;
        }
      }
      return TypeChecker.Type.INT;
    } catch (final Throwable _t) {
      if (_t instanceof Exception) {
        return TypeChecker.Type.INVALID;
      } else {
        throw Exceptions.sneakyThrow(_t);
      }
    }
  }
  
  protected TypeChecker.Type _type(final StringLiteral str) {
    return TypeChecker.Type.STRING;
  }
  
  protected TypeChecker.Type _type(final BooleanLiteral bool) {
    return TypeChecker.Type.BOOLEAN;
  }
  
  protected TypeChecker.Type _type(final Expression expression) {
    return TypeChecker.Type.BOOLEAN;
  }
  
  protected TypeChecker.Type _type(final Conditional conditional) {
    TypeChecker.Type _xblockexpression = null;
    {
      final TypeChecker.Type correctType = this.type(conditional.getCorrect());
      final TypeChecker.Type incorrectType = this.type(conditional.getIncorrect());
      final TypeChecker.Type numberType = this.evaluateNumeralTypes(correctType, incorrectType);
      TypeChecker.Type _xifexpression = null;
      boolean _equals = Objects.equal(numberType, TypeChecker.Type.INVALID);
      if (_equals) {
        TypeChecker.Type _xifexpression_1 = null;
        boolean _equals_1 = Objects.equal(correctType, incorrectType);
        if (_equals_1) {
          _xifexpression_1 = correctType;
        } else {
          _xifexpression_1 = TypeChecker.Type.INVALID;
        }
        _xifexpression = _xifexpression_1;
      } else {
        _xifexpression = numberType;
      }
      _xblockexpression = _xifexpression;
    }
    return _xblockexpression;
  }
  
  public boolean isNumberType(final TypeChecker.Type type) {
    return ((Objects.equal(type, TypeChecker.Type.INT) || Objects.equal(type, TypeChecker.Type.DOUBLE)) || Objects.equal(type, TypeChecker.Type.NUMBER));
  }
  
  public TypeChecker.Type evaluateNumeralTypes(final TypeChecker.Type type1, final TypeChecker.Type type2) {
    TypeChecker.Type _xifexpression = null;
    boolean _not = (!(this.isNumberType(type1) && this.isNumberType(type2)));
    if (_not) {
      _xifexpression = TypeChecker.Type.INVALID;
    } else {
      TypeChecker.Type _xifexpression_1 = null;
      if ((((Objects.equal(type1, TypeChecker.Type.DOUBLE) || Objects.equal(type2, TypeChecker.Type.DOUBLE)) || Objects.equal(type1, TypeChecker.Type.NUMBER)) || Objects.equal(type2, TypeChecker.Type.NUMBER))) {
        _xifexpression_1 = TypeChecker.Type.DOUBLE;
      } else {
        _xifexpression_1 = TypeChecker.Type.INT;
      }
      _xifexpression = _xifexpression_1;
    }
    return _xifexpression;
  }
  
  public TypeChecker.Type lastType(final Pipeline pipeline) {
    TypeChecker.Type type = TypeChecker.Type.INT;
    Pipeline pipe = pipeline;
    while ((pipe != null)) {
      {
        if ((pipe instanceof Map)) {
          final Map mapPipeline = ((Map) pipe);
          type = this.type(mapPipeline.getExpression());
        } else {
          type = TypeChecker.Type.DOUBLE;
        }
        pipe = pipe.getNext();
      }
    }
    return type;
  }
  
  protected TypeChecker.Type _type(final Plus plus) {
    TypeChecker.Type _xtrycatchfinallyexpression = null;
    try {
      TypeChecker.Type _xifexpression = null;
      if ((Objects.equal(this.type(plus.getLeft()), TypeChecker.Type.STRING) || Objects.equal(this.type(plus.getRight()), TypeChecker.Type.STRING))) {
        _xifexpression = TypeChecker.Type.STRING;
      } else {
        _xifexpression = this.evaluateNumeralTypes(this.type(plus.getLeft()), this.type(plus.getRight()));
      }
      _xtrycatchfinallyexpression = _xifexpression;
    } catch (final Throwable _t) {
      if (_t instanceof Exception) {
        return TypeChecker.Type.INVALID;
      } else {
        throw Exceptions.sneakyThrow(_t);
      }
    }
    return _xtrycatchfinallyexpression;
  }
  
  protected TypeChecker.Type _type(final Minus minus) {
    TypeChecker.Type _xtrycatchfinallyexpression = null;
    try {
      _xtrycatchfinallyexpression = this.evaluateNumeralTypes(this.type(minus.getLeft()), this.type(minus.getRight()));
    } catch (final Throwable _t) {
      if (_t instanceof Exception) {
        return TypeChecker.Type.INVALID;
      } else {
        throw Exceptions.sneakyThrow(_t);
      }
    }
    return _xtrycatchfinallyexpression;
  }
  
  protected TypeChecker.Type _type(final Mul multiply) {
    TypeChecker.Type _xtrycatchfinallyexpression = null;
    try {
      _xtrycatchfinallyexpression = this.evaluateNumeralTypes(this.type(multiply.getLeft()), this.type(multiply.getRight()));
    } catch (final Throwable _t) {
      if (_t instanceof Exception) {
        return TypeChecker.Type.INVALID;
      } else {
        throw Exceptions.sneakyThrow(_t);
      }
    }
    return _xtrycatchfinallyexpression;
  }
  
  protected TypeChecker.Type _type(final Div division) {
    TypeChecker.Type _xtrycatchfinallyexpression = null;
    try {
      _xtrycatchfinallyexpression = this.evaluateNumeralTypes(this.type(division.getLeft()), this.type(division.getRight()));
    } catch (final Throwable _t) {
      if (_t instanceof Exception) {
        return TypeChecker.Type.INVALID;
      } else {
        throw Exceptions.sneakyThrow(_t);
      }
    }
    return _xtrycatchfinallyexpression;
  }
  
  protected TypeChecker.Type _type(final Negation negation) {
    TypeChecker.Type _xtrycatchfinallyexpression = null;
    try {
      TypeChecker.Type _xifexpression = null;
      boolean _isNumberType = this.isNumberType(this.type(negation.getValue()));
      boolean _not = (!_isNumberType);
      if (_not) {
        _xifexpression = TypeChecker.Type.INVALID;
      } else {
        _xifexpression = this.type(negation.getValue());
      }
      _xtrycatchfinallyexpression = _xifexpression;
    } catch (final Throwable _t) {
      if (_t instanceof Exception) {
        return TypeChecker.Type.INVALID;
      } else {
        throw Exceptions.sneakyThrow(_t);
      }
    }
    return _xtrycatchfinallyexpression;
  }
  
  protected TypeChecker.Type _type(final Exponent exponent) {
    TypeChecker.Type _xtrycatchfinallyexpression = null;
    try {
      TypeChecker.Type _xifexpression = null;
      TypeChecker.Type _evaluateNumeralTypes = this.evaluateNumeralTypes(this.type(exponent.getBase()), this.type(exponent.getPower()));
      boolean _equals = Objects.equal(_evaluateNumeralTypes, TypeChecker.Type.INVALID);
      if (_equals) {
        _xifexpression = TypeChecker.Type.INVALID;
      } else {
        _xifexpression = TypeChecker.Type.DOUBLE;
      }
      _xtrycatchfinallyexpression = _xifexpression;
    } catch (final Throwable _t) {
      if (_t instanceof Exception) {
        return TypeChecker.Type.INVALID;
      } else {
        throw Exceptions.sneakyThrow(_t);
      }
    }
    return _xtrycatchfinallyexpression;
  }
  
  public EObject getPipelineChildOf(final EObject pipeline) {
    EObject parent = pipeline.eContainer();
    while ((parent instanceof Pipeline)) {
      boolean _matched = false;
      if (parent instanceof Map) {
        _matched=true;
        return parent;
      }
      if (!_matched) {
        if (parent instanceof External) {
          _matched=true;
          return parent;
        }
      }
      parent = ((Pipeline)parent).eContainer();
    }
    return null;
  }
  
  protected TypeChecker.Type _type(final Reference reference) {
    TypeChecker.Type _xblockexpression = null;
    {
      TypeChecker.Type type = TypeChecker.Type.NUMBER;
      EObject parent = this.getPipelineChildOf(EcoreUtil2.<Pipeline>getContainerOfType(reference, Pipeline.class));
      if ((parent instanceof Map)) {
        Map map = ((Map) parent);
        Expression expression = map.getExpression();
        if (((expression != null) || (map.getOutput() != null))) {
          type = this.type(expression);
        }
      }
      _xblockexpression = type;
    }
    return _xblockexpression;
  }
  
  protected TypeChecker.Type _type(final FunctionInputType functionType) {
    final String name = functionType.getName().toString();
    if (name != null) {
      switch (name) {
        case "num":
          return TypeChecker.Type.NUMBER;
        case "str":
          return TypeChecker.Type.STRING;
        case "bool":
          return TypeChecker.Type.BOOLEAN;
        default:
          return TypeChecker.Type.INVALID;
      }
    } else {
      return TypeChecker.Type.INVALID;
    }
  }
  
  public String ctype(final TypeChecker.Type type) {
    boolean _equals = Objects.equal(type, TypeChecker.Type.BOOLEAN);
    if (_equals) {
      return "bool";
    }
    boolean _equals_1 = Objects.equal(type, TypeChecker.Type.INT);
    if (_equals_1) {
      return "int";
    }
    return "float";
  }
  
  protected boolean _ifInvalid(final TypeChecker.Type type) {
    boolean _xblockexpression = false;
    {
      boolean _equals = Objects.equal(type, TypeChecker.Type.INVALID);
      if (_equals) {
        return true;
      }
      _xblockexpression = false;
    }
    return _xblockexpression;
  }
  
  protected boolean _ifInvalid(final TypeChecker.ChannelType type) {
    boolean _xblockexpression = false;
    {
      boolean _equals = Objects.equal(type, TypeChecker.ChannelType.INVALID);
      if (_equals) {
        return true;
      }
      _xblockexpression = false;
    }
    return _xblockexpression;
  }
  
  public boolean ifSerialType(final Channel channel) {
    boolean _xblockexpression = false;
    {
      TypeChecker.ChannelType _channelType = this.getChannelType(channel);
      boolean _equals = Objects.equal(_channelType, TypeChecker.ChannelType.SERIAL);
      if (_equals) {
        return true;
      }
      _xblockexpression = false;
    }
    return _xblockexpression;
  }
  
  public boolean ifMQTTType(final Channel channel) {
    boolean _xblockexpression = false;
    {
      TypeChecker.ChannelType _channelType = this.getChannelType(channel);
      boolean _equals = Objects.equal(_channelType, TypeChecker.ChannelType.MQTT);
      if (_equals) {
        return true;
      }
      _xblockexpression = false;
    }
    return _xblockexpression;
  }
  
  public boolean ifServerType(final Channel channel) {
    boolean _xblockexpression = false;
    {
      TypeChecker.ChannelType _channelType = this.getChannelType(channel);
      boolean _equals = Objects.equal(_channelType, TypeChecker.ChannelType.CLOUD);
      if (_equals) {
        return true;
      }
      _xblockexpression = false;
    }
    return _xblockexpression;
  }
  
  public TypeChecker.ChannelType getChannelType(final Channel channel) {
    org.xtext.mdsd.arduino.boardgenerator.ioT.ChannelType _ctype = channel.getCtype();
    String _name = null;
    if (_ctype!=null) {
      _name=_ctype.getName();
    }
    final String type = _name;
    if ((type != null)) {
      boolean _equals = Objects.equal(type, "mqtt");
      if (_equals) {
        return TypeChecker.ChannelType.MQTT;
      } else {
        boolean _equals_1 = Objects.equal(type, "cloud");
        if (_equals_1) {
          return TypeChecker.ChannelType.CLOUD;
        } else {
          boolean _equals_2 = Objects.equal(type, "serial");
          if (_equals_2) {
            return TypeChecker.ChannelType.SERIAL;
          } else {
            return TypeChecker.ChannelType.INVALID;
          }
        }
      }
    } else {
      final ChannelConfig config = channel.getConfig();
      if ((config instanceof Wifi)) {
        return TypeChecker.ChannelType.CLOUD;
      } else {
        if ((config instanceof Serial)) {
          return TypeChecker.ChannelType.SERIAL;
        } else {
          if ((config instanceof MqttClient)) {
            return TypeChecker.ChannelType.MQTT;
          } else {
            return TypeChecker.ChannelType.INVALID;
          }
        }
      }
    }
  }
  
  public boolean xOr(final boolean first, final boolean second) {
    if ((first == second)) {
      return false;
    }
    return true;
  }
  
  public TypeChecker.Type type(final EObject bool) {
    if (bool instanceof BooleanLiteral) {
      return _type((BooleanLiteral)bool);
    } else if (bool instanceof Conditional) {
      return _type((Conditional)bool);
    } else if (bool instanceof Div) {
      return _type((Div)bool);
    } else if (bool instanceof Exponent) {
      return _type((Exponent)bool);
    } else if (bool instanceof Minus) {
      return _type((Minus)bool);
    } else if (bool instanceof Mul) {
      return _type((Mul)bool);
    } else if (bool instanceof Negation) {
      return _type((Negation)bool);
    } else if (bool instanceof NumberLiteral) {
      return _type((NumberLiteral)bool);
    } else if (bool instanceof Plus) {
      return _type((Plus)bool);
    } else if (bool instanceof Reference) {
      return _type((Reference)bool);
    } else if (bool instanceof StringLiteral) {
      return _type((StringLiteral)bool);
    } else if (bool instanceof Expression) {
      return _type((Expression)bool);
    } else if (bool instanceof FunctionInputType) {
      return _type((FunctionInputType)bool);
    } else {
      throw new IllegalArgumentException("Unhandled parameter types: " +
        Arrays.<Object>asList(bool).toString());
    }
  }
  
  public boolean ifInvalid(final Enum<?> type) {
    if (type instanceof TypeChecker.ChannelType) {
      return _ifInvalid((TypeChecker.ChannelType)type);
    } else if (type instanceof TypeChecker.Type) {
      return _ifInvalid((TypeChecker.Type)type);
    } else {
      throw new IllegalArgumentException("Unhandled parameter types: " +
        Arrays.<Object>asList(type).toString());
    }
  }
}
