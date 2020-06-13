package org.xtext.mdsd.arduino.boardgenerator.generator;

import com.google.common.base.Objects;
import com.google.common.collect.Iterables;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.function.Consumer;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.xtext.xbase.lib.CollectionLiterals;
import org.eclipse.xtext.xbase.lib.Functions.Function1;
import org.eclipse.xtext.xbase.lib.IterableExtensions;
import org.xtext.mdsd.arduino.boardgenerator.ioT.Board;
import org.xtext.mdsd.arduino.boardgenerator.ioT.BoardVersion;
import org.xtext.mdsd.arduino.boardgenerator.ioT.Channel;
import org.xtext.mdsd.arduino.boardgenerator.ioT.Command;
import org.xtext.mdsd.arduino.boardgenerator.ioT.ExtendsBoard;
import org.xtext.mdsd.arduino.boardgenerator.ioT.External;
import org.xtext.mdsd.arduino.boardgenerator.ioT.ExternalSensor;
import org.xtext.mdsd.arduino.boardgenerator.ioT.Interval;
import org.xtext.mdsd.arduino.boardgenerator.ioT.NewBoard;
import org.xtext.mdsd.arduino.boardgenerator.ioT.Pipeline;
import org.xtext.mdsd.arduino.boardgenerator.ioT.Sensor;
import org.xtext.mdsd.arduino.boardgenerator.ioT.SensorOutput;
import org.xtext.mdsd.arduino.boardgenerator.ioT.SensorType;
import org.xtext.mdsd.arduino.boardgenerator.ioT.Variable;
import org.xtext.mdsd.arduino.boardgenerator.ioT.impl.SensorImpl;
import org.xtext.mdsd.arduino.boardgenerator.ioT.impl.SensorOutputImpl;

@SuppressWarnings("all")
public class GeneratorUtils extends EcoreUtil {
  public List<Sensor> getSensorsSampleByFrequency(final List<Sensor> sensors) {
    List<Sensor> _xblockexpression = null;
    {
      final ArrayList<Sensor> freqSensors = CollectionLiterals.<Sensor>newArrayList();
      final Consumer<Sensor> _function = (Sensor s) -> {
        if (((s.getSampler() != null) && (s.getSampler() instanceof Interval))) {
          freqSensors.add(s);
        }
      };
      sensors.forEach(_function);
      _xblockexpression = IterableExtensions.<Sensor>toList(freqSensors);
    }
    return _xblockexpression;
  }
  
  public List<Sensor> getSensorsSampleByCommand(final List<Sensor> sensors) {
    List<Sensor> _xblockexpression = null;
    {
      final ArrayList<Sensor> commSensors = CollectionLiterals.<Sensor>newArrayList();
      final Consumer<Sensor> _function = (Sensor s) -> {
        if (((s.getSampler() != null) && (s.getSampler() instanceof Command))) {
          commSensors.add(s);
        }
      };
      sensors.forEach(_function);
      _xblockexpression = IterableExtensions.<Sensor>toList(commSensors);
    }
    return _xblockexpression;
  }
  
  public BoardVersion getBoardVersion(final Board board) {
    if ((board instanceof NewBoard)) {
      return ((NewBoard) board).getVersion();
    }
    if ((board instanceof ExtendsBoard)) {
      return ((ExtendsBoard) board).getAbstractBoard().getVersion();
    }
    return null;
  }
  
  public List<Integer> getVariablesIndexes(final List<Variable> variables) {
    ArrayList<Integer> _xblockexpression = null;
    {
      final ArrayList<Integer> indexes = CollectionLiterals.<Integer>newArrayList();
      final ArrayList<String> svars = CollectionLiterals.<String>newArrayList();
      final Consumer<Variable> _function = (Variable v) -> {
        svars.add(v.getName());
      };
      variables.forEach(_function);
      final Consumer<Variable> _function_1 = (Variable v) -> {
        String _name = v.getName();
        boolean _notEquals = (!Objects.equal(_name, "_"));
        if (_notEquals) {
          indexes.add(Integer.valueOf(svars.indexOf(v.getName())));
        }
      };
      variables.forEach(_function_1);
      _xblockexpression = indexes;
    }
    return _xblockexpression;
  }
  
  public List<Sensor> getBoardSensors(final Board board) {
    List<Sensor> _xifexpression = null;
    if ((board instanceof NewBoard)) {
      return ((NewBoard)board).getSensors();
    } else {
      List<Sensor> _xifexpression_1 = null;
      if ((board instanceof ExtendsBoard)) {
        List<Sensor> _xblockexpression = null;
        {
          final EList<Sensor> abSensors = ((ExtendsBoard) board).getAbstractBoard().getSensors();
          final HashMap<String, Sensor> map = new HashMap<String, Sensor>();
          final Consumer<Sensor> _function = (Sensor s) -> {
            map.put(s.getName(), s);
          };
          abSensors.forEach(_function);
          EList<Sensor> _sensors = ((ExtendsBoard) board).getSensors();
          if (_sensors!=null) {
            final Consumer<Sensor> _function_1 = (Sensor s) -> {
              map.put(s.getName(), s);
            };
            _sensors.forEach(_function_1);
          }
          _xblockexpression = IterableExtensions.<Sensor>toList(map.values());
        }
        _xifexpression_1 = _xblockexpression;
      } else {
        _xifexpression_1 = CollectionLiterals.<Sensor>newArrayList();
      }
      _xifexpression = _xifexpression_1;
    }
    return _xifexpression;
  }
  
  public boolean anySensorExternal(final List<Sensor> sensors) {
    boolean _xblockexpression = false;
    {
      for (final Sensor sensor : sensors) {
        SensorType _sensortype = sensor.getSensortype();
        if ((_sensortype instanceof ExternalSensor)) {
          return true;
        }
      }
      _xblockexpression = false;
    }
    return _xblockexpression;
  }
  
  public Set<Channel> getChannelsInBoard(final Board board) {
    Set<Channel> _xblockexpression = null;
    {
      Iterable<EObject> _xifexpression = null;
      if ((board instanceof ExtendsBoard)) {
        List<EObject> _includesTypes = this.includesTypes(((ExtendsBoard)board).getAbstractBoard().eContents(), SensorImpl.class);
        List<EObject> _includesTypes_1 = this.includesTypes(((ExtendsBoard)board).eContents(), SensorImpl.class);
        _xifexpression = Iterables.<EObject>concat(_includesTypes, _includesTypes_1);
      } else {
        _xifexpression = this.includesTypes(board.eContents(), SensorImpl.class);
      }
      Iterable<EObject> contains = _xifexpression;
      contains = this.forEachIncludeTypes(IterableExtensions.<EObject>toList(contains), SensorOutputImpl.class);
      Set<Channel> chans = this.extractChannelsFromSensorOutput(IterableExtensions.<EObject>toList(contains));
      _xblockexpression = chans;
    }
    return _xblockexpression;
  }
  
  public Set<External> getExternalsInBoard(final Board board) {
    Set<External> _xblockexpression = null;
    {
      Iterable<EObject> _xifexpression = null;
      if ((board instanceof ExtendsBoard)) {
        List<EObject> _includesTypes = this.includesTypes(((ExtendsBoard)board).getAbstractBoard().eContents(), SensorImpl.class);
        List<EObject> _includesTypes_1 = this.includesTypes(((ExtendsBoard)board).eContents(), SensorImpl.class);
        _xifexpression = Iterables.<EObject>concat(_includesTypes, _includesTypes_1);
      } else {
        _xifexpression = this.includesTypes(board.eContents(), SensorImpl.class);
      }
      Iterable<EObject> contains = _xifexpression;
      contains = this.forEachIncludeTypes(IterableExtensions.<EObject>toList(contains), SensorOutputImpl.class);
      Set<External> externals = this.extractExternalsFromSensorOutput(IterableExtensions.<EObject>toList(contains));
      _xblockexpression = externals;
    }
    return _xblockexpression;
  }
  
  public Set<Channel> extractChannelsFromSensorOutput(final List<EObject> sensors) {
    HashSet<Channel> _xblockexpression = null;
    {
      final ArrayList<Channel> channels = CollectionLiterals.<Channel>newArrayList();
      final Consumer<EObject> _function = (EObject s) -> {
        final Consumer<Channel> _function_1 = (Channel c) -> {
          channels.add(c);
        };
        ((SensorOutputImpl) s).getChannel().forEach(_function_1);
      };
      sensors.forEach(_function);
      _xblockexpression = new HashSet<Channel>(channels);
    }
    return _xblockexpression;
  }
  
  public Set<External> extractExternalsFromSensorOutput(final List<EObject> sensors) {
    HashSet<External> _xblockexpression = null;
    {
      final ArrayList<External> externals = CollectionLiterals.<External>newArrayList();
      final Consumer<EObject> _function = (EObject s) -> {
        Pipeline pipeline = ((SensorOutputImpl) s).getPipeline();
        while ((pipeline != null)) {
          {
            if ((pipeline instanceof External)) {
              externals.add(((External) pipeline));
            }
            pipeline = pipeline.getNext();
          }
        }
      };
      sensors.forEach(_function);
      List<External> _list = IterableExtensions.<External>toList(externals);
      _xblockexpression = new HashSet<External>(_list);
    }
    return _xblockexpression;
  }
  
  public Set<Channel> getUniqueChannelsFromSensorOutput(final List<SensorOutput> sensors) {
    HashSet<Channel> _xblockexpression = null;
    {
      final ArrayList<Channel> channels = CollectionLiterals.<Channel>newArrayList();
      final Consumer<SensorOutput> _function = (SensorOutput s) -> {
        final Function1<Channel, Boolean> _function_1 = (Channel c) -> {
          return Boolean.valueOf(channels.add(c));
        };
        IterableExtensions.<Channel>forall(((SensorOutput) s).getChannel(), _function_1);
      };
      sensors.forEach(_function);
      _xblockexpression = new HashSet<Channel>(channels);
    }
    return _xblockexpression;
  }
  
  public List<EObject> forEachIncludeTypes(final List<EObject> objects, final Class<? extends EObject> cls) {
    ArrayList<EObject> _xblockexpression = null;
    {
      ArrayList<EObject> classes = CollectionLiterals.<EObject>newArrayList();
      for (final EObject object : objects) {
        List<EObject> _includesTypes = this.includesTypes(object.eContents(), cls);
        Iterables.<EObject>addAll(classes, _includesTypes);
      }
      _xblockexpression = classes;
    }
    return _xblockexpression;
  }
  
  public List<EObject> includesTypes(final List<EObject> objects, final Class<? extends EObject> cls) {
    ArrayList<EObject> _xblockexpression = null;
    {
      ArrayList<EObject> classes = CollectionLiterals.<EObject>newArrayList();
      for (final EObject object : objects) {
        Class<? extends EObject> _class = object.getClass();
        boolean _tripleEquals = (_class == cls);
        if (_tripleEquals) {
          classes.add(object);
        }
      }
      _xblockexpression = classes;
    }
    return _xblockexpression;
  }
}
