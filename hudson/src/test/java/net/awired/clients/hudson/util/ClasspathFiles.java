/**
 *     Copyright (C) 2010 Julien SMADJA <julien dot smadja at gmail dot com> - Arnaud LEMAIRE <alemaire at norad dot fr>
 *
 *     Licensed under the Apache License, Version 2.0 (the "License");
 *     you may not use this file except in compliance with the License.
 *     You may obtain a copy of the License at
 *
 *             http://www.apache.org/licenses/LICENSE-2.0
 *
 *     Unless required by applicable law or agreed to in writing, software
 *     distributed under the License is distributed on an "AS IS" BASIS,
 *     WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *     See the License for the specific language governing permissions and
 *     limitations under the License.
 */

package net.awired.clients.hudson.util;

import java.net.URI;
import java.net.URISyntaxException;
import java.net.URL;

public class ClasspathFiles {

    public static String getAbsolutePathFile(String fileName) {
        try {
            Class<?> clazz = ClasspathFiles.class;
            ClassLoader classLoader = clazz.getClassLoader();
            URL resource = classLoader.getResource(fileName);
            URI uri = resource.toURI();
            String pomUrl = "file://" + uri.getPath();
            return pomUrl;
        } catch (URISyntaxException e) {
            throw new RuntimeException(e);
        }
    }
}
