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

package net.awired.clients.teamcity.resource;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElements;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name = "relatedIssues")
@XmlAccessorType(XmlAccessType.FIELD)
public class TeamCityRelatedIssues {

    @XmlElements({ @XmlElement(name = "relatedIssue") })
    private List<TeamCityRelatedIssue> relatedIssues = new ArrayList<TeamCityRelatedIssue>();

    public List<TeamCityRelatedIssue> getRelatedIssues() {
        return relatedIssues;
    }

    public void setRelatedIssues(List<TeamCityRelatedIssue> relatedIssues) {
        this.relatedIssues = relatedIssues;
    }

}
