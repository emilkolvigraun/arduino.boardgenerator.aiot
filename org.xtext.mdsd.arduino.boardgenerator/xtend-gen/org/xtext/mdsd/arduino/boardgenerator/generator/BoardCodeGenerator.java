package org.xtext.mdsd.arduino.boardgenerator.generator;

import com.google.common.base.Objects;
import com.google.inject.Inject;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.function.Consumer;
import org.eclipse.emf.common.util.EList;
import org.eclipse.xtend2.lib.StringConcatenation;
import org.eclipse.xtext.xbase.lib.CollectionLiterals;
import org.eclipse.xtext.xbase.lib.Conversions;
import org.eclipse.xtext.xbase.lib.Extension;
import org.eclipse.xtext.xbase.lib.IterableExtensions;
import org.eclipse.xtext.xbase.lib.StringExtensions;
import org.xtext.mdsd.arduino.boardgenerator.generator.ExpressionParser;
import org.xtext.mdsd.arduino.boardgenerator.generator.GeneratorUtils;
import org.xtext.mdsd.arduino.boardgenerator.ioT.Board;
import org.xtext.mdsd.arduino.boardgenerator.ioT.Channel;
import org.xtext.mdsd.arduino.boardgenerator.ioT.ChannelConfig;
import org.xtext.mdsd.arduino.boardgenerator.ioT.Command;
import org.xtext.mdsd.arduino.boardgenerator.ioT.ExecutePipeline;
import org.xtext.mdsd.arduino.boardgenerator.ioT.Expression;
import org.xtext.mdsd.arduino.boardgenerator.ioT.External;
import org.xtext.mdsd.arduino.boardgenerator.ioT.ExternalSensor;
import org.xtext.mdsd.arduino.boardgenerator.ioT.Frequency;
import org.xtext.mdsd.arduino.boardgenerator.ioT.Function;
import org.xtext.mdsd.arduino.boardgenerator.ioT.FunctionInputType;
import org.xtext.mdsd.arduino.boardgenerator.ioT.Map;
import org.xtext.mdsd.arduino.boardgenerator.ioT.Max;
import org.xtext.mdsd.arduino.boardgenerator.ioT.Mean;
import org.xtext.mdsd.arduino.boardgenerator.ioT.Median;
import org.xtext.mdsd.arduino.boardgenerator.ioT.Min;
import org.xtext.mdsd.arduino.boardgenerator.ioT.MqttClient;
import org.xtext.mdsd.arduino.boardgenerator.ioT.Pipeline;
import org.xtext.mdsd.arduino.boardgenerator.ioT.Sampler;
import org.xtext.mdsd.arduino.boardgenerator.ioT.Sensor;
import org.xtext.mdsd.arduino.boardgenerator.ioT.SensorOutput;
import org.xtext.mdsd.arduino.boardgenerator.ioT.SensorType;
import org.xtext.mdsd.arduino.boardgenerator.ioT.SensorVariables;
import org.xtext.mdsd.arduino.boardgenerator.ioT.Serial;
import org.xtext.mdsd.arduino.boardgenerator.ioT.Variable;
import org.xtext.mdsd.arduino.boardgenerator.ioT.Wifi;
import org.xtext.mdsd.arduino.boardgenerator.ioT.WifiConfig;
import org.xtext.mdsd.arduino.boardgenerator.ioT.Window;
import org.xtext.mdsd.arduino.boardgenerator.typeChecker.TypeChecker;
import org.xtext.mdsd.arduino.boardgenerator.validation.Boards;

@SuppressWarnings("all")
public class BoardCodeGenerator {
  @Inject
  @Extension
  private GeneratorUtils _generatorUtils;
  
  @Inject
  @Extension
  private ExpressionParser _expressionParser;
  
  @Inject
  private TypeChecker typeChecker;
  
  private HashMap<Channel, String> env;
  
  private HashMap<String, Window> windows;
  
  public String generateBoardCode(final Board board, final List<Channel> channels, final int configLength, final int embeddedSensorsLength) {
    String _xblockexpression = null;
    {
      HashMap<Channel, String> _hashMap = new HashMap<Channel, String>();
      this.env = _hashMap;
      HashMap<String, Window> _hashMap_1 = new HashMap<String, Window>();
      this.windows = _hashMap_1;
      final ArrayList<Channel> globalChannels = CollectionLiterals.<Channel>newArrayList();
      final List<Sensor> sensors = this._generatorUtils.getBoardSensors(board);
      final Consumer<Sensor> _function = (Sensor s) -> {
        final Consumer<Channel> _function_1 = (Channel c) -> {
          globalChannels.add(c);
        };
        IterableExtensions.<Channel>toList(this._generatorUtils.getUniqueChannelsFromSensorOutput(IterableExtensions.<SensorOutput>toList(s.getOutput()))).forEach(_function_1);
      };
      sensors.forEach(_function);
      HashSet<Channel> globalUniqueChannels = new HashSet<Channel>(globalChannels);
      final List<Sensor> frequencySensors = this._generatorUtils.getSensorsSampleByFrequency(sensors);
      final List<Sensor> commandSensors = this._generatorUtils.getSensorsSampleByCommand(sensors);
      final Set<External> externals = this._generatorUtils.getExternalsInBoard(board);
      final String sampleLoop = this.generateLoop(sensors);
      StringConcatenation _builder = new StringConcatenation();
      {
        WifiConfig _wifiSelect = board.getWifiSelect();
        boolean _tripleNotEquals = (_wifiSelect != null);
        if (_tripleNotEquals) {
          _builder.append("#include <WiFi.h>");
          _builder.newLine();
        }
      }
      _builder.append(" ");
      _builder.newLine();
      _builder.append("// library is needed to load JSON data");
      _builder.newLine();
      _builder.append("#include <ArduinoJson.h>");
      _builder.newLine();
      {
        boolean _ifMQTTChannelImplemented = this.getIfMQTTChannelImplemented(channels);
        if (_ifMQTTChannelImplemented) {
          _builder.append(" ");
          _builder.newLine();
          _builder.append("// includes PubSubClient library for MQTT");
          _builder.newLine();
          _builder.append("#include <PubSubClient.h>");
          _builder.newLine();
          _builder.append(" ");
          _builder.newLine();
        }
      }
      {
        if ((embeddedSensorsLength > 0)) {
          _builder.append("// the sensor manager includes code for interacting with embedded sensors");
          _builder.newLine();
          _builder.append("#include \"src/sensor_manager.h\"");
          _builder.newLine();
          _builder.append(" ");
          _builder.newLine();
        }
      }
      _builder.append("// setup requires SD card");
      _builder.newLine();
      _builder.append("#include \"SD.h\"");
      _builder.newLine();
      _builder.append(" ");
      _builder.newLine();
      _builder.append("// configuration file");
      _builder.newLine();
      _builder.append("File file;");
      _builder.newLine();
      _builder.append("StaticJsonDocument<");
      _builder.append((configLength + 10));
      _builder.append("> configJsonFile;");
      _builder.newLineIfNotEmpty();
      {
        int _length = ((Object[])Conversions.unwrapArray(frequencySensors, Object.class)).length;
        boolean _greaterThan = (_length > 0);
        if (_greaterThan) {
          _builder.append(" ");
          _builder.newLine();
          _builder.append("// system time function   ");
          _builder.newLine();
          _builder.append("#define milliseconds()(millis())");
          _builder.newLine();
          _builder.append(" ");
          _builder.newLine();
          _builder.append("double systemTime = 0.0;");
          _builder.newLine();
        }
      }
      _builder.append(" ");
      _builder.newLine();
      _builder.append("// used to verify whether the device booted correctly ");
      _builder.newLine();
      _builder.append("bool booted = false; ");
      _builder.newLine();
      _builder.append(" ");
      _builder.newLine();
      {
        for(final Sensor sensor : frequencySensors) {
          _builder.append("const double ");
          String _name = sensor.getName();
          _builder.append(_name);
          _builder.append("UpdateTimer = ");
          Sampler _sampler = sensor.getSampler();
          String _string = Integer.valueOf(((Frequency) _sampler).getFrequency()).toString();
          _builder.append(_string);
          _builder.append(";");
          _builder.newLineIfNotEmpty();
          _builder.append("double ");
          String _name_1 = sensor.getName();
          _builder.append(_name_1);
          _builder.append("LastUpdate = 0.0;");
          _builder.newLineIfNotEmpty();
          _builder.append(" ");
          _builder.newLine();
        }
      }
      {
        for(final Sensor sensor_1 : commandSensors) {
          _builder.append("String ");
          String _name_2 = sensor_1.getName();
          _builder.append(_name_2);
          _builder.append("Command = \"");
          Sampler _sampler_1 = sensor_1.getSampler();
          String _string_1 = ((Command) _sampler_1).getCommand().toString();
          _builder.append(_string_1);
          _builder.append("\";");
          _builder.newLineIfNotEmpty();
          _builder.append(" ");
          _builder.newLine();
        }
      }
      String _generateInitChannels = this.generateInitChannels(channels);
      _builder.append(_generateInitChannels);
      _builder.newLineIfNotEmpty();
      String _generateInitializeSDCard = this.generateInitializeSDCard(board);
      _builder.append(_generateInitializeSDCard);
      _builder.newLineIfNotEmpty();
      _builder.append(" ");
      _builder.newLine();
      {
        boolean _anySensorExternal = this._generatorUtils.anySensorExternal(sensors);
        if (_anySensorExternal) {
          _builder.append("String convertIntArrayToString(int array[]){");
          _builder.newLine();
          _builder.append("\t");
          _builder.append("char message[(sizeof(array)*2)];");
          _builder.newLine();
          _builder.append("\t");
          _builder.append("for (int i = 0; i < sizeof(array); i++){");
          _builder.newLine();
          _builder.append("\t\t");
          _builder.append("message[i] = (char) array[i];");
          _builder.newLine();
          _builder.append("\t\t");
          _builder.append("message[i+1] = \',\';");
          _builder.newLine();
          _builder.append("\t");
          _builder.append("}");
          _builder.newLine();
          _builder.append("\t");
          _builder.append("return (String) message;");
          _builder.newLine();
          _builder.append("}");
          _builder.newLine();
        }
      }
      {
        if ((embeddedSensorsLength > 0)) {
          _builder.append("String convertFloatArrayToString(float array[]){");
          _builder.newLine();
          _builder.append("\t");
          _builder.append("char message[(sizeof(array)*2)];");
          _builder.newLine();
          _builder.append("\t");
          _builder.append("for (int i = 0; i < sizeof(array); i++){");
          _builder.newLine();
          _builder.append("\t\t");
          _builder.append("message[i] = (char) array[i];");
          _builder.newLine();
          _builder.append("\t\t");
          _builder.append("message[i+1] = \',\';");
          _builder.newLine();
          _builder.append("\t");
          _builder.append("}");
          _builder.newLine();
          _builder.append("\t");
          _builder.append("return (String) message;");
          _builder.newLine();
          _builder.append("}");
          _builder.newLine();
        }
      }
      String _generateLoadConfigurationFile = this.generateLoadConfigurationFile();
      _builder.append(_generateLoadConfigurationFile);
      _builder.newLineIfNotEmpty();
      _builder.append(" ");
      _builder.newLine();
      WifiConfig _wifiSelect_1 = board.getWifiSelect();
      String _generateInitializeWifi = null;
      if (_wifiSelect_1!=null) {
        _generateInitializeWifi=this.generateInitializeWifi(_wifiSelect_1);
      }
      _builder.append(_generateInitializeWifi);
      _builder.newLineIfNotEmpty();
      _builder.append(" ");
      _builder.newLine();
      {
        Set<Channel> _keySet = this.env.keySet();
        for(final Channel key : _keySet) {
          String _get = this.env.get(key);
          _builder.append(_get);
          _builder.newLineIfNotEmpty();
          _builder.append(" ");
          _builder.newLine();
        }
      }
      {
        Set<String> _keySet_1 = this.windows.keySet();
        for(final String s : _keySet_1) {
          String _generateWindowFunctions = this.generateWindowFunctions(s, this.windows.get(s));
          _builder.append(_generateWindowFunctions);
          _builder.newLineIfNotEmpty();
          _builder.append(" ");
          _builder.newLine();
        }
      }
      String _generateTransferFunctions = this.generateTransferFunctions(globalUniqueChannels);
      _builder.append(_generateTransferFunctions);
      _builder.newLineIfNotEmpty();
      String _generateExternalSensorsGet = this.generateExternalSensorsGet(sensors);
      _builder.append(_generateExternalSensorsGet);
      _builder.newLineIfNotEmpty();
      String _generateExternalFunctions = this.generateExternalFunctions(IterableExtensions.<External>toList(externals));
      _builder.append(_generateExternalFunctions);
      _builder.newLineIfNotEmpty();
      _builder.append("void setup () {");
      _builder.newLine();
      _builder.append(" ");
      _builder.newLine();
      _builder.append("\t");
      _builder.append("if (init_SD_card()) {");
      _builder.newLine();
      _builder.append("\t\t");
      _builder.append("booted = true;");
      _builder.newLine();
      _builder.append("\t\t");
      String _serialBegin = this.getSerialBegin(channels);
      _builder.append(_serialBegin, "\t\t");
      _builder.newLineIfNotEmpty();
      _builder.append("\t\t");
      _builder.newLine();
      _builder.append("\t\t");
      String _initExternalSensors = this.initExternalSensors(sensors);
      _builder.append(_initExternalSensors, "\t\t");
      _builder.newLineIfNotEmpty();
      _builder.append("\t\t");
      _builder.newLine();
      {
        WifiConfig _wifiSelect_2 = board.getWifiSelect();
        boolean _tripleNotEquals_1 = (_wifiSelect_2 != null);
        if (_tripleNotEquals_1) {
          _builder.append("\t\t");
          _builder.append("init_wifi();");
          _builder.newLine();
        }
      }
      _builder.append("\t\t");
      _builder.newLine();
      _builder.append("\t\t");
      String _generateInitConnectChannels = this.generateInitConnectChannels(IterableExtensions.<Channel>toList(this.env.keySet()));
      _builder.append(_generateInitConnectChannels, "\t\t");
      _builder.newLineIfNotEmpty();
      _builder.append("\t");
      _builder.append("}");
      _builder.newLine();
      _builder.append("}");
      _builder.newLine();
      _builder.append(" ");
      _builder.newLine();
      _builder.append("void loop () {");
      _builder.newLine();
      _builder.append("\t");
      _builder.append("if (booted){");
      _builder.newLine();
      {
        int _length_1 = ((Object[])Conversions.unwrapArray(commandSensors, Object.class)).length;
        boolean _greaterThan_1 = (_length_1 > 0);
        if (_greaterThan_1) {
          _builder.append("\t\t");
          _builder.append("// read the incoming data as string");
          _builder.newLine();
          _builder.append("\t\t");
          _builder.append("String command = Serial.readString(); ");
          _builder.newLine();
          _builder.append("\t\t");
          _builder.append("command.remove(command.length()-1, 1);");
          _builder.newLine();
        }
      }
      _builder.append(" ");
      _builder.newLine();
      {
        int _length_2 = ((Object[])Conversions.unwrapArray(frequencySensors, Object.class)).length;
        boolean _greaterThan_2 = (_length_2 > 0);
        if (_greaterThan_2) {
          _builder.append("\t\t");
          _builder.append("systemTime = milliseconds();");
          _builder.newLine();
          _builder.append("\t\t");
          _builder.newLine();
        }
      }
      _builder.append("\t\t");
      _builder.append(sampleLoop, "\t\t");
      _builder.newLineIfNotEmpty();
      _builder.append("\t");
      _builder.append("}");
      _builder.newLine();
      _builder.append("}");
      _builder.newLine();
      _xblockexpression = _builder.toString();
    }
    return _xblockexpression;
  }
  
  public String getExecuteFunction(final ExecutePipeline pipe, final String type, final String name) {
    boolean _matched = false;
    if (pipe instanceof Mean) {
      _matched=true;
      StringConcatenation _builder = new StringConcatenation();
      _builder.append("float sum = 0;");
      _builder.newLine();
      _builder.append("for (int i = 0; i < sizeof(");
      _builder.append(name);
      _builder.append("WindowArray); i++){");
      _builder.newLineIfNotEmpty();
      _builder.append("\t");
      _builder.append("sum += ");
      _builder.append(name, "\t");
      _builder.append("WindowArray[i];");
      _builder.newLineIfNotEmpty();
      _builder.append("}");
      _builder.newLine();
      _builder.append("return sum/sizeof(");
      _builder.append(name);
      _builder.append("WindowArray);");
      return _builder.toString();
    }
    if (!_matched) {
      if (pipe instanceof Median) {
        _matched=true;
        StringConcatenation _builder = new StringConcatenation();
        _builder.append("int median = (sizeof(");
        _builder.append(name);
        _builder.append("WindowArray)/2)+0.5;");
        _builder.newLineIfNotEmpty();
        _builder.append("return ");
        _builder.append(name);
        _builder.append("WindowArray[median];");
        _builder.newLineIfNotEmpty();
        return _builder.toString();
      }
    }
    if (!_matched) {
      if (pipe instanceof Min) {
        _matched=true;
        StringConcatenation _builder = new StringConcatenation();
        _builder.append("float minimal = 999999.0;");
        _builder.newLine();
        _builder.append("for (int i = 0; i < sizeof(");
        _builder.append(name);
        _builder.append("WindowArray); i++){");
        _builder.newLineIfNotEmpty();
        _builder.append("\t");
        _builder.append("if (");
        _builder.append(name, "\t");
        _builder.append("WindowArray[i] < minimal){");
        _builder.newLineIfNotEmpty();
        _builder.append("\t\t");
        _builder.append("minimal = ");
        _builder.append(name, "\t\t");
        _builder.append("WindowArray[i];");
        _builder.newLineIfNotEmpty();
        _builder.append("\t");
        _builder.append("}\t");
        _builder.newLine();
        _builder.append("}");
        _builder.newLine();
        _builder.append("return minimal;");
        return _builder.toString();
      }
    }
    if (!_matched) {
      if (pipe instanceof Max) {
        _matched=true;
        StringConcatenation _builder = new StringConcatenation();
        _builder.append("float maximal = 0.0;");
        _builder.newLine();
        _builder.append("for (int i = 0; i < sizeof(");
        _builder.append(name);
        _builder.append("WindowArray); i++){");
        _builder.newLineIfNotEmpty();
        _builder.append("\t");
        _builder.append("if (");
        _builder.append(name, "\t");
        _builder.append("WindowArray[i] > maximal){");
        _builder.newLineIfNotEmpty();
        _builder.append("\t\t");
        _builder.append("maximal = ");
        _builder.append(name, "\t\t");
        _builder.append("WindowArray[i];");
        _builder.newLineIfNotEmpty();
        _builder.append("\t");
        _builder.append("}");
        _builder.newLine();
        _builder.append("}");
        _builder.newLine();
        _builder.append("return maximal;");
        return _builder.toString();
      }
    }
    return null;
  }
  
  public String insertValuesIntoWindow(final String type, final String name, final int width) {
    String _xblockexpression = null;
    {
      boolean _contains = type.toLowerCase().contains("tuple");
      if (_contains) {
        StringConcatenation _builder = new StringConcatenation();
        _builder.append("for (int i = 0; i < sizeof(data.tuple); i++){");
        _builder.newLine();
        _builder.append("\t");
        _builder.append(name, "\t");
        _builder.append("WindowArray[");
        _builder.append(name, "\t");
        _builder.append("WindowOldestIndex] = data.tuple[i];");
        _builder.newLineIfNotEmpty();
        _builder.append("\t");
        _builder.append(name, "\t");
        _builder.append("WindowOldestIndex += 1;");
        _builder.newLineIfNotEmpty();
        _builder.append("\t");
        _builder.append("if (");
        _builder.append(name, "\t");
        _builder.append("WindowOldestIndex >= ");
        _builder.append(width, "\t");
        _builder.append("-1){");
        _builder.newLineIfNotEmpty();
        _builder.append("\t\t");
        _builder.append(name, "\t\t");
        _builder.append("WindowOldestIndex = 0;");
        _builder.newLineIfNotEmpty();
        _builder.append("\t");
        _builder.append("}");
        _builder.newLine();
        _builder.append("}");
        return _builder.toString();
      }
      StringConcatenation _builder_1 = new StringConcatenation();
      _builder_1.append(name);
      _builder_1.append("WindowArray[");
      _builder_1.append(name);
      _builder_1.append("WindowOldestIndex] = data;");
      _builder_1.newLineIfNotEmpty();
      _builder_1.append(name);
      _builder_1.append("WindowOldestIndex += 1;");
      _builder_1.newLineIfNotEmpty();
      _builder_1.newLine();
      _builder_1.append("if (");
      _builder_1.append(name);
      _builder_1.append("WindowOldestIndex >= ");
      _builder_1.append(width);
      _builder_1.append("-1){");
      _builder_1.newLineIfNotEmpty();
      _builder_1.append("\t");
      _builder_1.append(name, "\t");
      _builder_1.append("WindowOldestIndex = 0;");
      _builder_1.newLineIfNotEmpty();
      _builder_1.append("}");
      _xblockexpression = _builder_1.toString();
    }
    return _xblockexpression;
  }
  
  public String generateWindowFunctions(final String nameAndType, final Window window) {
    String _xblockexpression = null;
    {
      String[] nAt = nameAndType.split(",");
      String name = nAt[0];
      String type = nAt[1];
      StringConcatenation _builder = new StringConcatenation();
      _builder.append("float ");
      _builder.append(name);
      _builder.append("WindowArray[");
      int _width = window.getWidth();
      _builder.append(_width);
      _builder.append("];");
      _builder.newLineIfNotEmpty();
      _builder.append("int ");
      _builder.append(name);
      _builder.append("WindowOldestIndex = 0;");
      _builder.newLineIfNotEmpty();
      _builder.append("float ");
      _builder.append(name);
      _builder.append("(");
      _builder.append(type);
      _builder.append(" data){");
      _builder.newLineIfNotEmpty();
      _builder.append("\t");
      String _insertValuesIntoWindow = this.insertValuesIntoWindow(type, name, window.getWidth());
      _builder.append(_insertValuesIntoWindow, "\t");
      _builder.newLineIfNotEmpty();
      _builder.append("\t");
      String _executeFunction = this.getExecuteFunction(window.getExecute(), type, name);
      _builder.append(_executeFunction, "\t");
      _builder.newLineIfNotEmpty();
      _builder.append("}");
      _xblockexpression = _builder.toString();
    }
    return _xblockexpression;
  }
  
  public String getFunctionInput(final Function function) {
    String _xblockexpression = null;
    {
      String input = "";
      int counter = 0;
      EList<FunctionInputType> _input = function.getInput();
      for (final FunctionInputType inp : _input) {
        {
          String _name = inp.getName();
          boolean _equals = Objects.equal(_name, "num");
          if (_equals) {
            String _input_1 = input;
            String _string = Integer.valueOf(counter).toString();
            String _plus = ("float x" + _string);
            String _plus_1 = (_plus + ", ");
            input = (_input_1 + _plus_1);
          }
          String _name_1 = inp.getName();
          boolean _equals_1 = Objects.equal(_name_1, "str");
          if (_equals_1) {
            String _input_2 = input;
            String _string_1 = Integer.valueOf(counter).toString();
            String _plus_2 = ("String x" + _string_1);
            String _plus_3 = (_plus_2 + ", ");
            input = (_input_2 + _plus_3);
          }
          String _name_2 = inp.getName();
          boolean _equals_2 = Objects.equal(_name_2, "bool");
          if (_equals_2) {
            String _input_3 = input;
            String _string_2 = Integer.valueOf(counter).toString();
            String _plus_4 = ("bool x" + _string_2);
            String _plus_5 = (_plus_4 + ", ");
            input = (_input_3 + _plus_5);
          }
          int _counter = counter;
          counter = (_counter + 1);
        }
      }
      int _length = input.length();
      int _minus = (_length - 2);
      _xblockexpression = input.substring(0, _minus);
    }
    return _xblockexpression;
  }
  
  public String generateExternalFunctions(final List<External> externals) {
    StringConcatenation _builder = new StringConcatenation();
    {
      for(final External external : externals) {
        _builder.append("struct ");
        String _name = external.getFunction().getName();
        _builder.append(_name);
        _builder.append("Tuple {");
        _builder.newLineIfNotEmpty();
        _builder.append("\t");
        _builder.append("float tuple[");
        int _size = external.getFunction().getOutput().size();
        _builder.append(_size, "\t");
        _builder.append("];");
        _builder.newLineIfNotEmpty();
        _builder.append("};");
        _builder.newLine();
        _builder.newLine();
        _builder.append("struct ");
        String _name_1 = external.getFunction().getName();
        _builder.append(_name_1);
        _builder.append("Tuple ");
        String _name_2 = external.getFunction().getName();
        _builder.append(_name_2);
        _builder.append("(");
        String _functionInput = this.getFunctionInput(external.getFunction());
        _builder.append(_functionInput);
        _builder.append("){");
        _builder.newLineIfNotEmpty();
        _builder.append("\t");
        _builder.append("// REQUIRES IMPLEMENTATION OR RETURNS EMPTY STRUCT");
        _builder.newLine();
        _builder.append("\t");
        _builder.append("struct ");
        String _name_3 = external.getFunction().getName();
        _builder.append(_name_3, "\t");
        _builder.append("Tuple tbl;");
        _builder.newLineIfNotEmpty();
        _builder.append("\t");
        _builder.append("return tbl;");
        _builder.newLine();
        _builder.append("}");
        _builder.newLine();
      }
    }
    return _builder.toString();
  }
  
  public String generateExternalSensorsGet(final List<Sensor> sensors) {
    StringConcatenation _builder = new StringConcatenation();
    {
      for(final Sensor sensor : sensors) {
        _builder.newLineIfNotEmpty();
        {
          SensorType _sensortype = sensor.getSensortype();
          if ((_sensortype instanceof ExternalSensor)) {
            _builder.append("struct ");
            String _name = sensor.getName();
            _builder.append(_name);
            _builder.append("Tuple {");
            _builder.newLineIfNotEmpty();
            _builder.append("\t");
            _builder.append("int tuple[");
            SensorType _sensortype_1 = sensor.getSensortype();
            int _size = ((ExternalSensor) _sensortype_1).getPins().size();
            _builder.append(_size, "\t");
            _builder.append("];");
            _builder.newLineIfNotEmpty();
            _builder.append("};");
            _builder.newLine();
            _builder.append(" ");
            _builder.newLine();
            _builder.append("struct ");
            String _name_1 = sensor.getName();
            _builder.append(_name_1);
            _builder.append("Tuple get_");
            String _name_2 = sensor.getName();
            _builder.append(_name_2);
            _builder.append("(){");
            _builder.newLineIfNotEmpty();
            _builder.append("\t");
            _builder.append("struct ");
            String _name_3 = sensor.getName();
            _builder.append(_name_3, "\t");
            _builder.append("Tuple tbl;");
            _builder.newLineIfNotEmpty();
            {
              SensorType _sensortype_2 = sensor.getSensortype();
              EList<Integer> _pins = ((ExternalSensor) _sensortype_2).getPins();
              for(final Integer i : _pins) {
                _builder.append("\t");
                _builder.append("tbl.tuple[");
                SensorType _sensortype_3 = sensor.getSensortype();
                int _indexOf = ((ExternalSensor) _sensortype_3).getPins().indexOf(i);
                _builder.append(_indexOf, "\t");
                _builder.append("] = analogRead(");
                _builder.append(i, "\t");
                _builder.append(");");
                _builder.newLineIfNotEmpty();
              }
            }
            _builder.append("\t");
            _builder.append("return tbl;");
            _builder.newLine();
            _builder.append("}");
            _builder.newLine();
            _builder.append(" ");
            _builder.newLine();
          }
        }
      }
    }
    return _builder.toString();
  }
  
  public String initExternalSensors(final List<Sensor> sensors) {
    String _xblockexpression = null;
    {
      String initStr = "";
      for (final Sensor sensor : sensors) {
        SensorType _sensortype = sensor.getSensortype();
        if ((_sensortype instanceof ExternalSensor)) {
          String _initStr = initStr;
          StringConcatenation _builder = new StringConcatenation();
          _builder.append("pinMode(");
          String _string = Integer.valueOf(sensor.getVcc()).toString();
          _builder.append(_string);
          _builder.append(", OUTPUT);");
          _builder.newLineIfNotEmpty();
          _builder.append("digitalWrite(");
          String _string_1 = Integer.valueOf(sensor.getVcc()).toString();
          _builder.append(_string_1);
          _builder.append(", HIGH);");
          _builder.newLineIfNotEmpty();
          initStr = (_initStr + _builder);
        }
      }
      _xblockexpression = initStr;
    }
    return _xblockexpression;
  }
  
  public String generateLoop(final List<Sensor> sensors) {
    StringConcatenation _builder = new StringConcatenation();
    {
      for(final Sensor sensor : sensors) {
        String _generateSensorDataSample = this.generateSensorDataSample(sensor);
        _builder.append(_generateSensorDataSample);
        _builder.newLineIfNotEmpty();
        _builder.append(" ");
        _builder.newLine();
      }
    }
    return _builder.toString();
  }
  
  public String executePipeline(final List<SensorOutput> sensorOutputs, final SensorType sensor, final String sensorName, final String varId, final SensorVariables vars) {
    String _xblockexpression = null;
    {
      final HashMap<String, String> env = new HashMap<String, String>();
      final Consumer<Variable> _function = (Variable v) -> {
        String _name = v.getName();
        boolean _notEquals = (!Objects.equal(_name, "_"));
        if (_notEquals) {
          String _name_1 = v.getName();
          int _indexOf = vars.getIds().indexOf(v);
          String _plus = ((varId + ".tuple[") + Integer.valueOf(_indexOf));
          String _plus_1 = (_plus + "]");
          env.put(_name_1, _plus_1);
        }
      };
      vars.getIds().forEach(_function);
      ArrayList<String> pipeStr = CollectionLiterals.<String>newArrayList();
      String prevIdentifier = varId;
      int externalCounter = 0;
      int mapCounter = 0;
      boolean lastIsExternal = false;
      StringConcatenation _builder = new StringConcatenation();
      _builder.append(sensorName);
      _builder.append("Tuple");
      String prevType = _builder.toString();
      for (final SensorOutput sensorOutput : sensorOutputs) {
        {
          Pipeline pipeline = sensorOutput.getOutput().getPipeline();
          while ((pipeline != null)) {
            {
              boolean _matched = false;
              if (pipeline instanceof Window) {
                _matched=true;
                StringConcatenation _builder_1 = new StringConcatenation();
                _builder_1.append("float ");
                _builder_1.append(sensorName);
                _builder_1.append("Window = ");
                _builder_1.append(sensorName);
                String _firstUpper = StringExtensions.toFirstUpper(varId);
                _builder_1.append(_firstUpper);
                _builder_1.append("Window(");
                _builder_1.append(prevIdentifier);
                _builder_1.append(");");
                pipeStr.add(_builder_1.toString());
                prevIdentifier = (sensorName + "Window");
                String _firstUpper_1 = StringExtensions.toFirstUpper(varId);
                String _plus = (sensorName + _firstUpper_1);
                String _plus_1 = (_plus + "Window");
                String _plus_2 = (_plus_1 + ",");
                String _plus_3 = (_plus_2 + prevType);
                this.windows.put(_plus_3, ((Window)pipeline));
                prevType = "float";
                lastIsExternal = false;
              }
              if (!_matched) {
                if (pipeline instanceof Map) {
                  _matched=true;
                  Expression exp = ((Map)pipeline).getExpression();
                  prevType = this.typeChecker.ctype(this.typeChecker.type(exp));
                  String _name = ((Map)pipeline).getOutput().getName();
                  String _name_1 = ((Map)pipeline).getOutput().getName();
                  String _firstUpper = StringExtensions.toFirstUpper(varId);
                  String _plus = (_name_1 + _firstUpper);
                  String _string = Integer.valueOf(mapCounter).toString();
                  String _plus_1 = (_plus + _string);
                  env.put(_name, _plus_1);
                  StringConcatenation _builder_1 = new StringConcatenation();
                  String _ctype = this.typeChecker.ctype(this.typeChecker.type(exp));
                  _builder_1.append(_ctype);
                  _builder_1.append(" ");
                  String _name_2 = ((Map)pipeline).getOutput().getName();
                  _builder_1.append(_name_2);
                  String _firstUpper_1 = StringExtensions.toFirstUpper(varId);
                  _builder_1.append(_firstUpper_1);
                  _builder_1.append(mapCounter);
                  _builder_1.append(" = ");
                  String _expression = this._expressionParser.getExpression(exp, env);
                  _builder_1.append(_expression);
                  _builder_1.append(";");
                  pipeStr.add(_builder_1.toString());
                  String _name_3 = ((Map)pipeline).getOutput().getName();
                  String _firstUpper_2 = StringExtensions.toFirstUpper(varId);
                  String _plus_2 = (_name_3 + _firstUpper_2);
                  String _string_1 = Integer.valueOf(mapCounter).toString();
                  String _plus_3 = (_plus_2 + _string_1);
                  prevIdentifier = _plus_3;
                  int _mapCounter = mapCounter;
                  mapCounter = (_mapCounter + 1);
                  lastIsExternal = false;
                }
              }
              if (!_matched) {
                if (pipeline instanceof External) {
                  _matched=true;
                  String externalInput = "";
                  EList<Expression> _input = ((External)pipeline).getInput();
                  for (final Expression exp : _input) {
                    String _externalInput = externalInput;
                    String _string = this._expressionParser.getExpression(exp, env).toString();
                    String _plus = (_string + ", ");
                    externalInput = (_externalInput + _plus);
                  }
                  final EList<String> outputs = ((External)pipeline).getFunction().getOutput();
                  for (final String out : outputs) {
                    String _string_1 = out.toString();
                    String _firstUpper = StringExtensions.toFirstUpper(varId);
                    String _plus_1 = ("ex" + _firstUpper);
                    String _string_2 = Integer.valueOf(externalCounter).toString();
                    String _plus_2 = (_plus_1 + _string_2);
                    String _plus_3 = (_plus_2 + ".tuple[");
                    int _indexOf = outputs.indexOf(out);
                    String _plus_4 = (_plus_3 + Integer.valueOf(_indexOf));
                    String _plus_5 = (_plus_4 + "]");
                    env.put(_string_1, _plus_5);
                  }
                  String _name = ((External)pipeline).getFunction().getName();
                  String _plus_6 = (_name + "Tuple");
                  prevType = _plus_6;
                  StringConcatenation _builder_1 = new StringConcatenation();
                  String _name_1 = ((External)pipeline).getFunction().getName();
                  _builder_1.append(_name_1);
                  _builder_1.append("Tuple ex");
                  String _firstUpper_1 = StringExtensions.toFirstUpper(varId);
                  _builder_1.append(_firstUpper_1);
                  String _string_3 = Integer.valueOf(externalCounter).toString();
                  _builder_1.append(_string_3);
                  _builder_1.append(" = ");
                  String _name_2 = ((External)pipeline).getFunction().getName();
                  _builder_1.append(_name_2);
                  _builder_1.append("(");
                  int _length = externalInput.length();
                  int _minus = (_length - 2);
                  String _substring = externalInput.substring(0, _minus);
                  _builder_1.append(_substring);
                  _builder_1.append(");");
                  pipeStr.add(_builder_1.toString());
                  String _firstUpper_2 = StringExtensions.toFirstUpper(varId);
                  String _plus_7 = ("ex" + _firstUpper_2);
                  String _string_4 = Integer.valueOf(externalCounter).toString();
                  String _plus_8 = (_plus_7 + _string_4);
                  prevIdentifier = _plus_8;
                  int _externalCounter = externalCounter;
                  externalCounter = (_externalCounter + 1);
                  lastIsExternal = true;
                }
              }
              pipeline = pipeline.getNext();
            }
          }
        }
      }
      StringConcatenation _builder_1 = new StringConcatenation();
      _builder_1.append(sensorName);
      _builder_1.append("Tuple ");
      _builder_1.append(varId);
      _builder_1.append(" = get_");
      _builder_1.append(sensorName);
      _builder_1.append("();");
      _builder_1.newLineIfNotEmpty();
      {
        for(final String pipe : pipeStr) {
          _builder_1.append(pipe);
          _builder_1.newLineIfNotEmpty();
        }
      }
      {
        Set<Channel> _uniqueChannelsFromSensorOutput = this._generatorUtils.getUniqueChannelsFromSensorOutput(sensorOutputs);
        for(final Channel chan : _uniqueChannelsFromSensorOutput) {
          String _parseTransmit = this.parseTransmit(prevIdentifier, lastIsExternal, sensor, StringExtensions.toFirstUpper(chan.getName()), prevType);
          _builder_1.append(_parseTransmit);
          _builder_1.newLineIfNotEmpty();
        }
      }
      _xblockexpression = _builder_1.toString();
    }
    return _xblockexpression;
  }
  
  public String parseTransmit(final String identifier, final boolean lastIsExternal, final SensorType sensor, final String channelName, final String type) {
    String variable = (identifier + ".tuple");
    boolean _contains = type.toLowerCase().contains("tuple");
    if (_contains) {
      variable = (identifier + ".tuple");
      StringConcatenation _builder = new StringConcatenation();
      _builder.append("transmit");
      _builder.append(channelName);
      _builder.append("(");
      {
        if (lastIsExternal) {
          _builder.append("convertFloatArrayToString(");
          _builder.append(variable);
          _builder.append(")");
        } else {
          if ((sensor instanceof ExternalSensor)) {
            _builder.append("convertIntArrayToString(");
            _builder.append(variable);
            _builder.append(")");
          } else {
            _builder.append("convertFloatArrayToString(");
            _builder.append(variable);
            _builder.append(")");
          }
        }
      }
      _builder.append(");");
      return _builder.toString();
    }
    StringConcatenation _builder_1 = new StringConcatenation();
    _builder_1.append("transmit");
    _builder_1.append(channelName);
    _builder_1.append("(((String)");
    _builder_1.append(identifier);
    _builder_1.append("));");
    return _builder_1.toString();
  }
  
  public String generateSensorDataSample(final Sensor sensor) {
    final Sampler sampler = sensor.getSampler();
    if (((sampler != null) && (sampler instanceof Frequency))) {
      StringConcatenation _builder = new StringConcatenation();
      _builder.append("if (systemTime - ");
      String _name = sensor.getName();
      _builder.append(_name);
      _builder.append("LastUpdate >= ");
      String _name_1 = sensor.getName();
      _builder.append(_name_1);
      _builder.append("UpdateTimer){");
      _builder.newLineIfNotEmpty();
      _builder.append("\t");
      _builder.newLine();
      _builder.append("\t");
      String _executePipeline = this.executePipeline(sensor.getOutput(), sensor.getSensortype(), sensor.getName(), sensor.getVars().getName(), sensor.getVars());
      _builder.append(_executePipeline, "\t");
      _builder.newLineIfNotEmpty();
      _builder.append("\t");
      _builder.append("double timeTaken = milliseconds();");
      _builder.newLine();
      _builder.append("\t");
      String _name_2 = sensor.getName();
      _builder.append(_name_2, "\t");
      _builder.append("LastUpdate = timeTaken - (systemTime - timeTaken); ");
      _builder.newLineIfNotEmpty();
      _builder.append("}");
      return _builder.toString();
    } else {
      if (((sampler != null) && (sampler instanceof Command))) {
        StringConcatenation _builder_1 = new StringConcatenation();
        _builder_1.append("if (command == ");
        String _name_3 = sensor.getName();
        _builder_1.append(_name_3);
        _builder_1.append("Command){");
        _builder_1.newLineIfNotEmpty();
        _builder_1.append("\t");
        _builder_1.newLine();
        _builder_1.append("\t");
        String _executePipeline_1 = this.executePipeline(sensor.getOutput(), sensor.getSensortype(), sensor.getName(), sensor.getVars().getName(), sensor.getVars());
        _builder_1.append(_executePipeline_1, "\t");
        _builder_1.newLineIfNotEmpty();
        _builder_1.append("}");
        return _builder_1.toString();
      } else {
        StringConcatenation _builder_2 = new StringConcatenation();
        String _executePipeline_2 = this.executePipeline(sensor.getOutput(), sensor.getSensortype(), sensor.getName(), sensor.getVars().getName(), sensor.getVars());
        _builder_2.append(_executePipeline_2);
        return _builder_2.toString();
      }
    }
  }
  
  public String generateTransferFunctions(final HashSet<Channel> channels) {
    StringConcatenation _builder = new StringConcatenation();
    {
      for(final Channel channel : channels) {
        String _correctTransferMethod = this.getCorrectTransferMethod(channel);
        _builder.append(_correctTransferMethod);
        _builder.newLineIfNotEmpty();
        _builder.append(" ");
        _builder.newLine();
      }
    }
    return _builder.toString();
  }
  
  public String getCorrectTransferMethod(final Channel channel) {
    String _xblockexpression = null;
    {
      final ChannelConfig config = channel.getConfig();
      if (((config instanceof Wifi) || this.typeChecker.ifServerType(channel))) {
        StringConcatenation _builder = new StringConcatenation();
        _builder.append("void transmit");
        String _firstUpper = StringExtensions.toFirstUpper(channel.getName());
        _builder.append(_firstUpper);
        _builder.append("(String message){\t\t\t\t");
        _builder.newLineIfNotEmpty();
        _builder.append("\t");
        _builder.append("connect");
        String _firstUpper_1 = StringExtensions.toFirstUpper(channel.getName());
        _builder.append(_firstUpper_1, "\t");
        _builder.append("();");
        _builder.newLineIfNotEmpty();
        _builder.append("\t");
        _builder.append("const char* route = configJsonFile[\"");
        String _name = channel.getName();
        _builder.append(_name, "\t");
        _builder.append("\"][\"route\"];");
        _builder.newLineIfNotEmpty();
        _builder.append("\t");
        _builder.append("String header = \"POST \" + ((String)route) + \" HTTP/1.1\\r\\nHost: \" + get");
        String _firstUpper_2 = StringExtensions.toFirstUpper(channel.getName());
        _builder.append(_firstUpper_2, "\t");
        _builder.append("IPAddress().toString() +\"\\r\\nConnection: close\\r\\nContent-Length: \" + message.length() + \"\\r\\nContent-Type: text/plain\\r\\n\\r\\n\";");
        _builder.newLineIfNotEmpty();
        _builder.append("\t");
        String _name_1 = channel.getName();
        _builder.append(_name_1, "\t");
        _builder.append("Client.print(header);");
        _builder.newLineIfNotEmpty();
        _builder.append("\t");
        String _name_2 = channel.getName();
        _builder.append(_name_2, "\t");
        _builder.append("Client.write_P(message.c_str(), message.length());");
        _builder.newLineIfNotEmpty();
        _builder.append("}");
        _builder.newLine();
        return _builder.toString();
      } else {
        if (((channel instanceof MqttClient) || this.typeChecker.ifMQTTType(channel))) {
          StringConcatenation _builder_1 = new StringConcatenation();
          _builder_1.append("void transmit");
          String _firstUpper_3 = StringExtensions.toFirstUpper(channel.getName());
          _builder_1.append(_firstUpper_3);
          _builder_1.append("(String message){");
          _builder_1.newLineIfNotEmpty();
          _builder_1.append("\t");
          _builder_1.append("const char* topic = configJsonFile[\"");
          String _name_3 = channel.getName();
          _builder_1.append(_name_3, "\t");
          _builder_1.append("\"][\"topic\"];");
          _builder_1.newLineIfNotEmpty();
          _builder_1.append("\t");
          String _name_4 = channel.getName();
          _builder_1.append(_name_4, "\t");
          _builder_1.append("Client.publish(topic, message.c_str());");
          _builder_1.newLineIfNotEmpty();
          _builder_1.append("}");
          _builder_1.newLine();
          return _builder_1.toString();
        } else {
          if (((channel instanceof Serial) || this.typeChecker.ifSerialType(channel))) {
            StringConcatenation _builder_2 = new StringConcatenation();
            _builder_2.append("void transmit");
            String _firstUpper_4 = StringExtensions.toFirstUpper(channel.getName());
            _builder_2.append(_firstUpper_4);
            _builder_2.append("(String message){");
            _builder_2.newLineIfNotEmpty();
            _builder_2.append("\t");
            _builder_2.append("Serial.println(message);");
            _builder_2.newLine();
            _builder_2.append("}");
            _builder_2.newLine();
            return _builder_2.toString();
          }
        }
      }
      StringConcatenation _builder_3 = new StringConcatenation();
      _xblockexpression = _builder_3.toString();
    }
    return _xblockexpression;
  }
  
  public String generateInitConnectChannels(final List<Channel> env) {
    StringConcatenation _builder = new StringConcatenation();
    {
      for(final Channel channel : env) {
        String _correctChannelFunctionCallOnInit = this.getCorrectChannelFunctionCallOnInit(channel);
        _builder.append(_correctChannelFunctionCallOnInit);
        _builder.newLineIfNotEmpty();
        _builder.append(" ");
        _builder.newLine();
      }
    }
    return _builder.toString();
  }
  
  public boolean getIfMQTTChannelImplemented(final List<Channel> channels) {
    boolean _xblockexpression = false;
    {
      for (final Channel channel : channels) {
        boolean _ifMQTTType = this.typeChecker.ifMQTTType(channel);
        if (_ifMQTTType) {
          return true;
        }
      }
      _xblockexpression = false;
    }
    return _xblockexpression;
  }
  
  public String getCorrectChannelFunctionCallOnInit(final Channel channel) {
    String _xblockexpression = null;
    {
      final ChannelConfig config = channel.getConfig();
      if (((config instanceof Wifi) || this.typeChecker.ifServerType(channel))) {
        StringConcatenation _builder = new StringConcatenation();
        _builder.append("connect");
        String _firstUpper = StringExtensions.toFirstUpper(channel.getName());
        _builder.append(_firstUpper);
        _builder.append("();");
        return _builder.toString();
      } else {
        if (((channel instanceof MqttClient) || this.typeChecker.ifMQTTType(channel))) {
          StringConcatenation _builder_1 = new StringConcatenation();
          _builder_1.append("const char*  ");
          String _name = channel.getName();
          _builder_1.append(_name);
          _builder_1.append("Ip   = configJsonFile[\"");
          String _name_1 = channel.getName();
          _builder_1.append(_name_1);
          _builder_1.append("\"][\"broker\"];");
          _builder_1.newLineIfNotEmpty();
          _builder_1.append("unsigned int ");
          String _name_2 = channel.getName();
          _builder_1.append(_name_2);
          _builder_1.append("Port = configJsonFile[\"");
          String _name_3 = channel.getName();
          _builder_1.append(_name_3);
          _builder_1.append("\"][\"port\"];");
          _builder_1.newLineIfNotEmpty();
          String _name_4 = channel.getName();
          _builder_1.append(_name_4);
          _builder_1.append("Client.setServer(");
          String _name_5 = channel.getName();
          _builder_1.append(_name_5);
          _builder_1.append("Ip, ");
          String _name_6 = channel.getName();
          _builder_1.append(_name_6);
          _builder_1.append("Port);");
          _builder_1.newLineIfNotEmpty();
          _builder_1.append("connect");
          String _firstUpper_1 = StringExtensions.toFirstUpper(channel.getName());
          _builder_1.append(_firstUpper_1);
          _builder_1.append("();");
          return _builder_1.toString();
        }
      }
      StringConcatenation _builder_2 = new StringConcatenation();
      _xblockexpression = _builder_2.toString();
    }
    return _xblockexpression;
  }
  
  public String generateInitChannels(final List<Channel> channels) {
    StringConcatenation _builder = new StringConcatenation();
    {
      for(final Channel channel : channels) {
        String _initChannel = this.initChannel(channel);
        _builder.append(_initChannel);
        _builder.newLineIfNotEmpty();
        _builder.append(" ");
        _builder.newLine();
      }
    }
    return _builder.toString();
  }
  
  public String initChannel(final Channel channel) {
    String _xblockexpression = null;
    {
      final ChannelConfig config = channel.getConfig();
      if (((config instanceof Wifi) || this.typeChecker.ifServerType(channel))) {
        StringConcatenation _builder = new StringConcatenation();
        _builder.append("IPAddress get");
        String _firstUpper = StringExtensions.toFirstUpper(channel.getName());
        _builder.append(_firstUpper);
        _builder.append("IPAddress(){");
        _builder.newLineIfNotEmpty();
        _builder.append("\t");
        _builder.append("const char* ");
        String _name = channel.getName();
        _builder.append(_name, "\t");
        _builder.append("IpChar = configJsonFile[\"");
        String _name_1 = channel.getName();
        _builder.append(_name_1, "\t");
        _builder.append("\"][\"ip\"];");
        _builder.newLineIfNotEmpty();
        _builder.append("\t");
        _builder.append("String ");
        String _name_2 = channel.getName();
        _builder.append(_name_2, "\t");
        _builder.append("IpStr = (String) ");
        String _name_3 = channel.getName();
        _builder.append(_name_3, "\t");
        _builder.append("IpChar;");
        _builder.newLineIfNotEmpty();
        _builder.append("\t");
        _builder.append("int a = -1;");
        _builder.newLine();
        _builder.append("\t");
        _builder.append("int b = -1;");
        _builder.newLine();
        _builder.append("\t");
        _builder.append("int c = -1;");
        _builder.newLine();
        _builder.append("\t");
        _builder.append("int d = -1;");
        _builder.newLine();
        _builder.append("\t");
        _builder.append("int li = 0;");
        _builder.newLine();
        _builder.append("\t");
        _builder.newLine();
        _builder.append("\t");
        _builder.append("for (int i = 0; i < ");
        String _name_4 = channel.getName();
        _builder.append(_name_4, "\t");
        _builder.append("IpStr.length(); i++) {");
        _builder.newLineIfNotEmpty();
        _builder.append("\t\t");
        _builder.append("if (");
        String _name_5 = channel.getName();
        _builder.append(_name_5, "\t\t");
        _builder.append("IpStr.substring(i, i+1) == \",\") {");
        _builder.newLineIfNotEmpty();
        _builder.append("\t\t\t");
        _builder.append("if (a == -1) {");
        _builder.newLine();
        _builder.append("\t\t\t    ");
        _builder.append("a = ");
        String _name_6 = channel.getName();
        _builder.append(_name_6, "\t\t\t    ");
        _builder.append("IpStr.substring(li, i).toInt();");
        _builder.newLineIfNotEmpty();
        _builder.append("\t\t\t\t");
        _builder.append("li = i;");
        _builder.newLine();
        _builder.append("\t\t\t");
        _builder.append("} else if (b == -1) {");
        _builder.newLine();
        _builder.append("\t\t\t\t");
        _builder.append("b = ");
        String _name_7 = channel.getName();
        _builder.append(_name_7, "\t\t\t\t");
        _builder.append("IpStr.substring(li, i).toInt();");
        _builder.newLineIfNotEmpty();
        _builder.append("\t\t\t\t");
        _builder.append("li = 1;");
        _builder.newLine();
        _builder.append("\t\t\t");
        _builder.append("} else if (c == -1) {");
        _builder.newLine();
        _builder.append("\t\t\t\t");
        _builder.append("c = ");
        String _name_8 = channel.getName();
        _builder.append(_name_8, "\t\t\t\t");
        _builder.append("IpStr.substring(li, i).toInt();");
        _builder.newLineIfNotEmpty();
        _builder.append("\t\t\t\t");
        _builder.append("d = ");
        String _name_9 = channel.getName();
        _builder.append(_name_9, "\t\t\t\t");
        _builder.append("IpStr.substring(i+1).toInt();");
        _builder.newLineIfNotEmpty();
        _builder.append("\t\t\t");
        _builder.append("}");
        _builder.newLine();
        _builder.append("\t  ");
        _builder.append("}");
        _builder.newLine();
        _builder.append("\t");
        _builder.append("}");
        _builder.newLine();
        _builder.append("\t");
        _builder.newLine();
        _builder.append("\t");
        _builder.append("IPAddress ");
        String _name_10 = channel.getName();
        _builder.append(_name_10, "\t");
        _builder.append("Ip(a, b, c, d);");
        _builder.newLineIfNotEmpty();
        _builder.append("\t");
        _builder.append("return ");
        String _name_11 = channel.getName();
        _builder.append(_name_11, "\t");
        _builder.append("Ip;");
        _builder.newLineIfNotEmpty();
        _builder.append("}");
        _builder.newLine();
        _builder.append(" ");
        _builder.newLine();
        _builder.append("void connect");
        String _firstUpper_1 = StringExtensions.toFirstUpper(channel.getName());
        _builder.append(_firstUpper_1);
        _builder.append("(){");
        _builder.newLineIfNotEmpty();
        _builder.append("\t");
        _builder.append("IPAddress ");
        String _name_12 = channel.getName();
        _builder.append(_name_12, "\t");
        _builder.append("Ip = get");
        String _firstUpper_2 = StringExtensions.toFirstUpper(channel.getName());
        _builder.append(_firstUpper_2, "\t");
        _builder.append("IPAddress();");
        _builder.newLineIfNotEmpty();
        _builder.append("\t");
        _builder.append("unsigned int ");
        String _name_13 = channel.getName();
        _builder.append(_name_13, "\t");
        _builder.append("Port  = configJsonFile[\"");
        String _name_14 = channel.getName();
        _builder.append(_name_14, "\t");
        _builder.append("\"][\"port\"];");
        _builder.newLineIfNotEmpty();
        _builder.append("\t");
        _builder.append("while(!");
        String _name_15 = channel.getName();
        _builder.append(_name_15, "\t");
        _builder.append("Client.connected()){");
        _builder.newLineIfNotEmpty();
        _builder.append("\t\t");
        _builder.append("if (");
        String _name_16 = channel.getName();
        _builder.append(_name_16, "\t\t");
        _builder.append("Client.connect(");
        String _name_17 = channel.getName();
        _builder.append(_name_17, "\t\t");
        _builder.append("Ip, ");
        String _name_18 = channel.getName();
        _builder.append(_name_18, "\t\t");
        _builder.append("Port)){");
        _builder.newLineIfNotEmpty();
        _builder.append("\t\t\t");
        _builder.append("break;");
        _builder.newLine();
        _builder.append("\t\t");
        _builder.append("}");
        _builder.newLine();
        _builder.append("\t\t");
        _builder.append("delay(500);");
        _builder.newLine();
        _builder.append("\t");
        _builder.append("}");
        _builder.newLine();
        _builder.append("}");
        _builder.newLine();
        this.env.put(channel, _builder.toString());
        StringConcatenation _builder_1 = new StringConcatenation();
        _builder_1.append("WiFiClient ");
        String _name_19 = channel.getName();
        _builder_1.append(_name_19);
        _builder_1.append("Client;");
        return _builder_1.toString();
      } else {
        if (((channel instanceof MqttClient) || this.typeChecker.ifMQTTType(channel))) {
          StringConcatenation _builder_2 = new StringConcatenation();
          _builder_2.append("void connect");
          String _firstUpper_3 = StringExtensions.toFirstUpper(channel.getName());
          _builder_2.append(_firstUpper_3);
          _builder_2.append("(){");
          _builder_2.newLineIfNotEmpty();
          _builder_2.append("\t");
          _builder_2.append("while(!");
          String _name_20 = channel.getName();
          _builder_2.append(_name_20, "\t");
          _builder_2.append("Client.connected()){");
          _builder_2.newLineIfNotEmpty();
          _builder_2.append("\t\t");
          _builder_2.append("const char* clientId = configJsonFile[\"");
          String _name_21 = channel.getName();
          _builder_2.append(_name_21, "\t\t");
          _builder_2.append("\"][\"id\"];");
          _builder_2.newLineIfNotEmpty();
          _builder_2.append("\t\t");
          _builder_2.append("if(");
          String _name_22 = channel.getName();
          _builder_2.append(_name_22, "\t\t");
          _builder_2.append("Client.connect(clientId)){");
          _builder_2.newLineIfNotEmpty();
          _builder_2.append("\t\t\t");
          _builder_2.append("break;");
          _builder_2.newLine();
          _builder_2.append("\t\t");
          _builder_2.append("} ");
          _builder_2.newLine();
          _builder_2.append("\t\t");
          _builder_2.append("delay(500);");
          _builder_2.newLine();
          _builder_2.append("\t");
          _builder_2.append("}");
          _builder_2.newLine();
          _builder_2.append("}");
          _builder_2.newLine();
          this.env.put(channel, _builder_2.toString());
          StringConcatenation _builder_3 = new StringConcatenation();
          _builder_3.append("WiFiClient mqttWifiClient;");
          _builder_3.newLine();
          _builder_3.append("PubSubClient ");
          String _name_23 = channel.getName();
          _builder_3.append(_name_23);
          _builder_3.append("Client(mqttWifiClient);");
          return _builder_3.toString();
        }
      }
      StringConcatenation _builder_4 = new StringConcatenation();
      _xblockexpression = _builder_4.toString();
    }
    return _xblockexpression;
  }
  
  public String getSerialBegin(final List<Channel> channels) {
    String _xblockexpression = null;
    {
      for (final Channel channel : channels) {
        boolean _ifSerialType = this.typeChecker.ifSerialType(channel);
        if (_ifSerialType) {
          ChannelConfig _config = channel.getConfig();
          boolean _tripleNotEquals = (_config != null);
          if (_tripleNotEquals) {
            StringConcatenation _builder = new StringConcatenation();
            _builder.append("unsigned int baudRate = configJsonFile[\"");
            String _name = channel.getName();
            _builder.append(_name);
            _builder.append("\"][\"baud\"];");
            _builder.newLineIfNotEmpty();
            _builder.append("Serial.begin(baudRate);");
            _builder.newLine();
            _builder.append("delay(1);");
            _builder.newLine();
            return _builder.toString();
          }
        }
      }
      StringConcatenation _builder_1 = new StringConcatenation();
      _xblockexpression = _builder_1.toString();
    }
    return _xblockexpression;
  }
  
  public String generateInitializeWifi(final WifiConfig config) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("void init_wifi() {");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("// Establishing a connection to ");
    String _name = config.getName();
    _builder.append(_name, "\t");
    _builder.append("-network");
    _builder.newLineIfNotEmpty();
    _builder.append("\t");
    _builder.append("const char* ssid = configJsonFile[\"wifi\"][\"ssid\"];");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("const char* pwd = configJsonFile[\"wifi\"][\"pass\"];");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("WiFi.begin(ssid, pwd);");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("while(WiFi.status() != WL_CONNECTED){");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("delay(500);");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("}");
    _builder.newLine();
    _builder.append("}");
    _builder.newLine();
    return _builder.toString();
  }
  
  public String generateLoadConfigurationFile() {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("bool load_configurations() {");
    _builder.newLine();
    _builder.append("\t");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("// make sure to place the config file in the root folder");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("file = SD.open(\"/config.json\");");
    _builder.newLine();
    _builder.append("\t");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("if (file) {");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("char content[file.size()];");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("int i = 0;");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("while (file.available()) {");
    _builder.newLine();
    _builder.append("\t\t\t");
    _builder.append("int currentByte = file.read();");
    _builder.newLine();
    _builder.append("\t\t\t");
    _builder.append("char character = (char) currentByte;");
    _builder.newLine();
    _builder.append("\t\t\t");
    _builder.newLine();
    _builder.append("\t\t\t");
    _builder.append("content[i] = character;");
    _builder.newLine();
    _builder.append("\t\t\t");
    _builder.append("i += 1;");
    _builder.newLine();
    _builder.append("\t\t\t");
    _builder.newLine();
    _builder.append("\t\t\t");
    _builder.append("if (currentByte == -1){");
    _builder.newLine();
    _builder.append("\t\t\t\t");
    _builder.append("break;");
    _builder.newLine();
    _builder.append("\t\t\t");
    _builder.append("}");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("}");
    _builder.newLine();
    _builder.append("\t");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("if (deserializeJson(configJsonFile, content)) {");
    _builder.newLine();
    _builder.append("\t\t    ");
    _builder.append("return false;");
    _builder.newLine();
    _builder.append("\t  \t");
    _builder.append("}");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("} ");
    _builder.newLine();
    _builder.append("\t");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("file.close();");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("return true;");
    _builder.newLine();
    _builder.append("}");
    _builder.newLine();
    return _builder.toString();
  }
  
  public String generateInitializeSDCard(final Board board) {
    String _xblockexpression = null;
    {
      final Boards supportedBoard = Boards.getBoardSupported(this._generatorUtils.getBoardVersion(board));
      StringConcatenation _builder = new StringConcatenation();
      _builder.append("bool init_SD_card () {");
      _builder.newLine();
      _builder.append("\t");
      _builder.append("SPI.begin(");
      int _sDMapping = supportedBoard.getSDMapping("sd_clk");
      _builder.append(_sDMapping, "\t");
      _builder.append(", ");
      int _sDMapping_1 = supportedBoard.getSDMapping("sd_do");
      _builder.append(_sDMapping_1, "\t");
      _builder.append(", ");
      int _sDMapping_2 = supportedBoard.getSDMapping("sd_di");
      _builder.append(_sDMapping_2, "\t");
      _builder.append(", ");
      int _sDMapping_3 = supportedBoard.getSDMapping("sd_cs");
      _builder.append(_sDMapping_3, "\t");
      _builder.append(");");
      _builder.newLineIfNotEmpty();
      _builder.append("\t");
      _builder.append("if (!SD.begin(");
      int _sDMapping_4 = supportedBoard.getSDMapping("sd_cs");
      _builder.append(_sDMapping_4, "\t");
      _builder.append(")) {");
      _builder.newLineIfNotEmpty();
      _builder.append("\t\t");
      _builder.append("return false;");
      _builder.newLine();
      _builder.append("\t");
      _builder.append("}");
      _builder.newLine();
      _builder.append("\t");
      _builder.append("return load_configurations();");
      _builder.newLine();
      _builder.append("}");
      _builder.newLine();
      _xblockexpression = _builder.toString();
    }
    return _xblockexpression;
  }
}
