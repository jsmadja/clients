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

package net.awired.clients.bamboo.builder;

public class BambooUrlBuilder {

    private String bambooUrl;

    public BambooUrlBuilder(String bambooUrl) {
        this.bambooUrl = bambooUrl + "/rest/api/";
    }

    public String getAllPlansUrl() {
        return bambooUrl + "latest/plan";
    }

    public String getAllBuildsUrl() {
        return bambooUrl + "latest/build";
    }

    public String getAllResultsUrl() {
        return bambooUrl + "latest/result";
    }

    public String getPlanUrl(String planKey) {
        return bambooUrl + "latest/plan/" + planKey;
    }

    public String getResultUrl(String planKey, int buildNumber) {
        return bambooUrl + "latest/result/" + planKey + "-" + buildNumber
                + "?expand=changes,metadata,stages,labels,jiraIssues,comments";
    }

    public String getResultsUrl(String planKey) {
        return bambooUrl + "latest/result/" + planKey;
    }

}
