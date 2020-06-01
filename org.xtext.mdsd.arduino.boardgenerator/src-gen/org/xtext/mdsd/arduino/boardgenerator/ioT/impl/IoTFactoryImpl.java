/**
 * generated by Xtext 2.21.0
 */
package org.xtext.mdsd.arduino.boardgenerator.ioT.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

import org.xtext.mdsd.arduino.boardgenerator.ioT.*;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class IoTFactoryImpl extends EFactoryImpl implements IoTFactory
{
  /**
   * Creates the default factory implementation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static IoTFactory init()
  {
    try
    {
      IoTFactory theIoTFactory = (IoTFactory)EPackage.Registry.INSTANCE.getEFactory(IoTPackage.eNS_URI);
      if (theIoTFactory != null)
      {
        return theIoTFactory;
      }
    }
    catch (Exception exception)
    {
      EcorePlugin.INSTANCE.log(exception);
    }
    return new IoTFactoryImpl();
  }

  /**
   * Creates an instance of the factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public IoTFactoryImpl()
  {
    super();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EObject create(EClass eClass)
  {
    switch (eClass.getClassifierID())
    {
      case IoTPackage.MODEL: return createModel();
      case IoTPackage.INCLUDE: return createInclude();
      case IoTPackage.IMPORT_OBJECT: return createImportObject();
      case IoTPackage.WIFI_CONFIG: return createWifiConfig();
      case IoTPackage.CHANNEL: return createChannel();
      case IoTPackage.CHANNEL_TYPE: return createChannelType();
      case IoTPackage.CHANNEL_CONFIG: return createChannelConfig();
      case IoTPackage.WIFI: return createWifi();
      case IoTPackage.SERIAL: return createSerial();
      case IoTPackage.STOP_IDENTIFYER: return createStopIdentifyer();
      case IoTPackage.STOP_CHAR: return createStopChar();
      case IoTPackage.STOP_BYTE: return createStopByte();
      case IoTPackage.MQTT_CLIENT: return createMqttClient();
      case IoTPackage.FUNCTION: return createFunction();
      case IoTPackage.FUNCTION_INPUT_TYPE: return createFunctionInputType();
      case IoTPackage.BOARD: return createBoard();
      case IoTPackage.NEW_BOARD: return createNewBoard();
      case IoTPackage.BOARD_VERSION: return createBoardVersion();
      case IoTPackage.EXTENDS_BOARD: return createExtendsBoard();
      case IoTPackage.ABSTRACT_BOARD: return createAbstractBoard();
      case IoTPackage.SENSOR: return createSensor();
      case IoTPackage.SENSOR_TYPE: return createSensorType();
      case IoTPackage.EXTERNAL_SENSOR: return createExternalSensor();
      case IoTPackage.ONBOARD_SENSOR: return createOnboardSensor();
      case IoTPackage.SENSOR_VARIABLES: return createSensorVariables();
      case IoTPackage.VARIABLE: return createVariable();
      case IoTPackage.SAMPLER: return createSampler();
      case IoTPackage.COMMAND: return createCommand();
      case IoTPackage.FREQUENCY: return createFrequency();
      case IoTPackage.RESOLUTION: return createResolution();
      case IoTPackage.SENSOR_OUTPUT: return createSensorOutput();
      case IoTPackage.DATA_OUTPUT: return createDataOutput();
      case IoTPackage.PIPELINE: return createPipeline();
      case IoTPackage.EXTERNAL: return createExternal();
      case IoTPackage.TUPLE_PIPELINE: return createTuplePipeline();
      case IoTPackage.MAP_PIPELINE: return createMapPipeline();
      case IoTPackage.WINDOW_PIPELINE: return createWindowPipeline();
      case IoTPackage.EXECUTE_PIPELINE: return createExecutePipeline();
      case IoTPackage.EXPRESSION: return createExpression();
      case IoTPackage.REFERENCE: return createReference();
      case IoTPackage.STRING_LITERAL: return createStringLiteral();
      case IoTPackage.NUMBER_LITERAL: return createNumberLiteral();
      case IoTPackage.BOOLEAN_LITERAL: return createBooleanLiteral();
      case IoTPackage.SECONDS: return createSeconds();
      case IoTPackage.MILLIS: return createMillis();
      case IoTPackage.MICROS: return createMicros();
      case IoTPackage.FILTER: return createFilter();
      case IoTPackage.ABS: return createAbs();
      case IoTPackage.MAP: return createMap();
      case IoTPackage.WINDOW: return createWindow();
      case IoTPackage.REDUCE: return createReduce();
      case IoTPackage.MEAN: return createMean();
      case IoTPackage.MEDIAN: return createMedian();
      case IoTPackage.ST_DEV: return createStDev();
      case IoTPackage.MIN: return createMin();
      case IoTPackage.MAX: return createMax();
      case IoTPackage.COUNT: return createCount();
      case IoTPackage.VAR: return createVar();
      case IoTPackage.CONDITIONAL: return createConditional();
      case IoTPackage.OR: return createOr();
      case IoTPackage.AND: return createAnd();
      case IoTPackage.EQUAL: return createEqual();
      case IoTPackage.UNEQUAL: return createUnequal();
      case IoTPackage.LESS_THAN: return createLessThan();
      case IoTPackage.LESS_THAN_EQUAL: return createLessThanEqual();
      case IoTPackage.GREATER_THAN: return createGreaterThan();
      case IoTPackage.GREATER_THAN_EQUAL: return createGreaterThanEqual();
      case IoTPackage.PLUS: return createPlus();
      case IoTPackage.MINUS: return createMinus();
      case IoTPackage.MUL: return createMul();
      case IoTPackage.DIV: return createDiv();
      case IoTPackage.NEGATION: return createNegation();
      case IoTPackage.EXPONENT: return createExponent();
      case IoTPackage.NOT: return createNot();
      default:
        throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
    }
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Model createModel()
  {
    ModelImpl model = new ModelImpl();
    return model;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Include createInclude()
  {
    IncludeImpl include = new IncludeImpl();
    return include;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public ImportObject createImportObject()
  {
    ImportObjectImpl importObject = new ImportObjectImpl();
    return importObject;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public WifiConfig createWifiConfig()
  {
    WifiConfigImpl wifiConfig = new WifiConfigImpl();
    return wifiConfig;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Channel createChannel()
  {
    ChannelImpl channel = new ChannelImpl();
    return channel;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public ChannelType createChannelType()
  {
    ChannelTypeImpl channelType = new ChannelTypeImpl();
    return channelType;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public ChannelConfig createChannelConfig()
  {
    ChannelConfigImpl channelConfig = new ChannelConfigImpl();
    return channelConfig;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Wifi createWifi()
  {
    WifiImpl wifi = new WifiImpl();
    return wifi;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Serial createSerial()
  {
    SerialImpl serial = new SerialImpl();
    return serial;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public StopIdentifyer createStopIdentifyer()
  {
    StopIdentifyerImpl stopIdentifyer = new StopIdentifyerImpl();
    return stopIdentifyer;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public StopChar createStopChar()
  {
    StopCharImpl stopChar = new StopCharImpl();
    return stopChar;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public StopByte createStopByte()
  {
    StopByteImpl stopByte = new StopByteImpl();
    return stopByte;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public MqttClient createMqttClient()
  {
    MqttClientImpl mqttClient = new MqttClientImpl();
    return mqttClient;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Function createFunction()
  {
    FunctionImpl function = new FunctionImpl();
    return function;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public FunctionInputType createFunctionInputType()
  {
    FunctionInputTypeImpl functionInputType = new FunctionInputTypeImpl();
    return functionInputType;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Board createBoard()
  {
    BoardImpl board = new BoardImpl();
    return board;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public NewBoard createNewBoard()
  {
    NewBoardImpl newBoard = new NewBoardImpl();
    return newBoard;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public BoardVersion createBoardVersion()
  {
    BoardVersionImpl boardVersion = new BoardVersionImpl();
    return boardVersion;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public ExtendsBoard createExtendsBoard()
  {
    ExtendsBoardImpl extendsBoard = new ExtendsBoardImpl();
    return extendsBoard;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public AbstractBoard createAbstractBoard()
  {
    AbstractBoardImpl abstractBoard = new AbstractBoardImpl();
    return abstractBoard;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Sensor createSensor()
  {
    SensorImpl sensor = new SensorImpl();
    return sensor;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public SensorType createSensorType()
  {
    SensorTypeImpl sensorType = new SensorTypeImpl();
    return sensorType;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public ExternalSensor createExternalSensor()
  {
    ExternalSensorImpl externalSensor = new ExternalSensorImpl();
    return externalSensor;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public OnboardSensor createOnboardSensor()
  {
    OnboardSensorImpl onboardSensor = new OnboardSensorImpl();
    return onboardSensor;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public SensorVariables createSensorVariables()
  {
    SensorVariablesImpl sensorVariables = new SensorVariablesImpl();
    return sensorVariables;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Variable createVariable()
  {
    VariableImpl variable = new VariableImpl();
    return variable;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Sampler createSampler()
  {
    SamplerImpl sampler = new SamplerImpl();
    return sampler;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Command createCommand()
  {
    CommandImpl command = new CommandImpl();
    return command;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Frequency createFrequency()
  {
    FrequencyImpl frequency = new FrequencyImpl();
    return frequency;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Resolution createResolution()
  {
    ResolutionImpl resolution = new ResolutionImpl();
    return resolution;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public SensorOutput createSensorOutput()
  {
    SensorOutputImpl sensorOutput = new SensorOutputImpl();
    return sensorOutput;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public DataOutput createDataOutput()
  {
    DataOutputImpl dataOutput = new DataOutputImpl();
    return dataOutput;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Pipeline createPipeline()
  {
    PipelineImpl pipeline = new PipelineImpl();
    return pipeline;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public External createExternal()
  {
    ExternalImpl external = new ExternalImpl();
    return external;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public TuplePipeline createTuplePipeline()
  {
    TuplePipelineImpl tuplePipeline = new TuplePipelineImpl();
    return tuplePipeline;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public MapPipeline createMapPipeline()
  {
    MapPipelineImpl mapPipeline = new MapPipelineImpl();
    return mapPipeline;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public WindowPipeline createWindowPipeline()
  {
    WindowPipelineImpl windowPipeline = new WindowPipelineImpl();
    return windowPipeline;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public ExecutePipeline createExecutePipeline()
  {
    ExecutePipelineImpl executePipeline = new ExecutePipelineImpl();
    return executePipeline;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Expression createExpression()
  {
    ExpressionImpl expression = new ExpressionImpl();
    return expression;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Reference createReference()
  {
    ReferenceImpl reference = new ReferenceImpl();
    return reference;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public StringLiteral createStringLiteral()
  {
    StringLiteralImpl stringLiteral = new StringLiteralImpl();
    return stringLiteral;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public NumberLiteral createNumberLiteral()
  {
    NumberLiteralImpl numberLiteral = new NumberLiteralImpl();
    return numberLiteral;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public BooleanLiteral createBooleanLiteral()
  {
    BooleanLiteralImpl booleanLiteral = new BooleanLiteralImpl();
    return booleanLiteral;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Seconds createSeconds()
  {
    SecondsImpl seconds = new SecondsImpl();
    return seconds;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Millis createMillis()
  {
    MillisImpl millis = new MillisImpl();
    return millis;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Micros createMicros()
  {
    MicrosImpl micros = new MicrosImpl();
    return micros;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Filter createFilter()
  {
    FilterImpl filter = new FilterImpl();
    return filter;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Abs createAbs()
  {
    AbsImpl abs = new AbsImpl();
    return abs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Map createMap()
  {
    MapImpl map = new MapImpl();
    return map;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Window createWindow()
  {
    WindowImpl window = new WindowImpl();
    return window;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Reduce createReduce()
  {
    ReduceImpl reduce = new ReduceImpl();
    return reduce;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Mean createMean()
  {
    MeanImpl mean = new MeanImpl();
    return mean;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Median createMedian()
  {
    MedianImpl median = new MedianImpl();
    return median;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public StDev createStDev()
  {
    StDevImpl stDev = new StDevImpl();
    return stDev;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Min createMin()
  {
    MinImpl min = new MinImpl();
    return min;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Max createMax()
  {
    MaxImpl max = new MaxImpl();
    return max;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Count createCount()
  {
    CountImpl count = new CountImpl();
    return count;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Var createVar()
  {
    VarImpl var = new VarImpl();
    return var;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Conditional createConditional()
  {
    ConditionalImpl conditional = new ConditionalImpl();
    return conditional;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Or createOr()
  {
    OrImpl or = new OrImpl();
    return or;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public And createAnd()
  {
    AndImpl and = new AndImpl();
    return and;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Equal createEqual()
  {
    EqualImpl equal = new EqualImpl();
    return equal;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Unequal createUnequal()
  {
    UnequalImpl unequal = new UnequalImpl();
    return unequal;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public LessThan createLessThan()
  {
    LessThanImpl lessThan = new LessThanImpl();
    return lessThan;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public LessThanEqual createLessThanEqual()
  {
    LessThanEqualImpl lessThanEqual = new LessThanEqualImpl();
    return lessThanEqual;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public GreaterThan createGreaterThan()
  {
    GreaterThanImpl greaterThan = new GreaterThanImpl();
    return greaterThan;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public GreaterThanEqual createGreaterThanEqual()
  {
    GreaterThanEqualImpl greaterThanEqual = new GreaterThanEqualImpl();
    return greaterThanEqual;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Plus createPlus()
  {
    PlusImpl plus = new PlusImpl();
    return plus;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Minus createMinus()
  {
    MinusImpl minus = new MinusImpl();
    return minus;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Mul createMul()
  {
    MulImpl mul = new MulImpl();
    return mul;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Div createDiv()
  {
    DivImpl div = new DivImpl();
    return div;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Negation createNegation()
  {
    NegationImpl negation = new NegationImpl();
    return negation;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Exponent createExponent()
  {
    ExponentImpl exponent = new ExponentImpl();
    return exponent;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Not createNot()
  {
    NotImpl not = new NotImpl();
    return not;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public IoTPackage getIoTPackage()
  {
    return (IoTPackage)getEPackage();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @deprecated
   * @generated
   */
  @Deprecated
  public static IoTPackage getPackage()
  {
    return IoTPackage.eINSTANCE;
  }

} //IoTFactoryImpl
