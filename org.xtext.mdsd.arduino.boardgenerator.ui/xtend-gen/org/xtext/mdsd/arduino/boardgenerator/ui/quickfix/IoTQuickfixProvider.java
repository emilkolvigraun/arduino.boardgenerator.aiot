/**
 * generated by Xtext 2.21.0
 */
package org.xtext.mdsd.arduino.boardgenerator.ui.quickfix;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtend2.lib.StringConcatenation;
import org.eclipse.xtext.EcoreUtil2;
import org.eclipse.xtext.nodemodel.ICompositeNode;
import org.eclipse.xtext.nodemodel.util.NodeModelUtils;
import org.eclipse.xtext.ui.editor.model.IXtextDocument;
import org.eclipse.xtext.ui.editor.model.edit.IModificationContext;
import org.eclipse.xtext.ui.editor.model.edit.ISemanticModification;
import org.eclipse.xtext.ui.editor.quickfix.DefaultQuickfixProvider;
import org.eclipse.xtext.ui.editor.quickfix.Fix;
import org.eclipse.xtext.ui.editor.quickfix.IssueResolutionAcceptor;
import org.eclipse.xtext.validation.Issue;
import org.eclipse.xtext.xbase.lib.ExclusiveRange;
import org.xtext.mdsd.arduino.boardgenerator.ioT.FunctionInputType;
import org.xtext.mdsd.arduino.boardgenerator.ioT.Sensor;
import org.xtext.mdsd.arduino.boardgenerator.validation.IoTValidator;

/**
 * Custom quickfixes.
 * 
 * See https://www.eclipse.org/Xtext/documentation/310_eclipse_support.html#quick-fixes
 */
@SuppressWarnings("all")
public class IoTQuickfixProvider extends DefaultQuickfixProvider {
  @Fix(IoTValidator.NO_SUPPORT_FOR_SENSOR)
  public void newSensor(final Issue issue, final IssueResolutionAcceptor acceptor) {
    final ISemanticModification _function = (EObject element, IModificationContext context) -> {
      Sensor sensor = EcoreUtil2.<Sensor>getContainerOfType(element, Sensor.class);
      StringConcatenation _builder = new StringConcatenation();
      String pins = _builder.toString();
      int _size = sensor.getVars().getIds().size();
      ExclusiveRange _doubleDotLessThan = new ExclusiveRange(0, _size, true);
      for (final Integer i : _doubleDotLessThan) {
        String _pins = pins;
        StringConcatenation _builder_1 = new StringConcatenation();
        _builder_1.append(i);
        _builder_1.append(", ");
        pins = (_pins + _builder_1);
      }
      IXtextDocument _xtextDocument = context.getXtextDocument();
      int _endOffset = NodeModelUtils.getNode(element).getEndOffset();
      StringConcatenation _builder_2 = new StringConcatenation();
      _builder_2.append(" ");
      _builder_2.append("(");
      int _length = pins.length();
      int _minus = (_length - 2);
      String _substring = pins.substring(0, _minus);
      _builder_2.append(_substring, " ");
      _builder_2.append(")");
      _xtextDocument.replace(_endOffset, 0, _builder_2.toString());
    };
    acceptor.accept(issue, "Assign pins", 
      null, null, _function);
  }
  
  @Fix(IoTValidator.INVALID_TYPE)
  public void invalidExternalType(final Issue issue, final IssueResolutionAcceptor acceptor) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("Change to string - \"str\"");
    final ISemanticModification _function = (EObject element, IModificationContext context) -> {
      ICompositeNode node = NodeModelUtils.getNode(element);
      FunctionInputType ftype = EcoreUtil2.<FunctionInputType>getContainerOfType(element, FunctionInputType.class);
      IXtextDocument _xtextDocument = context.getXtextDocument();
      int _endOffset = node.getEndOffset();
      int _length = ftype.getName().length();
      int _minus = (_endOffset - _length);
      int _length_1 = ftype.getName().length();
      StringConcatenation _builder_1 = new StringConcatenation();
      _builder_1.append("str");
      _xtextDocument.replace(_minus, _length_1, _builder_1.toString());
    };
    acceptor.accept(issue, _builder.toString(), 
      null, null, _function);
    StringConcatenation _builder_1 = new StringConcatenation();
    _builder_1.append("Change to number - \"num\"");
    final ISemanticModification _function_1 = (EObject element, IModificationContext context) -> {
      ICompositeNode node = NodeModelUtils.getNode(element);
      FunctionInputType ftype = EcoreUtil2.<FunctionInputType>getContainerOfType(element, FunctionInputType.class);
      IXtextDocument _xtextDocument = context.getXtextDocument();
      int _endOffset = node.getEndOffset();
      int _length = ftype.getName().length();
      int _minus = (_endOffset - _length);
      int _length_1 = ftype.getName().length();
      StringConcatenation _builder_2 = new StringConcatenation();
      _builder_2.append("num");
      _xtextDocument.replace(_minus, _length_1, _builder_2.toString());
    };
    acceptor.accept(issue, _builder_1.toString(), 
      null, null, _function_1);
    StringConcatenation _builder_2 = new StringConcatenation();
    _builder_2.append("Change to boolean - \"bool\"");
    final ISemanticModification _function_2 = (EObject element, IModificationContext context) -> {
      ICompositeNode node = NodeModelUtils.getNode(element);
      FunctionInputType ftype = EcoreUtil2.<FunctionInputType>getContainerOfType(element, FunctionInputType.class);
      IXtextDocument _xtextDocument = context.getXtextDocument();
      int _endOffset = node.getEndOffset();
      int _length = ftype.getName().length();
      int _minus = (_endOffset - _length);
      int _length_1 = ftype.getName().length();
      StringConcatenation _builder_3 = new StringConcatenation();
      _builder_3.append("bool");
      _xtextDocument.replace(_minus, _length_1, _builder_3.toString());
    };
    acceptor.accept(issue, _builder_2.toString(), 
      null, null, _function_2);
  }
}
