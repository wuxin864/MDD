/*
 * generated by Xtext 2.24.0
 */
package uk.kcl.pgt.mdd.cw.ide;

import com.google.inject.Guice;
import com.google.inject.Injector;
import org.eclipse.xtext.util.Modules2;
import uk.kcl.pgt.mdd.cw.GameRuntimeModule;
import uk.kcl.pgt.mdd.cw.GameStandaloneSetup;

/**
 * Initialization support for running Xtext languages as language servers.
 */
public class GameIdeSetup extends GameStandaloneSetup {

	@Override
	public Injector createInjector() {
		return Guice.createInjector(Modules2.mixin(new GameRuntimeModule(), new GameIdeModule()));
	}
	
}
