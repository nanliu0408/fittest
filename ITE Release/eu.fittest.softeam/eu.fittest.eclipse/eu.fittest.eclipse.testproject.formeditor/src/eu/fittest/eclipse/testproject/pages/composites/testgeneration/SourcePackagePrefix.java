package eu.fittest.eclipse.testproject.pages.composites.testgeneration;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.ui.forms.widgets.FormToolkit;

import es.cv.gvcase.fefem.common.FEFEMPage;
import es.cv.gvcase.fefem.common.composites.EMFPropertyStringComposite;
import eu.fittest.test.project.ProjectPackage;

public class SourcePackagePrefix extends EMFPropertyStringComposite {

	public SourcePackagePrefix(Composite parent, int style,
			FormToolkit toolkit, EObject eObject, FEFEMPage page) {
		super(parent, style, toolkit, eObject, page);
	}

	@Override
	protected EStructuralFeature getFeature() {
		return ProjectPackage.eINSTANCE.getTestGenerationType_SourcePackagePrefix();
	}

	@Override
	protected String getLabelText() {
		return "Package name for generated source code: ";
	}

}
