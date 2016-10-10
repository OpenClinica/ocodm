//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.11 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2016.10.10 at 02:18:37 PM EDT 
//


package org.openclinica.ns.rules.v31;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for HideActionType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="HideActionType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Run" type="{http://www.openclinica.org/ns/rules/v3.1}ActionRunType" minOccurs="0"/&gt;
 *         &lt;element name="Message" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="DestinationProperty" type="{http://www.openclinica.org/ns/rules/v3.1}PropertyType" maxOccurs="unbounded"/&gt;
 *       &lt;/sequence&gt;
 *       &lt;attGroup ref="{http://www.openclinica.org/ns/rules/v3.1}DiscrepancyNoteActionAttributeType"/&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "HideActionType", propOrder = {
    "run",
    "message",
    "destinationProperty"
})
public class HideActionType {

    @XmlElement(name = "Run")
    protected ActionRunType run;
    @XmlElement(name = "Message", required = true)
    protected String message;
    @XmlElement(name = "DestinationProperty", required = true)
    protected List<PropertyType> destinationProperty;
    @XmlAttribute(name = "IfExpressionEvaluates")
    protected String ifExpressionEvaluates;

    /**
     * Gets the value of the run property.
     * 
     * @return
     *     possible object is
     *     {@link ActionRunType }
     *     
     */
    public ActionRunType getRun() {
        return run;
    }

    /**
     * Sets the value of the run property.
     * 
     * @param value
     *     allowed object is
     *     {@link ActionRunType }
     *     
     */
    public void setRun(ActionRunType value) {
        this.run = value;
    }

    /**
     * Gets the value of the message property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMessage() {
        return message;
    }

    /**
     * Sets the value of the message property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMessage(String value) {
        this.message = value;
    }

    /**
     * Gets the value of the destinationProperty property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the destinationProperty property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getDestinationProperty().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link PropertyType }
     * 
     * 
     */
    public List<PropertyType> getDestinationProperty() {
        if (destinationProperty == null) {
            destinationProperty = new ArrayList<PropertyType>();
        }
        return this.destinationProperty;
    }

    /**
     * Gets the value of the ifExpressionEvaluates property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIfExpressionEvaluates() {
        return ifExpressionEvaluates;
    }

    /**
     * Sets the value of the ifExpressionEvaluates property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIfExpressionEvaluates(String value) {
        this.ifExpressionEvaluates = value;
    }

}
