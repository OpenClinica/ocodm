//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.3.2 
// See <a href="https://javaee.github.io/jaxb-v2/">https://javaee.github.io/jaxb-v2/</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2023.11.08 at 08:38:34 PM PKT 
//


package org.openclinica.ns.odm_ext_v130.v31;

import java.io.Serializable;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for OCodmComplexTypeDefinition-FormLayoutRef complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="OCodmComplexTypeDefinition-FormLayoutRef"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;attGroup ref="{http://www.openclinica.org/ns/odm_ext_v130/v3.1}FormLayoutRefAttributeDefinition"/&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "OCodmComplexTypeDefinition-FormLayoutRef")
public class OCodmComplexTypeDefinitionFormLayoutRef
    implements Serializable
{

    @XmlAttribute(name = "OID", required = true)
    protected String oid;
    @XmlAttribute(name = "IsDefaultVersion")
    protected String isDefaultVersion;

    /**
     * Gets the value of the oid property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOID() {
        return oid;
    }

    /**
     * Sets the value of the oid property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOID(String value) {
        this.oid = value;
    }

    public boolean isSetOID() {
        return (this.oid!= null);
    }

    /**
     * Gets the value of the isDefaultVersion property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIsDefaultVersion() {
        return isDefaultVersion;
    }

    /**
     * Sets the value of the isDefaultVersion property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIsDefaultVersion(String value) {
        this.isDefaultVersion = value;
    }

    public boolean isSetIsDefaultVersion() {
        return (this.isDefaultVersion!= null);
    }

}
