//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.11 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2018.09.24 at 01:05:42 PM EDT 
//


package org.cdisc.ns.odm.v121;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ODMcomplexTypeDefinition-SignatureDef complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ODMcomplexTypeDefinition-SignatureDef"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{http://www.cdisc.org/ns/odm/v1.2}Meaning"/&gt;
 *         &lt;element ref="{http://www.cdisc.org/ns/odm/v1.2}LegalReason"/&gt;
 *         &lt;group ref="{http://www.cdisc.org/ns/odm/v1.2}SignatureDefElementExtension" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *       &lt;attGroup ref="{http://www.cdisc.org/ns/odm/v1.2}SignatureDefAttributeDefinition"/&gt;
 *       &lt;attGroup ref="{http://www.cdisc.org/ns/odm/v1.2}SignatureDefAttributeExtension"/&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ODMcomplexTypeDefinition-SignatureDef", propOrder = {
    "meaning",
    "legalReason"
})
public class ODMcomplexTypeDefinitionSignatureDef {

    @XmlElement(name = "Meaning", required = true)
    protected ODMcomplexTypeDefinitionMeaning meaning;
    @XmlElement(name = "LegalReason", required = true)
    protected ODMcomplexTypeDefinitionLegalReason legalReason;
    @XmlAttribute(name = "OID", required = true)
    protected String oid;
    @XmlAttribute(name = "Methodology")
    protected SignMethod methodology;

    /**
     * Gets the value of the meaning property.
     * 
     * @return
     *     possible object is
     *     {@link ODMcomplexTypeDefinitionMeaning }
     *     
     */
    public ODMcomplexTypeDefinitionMeaning getMeaning() {
        return meaning;
    }

    /**
     * Sets the value of the meaning property.
     * 
     * @param value
     *     allowed object is
     *     {@link ODMcomplexTypeDefinitionMeaning }
     *     
     */
    public void setMeaning(ODMcomplexTypeDefinitionMeaning value) {
        this.meaning = value;
    }

    /**
     * Gets the value of the legalReason property.
     * 
     * @return
     *     possible object is
     *     {@link ODMcomplexTypeDefinitionLegalReason }
     *     
     */
    public ODMcomplexTypeDefinitionLegalReason getLegalReason() {
        return legalReason;
    }

    /**
     * Sets the value of the legalReason property.
     * 
     * @param value
     *     allowed object is
     *     {@link ODMcomplexTypeDefinitionLegalReason }
     *     
     */
    public void setLegalReason(ODMcomplexTypeDefinitionLegalReason value) {
        this.legalReason = value;
    }

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

    /**
     * Gets the value of the methodology property.
     * 
     * @return
     *     possible object is
     *     {@link SignMethod }
     *     
     */
    public SignMethod getMethodology() {
        return methodology;
    }

    /**
     * Sets the value of the methodology property.
     * 
     * @param value
     *     allowed object is
     *     {@link SignMethod }
     *     
     */
    public void setMethodology(SignMethod value) {
        this.methodology = value;
    }

}
