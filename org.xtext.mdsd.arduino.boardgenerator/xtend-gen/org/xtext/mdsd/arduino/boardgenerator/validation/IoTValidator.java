/**
 * generated by Xtext 2.21.0
 */
package org.xtext.mdsd.arduino.boardgenerator.validation;

import com.google.common.base.Objects;
import com.google.inject.Inject;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.function.Consumer;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.xtend2.lib.StringConcatenation;
import org.eclipse.xtext.EcoreUtil2;
import org.eclipse.xtext.resource.IEObjectDescription;
import org.eclipse.xtext.resource.IResourceDescriptions;
import org.eclipse.xtext.validation.Check;
import org.eclipse.xtext.validation.CheckType;
import org.eclipse.xtext.xbase.lib.CollectionLiterals;
import org.eclipse.xtext.xbase.lib.Conversions;
import org.eclipse.xtext.xbase.lib.Exceptions;
import org.eclipse.xtext.xbase.lib.ExclusiveRange;
import org.eclipse.xtext.xbase.lib.Extension;
import org.xtext.mdsd.arduino.boardgenerator.ioT.AbstractBoard;
import org.xtext.mdsd.arduino.boardgenerator.ioT.And;
import org.xtext.mdsd.arduino.boardgenerator.ioT.Board;
import org.xtext.mdsd.arduino.boardgenerator.ioT.BoardVersion;
import org.xtext.mdsd.arduino.boardgenerator.ioT.Channel;
import org.xtext.mdsd.arduino.boardgenerator.ioT.Conditional;
import org.xtext.mdsd.arduino.boardgenerator.ioT.Div;
import org.xtext.mdsd.arduino.boardgenerator.ioT.Equal;
import org.xtext.mdsd.arduino.boardgenerator.ioT.Exponent;
import org.xtext.mdsd.arduino.boardgenerator.ioT.Expression;
import org.xtext.mdsd.arduino.boardgenerator.ioT.ExtendsBoard;
import org.xtext.mdsd.arduino.boardgenerator.ioT.External;
import org.xtext.mdsd.arduino.boardgenerator.ioT.ExternalSensor;
import org.xtext.mdsd.arduino.boardgenerator.ioT.Filter;
import org.xtext.mdsd.arduino.boardgenerator.ioT.Function;
import org.xtext.mdsd.arduino.boardgenerator.ioT.FunctionInputType;
import org.xtext.mdsd.arduino.boardgenerator.ioT.GreaterThan;
import org.xtext.mdsd.arduino.boardgenerator.ioT.GreaterThanEqual;
import org.xtext.mdsd.arduino.boardgenerator.ioT.IoTPackage;
import org.xtext.mdsd.arduino.boardgenerator.ioT.LessThan;
import org.xtext.mdsd.arduino.boardgenerator.ioT.LessThanEqual;
import org.xtext.mdsd.arduino.boardgenerator.ioT.Map;
import org.xtext.mdsd.arduino.boardgenerator.ioT.Minus;
import org.xtext.mdsd.arduino.boardgenerator.ioT.Model;
import org.xtext.mdsd.arduino.boardgenerator.ioT.MqttClient;
import org.xtext.mdsd.arduino.boardgenerator.ioT.Mul;
import org.xtext.mdsd.arduino.boardgenerator.ioT.Negation;
import org.xtext.mdsd.arduino.boardgenerator.ioT.NewBoard;
import org.xtext.mdsd.arduino.boardgenerator.ioT.Not;
import org.xtext.mdsd.arduino.boardgenerator.ioT.OnboardSensor;
import org.xtext.mdsd.arduino.boardgenerator.ioT.Or;
import org.xtext.mdsd.arduino.boardgenerator.ioT.Pipeline;
import org.xtext.mdsd.arduino.boardgenerator.ioT.Plus;
import org.xtext.mdsd.arduino.boardgenerator.ioT.Reference;
import org.xtext.mdsd.arduino.boardgenerator.ioT.Sensor;
import org.xtext.mdsd.arduino.boardgenerator.ioT.SensorOutput;
import org.xtext.mdsd.arduino.boardgenerator.ioT.SensorType;
import org.xtext.mdsd.arduino.boardgenerator.ioT.SensorVariables;
import org.xtext.mdsd.arduino.boardgenerator.ioT.Unequal;
import org.xtext.mdsd.arduino.boardgenerator.ioT.Variable;
import org.xtext.mdsd.arduino.boardgenerator.ioT.Wifi;
import org.xtext.mdsd.arduino.boardgenerator.ioT.WifiConfig;
import org.xtext.mdsd.arduino.boardgenerator.ioT.WindowPipeline;
import org.xtext.mdsd.arduino.boardgenerator.scoping.IoTGlobalScopeProvider;
import org.xtext.mdsd.arduino.boardgenerator.typeChecker.TypeChecker;
import org.xtext.mdsd.arduino.boardgenerator.validation.AbstractIoTValidator;
import org.xtext.mdsd.arduino.boardgenerator.validation.Boards;

/**
 * This class contains custom validation rules.
 * 
 * See https://www.eclipse.org/Xtext/documentation/303_runtime_concepts.html#validation
 */
@SuppressWarnings("all")
public class IoTValidator extends AbstractIoTValidator {
  public static final String NO_SUPPORT_FOR_SENSOR = "org.xtext.mdsd.arduino.boardgenerator.NoSupportForSensor";
  
  public static final String INVALID_TYPE = "org.xtext.mdsd.arduino.boardgenerator.InvalidType";
  
  @Inject
  private IoTGlobalScopeProvider scopeProvider;
  
  @Inject
  @Extension
  private TypeChecker _typeChecker;
  
  @Check
  public void validateExternalSensor(final Sensor sensor) {
    final int vcc = sensor.getVcc();
    final SensorType externalSensor = sensor.getSensortype();
    if ((externalSensor instanceof ExternalSensor)) {
      int _size = ((ExternalSensor)externalSensor).getPins().size();
      int _size_1 = sensor.getVars().getIds().size();
      boolean _notEquals = (_size != _size_1);
      if (_notEquals) {
        StringConcatenation _builder = new StringConcatenation();
        _builder.append("number of vars must equal ");
        int _size_2 = ((ExternalSensor)externalSensor).getPins().size();
        _builder.append(_size_2);
        this.error(_builder.toString(), IoTPackage.Literals.SENSOR__VARS);
      }
      if ((vcc < 1)) {
        this.error("this declaration of sensor needs vcc", IoTPackage.eINSTANCE.getSensor_Name());
      }
    }
    final List<String> list = this.construct(sensor.getVars().getIds());
    final HashSet<String> set = new HashSet<String>(list);
    int _size_3 = set.size();
    int _size_4 = list.size();
    boolean _notEquals_1 = (_size_3 != _size_4);
    if (_notEquals_1) {
      this.error("variables must be unique", IoTPackage.Literals.SENSOR__VARS);
    }
    if (((externalSensor instanceof OnboardSensor) && (vcc > 0))) {
      this.warning("supported sensors does not require vcc", IoTPackage.eINSTANCE.getSensor_Vcc());
    }
  }
  
  public List<String> construct(final List<Variable> variables) {
    ArrayList<String> _xblockexpression = null;
    {
      final ArrayList<String> list = CollectionLiterals.<String>newArrayList();
      int counter = 0;
      for (final Variable v : variables) {
        {
          final String name = v.getName();
          boolean _equals = Objects.equal(name, "_");
          if (_equals) {
            String _string = Integer.valueOf(counter).toString();
            String _plus = (name + _string);
            list.add(_plus);
            counter++;
          } else {
            list.add(name);
          }
        }
      }
      _xblockexpression = list;
    }
    return _xblockexpression;
  }
  
  @Check
  public void validateExpressionVariables(final Expression expression) {
    if ((expression instanceof Reference)) {
      final Reference reference = ((Reference) expression);
      EObject parent = this._typeChecker.getPipelineChildOf(EcoreUtil2.<Pipeline>getContainerOfType(reference, Pipeline.class));
      if ((parent == null)) {
        final Sensor sensor = EcoreUtil2.<Sensor>getContainerOfType(expression, Sensor.class);
        boolean error = true;
        EList<Variable> _ids = sensor.getVars().getIds();
        for (final Variable v : _ids) {
          String _ref = reference.getRef();
          String _name = v.getName();
          boolean _equals = Objects.equal(_ref, _name);
          if (_equals) {
            error = false;
          }
        }
        if (error) {
          StringConcatenation _builder = new StringConcatenation();
          _builder.append("variable \"");
          String _ref_1 = reference.getRef();
          _builder.append(_ref_1);
          _builder.append("\" was not declared");
          this.error(_builder.toString(), IoTPackage.eINSTANCE.getReference_Ref());
        }
      } else {
        if ((parent instanceof Map)) {
          Map map = ((Map) parent);
          String _name_1 = map.getOutput().getName();
          String _ref_2 = reference.getRef();
          boolean _notEquals = (!Objects.equal(_name_1, _ref_2));
          if (_notEquals) {
            StringConcatenation _builder_1 = new StringConcatenation();
            _builder_1.append("only variable \"");
            String _name_2 = map.getOutput().getName();
            _builder_1.append(_name_2);
            _builder_1.append("\" is reachable after map function");
            this.error(_builder_1.toString(), IoTPackage.eINSTANCE.getReference_Ref());
          }
        } else {
          if ((parent instanceof External)) {
            External external = ((External) parent);
            int index = external.getFunction().getOutput().indexOf(reference.getRef());
            if ((index < 0)) {
              StringConcatenation _builder_2 = new StringConcatenation();
              _builder_2.append("\"");
              String _ref_3 = reference.getRef();
              _builder_2.append(_ref_3);
              _builder_2.append("\" not reachable");
              this.error(_builder_2.toString(), IoTPackage.eINSTANCE.getReference_Ref());
            }
          }
        }
      }
    }
  }
  
  @Check
  public void validateFunction(final External external) {
    int functionOutput = external.getFunction().getInput().size();
    int _size = external.getInput().size();
    boolean _notEquals = (_size != functionOutput);
    if (_notEquals) {
      final ArrayList<String> inputs = CollectionLiterals.<String>newArrayList();
      final Consumer<FunctionInputType> _function = (FunctionInputType i) -> {
        inputs.add(i.getName());
      };
      external.getFunction().getInput().forEach(_function);
      StringConcatenation _builder = new StringConcatenation();
      _builder.append("input does not match declared function ");
      String _name = external.getFunction().getName();
      _builder.append(_name);
      String _replace = inputs.toString().replace("[", "(").replace("]", ")");
      _builder.append(_replace);
      this.error(_builder.toString(), IoTPackage.eINSTANCE.getExternal_Function());
    }
    Sensor sensor = EcoreUtil2.<Sensor>getContainerOfType(external, Sensor.class);
    ExclusiveRange _doubleDotLessThan = new ExclusiveRange(0, functionOutput, true);
    for (final Integer i : _doubleDotLessThan) {
      {
        int _size_1 = external.getInput().size();
        boolean _lessThan = (_size_1 < 1);
        if (_lessThan) {
          return;
        }
        try {
          Expression _get = external.getInput().get((i).intValue());
          TypeChecker.Type inputType = this._typeChecker.type(((Expression) _get));
          TypeChecker.Type acceptedInputType = this._typeChecker.type(external.getFunction().getInput().get((i).intValue()));
          boolean _isNumberType = this._typeChecker.isNumberType(acceptedInputType);
          if (_isNumberType) {
            this.validateNumbers(inputType, IoTPackage.eINSTANCE.getExternal_Input());
          } else {
            this.validateTypes(inputType, acceptedInputType, IoTPackage.eINSTANCE.getExternal_Input());
          }
          if ((sensor != null)) {
            String functionOutputID = external.getFunction().getOutput().get((i).intValue());
            int index = this.asStringList(sensor.getVars().getIds()).indexOf(functionOutputID.toString());
            if ((index > (-1))) {
              StringConcatenation _builder_1 = new StringConcatenation();
              _builder_1.append("funtion ");
              String _name_1 = external.getFunction().getName();
              _builder_1.append(_name_1);
              _builder_1.append(" not applicable in ");
              String _name_2 = sensor.getName();
              _builder_1.append(_name_2);
              _builder_1.append(" because output variables not unique");
              this.error(_builder_1.toString(), IoTPackage.eINSTANCE.getExternal_Function());
            }
            String _string = functionOutputID.toString();
            String _string_1 = sensor.getVars().getName().toString();
            boolean _equals = Objects.equal(_string, _string_1);
            if (_equals) {
              StringConcatenation _builder_2 = new StringConcatenation();
              _builder_2.append("funtion ");
              String _name_3 = external.getFunction().getName();
              _builder_2.append(_name_3);
              _builder_2.append(" not applicable in ");
              String _name_4 = sensor.getName();
              _builder_2.append(_name_4);
              _builder_2.append(" because sensor variable not unique");
              this.error(_builder_2.toString(), IoTPackage.eINSTANCE.getExternal_Function());
            }
          }
        } catch (final Throwable _t) {
          if (_t instanceof Exception) {
            return;
          } else {
            throw Exceptions.sneakyThrow(_t);
          }
        }
      }
    }
  }
  
  @Check
  public void validateSensorHasWifiConnection(final SensorOutput output) {
    final EList<Channel> channels = output.getChannel();
    boolean includes = false;
    ArrayList<String> wifiChannels = CollectionLiterals.<String>newArrayList();
    for (final Channel channel : channels) {
      {
        if (((channel.getConfig() instanceof Wifi) || (channel.getConfig() instanceof MqttClient))) {
          includes = true;
        }
        wifiChannels.add(channel.getName());
      }
    }
    if (includes) {
      Board board = EcoreUtil2.<Board>getContainerOfType(output, Board.class);
      WifiConfig _wifiSelect = board.getWifiSelect();
      final boolean wifi = (_wifiSelect != null);
      if ((!wifi)) {
        StringConcatenation _builder = new StringConcatenation();
        String _replace = wifiChannels.toString().replace(",", " and").replace("[", "").replace("]", "");
        _builder.append(_replace);
        _builder.append(", is not applicable without a wifi connection");
        this.error(_builder.toString(), IoTPackage.eINSTANCE.getSensorOutput_Channel());
      }
    }
  }
  
  @Check
  public void validateReferenceNotIgnored(final Reference reference) {
    String _ref = reference.getRef();
    boolean _equals = Objects.equal(_ref, "_");
    if (_equals) {
      StringConcatenation _builder = new StringConcatenation();
      _builder.append("cannot parse ignored variables");
      this.error(_builder.toString(), IoTPackage.eINSTANCE.getReference_Ref());
    }
  }
  
  @Check
  public void validateLastPipeIsWindow(final WindowPipeline pipeline) {
    Pipeline next = pipeline.getNext();
    if ((next != null)) {
      StringConcatenation _builder = new StringConcatenation();
      _builder.append("byWindow cannot be followed by another pipeline");
      this.error(_builder.toString(), IoTPackage.eINSTANCE.getPipeline_Next());
    }
  }
  
  public Iterable<IEObjectDescription> getGlobalEObjectsOfType(final Model model, final EClass type) {
    Iterable<IEObjectDescription> _xblockexpression = null;
    {
      IResourceDescriptions scope = this.scopeProvider.getResourceDescriptions(model.eResource());
      final Iterable<IEObjectDescription> objs = scope.getExportedObjectsByType(type);
      _xblockexpression = objs;
    }
    return _xblockexpression;
  }
  
  public List<String> getListQualifiedNames(final Iterable<IEObjectDescription> descriptions) {
    ArrayList<String> _xblockexpression = null;
    {
      ArrayList<String> list = CollectionLiterals.<String>newArrayList();
      for (final IEObjectDescription description : descriptions) {
        {
          String[] name = description.getName().toString().split("\\.");
          final String[] _converted_name = (String[])name;
          int _size = ((List<String>)Conversions.doWrapArray(_converted_name)).size();
          boolean _greaterThan = (_size > 1);
          if (_greaterThan) {
            final String[] _converted_name_1 = (String[])name;
            int _size_1 = ((List<String>)Conversions.doWrapArray(_converted_name_1)).size();
            int _minus = (_size_1 - 1);
            list.add(name[_minus]);
          } else {
            list.add(name[0]);
          }
        }
      }
      _xblockexpression = list;
    }
    return _xblockexpression;
  }
  
  public boolean validateOccursOnce(final List<String> list, final String name) {
    boolean _xblockexpression = false;
    {
      int counter = 0;
      for (final String currentName : list) {
        boolean _equals = Objects.equal(name, currentName);
        if (_equals) {
          counter++;
        }
      }
      if ((counter > 1)) {
        return true;
      }
      _xblockexpression = false;
    }
    return _xblockexpression;
  }
  
  @Check(CheckType.NORMAL)
  public void validateBoardNamesUniversallyUnique(final Board board) {
    final Iterable<IEObjectDescription> boards = this.getGlobalEObjectsOfType(EcoreUtil2.<Model>getContainerOfType(board, Model.class), IoTPackage.eINSTANCE.getBoard());
    final boolean dublicate = this.validateOccursOnce(this.getListQualifiedNames(boards), board.getName());
    if (dublicate) {
      StringConcatenation _builder = new StringConcatenation();
      _builder.append("board name \"");
      String _name = board.getName();
      _builder.append(_name);
      _builder.append("\" is already taken");
      this.error(_builder.toString(), IoTPackage.Literals.BOARD__NAME);
    }
  }
  
  @Check(CheckType.NORMAL)
  public void validateChannelNamesUniversallyUnique(final Channel channel) {
    final Iterable<IEObjectDescription> channels = this.getGlobalEObjectsOfType(EcoreUtil2.<Model>getContainerOfType(channel, Model.class), IoTPackage.eINSTANCE.getChannel());
    final boolean dublicate = this.validateOccursOnce(this.getListQualifiedNames(channels), channel.getName());
    if (dublicate) {
      StringConcatenation _builder = new StringConcatenation();
      _builder.append("board name \"");
      String _name = channel.getName();
      _builder.append(_name);
      _builder.append("\" is already taken");
      this.error(_builder.toString(), IoTPackage.Literals.CHANNEL__NAME);
    }
  }
  
  @Check(CheckType.NORMAL)
  public void validateFunctionNamesUniversallyUnique(final Function function) {
    final Iterable<IEObjectDescription> functions = this.getGlobalEObjectsOfType(EcoreUtil2.<Model>getContainerOfType(function, Model.class), IoTPackage.eINSTANCE.getFunction());
    final boolean dublicate = this.validateOccursOnce(this.getListQualifiedNames(functions), function.getName());
    if (dublicate) {
      StringConcatenation _builder = new StringConcatenation();
      _builder.append("board name \"");
      String _name = function.getName();
      _builder.append(_name);
      _builder.append("\" is already taken");
      this.error(_builder.toString(), IoTPackage.Literals.FUNCTION__NAME);
    }
  }
  
  @Check
  public void validateFunctionType(final FunctionInputType functionType) {
    boolean _ifInvalid = this._typeChecker.ifInvalid(this._typeChecker.type(functionType));
    if (_ifInvalid) {
      StringConcatenation _builder = new StringConcatenation();
      _builder.append("invalid type");
      this.error(_builder.toString(), IoTPackage.eINSTANCE.getFunctionInputType_Name(), IoTValidator.INVALID_TYPE, functionType.getName());
    }
  }
  
  public ArrayList<String> asStringList(final List<Variable> vars) {
    ArrayList<String> _xblockexpression = null;
    {
      final ArrayList<String> list = CollectionLiterals.<String>newArrayList();
      for (final Variable variable : vars) {
        list.add(variable.getName());
      }
      _xblockexpression = list;
    }
    return _xblockexpression;
  }
  
  public ArrayList<String> asStringListSensor(final List<Sensor> vars) {
    ArrayList<String> _xblockexpression = null;
    {
      final ArrayList<String> list = CollectionLiterals.<String>newArrayList();
      for (final Sensor sensor : vars) {
        list.add(sensor.getName());
      }
      _xblockexpression = list;
    }
    return _xblockexpression;
  }
  
  public boolean appearsOnce(final List<String> list, final String name) {
    int counter = 0;
    for (final String actual : list) {
      boolean _equals = Objects.equal(actual, name);
      if (_equals) {
        counter++;
      }
    }
    if ((counter > 1)) {
      return false;
    }
    return true;
  }
  
  @Check(CheckType.NORMAL)
  public void validateSensorNamesUniversallyUnique(final Sensor sensor) {
    final boolean error = this.appearsOnce(this.getListQualifiedNames(this.getGlobalEObjectsOfType(EcoreUtil2.<Model>getContainerOfType(sensor, Model.class), IoTPackage.eINSTANCE.getSensor())), sensor.getName());
    AbstractBoard abstractContainer = EcoreUtil2.<AbstractBoard>getContainerOfType(sensor, AbstractBoard.class);
    if ((((!error) && (abstractContainer != null)) && this.appearsOnce(this.asStringListSensor(abstractContainer.getSensors()), sensor.getName()))) {
      StringConcatenation _builder = new StringConcatenation();
      String _name = sensor.getName();
      _builder.append(_name);
      _builder.append(" might be overwritten");
      this.info(_builder.toString(), IoTPackage.Literals.SENSOR__NAME);
      return;
    }
    ExtendsBoard _containerOfType = EcoreUtil2.<ExtendsBoard>getContainerOfType(sensor, ExtendsBoard.class);
    AbstractBoard _abstractBoard = null;
    if (_containerOfType!=null) {
      _abstractBoard=_containerOfType.getAbstractBoard();
    }
    AbstractBoard extendsBoard = _abstractBoard;
    if ((((!error) && (extendsBoard != null)) && this.appearsOnce(this.asStringListSensor(extendsBoard.getSensors()), sensor.getName()))) {
      StringConcatenation _builder_1 = new StringConcatenation();
      _builder_1.append("overriding ");
      String _name_1 = sensor.getName();
      _builder_1.append(_name_1);
      _builder_1.append(" in ");
      String _name_2 = extendsBoard.getName();
      _builder_1.append(_name_2);
      this.info(_builder_1.toString(), IoTPackage.Literals.SENSOR__NAME);
      return;
    }
    NewBoard newBoard = EcoreUtil2.<NewBoard>getContainerOfType(sensor, NewBoard.class);
    boolean _appearsOnce = this.appearsOnce(this.asStringListSensor(newBoard.getSensors()), sensor.getName());
    boolean _not = (!_appearsOnce);
    if (_not) {
      StringConcatenation _builder_2 = new StringConcatenation();
      _builder_2.append("sensor names must be unique within the context of a board");
      this.error(_builder_2.toString(), IoTPackage.Literals.SENSOR__NAME);
    }
  }
  
  @Check
  public void validateBoardVersion(final BoardVersion boardVersion) {
    final Boards board = Boards.getBoardSupported(boardVersion.getType(), boardVersion.getModel());
    int _size = board.getSensors().size();
    boolean _greaterThan = (_size > 0);
    if (_greaterThan) {
      StringConcatenation _builder = new StringConcatenation();
      String _string = board.toString();
      _builder.append(_string);
      _builder.append(" supports the following sensors: ");
      Set<String> _sensors = board.getSensors();
      _builder.append(_sensors);
      this.info(_builder.toString(), IoTPackage.Literals.BOARD_VERSION__TYPE);
    }
  }
  
  public void validateOnboardSensorVariables(final Boards board, final String sensor, final List<Variable> vars, final EReference ref) {
    boolean _supportsSensor = board.supportsSensor(sensor);
    if (_supportsSensor) {
      int _variableCount = board.getVariableCount(sensor);
      int _size = vars.size();
      boolean _notEquals = (_variableCount != _size);
      if (_notEquals) {
        StringConcatenation _builder = new StringConcatenation();
        _builder.append(sensor);
        _builder.append(" outputs ");
        int _variableCount_1 = board.getVariableCount(sensor);
        _builder.append(_variableCount_1);
        _builder.append(" variables");
        this.error(_builder.toString(), ref);
      }
    }
  }
  
  @Check
  public void validateSensorVariables(final SensorVariables sensorVars) {
    boolean _contains = this.asStringList(sensorVars.getIds()).contains(sensorVars.getName());
    if (_contains) {
      StringConcatenation _builder = new StringConcatenation();
      _builder.append("sensor variable \"");
      String _name = sensorVars.getName();
      _builder.append(_name);
      _builder.append("\" is already taken");
      this.error(_builder.toString(), IoTPackage.eINSTANCE.getSensorVariables_Name());
    }
  }
  
  @Check
  public void validateOnboardSensorVariables(final Sensor sensor) {
    final NewBoard nboard = EcoreUtil2.<NewBoard>getContainerOfType(sensor, NewBoard.class);
    if ((nboard != null)) {
      final Boards board = Boards.getBoardSupported(nboard.getVersion());
      this.validateOnboardSensorVariables(board, sensor.getSensortype().getName(), sensor.getVars().getIds(), IoTPackage.eINSTANCE.getSensor_Vars());
      return;
    }
    final ExtendsBoard eboard = EcoreUtil2.<ExtendsBoard>getContainerOfType(sensor, ExtendsBoard.class);
    if ((eboard != null)) {
      final Boards board_1 = Boards.getBoardSupported(eboard.getAbstractBoard().getVersion());
      this.validateOnboardSensorVariables(board_1, sensor.getSensortype().getName(), sensor.getVars().getIds(), IoTPackage.eINSTANCE.getSensor_Vars());
      return;
    }
    final AbstractBoard aboard = EcoreUtil2.<AbstractBoard>getContainerOfType(sensor, AbstractBoard.class);
    if ((aboard != null)) {
      final Boards board_2 = Boards.getBoardSupported(aboard.getVersion());
      this.validateOnboardSensorVariables(board_2, sensor.getSensortype().getName(), sensor.getVars().getIds(), IoTPackage.eINSTANCE.getSensor_Vars());
    }
  }
  
  @Check
  public void validateOnboardSensor(final OnboardSensor onbSensor) {
    NewBoard boardVersion = EcoreUtil2.<NewBoard>getContainerOfType(onbSensor, NewBoard.class);
    if ((boardVersion != null)) {
      final Boards board = Boards.getBoardSupported(boardVersion.getVersion());
      boolean _supportsSensor = board.supportsSensor(onbSensor.getName());
      boolean _not = (!_supportsSensor);
      if (_not) {
        StringConcatenation _builder = new StringConcatenation();
        String _string = board.toString();
        _builder.append(_string);
        _builder.append(" does not support ");
        String _name = onbSensor.getName();
        _builder.append(_name);
        this.error(_builder.toString(), IoTPackage.eINSTANCE.getSensorType_Name(), IoTValidator.NO_SUPPORT_FOR_SENSOR, onbSensor.getName());
      }
      return;
    }
    ExtendsBoard _containerOfType = EcoreUtil2.<ExtendsBoard>getContainerOfType(onbSensor, ExtendsBoard.class);
    AbstractBoard _abstractBoard = null;
    if (_containerOfType!=null) {
      _abstractBoard=_containerOfType.getAbstractBoard();
    }
    AbstractBoard extendsVersion = _abstractBoard;
    if ((extendsVersion != null)) {
      final Boards board_1 = Boards.getBoardSupported(extendsVersion.getVersion());
      boolean _supportsSensor_1 = board_1.supportsSensor(onbSensor.getName());
      boolean _not_1 = (!_supportsSensor_1);
      if (_not_1) {
        StringConcatenation _builder_1 = new StringConcatenation();
        String _name_1 = extendsVersion.getName();
        _builder_1.append(_name_1);
        _builder_1.append(" does not support ");
        String _name_2 = onbSensor.getName();
        _builder_1.append(_name_2);
        this.error(_builder_1.toString(), IoTPackage.eINSTANCE.getSensorType_Name(), IoTValidator.NO_SUPPORT_FOR_SENSOR, onbSensor.getName());
      }
      return;
    }
    AbstractBoard abstractVersion = EcoreUtil2.<AbstractBoard>getContainerOfType(onbSensor, AbstractBoard.class);
    if ((abstractVersion != null)) {
      final Boards board_2 = Boards.getBoardSupported(abstractVersion.getVersion());
      boolean _supportsSensor_2 = board_2.supportsSensor(onbSensor.getName());
      boolean _not_2 = (!_supportsSensor_2);
      if (_not_2) {
        StringConcatenation _builder_2 = new StringConcatenation();
        String _string_1 = board_2.toString();
        _builder_2.append(_string_1);
        _builder_2.append(" does not support ");
        String _name_3 = onbSensor.getName();
        _builder_2.append(_name_3);
        this.error(_builder_2.toString(), IoTPackage.eINSTANCE.getSensorType_Name(), IoTValidator.NO_SUPPORT_FOR_SENSOR, onbSensor.getName());
      }
    }
  }
  
  @Check
  public void validateChannel(final WifiConfig channel) {
    String _pass = channel.getPass();
    boolean _tripleNotEquals = (_pass != null);
    if (_tripleNotEquals) {
      this.warning("sensitive information should not be displayed in the code", IoTPackage.eINSTANCE.getWifiConfig_Pass());
    }
  }
  
  @Check
  public void validateMQTTClient(final MqttClient mqtt) {
    String[] ipAddress = mqtt.getBroker().split("\\.");
    final String[] _converted_ipAddress = (String[])ipAddress;
    int _size = ((List<String>)Conversions.doWrapArray(_converted_ipAddress)).size();
    boolean _lessThan = (_size < 4);
    if (_lessThan) {
      this.error("not a valid ip address", IoTPackage.eINSTANCE.getMqttClient_Broker());
    }
    for (final String str : ipAddress) {
      {
        final int integer = Integer.parseInt(str);
        if ((integer < 0)) {
          this.error("address cannot be less than 0", IoTPackage.eINSTANCE.getMqttClient_Broker());
        }
        if ((integer > 255)) {
          this.error("address cannot be larger than 255", IoTPackage.eINSTANCE.getMqttClient_Broker());
        }
      }
    }
  }
  
  public void validateTypes(final TypeChecker.Type actual, final TypeChecker.Type expected, final EStructuralFeature error) {
    boolean _notEquals = (!Objects.equal(expected, actual));
    if (_notEquals) {
      StringConcatenation _builder = new StringConcatenation();
      _builder.append("expected ");
      _builder.append(expected);
      _builder.append(" got ");
      _builder.append(actual);
      this.error(_builder.toString(), error);
    }
  }
  
  public void validateNumbers(final TypeChecker.Type type, final EStructuralFeature error) {
    boolean _isNumberType = this._typeChecker.isNumberType(type);
    boolean _not = (!_isNumberType);
    if (_not) {
      StringConcatenation _builder = new StringConcatenation();
      _builder.append("expected number got ");
      _builder.append(type);
      this.error(_builder.toString(), error);
    }
  }
  
  @Check
  public void validateFilterExpression(final Filter filter) {
    this.validateTypes(this._typeChecker.type(filter.getExpression()), TypeChecker.Type.BOOLEAN, 
      IoTPackage.Literals.TUPLE_PIPELINE__EXPRESSION);
  }
  
  @Check
  public void checkExpression(final Conditional conditional) {
    Expression _condition = conditional.getCondition();
    boolean _tripleNotEquals = (_condition != null);
    if (_tripleNotEquals) {
      this.validateTypes(this._typeChecker.type(conditional.getCondition()), TypeChecker.Type.BOOLEAN, IoTPackage.Literals.CONDITIONAL__CONDITION);
    }
    Expression _incorrect = conditional.getIncorrect();
    boolean _tripleNotEquals_1 = (_incorrect != null);
    if (_tripleNotEquals_1) {
      this.validateTypes(this._typeChecker.type(conditional.getIncorrect()), this._typeChecker.type(conditional.getCorrect()), IoTPackage.Literals.CONDITIONAL__INCORRECT);
    }
  }
  
  @Check
  public void checkExpression(final Or or) {
    Expression _left = or.getLeft();
    boolean _tripleNotEquals = (_left != null);
    if (_tripleNotEquals) {
      this.validateTypes(this._typeChecker.type(or.getLeft()), TypeChecker.Type.BOOLEAN, IoTPackage.Literals.OR__LEFT);
    }
    Expression _right = or.getRight();
    boolean _tripleNotEquals_1 = (_right != null);
    if (_tripleNotEquals_1) {
      this.validateTypes(this._typeChecker.type(or.getRight()), TypeChecker.Type.BOOLEAN, IoTPackage.Literals.OR__RIGHT);
    }
  }
  
  @Check
  public void checkExpression(final And and) {
    Expression _left = and.getLeft();
    boolean _tripleNotEquals = (_left != null);
    if (_tripleNotEquals) {
      this.validateTypes(this._typeChecker.type(and.getLeft()), TypeChecker.Type.BOOLEAN, IoTPackage.Literals.AND__LEFT);
    }
    Expression _right = and.getRight();
    boolean _tripleNotEquals_1 = (_right != null);
    if (_tripleNotEquals_1) {
      this.validateTypes(this._typeChecker.type(and.getRight()), TypeChecker.Type.BOOLEAN, IoTPackage.Literals.AND__RIGHT);
    }
  }
  
  @Check
  public void checkExpression(final Equal equal) {
    if (((equal.getLeft() != null) && (equal.getRight() != null))) {
      if (((!this._typeChecker.isNumberType(this._typeChecker.type(equal.getLeft()))) || (!this._typeChecker.isNumberType(this._typeChecker.type(equal.getRight()))))) {
        this.validateTypes(this._typeChecker.type(equal.getRight()), this._typeChecker.type(equal.getLeft()), IoTPackage.Literals.EQUAL__RIGHT);
      }
    }
  }
  
  @Check
  public void checkExpression(final Unequal unequal) {
    if (((unequal.getLeft() != null) && (unequal.getRight() != null))) {
      if (((!this._typeChecker.isNumberType(this._typeChecker.type(unequal.getLeft()))) || (!this._typeChecker.isNumberType(this._typeChecker.type(unequal.getRight()))))) {
        this.validateTypes(this._typeChecker.type(unequal.getRight()), this._typeChecker.type(unequal.getLeft()), IoTPackage.Literals.UNEQUAL__RIGHT);
      }
    }
  }
  
  @Check
  public void checkExpression(final LessThan lessThan) {
    Expression _left = lessThan.getLeft();
    boolean _tripleNotEquals = (_left != null);
    if (_tripleNotEquals) {
      this.validateNumbers(this._typeChecker.type(lessThan.getLeft()), IoTPackage.Literals.LESS_THAN__LEFT);
    }
    Expression _right = lessThan.getRight();
    boolean _tripleNotEquals_1 = (_right != null);
    if (_tripleNotEquals_1) {
      this.validateNumbers(this._typeChecker.type(lessThan.getRight()), IoTPackage.Literals.LESS_THAN__RIGHT);
    }
  }
  
  @Check
  public void checkExpression(final LessThanEqual lessThanEqual) {
    Expression _left = lessThanEqual.getLeft();
    boolean _tripleNotEquals = (_left != null);
    if (_tripleNotEquals) {
      this.validateNumbers(this._typeChecker.type(lessThanEqual.getLeft()), IoTPackage.Literals.LESS_THAN_EQUAL__LEFT);
    }
    Expression _right = lessThanEqual.getRight();
    boolean _tripleNotEquals_1 = (_right != null);
    if (_tripleNotEquals_1) {
      this.validateNumbers(this._typeChecker.type(lessThanEqual.getRight()), IoTPackage.Literals.LESS_THAN_EQUAL__RIGHT);
    }
  }
  
  @Check
  public void checkExpression(final GreaterThan greaterThan) {
    if (((greaterThan.getLeft() != null) && (greaterThan.getRight() != null))) {
      this.validateNumbers(this._typeChecker.type(greaterThan.getLeft()), IoTPackage.Literals.GREATER_THAN__LEFT);
      this.validateNumbers(this._typeChecker.type(greaterThan.getRight()), IoTPackage.Literals.GREATER_THAN__RIGHT);
    }
  }
  
  @Check
  public void checkExpression(final GreaterThanEqual greaterThanEqual) {
    if (((greaterThanEqual.getLeft() != null) && (greaterThanEqual.getRight() != null))) {
      this.validateNumbers(this._typeChecker.type(greaterThanEqual.getLeft()), IoTPackage.Literals.GREATER_THAN_EQUAL__LEFT);
      this.validateNumbers(this._typeChecker.type(greaterThanEqual.getRight()), IoTPackage.Literals.GREATER_THAN_EQUAL__RIGHT);
    }
  }
  
  @Check
  public void checkExpression(final Plus plus) {
    if (((plus.getLeft() != null) && (plus.getRight() != null))) {
      if (((!Objects.equal(this._typeChecker.type(plus.getLeft()), TypeChecker.Type.STRING)) && (!Objects.equal(this._typeChecker.type(plus.getRight()), TypeChecker.Type.STRING)))) {
        this.validateNumbers(this._typeChecker.type(plus.getLeft()), IoTPackage.Literals.PLUS__LEFT);
        this.validateNumbers(this._typeChecker.type(plus.getRight()), IoTPackage.Literals.PLUS__RIGHT);
      }
    }
  }
  
  @Check
  public void checkExpression(final Minus minus) {
    Expression _left = minus.getLeft();
    boolean _tripleNotEquals = (_left != null);
    if (_tripleNotEquals) {
      this.validateNumbers(this._typeChecker.type(minus.getLeft()), IoTPackage.Literals.MINUS__LEFT);
    }
    Expression _right = minus.getRight();
    boolean _tripleNotEquals_1 = (_right != null);
    if (_tripleNotEquals_1) {
      this.validateNumbers(this._typeChecker.type(minus.getRight()), IoTPackage.Literals.MINUS__RIGHT);
    }
  }
  
  @Check
  public void checkExpression(final Mul mul) {
    Expression _left = mul.getLeft();
    boolean _tripleNotEquals = (_left != null);
    if (_tripleNotEquals) {
      this.validateNumbers(this._typeChecker.type(mul.getLeft()), IoTPackage.Literals.MUL__LEFT);
    }
    Expression _right = mul.getRight();
    boolean _tripleNotEquals_1 = (_right != null);
    if (_tripleNotEquals_1) {
      this.validateNumbers(this._typeChecker.type(mul.getRight()), IoTPackage.Literals.MUL__RIGHT);
    }
  }
  
  @Check
  public void checkExpression(final Div div) {
    Expression _left = div.getLeft();
    boolean _tripleNotEquals = (_left != null);
    if (_tripleNotEquals) {
      this.validateNumbers(this._typeChecker.type(div.getLeft()), IoTPackage.Literals.DIV__LEFT);
    }
    Expression _right = div.getRight();
    boolean _tripleNotEquals_1 = (_right != null);
    if (_tripleNotEquals_1) {
      this.validateNumbers(this._typeChecker.type(div.getRight()), IoTPackage.Literals.DIV__RIGHT);
    }
  }
  
  @Check
  public void checkExpression(final Negation negation) {
    Expression _value = negation.getValue();
    boolean _tripleNotEquals = (_value != null);
    if (_tripleNotEquals) {
      this.validateNumbers(this._typeChecker.type(negation.getValue()), IoTPackage.Literals.NEGATION__VALUE);
    }
  }
  
  @Check
  public void checkExpression(final Exponent exponent) {
    Expression _base = exponent.getBase();
    boolean _tripleNotEquals = (_base != null);
    if (_tripleNotEquals) {
      this.validateNumbers(this._typeChecker.type(exponent.getBase()), IoTPackage.Literals.EXPONENT__BASE);
    }
    Expression _power = exponent.getPower();
    boolean _tripleNotEquals_1 = (_power != null);
    if (_tripleNotEquals_1) {
      this.validateNumbers(this._typeChecker.type(exponent.getPower()), IoTPackage.Literals.EXPONENT__POWER);
    }
  }
  
  @Check
  public void checkPower(final Not not) {
    Expression _value = not.getValue();
    boolean _tripleNotEquals = (_value != null);
    if (_tripleNotEquals) {
      this.validateTypes(this._typeChecker.type(not.getValue()), TypeChecker.Type.BOOLEAN, IoTPackage.Literals.NOT__VALUE);
    }
  }
}
