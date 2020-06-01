package org.xtext.mdsd.arduino.bordgenerator.ui.syntaxColoring;

import java.util.List;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.EcoreUtil2;
import org.eclipse.xtext.nodemodel.INode;
import org.eclipse.xtext.nodemodel.util.NodeModelUtils;
import org.eclipse.xtext.resource.XtextResource;
import org.eclipse.xtext.ui.editor.syntaxcoloring.DefaultSemanticHighlightingCalculator;
import org.eclipse.xtext.ui.editor.syntaxcoloring.IHighlightedPositionAcceptor;
import org.xtext.mdsd.arduino.boardgenerator.ioT.Channel;
import org.xtext.mdsd.arduino.boardgenerator.ioT.External;
import org.xtext.mdsd.arduino.boardgenerator.ioT.Function;
import org.xtext.mdsd.arduino.boardgenerator.ioT.FunctionInputType;
import org.xtext.mdsd.arduino.boardgenerator.ioT.IoTPackage;
import org.xtext.mdsd.arduino.bordgenerator.ui.syntaxColoring.IoTHighlightingConfiguration;

@SuppressWarnings("all")
public class IoTSemanticHighlightConfiguration extends DefaultSemanticHighlightingCalculator {
  @Override
  public void doProvideHighlightingFor(final XtextResource resource, final IHighlightedPositionAcceptor acceptor) {
    EObject rootObject = resource.getParseResult().getRootASTElement();
    List<External> _allContentsOfType = EcoreUtil2.<External>getAllContentsOfType(rootObject, External.class);
    for (final External ext : _allContentsOfType) {
      List<INode> _findNodesForFeature = NodeModelUtils.findNodesForFeature(ext, IoTPackage.Literals.EXTERNAL__FUNCTION);
      for (final INode node : _findNodesForFeature) {
        acceptor.addPosition(node.getOffset(), node.getLength(), IoTHighlightingConfiguration.EXTERNAL_ID);
      }
    }
    List<Function> _allContentsOfType_1 = EcoreUtil2.<Function>getAllContentsOfType(rootObject, Function.class);
    for (final Function fun : _allContentsOfType_1) {
      List<INode> _findNodesForFeature_1 = NodeModelUtils.findNodesForFeature(fun, IoTPackage.Literals.FUNCTION__NAME);
      for (final INode node_1 : _findNodesForFeature_1) {
        acceptor.addPosition(node_1.getOffset(), node_1.getLength(), IoTHighlightingConfiguration.EXTERNAL_ID);
      }
    }
    List<FunctionInputType> _allContentsOfType_2 = EcoreUtil2.<FunctionInputType>getAllContentsOfType(rootObject, FunctionInputType.class);
    for (final FunctionInputType typ : _allContentsOfType_2) {
      List<INode> _findNodesForFeature_2 = NodeModelUtils.findNodesForFeature(typ, IoTPackage.Literals.FUNCTION_INPUT_TYPE__NAME);
      for (final INode node_2 : _findNodesForFeature_2) {
        acceptor.addPosition(node_2.getOffset(), node_2.getLength(), IoTHighlightingConfiguration.EXTERNAL_TYPE_ID);
      }
    }
    List<Channel> _allContentsOfType_3 = EcoreUtil2.<Channel>getAllContentsOfType(rootObject, Channel.class);
    for (final Channel chan : _allContentsOfType_3) {
      List<INode> _findNodesForFeature_3 = NodeModelUtils.findNodesForFeature(chan, IoTPackage.Literals.CHANNEL__CTYPE);
      for (final INode node_3 : _findNodesForFeature_3) {
        acceptor.addPosition(node_3.getOffset(), node_3.getLength(), IoTHighlightingConfiguration.CHANNEL_TYPE_ID);
      }
    }
    super.doProvideHighlightingFor(resource, acceptor);
  }
}
