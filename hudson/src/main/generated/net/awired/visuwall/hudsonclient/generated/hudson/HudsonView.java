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

package net.awired.visuwall.hudsonclient.generated.hudson;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElements;
import javax.xml.bind.annotation.XmlRootElement;
import net.awired.visuwall.hudsonclient.generated.hudson.mavenmoduleset.HudsonModelJob;

@XmlRootElement(name = "listView")
@XmlAccessorType(XmlAccessType.FIELD)
public class HudsonView {

    @XmlElements({ @XmlElement(name = "job") })
    private List<HudsonModelJob> jobs = new ArrayList<HudsonModelJob>();

    private String name;

    private String url;

    public List<HudsonModelJob> getJobs() {
        return jobs;
    }

    public void setJobs(List<HudsonModelJob> jobs) {
        this.jobs = jobs;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

}
