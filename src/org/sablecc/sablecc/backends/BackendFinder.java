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
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLClassLoader;
import java.util.Properties;

/**
 * 
 * This class allows to find a back-end that was dynamically plugged in.
 * 
 * @author Lucas Satabin
 * 
 */
public class BackendFinder {

    private final File directory;

    private final URLClassLoader classloader;

    /**
     * Creates a new {@link BackendFinder}.
     * 
     * @param directory
     *            the directory to search for
     */
    public BackendFinder(
            File directory) {

        this.directory = directory;
        File[] files = directory.listFiles();
        URL[] jars = new URL[files.length];
        for (int i = 0; i < files.length; i++) {
            try {
                jars[i] = files[i].toURI().toURL();
            }
            catch (MalformedURLException e) {
                // should not happen
                // TODO handle it correctly
                e.printStackTrace();
            }
        }
        classloader = new URLClassLoader(jars);

    }

    /**
     * Returns the first find back-end with the given name.
     * 
     * @param name
     *            the back-end name
     * @return the found back-end or <code>null</code> if not found.
     */
    public SableCCBackend findBackend(
            String name) {

        // find the configuration file
        InputStream configuration = classloader.getResourceAsStream(name + ".backend");
        if(configuration == null) {
            return null;
        }
        
        try {
            Properties backendProp = new Properties();
            backendProp.load(configuration);
        }
        catch (IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        
        return null;

    }

}
