//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.11 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2016.10.10 at 02:18:37 PM EDT 
//


package org.cdisc.ns.odm.v130;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.XmlValue;


/**
 * <p>Java class for ODMcomplexTypeDefinition-FlagType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ODMcomplexTypeDefinition-FlagType"&gt;
 *   &lt;simpleContent&gt;
 *     &lt;extension base="&lt;http://www.cdisc.org/ns/odm/v1.3&gt;name"&gt;
 *       &lt;attGroup ref="{http://www.cdisc.org/ns/odm/v1.3}FlagTypeAttributeExtension"/&gt;
 *       &lt;attGroup ref="{http://www.cdisc.org/ns/odm/v1.3}FlagTypeAttributeDefinition"/&gt;
 *     &lt;/extension&gt;
 *   &lt;/simpleContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ODMcomplexTypeDefinition-FlagType", propOrder = {
    "value"
})
public class ODMcomplexTypeDefinitionFlagType {

    @XmlValue
    protected String value;
    @XmlAttribute(name = "CodeListOID", required = true)
    protected String codeListOID;

    /**
     * Gets the value of the value property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getValue() {
        return value;
    }

    /**
     * Sets the value of the value property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setValue(String value) {
        this.value = value;
    }

    /**
     * Gets the value of the codeListOID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCodeListOID() {
        return codeListOID;
    }

    /**
     * Sets the value of the codeListOID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCodeListOID(String value) {
        this.codeListOID = value;
    }

}
