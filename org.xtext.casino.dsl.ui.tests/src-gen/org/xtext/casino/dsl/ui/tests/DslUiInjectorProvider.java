/*
 * generated by Xtext 2.17.0
 */
package org.xtext.casino.dsl.ui.tests;

import com.google.inject.Injector;
import org.eclipse.xtext.testing.IInjectorProvider;
import org.xtext.casino.dsl.ui.internal.DslActivator;

public class DslUiInjectorProvider implements IInjectorProvider {

	@Override
	public Injector getInjector() {
		return DslActivator.getInstance().getInjector("org.xtext.casino.dsl.Dsl");
	}

}
