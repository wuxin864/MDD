/*
 * generated by Xtext 2.24.0
 */
package uk.kcl.pgt.mdd.cw.ui.tests;

import com.google.inject.Injector;
import org.eclipse.xtext.testing.IInjectorProvider;
import uk.kcl.pgt.mdd.cw.Game.ui.internal.GameActivator;

public class GameUiInjectorProvider implements IInjectorProvider {

	@Override
	public Injector getInjector() {
		return GameActivator.getInstance().getInjector("uk.kcl.pgt.mdd.cw.Game");
	}

}
