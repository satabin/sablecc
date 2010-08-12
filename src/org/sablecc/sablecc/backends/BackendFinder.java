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
import java.io.FilenameFilter;
import java.io.InputStream;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLClassLoader;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Properties;
import java.util.jar.JarFile;

/**
 * 
 * This class allows to find a back-end that was dynamically plugged in. When
 * initialized, it loads all the targets that are present in the given
 * repository. A target is a jar file with following Header:
 * <ul>
 * <li><code>SableCC-TargetName</code>: the target name e.g. java, scala, ...</li>
 * <li><code>SableCC-TargetClass</code>: the fully qualified target class name</li>
 * <li>TODO: anything else?</li>
 * </ul>
 * 
 * @author Lucas Satabin
 * 
 */
public class BackendFinder {

    private final Map<String, String> backends;

    private final URLClassLoader classloader;

    /**
     * Creates a new {@link BackendFinder}.
     * 
     * @param directory
     *            the directory to search for back-ends
     */
    public BackendFinder(File directory) {

        this.backends = new HashMap<String, String>();
        File[] files = directory.listFiles(new FilenameFilter() {
            @Override
            public boolean accept(File dir, String name) {
                // only accept jar files
                return name.endsWith(".jar");
            }
        });
        List<URL> urls = new ArrayList<URL>();
        for (File file : files) {
            try {
                JarFile jar = new JarFile(file);
                String targetName = jar.getManifest().getMainAttributes()
                        .getValue("SableCC-TargetName");
                String targetClass = jar.getManifest().getMainAttributes()
                        .getValue("SableCC-TargetClass");
                if (targetName != null) {
                    backends.put(targetName, targetClass);
                    urls.add(file.toURI().toURL());
                }
            } catch (Exception e) {
                // should not happen
                // TODO handle it correctly
                e.printStackTrace();
            }
        }
        classloader = new URLClassLoader(urls.toArray(new URL[urls.size()]));

    }

    /**
     * Returns the first find back-end with the given name.
     * 
     * @param name
     *            the back-end name
     * @return the found back-end or <code>null</code> if not found.
     */
    @SuppressWarnings("unchecked")
    public SableCCBackend findBackend(String name) {

        try {
            String className = backends.get(name);
            Class<SableCCBackend> clazz = (Class<SableCCBackend>) classloader
                    .loadClass(className);
            return clazz.newInstance();
        } catch (Exception e) {
            // TODO handle it correctly
            e.printStackTrace();
        }

        return null;

    }

    /**
     * Returns the list of all known plugged targets targets.
     * 
     * @return the non-<code>null</code> list of known plugged targets
     */
    public String[] getAllTargets() {

        return new String[0];
    }

}
