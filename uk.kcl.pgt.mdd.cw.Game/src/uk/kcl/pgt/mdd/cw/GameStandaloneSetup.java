/*
 * generated by Xtext 2.24.0
 */
package uk.kcl.pgt.mdd.cw;


/**
 * Initialization support for running Xtext languages without Equinox extension registry.
 */
public class GameStandaloneSetup extends GameStandaloneSetupGenerated {

	public static void doSetup() {
		new GameStandaloneSetup().createInjectorAndDoEMFRegistration();
	}
}
