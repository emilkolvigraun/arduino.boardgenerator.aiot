package org.xtext.mdsd.arduino.boardgenerator.generator;

import com.google.inject.Inject;
import java.util.HashMap;
import java.util.List;
import java.util.Set;
import org.eclipse.xtend2.lib.StringConcatenation;
import org.eclipse.xtext.xbase.lib.Extension;
import org.eclipse.xtext.xbase.lib.IterableExtensions;
import org.eclipse.xtext.xbase.lib.StringExtensions;
import org.xtext.mdsd.arduino.boardgenerator.generator.GeneratorUtils;
import org.xtext.mdsd.arduino.boardgenerator.ioT.Board;
import org.xtext.mdsd.arduino.boardgenerator.ioT.Channel;
import org.xtext.mdsd.arduino.boardgenerator.ioT.ChannelConfig;
import org.xtext.mdsd.arduino.boardgenerator.ioT.MqttClient;
import org.xtext.mdsd.arduino.boardgenerator.ioT.Sensor;
import org.xtext.mdsd.arduino.boardgenerator.ioT.Wifi;
import org.xtext.mdsd.arduino.boardgenerator.ioT.WifiConfig;
import org.xtext.mdsd.arduino.boardgenerator.typeChecker.TypeChecker;
import org.xtext.mdsd.arduino.boardgenerator.validation.Boards;

@SuppressWarnings("all")
public class BoardCodeGenerator {
  @Inject
  @Extension
  private GeneratorUtils _generatorUtils;
  
  @Inject
  private TypeChecker typeChecker;
  
  public String generateBoardCode(final Board board, final List<Channel> channels, final int configLength, final int embeddedSensorsLength) {
    String _xblockexpression = null;
    {
      HashMap<Channel, String> env = new HashMap<Channel, String>();
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
      _builder.append(" ");
      _builder.newLine();
      _builder.append("// used to verify whether the device booted correctly ");
      _builder.newLine();
      _builder.append("bool booted = false;");
      _builder.newLine();
      _builder.append(" ");
      _builder.newLine();
      String _generateInitChannels = this.generateInitChannels(channels, env);
      _builder.append(_generateInitChannels);
      _builder.newLineIfNotEmpty();
      String _generateInitializeSDCard = this.generateInitializeSDCard(board);
      _builder.append(_generateInitializeSDCard);
      _builder.newLineIfNotEmpty();
      _builder.append(" ");
      _builder.newLine();
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
      String _generateChannelsConnect = this.generateChannelsConnect(env);
      _builder.append(_generateChannelsConnect);
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
      String _generateInitConnectChannels = this.generateInitConnectChannels(IterableExtensions.<Channel>toList(env.keySet()));
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
      String _generateLoop = this.generateLoop(this._generatorUtils.getBoardSensors(board), env);
      _builder.append(_generateLoop, "\t");
      _builder.newLineIfNotEmpty();
      _builder.append("}");
      _builder.newLine();
      _xblockexpression = _builder.toString();
    }
    return _xblockexpression;
  }
  
  public String generateLoop(final List<Sensor> sensors, final HashMap<Channel, String> env) {
    String _xblockexpression = null;
    {
      for (final Sensor s : sensors) {
        System.out.println(s.getOutput().toString());
      }
      StringConcatenation _builder = new StringConcatenation();
      _xblockexpression = _builder.toString();
    }
    return _xblockexpression;
  }
  
  public String generateChannelsConnect(final HashMap<Channel, String> env) {
    StringConcatenation _builder = new StringConcatenation();
    {
      Set<Channel> _keySet = env.keySet();
      for(final Channel key : _keySet) {
        String _get = env.get(key);
        _builder.append(_get);
        _builder.newLineIfNotEmpty();
        _builder.append(" ");
        _builder.newLine();
      }
    }
    return _builder.toString();
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
  
  public String generateInitChannels(final List<Channel> channels, final HashMap<Channel, String> env) {
    StringConcatenation _builder = new StringConcatenation();
    {
      for(final Channel channel : channels) {
        String _initChannel = this.initChannel(channel, env);
        _builder.append(_initChannel);
        _builder.newLineIfNotEmpty();
        _builder.append(" ");
        _builder.newLine();
      }
    }
    return _builder.toString();
  }
  
  public String initChannel(final Channel channel, final HashMap<Channel, String> env) {
    String _xblockexpression = null;
    {
      final ChannelConfig config = channel.getConfig();
      if (((config instanceof Wifi) || this.typeChecker.ifServerType(channel))) {
        StringConcatenation _builder = new StringConcatenation();
        _builder.append("void connect");
        String _firstUpper = StringExtensions.toFirstUpper(channel.getName());
        _builder.append(_firstUpper);
        _builder.append("(){");
        _builder.newLineIfNotEmpty();
        _builder.append("\t");
        _builder.append("while(!");
        String _name = channel.getName();
        _builder.append(_name, "\t");
        _builder.append("Client.connected()){");
        _builder.newLineIfNotEmpty();
        _builder.append("\t\t");
        _builder.append("unsigned int ");
        String _name_1 = channel.getName();
        _builder.append(_name_1, "\t\t");
        _builder.append("Port  = configJsonFile[\"");
        String _name_2 = channel.getName();
        _builder.append(_name_2, "\t\t");
        _builder.append("\"][\"port\"];");
        _builder.newLineIfNotEmpty();
        _builder.append("\t\t");
        _builder.append("const char* ");
        String _name_3 = channel.getName();
        _builder.append(_name_3, "\t\t");
        _builder.append("IpChar = configJsonFile[\"");
        String _name_4 = channel.getName();
        _builder.append(_name_4, "\t\t");
        _builder.append("\"][\"ip\"];");
        _builder.newLineIfNotEmpty();
        _builder.append("\t\t");
        _builder.append("String ");
        String _name_5 = channel.getName();
        _builder.append(_name_5, "\t\t");
        _builder.append("IpStr = (String) ");
        String _name_6 = channel.getName();
        _builder.append(_name_6, "\t\t");
        _builder.append("IpChar;");
        _builder.newLineIfNotEmpty();
        _builder.append("\t\t");
        _builder.append("int a = -1;");
        _builder.newLine();
        _builder.append("\t\t");
        _builder.append("int b = -1;");
        _builder.newLine();
        _builder.append("\t\t");
        _builder.append("int c = -1;");
        _builder.newLine();
        _builder.append("\t\t");
        _builder.append("int d = -1;");
        _builder.newLine();
        _builder.append("\t\t");
        _builder.append("int li = 0;");
        _builder.newLine();
        _builder.append("\t\t");
        _builder.newLine();
        _builder.append("\t\t");
        _builder.append("for (int i = 0; i < ");
        String _name_7 = channel.getName();
        _builder.append(_name_7, "\t\t");
        _builder.append("IpStr.length(); i++) {");
        _builder.newLineIfNotEmpty();
        _builder.append("\t\t\t");
        _builder.append("if (");
        String _name_8 = channel.getName();
        _builder.append(_name_8, "\t\t\t");
        _builder.append("IpStr.substring(i, i+1) == \",\") {");
        _builder.newLineIfNotEmpty();
        _builder.append("\t\t\t\t");
        _builder.append("if (a == -1) {");
        _builder.newLine();
        _builder.append("\t\t\t\t    ");
        _builder.append("a = ");
        String _name_9 = channel.getName();
        _builder.append(_name_9, "\t\t\t\t    ");
        _builder.append("IpStr.substring(li, i).toInt();");
        _builder.newLineIfNotEmpty();
        _builder.append("\t\t\t\t\t");
        _builder.append("li = i;");
        _builder.newLine();
        _builder.append("\t\t\t\t");
        _builder.append("} else if (b == -1) {");
        _builder.newLine();
        _builder.append("\t\t\t\t\t");
        _builder.append("b = ");
        String _name_10 = channel.getName();
        _builder.append(_name_10, "\t\t\t\t\t");
        _builder.append("IpStr.substring(li, i).toInt();");
        _builder.newLineIfNotEmpty();
        _builder.append("\t\t\t\t\t");
        _builder.append("li = 1;");
        _builder.newLine();
        _builder.append("\t\t\t\t");
        _builder.append("} else if (c == -1) {");
        _builder.newLine();
        _builder.append("\t\t\t\t\t");
        _builder.append("c = ");
        String _name_11 = channel.getName();
        _builder.append(_name_11, "\t\t\t\t\t");
        _builder.append("IpStr.substring(li, i).toInt();");
        _builder.newLineIfNotEmpty();
        _builder.append("\t\t\t\t\t");
        _builder.append("d = ");
        String _name_12 = channel.getName();
        _builder.append(_name_12, "\t\t\t\t\t");
        _builder.append("IpStr.substring(i+1).toInt();");
        _builder.newLineIfNotEmpty();
        _builder.append("\t\t\t\t");
        _builder.append("}");
        _builder.newLine();
        _builder.append("\t\t  ");
        _builder.append("}");
        _builder.newLine();
        _builder.append("\t\t");
        _builder.append("}");
        _builder.newLine();
        _builder.append("\t\t");
        _builder.newLine();
        _builder.append("\t\t");
        _builder.append("IPAddress ");
        String _name_13 = channel.getName();
        _builder.append(_name_13, "\t\t");
        _builder.append("Ip(a, b, c, d);");
        _builder.newLineIfNotEmpty();
        _builder.append("\t\t");
        _builder.append("if (");
        String _name_14 = channel.getName();
        _builder.append(_name_14, "\t\t");
        _builder.append("Client.connect(");
        String _name_15 = channel.getName();
        _builder.append(_name_15, "\t\t");
        _builder.append("Ip, ");
        String _name_16 = channel.getName();
        _builder.append(_name_16, "\t\t");
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
        env.put(channel, _builder.toString());
        StringConcatenation _builder_1 = new StringConcatenation();
        _builder_1.append("WiFiClient ");
        String _name_17 = channel.getName();
        _builder_1.append(_name_17);
        _builder_1.append("Client;");
        return _builder_1.toString();
      } else {
        if (((channel instanceof MqttClient) || this.typeChecker.ifMQTTType(channel))) {
          StringConcatenation _builder_2 = new StringConcatenation();
          _builder_2.append("void connect");
          String _firstUpper_1 = StringExtensions.toFirstUpper(channel.getName());
          _builder_2.append(_firstUpper_1);
          _builder_2.append("(){");
          _builder_2.newLineIfNotEmpty();
          _builder_2.append("\t");
          _builder_2.append("while(!");
          String _name_18 = channel.getName();
          _builder_2.append(_name_18, "\t");
          _builder_2.append("Client.connected()){");
          _builder_2.newLineIfNotEmpty();
          _builder_2.append("\t\t");
          _builder_2.append("const char* clientId = configJsonFile[\"");
          String _name_19 = channel.getName();
          _builder_2.append(_name_19, "\t\t");
          _builder_2.append("\"][\"id\"];");
          _builder_2.newLineIfNotEmpty();
          _builder_2.append("\t\t");
          _builder_2.append("if(");
          String _name_20 = channel.getName();
          _builder_2.append(_name_20, "\t\t");
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
          env.put(channel, _builder_2.toString());
          StringConcatenation _builder_3 = new StringConcatenation();
          _builder_3.append("WiFiClient mqttWifiClient;");
          _builder_3.newLine();
          _builder_3.append("PubSubClient ");
          String _name_21 = channel.getName();
          _builder_3.append(_name_21);
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
