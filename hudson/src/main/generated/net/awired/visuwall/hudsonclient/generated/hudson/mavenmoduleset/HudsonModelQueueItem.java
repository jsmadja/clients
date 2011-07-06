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

//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, vJAXB 2.1.10 in JDK 6 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2011.02.21 at 12:18:20 PM CET 
//

package net.awired.visuwall.hudsonclient.generated.hudson.mavenmoduleset;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;

/**
 * <p>
 * Java class for hudson.model.Queue-Item complex type.
 * 
 * <p>
 * The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="hudson.model.Queue-Item">
 *   &lt;complexContent>
 *     &lt;extension base="{}hudson.model.Actionable">
 *       &lt;sequence>
 *         &lt;element name="blocked" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="buildable" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="params" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="stuck" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="task" type="{http://www.w3.org/2001/XMLSchema}anyType" minOccurs="0"/>
 *         &lt;element name="why" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "hudson.model.Queue-Item", propOrder = { "blocked", "buildable", "params", "stuck", "task", "why" })
public class HudsonModelQueueItem extends HudsonModelActionable {

    protected boolean blocked;
    protected boolean buildable;
    protected String params;
    protected boolean stuck;
    protected Object task;
    protected String why;

    /**
     * Gets the value of the blocked property.
     * 
     */
    public boolean isBlocked() {
        return blocked;
    }

    /**
     * Sets the value of the blocked property.
     * 
     */
    public void setBlocked(boolean value) {
        this.blocked = value;
    }

    /**
     * Gets the value of the buildable property.
     * 
     */
    public boolean isBuildable() {
        return buildable;
    }

    /**
     * Sets the value of the buildable property.
     * 
     */
    public void setBuildable(boolean value) {
        this.buildable = value;
    }

    /**
     * Gets the value of the params property.
     * 
     * @return possible object is {@link String }
     * 
     */
    public String getParams() {
        return params;
    }

    /**
     * Sets the value of the params property.
     * 
     * @param value
     *            allowed object is {@link String }
     * 
     */
    public void setParams(String value) {
        this.params = value;
    }

    /**
     * Gets the value of the stuck property.
     * 
     */
    public boolean isStuck() {
        return stuck;
    }

    /**
     * Sets the value of the stuck property.
     * 
     */
    public void setStuck(boolean value) {
        this.stuck = value;
    }

    /**
     * Gets the value of the task property.
     * 
     * @return possible object is {@link Object }
     * 
     */
    public Object getTask() {
        return task;
    }

    /**
     * Sets the value of the task property.
     * 
     * @param value
     *            allowed object is {@link Object }
     * 
     */
    public void setTask(Object value) {
        this.task = value;
    }

    /**
     * Gets the value of the why property.
     * 
     * @return possible object is {@link String }
     * 
     */
    public String getWhy() {
        return why;
    }

    /**
     * Sets the value of the why property.
     * 
     * @param value
     *            allowed object is {@link String }
     * 
     */
    public void setWhy(String value) {
        this.why = value;
    }

}