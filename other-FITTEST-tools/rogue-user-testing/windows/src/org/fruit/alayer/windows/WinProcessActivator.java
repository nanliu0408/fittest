/**************************************************************************************
*  Copyright (c) 2013, Universitat Politecnica de Valencia. All rights reserved.      *
*  This program and the accompanying materials are made available under the terms     *
*  of the 3-Clause BSD License which accompanies this distribution, and is available  *
*  at http://www.opensource.org/licenses/BSD-3-Clause. The research leading to these  *
*  results has received funding from the European Community`s Seventh Framework       *
*  Programme (FP7/2007-2013) under the grant agreement  FP7-257574 FITTEST.           *
**************************************************************************************/

/**
 *  @author Sebastian Bauersfeld
 */
package org.fruit.alayer.windows;

import org.fruit.Proc;
import org.fruit.alayer.ActionFailedException;

public final class WinProcessActivator implements Proc {
	private final long pid;
	
	public WinProcessActivator(long pid){ this.pid = pid; }
	
	public void run() {
		try{
			WinProcess.toForeground(pid);
		}catch(WinApiException wae){
			throw new ActionFailedException(wae);
		}		
	}
}
