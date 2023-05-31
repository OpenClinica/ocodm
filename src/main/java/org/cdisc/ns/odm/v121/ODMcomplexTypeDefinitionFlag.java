//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.3.2 
// See <a href="https://javaee.github.io/jaxb-v2/">https://javaee.github.io/jaxb-v2/</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2023.05.31 at 07:00:09 PM PKT 
//


package org.cdisc.ns.odm.v121;

import java.io.Serializable;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ODMcomplexTypeDefinition-Flag complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ODMcomplexTypeDefinition-Flag"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{http://www.cdisc.org/ns/odm/v1.2}FlagValue"/&gt;
 *         &lt;element ref="{http://www.cdisc.org/ns/odm/v1.2}FlagType" minOccurs="0"/&gt;
 *         &lt;group ref="{http://www.cdisc.org/ns/odm/v1.2}FlagElementExtension" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *       &lt;attGroup ref="{http://www.cdisc.org/ns/odm/v1.2}FlagAttributeExtension"/&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ODMcomplexTypeDefinition-Flag", propOrder = {
    "flagValue",
    "flagType"
})
public class ODMcomplexTypeDefinitionFlag
    implements Serializable
{

    @XmlElement(name = "FlagValue", required = true)
    protected ODMcomplexTypeDefinitionFlagValue flagValue;
    @XmlElement(name = "FlagType")
    protected ODMcomplexTypeDefinitionFlagType flagType;

    /**
     * Gets the value of the flagValue property.
     * 
     * @return
     *     possible object is
     *     {@link ODMcomplexTypeDefinitionFlagValue }
     *     
     */
    public ODMcomplexTypeDefinitionFlagValue getFlagValue() {
        return flagValue;
    }

    /**
     * Sets the value of the flagValue property.
     * 
     * @param value
     *     allowed object is
     *     {@link ODMcomplexTypeDefinitionFlagValue }
     *     
     */
    public void setFlagValue(ODMcomplexTypeDefinitionFlagValue value) {
        this.flagValue = value;
    }

    public boolean isSetFlagValue() {
        return (this.flagValue!= null);
    }

    /**
     * Gets the value of the flagType property.
     * 
     * @return
     *     possible object is
     *     {@link ODMcomplexTypeDefinitionFlagType }
     *     
     */
    public ODMcomplexTypeDefinitionFlagType getFlagType() {
        return flagType;
    }

    /**
     * Sets the value of the flagType property.
     * 
     * @param value
     *     allowed object is
     *     {@link ODMcomplexTypeDefinitionFlagType }
     *     
     */
    public void setFlagType(ODMcomplexTypeDefinitionFlagType value) {
        this.flagType = value;
    }

    public boolean isSetFlagType() {
        return (this.flagType!= null);
    }

}
