//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.7 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2021.01.11 at 04:46:33 PM EST 
//


package org.openclinica.ns.odm_ext_v130.v31;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for OCodmComplexTypeDefinition-PresentInEventDefinition complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="OCodmComplexTypeDefinition-PresentInEventDefinition">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;group ref="{http://www.openclinica.org/ns/odm_ext_v130/v3.1}PresentInEventDefinitionElementExtension" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attGroup ref="{http://www.openclinica.org/ns/odm_ext_v130/v3.1}PresentInEventDefinitionAttributeExtension"/>
 *       &lt;attGroup ref="{http://www.openclinica.org/ns/odm_ext_v130/v3.1}PresentInEventDefinitionAttributeDefinition"/>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "OCodmComplexTypeDefinition-PresentInEventDefinition")
public class OCodmComplexTypeDefinitionPresentInEventDefinition {

    @XmlAttribute(name = "StudyEventOID", required = true)
    protected String studyEventOID;
    @XmlAttribute(name = "IsDefaultVersion")
    protected String isDefaultVersion;
    @XmlAttribute(name = "NullValues")
    protected String nullValues;
    @XmlAttribute(name = "PasswordRequired")
    protected String passwordRequired;
    @XmlAttribute(name = "DoubleDataEntry")
    protected String doubleDataEntry;
    @XmlAttribute(name = "HideCRF")
    protected String hideCRF;
    @XmlAttribute(name = "SourceDataVerification")
    protected String sourceDataVerification;
    @XmlAttribute(name = "allowAdd")
    protected String allowAdd;

    /**
     * Gets the value of the studyEventOID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStudyEventOID() {
        return studyEventOID;
    }

    /**
     * Sets the value of the studyEventOID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStudyEventOID(String value) {
        this.studyEventOID = value;
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

    /**
     * Gets the value of the nullValues property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNullValues() {
        return nullValues;
    }

    /**
     * Sets the value of the nullValues property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNullValues(String value) {
        this.nullValues = value;
    }

    /**
     * Gets the value of the passwordRequired property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPasswordRequired() {
        return passwordRequired;
    }

    /**
     * Sets the value of the passwordRequired property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPasswordRequired(String value) {
        this.passwordRequired = value;
    }

    /**
     * Gets the value of the doubleDataEntry property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDoubleDataEntry() {
        return doubleDataEntry;
    }

    /**
     * Sets the value of the doubleDataEntry property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDoubleDataEntry(String value) {
        this.doubleDataEntry = value;
    }

    /**
     * Gets the value of the hideCRF property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getHideCRF() {
        return hideCRF;
    }

    /**
     * Sets the value of the hideCRF property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setHideCRF(String value) {
        this.hideCRF = value;
    }

    /**
     * Gets the value of the sourceDataVerification property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSourceDataVerification() {
        return sourceDataVerification;
    }

    /**
     * Sets the value of the sourceDataVerification property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSourceDataVerification(String value) {
        this.sourceDataVerification = value;
    }

    /**
     * Gets the value of the allowAdd property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAllowAdd() {
        return allowAdd;
    }

    /**
     * Sets the value of the allowAdd property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAllowAdd(String value) {
        this.allowAdd = value;
    }

}
