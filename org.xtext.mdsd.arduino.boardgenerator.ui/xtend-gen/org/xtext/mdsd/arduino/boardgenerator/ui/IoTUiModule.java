/**
 * generated by Xtext 2.21.0
 */
package org.xtext.mdsd.arduino.boardgenerator.ui;

import org.eclipse.ui.plugin.AbstractUIPlugin;
import org.eclipse.xtend.lib.annotations.FinalFieldsConstructor;
import org.eclipse.xtext.ui.editor.hover.IEObjectHoverProvider;
import org.eclipse.xtext.ui.editor.syntaxcoloring.IHighlightingConfiguration;
import org.xtext.mdsd.arduino.boardgenerator.hover.IoTHoverProvider;
import org.xtext.mdsd.arduino.boardgenerator.ui.AbstractIoTUiModule;
import org.xtext.mdsd.arduino.bordgenerator.ui.syntaxColoring.IoTHighlightingConfiguration;

/**
 * Use this class to register components to be used within the Eclipse IDE.
 */
@FinalFieldsConstructor
@SuppressWarnings("all")
public class IoTUiModule extends AbstractIoTUiModule {
  public Class<? extends IHighlightingConfiguration> bindIHighlightingConfiguration() {
    return IoTHighlightingConfiguration.class;
  }
  
  public Class<? extends IEObjectHoverProvider> bindIEObjectHoverProvider() {
    return IoTHoverProvider.class;
  }
  
  public IoTUiModule(final AbstractUIPlugin plugin) {
    super(plugin);
  }
}
