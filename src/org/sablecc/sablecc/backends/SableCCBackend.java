/* This file is part of SableCC ( http://sablecc.org ).
 *
 * See the NOTICE file distributed with this work for copyright information.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package org.sablecc.sablecc.backends;

import java.io.File;

import org.sablecc.sablecc.automaton.Automaton;
import org.sablecc.sablecc.lrautomaton.LRAutomaton;
import org.sablecc.sablecc.oldstructure.GlobalIndex;

/**
 * This interface describes a back-end for SableCC. All back-ends must implement
 * this interface.<br />
 * A SableCC back-end must a default constructor.
 * 
 * @author Lucas Satabin
 * 
 */
public interface SableCCBackend {

    // TODO add support for back-end specific options
    
	public void generateCode(File destinationDirectory,
			String destinationPackage, GlobalIndex globalIndex,
			Automaton lexer, LRAutomaton parser);
	
}
