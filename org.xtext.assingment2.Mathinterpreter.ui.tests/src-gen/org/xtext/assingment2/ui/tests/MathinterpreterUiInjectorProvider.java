/*
 * generated by Xtext 2.21.0
 */
package org.xtext.assingment2.ui.tests;

import com.google.inject.Injector;
import org.eclipse.xtext.testing.IInjectorProvider;
import org.xtext.assingment2.Mathinterpreter.ui.internal.MathinterpreterActivator;

public class MathinterpreterUiInjectorProvider implements IInjectorProvider {

	@Override
	public Injector getInjector() {
		return MathinterpreterActivator.getInstance().getInjector("org.xtext.assingment2.Mathinterpreter");
	}

}