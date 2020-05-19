package org.xtext.mdsd.arduino.boardgenerator.generator;

import com.google.common.collect.Iterables;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.function.Consumer;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.xtext.xbase.lib.CollectionLiterals;
import org.eclipse.xtext.xbase.lib.Functions.Function1;
import org.eclipse.xtext.xbase.lib.IterableExtensions;
import org.xtext.mdsd.arduino.boardgenerator.ioT.Board;
import org.xtext.mdsd.arduino.boardgenerator.ioT.BoardVersion;
import org.xtext.mdsd.arduino.boardgenerator.ioT.Channel;
import org.xtext.mdsd.arduino.boardgenerator.ioT.ExtendsBoard;
import org.xtext.mdsd.arduino.boardgenerator.ioT.NewBoard;
import org.xtext.mdsd.arduino.boardgenerator.ioT.Sensor;
import org.xtext.mdsd.arduino.boardgenerator.ioT.impl.SensorImpl;
import org.xtext.mdsd.arduino.boardgenerator.ioT.impl.SensorOutputImpl;

@SuppressWarnings("all")
public class GeneratorUtils extends EcoreUtil {
  public BoardVersion getBoardVersion(final Board board) {
    if ((board instanceof NewBoard)) {
      return ((NewBoard) board).getVersion();
    }
    if ((board instanceof ExtendsBoard)) {
      return ((ExtendsBoard) board).getAbstractBoard().getVersion();
    }
    return null;
  }
  
  public Set<Channel> getChannelsInBoard(final Board board) {
    Set<Channel> _xblockexpression = null;
    {
      Iterable<EObject> _xifexpression = null;
      if ((board instanceof ExtendsBoard)) {
        List<EObject> _includesTypes = this.includesTypes(((ExtendsBoard)board).getAbstractBoard().eContents(), SensorImpl.class);
        List<EObject> _includesTypes_1 = this.includesTypes(((ExtendsBoard)board).eContents(), Sensor.class);
        _xifexpression = Iterables.<EObject>concat(_includesTypes, _includesTypes_1);
      } else {
        _xifexpression = this.includesTypes(board.eContents(), SensorImpl.class);
      }
      Iterable<EObject> contains = _xifexpression;
      contains = this.forEachIncludeTypes(IterableExtensions.<EObject>toList(contains), SensorOutputImpl.class);
      _xblockexpression = this.extractChannelsFromSensorOutput(IterableExtensions.<EObject>toList(contains));
    }
    return _xblockexpression;
  }
  
  @Deprecated
  public boolean andGate(final boolean first, final boolean second) {
    if ((first && second)) {
      return true;
    }
    return false;
  }
  
  public Set<Channel> extractChannelsFromSensorOutput(final List<EObject> sensors) {
    HashSet<Channel> _xblockexpression = null;
    {
      final ArrayList<Channel> channels = CollectionLiterals.<Channel>newArrayList();
      final Consumer<EObject> _function = (EObject s) -> {
        final Function1<Channel, Boolean> _function_1 = (Channel c) -> {
          return Boolean.valueOf(channels.add(c));
        };
        IterableExtensions.<Channel>forall(((SensorOutputImpl) s).getChannel(), _function_1);
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
