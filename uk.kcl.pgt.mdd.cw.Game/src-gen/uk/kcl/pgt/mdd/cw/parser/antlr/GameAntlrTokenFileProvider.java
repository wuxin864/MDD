/*
 * generated by Xtext 2.24.0
 */
package uk.kcl.pgt.mdd.cw.parser.antlr;

import java.io.InputStream;
import org.eclipse.xtext.parser.antlr.IAntlrTokenFileProvider;

public class GameAntlrTokenFileProvider implements IAntlrTokenFileProvider {

	@Override
	public InputStream getAntlrTokenFile() {
		ClassLoader classLoader = getClass().getClassLoader();
		return classLoader.getResourceAsStream("uk/kcl/pgt/mdd/cw/parser/antlr/internal/InternalGame.tokens");
	}
}