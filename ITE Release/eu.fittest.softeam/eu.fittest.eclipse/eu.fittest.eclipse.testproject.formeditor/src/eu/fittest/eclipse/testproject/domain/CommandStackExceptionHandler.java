/**
 * <copyright>
 *
 * Copyright (c) 2005, 2007 IBM Corporation and others.
 * All rights reserved.   This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *   IBM - Initial API and implementation
 *
 * </copyright>
 *
 * $Id: CommandStackExceptionHandler.java,v 1.2 2007/06/07 14:25:36 cdamus Exp $
 */
package eu.fittest.eclipse.testproject.domain;

import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.Status;
import org.eclipse.emf.transaction.ExceptionHandler;
import org.eclipse.emf.transaction.RollbackException;
import org.eclipse.jface.dialogs.ErrorDialog;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.ui.IWorkbenchWindow;
import org.eclipse.ui.PlatformUI;


/**
 * An exception handler for the shared editing domain's command stack, that
 * shows errors in a pop-up dialog.
 *
 * @author Christian W. Damus (cdamus)
 */
public class CommandStackExceptionHandler implements ExceptionHandler {

	// Documentation copied from the inherited specification
	public void handleException(final Exception e) {
		PlatformUI.getWorkbench().getDisplay().asyncExec(new Runnable() {
			public void run() {
				Shell shell = null;
				IWorkbenchWindow window =
					PlatformUI.getWorkbench().getActiveWorkbenchWindow();
				
				if (window != null) {
					shell = window.getShell();
				}
				
				if (e instanceof RollbackException) {
					RollbackException rbe = (RollbackException) e;
					
					ErrorDialog.openError(
							shell,
							"Failed",
							"Rolling back",
							rbe.getStatus());
				} else {
					ErrorDialog.openError(
							shell,
							"Failed",
							"Exception",
							new Status(
									IStatus.ERROR,
									"Test Project editor",
									1,
									e.getLocalizedMessage(),
									e));
				}
			}});
	}

}
