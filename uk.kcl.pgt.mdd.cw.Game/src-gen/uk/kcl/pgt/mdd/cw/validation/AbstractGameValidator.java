/*
 * generated by Xtext 2.24.0
 */
package uk.kcl.pgt.mdd.cw.validation;

import java.util.ArrayList;
import java.util.List;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.xtext.validation.AbstractDeclarativeValidator;

public abstract class AbstractGameValidator extends AbstractDeclarativeValidator {
	
	@Override
	protected List<EPackage> getEPackages() {
		List<EPackage> result = new ArrayList<EPackage>();
		result.add(uk.kcl.pgt.mdd.cw.game.GamePackage.eINSTANCE);
		return result;
	}
}
