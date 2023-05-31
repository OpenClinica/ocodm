//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.3.2 
// See <a href="https://javaee.github.io/jaxb-v2/">https://javaee.github.io/jaxb-v2/</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2023.05.31 at 04:47:56 PM PKT 
//


package org.openclinica.ns.rules.v31;

import java.io.Serializable;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for RunOnType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="RunOnType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;attribute name="not_scheduled" type="{http://www.w3.org/2001/XMLSchema}boolean" default="true" /&gt;
 *       &lt;attribute name="scheduled" type="{http://www.w3.org/2001/XMLSchema}boolean" default="true" /&gt;
 *       &lt;attribute name="data_entry_started" type="{http://www.w3.org/2001/XMLSchema}boolean" default="false" /&gt;
 *       &lt;attribute name="completed" type="{http://www.w3.org/2001/XMLSchema}boolean" default="false" /&gt;
 *       &lt;attribute name="skipped" type="{http://www.w3.org/2001/XMLSchema}boolean" default="false" /&gt;
 *       &lt;attribute name="stopped" type="{http://www.w3.org/2001/XMLSchema}boolean" default="false" /&gt;
 *       &lt;attribute name="signed" type="{http://www.w3.org/2001/XMLSchema}boolean" fixed="false" /&gt;
 *       &lt;attribute name="locked" type="{http://www.w3.org/2001/XMLSchema}boolean" fixed="false" /&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "RunOnType")
public class RunOnType
    implements Serializable
{

    @XmlAttribute(name = "not_scheduled")
    protected Boolean notScheduled;
    @XmlAttribute(name = "scheduled")
    protected Boolean scheduled;
    @XmlAttribute(name = "data_entry_started")
    protected Boolean dataEntryStarted;
    @XmlAttribute(name = "completed")
    protected Boolean completed;
    @XmlAttribute(name = "skipped")
    protected Boolean skipped;
    @XmlAttribute(name = "stopped")
    protected Boolean stopped;
    @XmlAttribute(name = "signed")
    protected Boolean signed;
    @XmlAttribute(name = "locked")
    protected Boolean locked;

    /**
     * Gets the value of the notScheduled property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public boolean isNotScheduled() {
        if (notScheduled == null) {
            return true;
        } else {
            return notScheduled;
        }
    }

    /**
     * Sets the value of the notScheduled property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setNotScheduled(boolean value) {
        this.notScheduled = value;
    }

    public boolean isSetNotScheduled() {
        return (this.notScheduled!= null);
    }

    public void unsetNotScheduled() {
        this.notScheduled = null;
    }

    /**
     * Gets the value of the scheduled property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public boolean isScheduled() {
        if (scheduled == null) {
            return true;
        } else {
            return scheduled;
        }
    }

    /**
     * Sets the value of the scheduled property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setScheduled(boolean value) {
        this.scheduled = value;
    }

    public boolean isSetScheduled() {
        return (this.scheduled!= null);
    }

    public void unsetScheduled() {
        this.scheduled = null;
    }

    /**
     * Gets the value of the dataEntryStarted property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public boolean isDataEntryStarted() {
        if (dataEntryStarted == null) {
            return false;
        } else {
            return dataEntryStarted;
        }
    }

    /**
     * Sets the value of the dataEntryStarted property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setDataEntryStarted(boolean value) {
        this.dataEntryStarted = value;
    }

    public boolean isSetDataEntryStarted() {
        return (this.dataEntryStarted!= null);
    }

    public void unsetDataEntryStarted() {
        this.dataEntryStarted = null;
    }

    /**
     * Gets the value of the completed property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public boolean isCompleted() {
        if (completed == null) {
            return false;
        } else {
            return completed;
        }
    }

    /**
     * Sets the value of the completed property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setCompleted(boolean value) {
        this.completed = value;
    }

    public boolean isSetCompleted() {
        return (this.completed!= null);
    }

    public void unsetCompleted() {
        this.completed = null;
    }

    /**
     * Gets the value of the skipped property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public boolean isSkipped() {
        if (skipped == null) {
            return false;
        } else {
            return skipped;
        }
    }

    /**
     * Sets the value of the skipped property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setSkipped(boolean value) {
        this.skipped = value;
    }

    public boolean isSetSkipped() {
        return (this.skipped!= null);
    }

    public void unsetSkipped() {
        this.skipped = null;
    }

    /**
     * Gets the value of the stopped property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public boolean isStopped() {
        if (stopped == null) {
            return false;
        } else {
            return stopped;
        }
    }

    /**
     * Sets the value of the stopped property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setStopped(boolean value) {
        this.stopped = value;
    }

    public boolean isSetStopped() {
        return (this.stopped!= null);
    }

    public void unsetStopped() {
        this.stopped = null;
    }

    /**
     * Gets the value of the signed property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public boolean isSigned() {
        if (signed == null) {
            return false;
        } else {
            return signed;
        }
    }

    /**
     * Sets the value of the signed property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setSigned(boolean value) {
        this.signed = value;
    }

    public boolean isSetSigned() {
        return (this.signed!= null);
    }

    public void unsetSigned() {
        this.signed = null;
    }

    /**
     * Gets the value of the locked property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public boolean isLocked() {
        if (locked == null) {
            return false;
        } else {
            return locked;
        }
    }

    /**
     * Sets the value of the locked property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setLocked(boolean value) {
        this.locked = value;
    }

    public boolean isSetLocked() {
        return (this.locked!= null);
    }

    public void unsetLocked() {
        this.locked = null;
    }

}
