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

package net.awired.clients.sonar;

import static org.junit.Assert.assertTrue;
import net.awired.visuwall.sonarclient.SonarClient;
import net.awired.visuwall.sonarclient.exception.SonarMeasureNotFoundException;
import org.junit.Test;
import org.sonar.wsclient.services.Measure;

public class SonarIT {

    @Test
    public void should_find_measure() throws SonarMeasureNotFoundException {
        SonarClient sonarClient = new SonarClient("http://sonar.awired.net");
        Measure measure = sonarClient.findMeasure("org.apache.struts:struts-parent", "violations_density");
        assertTrue(measure.getFormattedValue().length() > 0);
        assertTrue(measure.getValue() > 0);
    }
}
