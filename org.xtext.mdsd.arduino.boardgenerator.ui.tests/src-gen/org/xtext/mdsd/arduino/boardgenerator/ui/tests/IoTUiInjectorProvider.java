/*
 * generated by Xtext 2.21.0
 */
package org.xtext.mdsd.arduino.boardgenerator.ui.tests;

import com.google.inject.Injector;
import org.eclipse.xtext.testing.IInjectorProvider;
import org.xtext.mdsd.arduino.boardgenerator.ui.internal.BoardgeneratorActivator;

public class IoTUiInjectorProvider implements IInjectorProvider {

	@Override
	public Injector getInjector() {
		return BoardgeneratorActivator.getInstance().getInjector("org.xtext.mdsd.arduino.boardgenerator.IoT");
	}

}