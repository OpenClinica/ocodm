//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.7 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2021.01.11 at 04:43:38 PM EST 
//


package org.openclinica.ns.rules.v31;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for DiscrepancyNoteActionType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="DiscrepancyNoteActionType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Run" type="{http://www.openclinica.org/ns/rules/v3.1}ActionRunType" minOccurs="0"/>
 *         &lt;element name="Message" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *       &lt;/sequence>
 *       &lt;attGroup ref="{http://www.openclinica.org/ns/rules/v3.1}DiscrepancyNoteActionAttributeType"/>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DiscrepancyNoteActionType", propOrder = {
    "run",
    "message"
})
public class DiscrepancyNoteActionType {

    @XmlElement(name = "Run")
    protected ActionRunType run;
    @XmlElement(name = "Message", required = true)
    protected String message;
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
