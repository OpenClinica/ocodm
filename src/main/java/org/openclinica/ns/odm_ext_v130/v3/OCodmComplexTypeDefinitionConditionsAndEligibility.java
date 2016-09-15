//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.7 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2016.09.14 at 08:43:35 PM EDT 
//


package org.openclinica.ns.odm_ext_v130.v3;

import java.math.BigInteger;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for OCodmComplexTypeDefinition-ConditionsAndEligibility complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="OCodmComplexTypeDefinition-ConditionsAndEligibility">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Conditions" type="{http://www.cdisc.org/ns/odm/v1.3-sb}text" minOccurs="0"/>
 *         &lt;element name="Keywords" type="{http://www.cdisc.org/ns/odm/v1.3-sb}text" minOccurs="0"/>
 *         &lt;element name="EligibilityCriteria" type="{http://www.cdisc.org/ns/odm/v1.3-sb}text" minOccurs="0"/>
 *         &lt;element name="Sex" type="{http://www.cdisc.org/ns/odm/v1.3-sb}text" minOccurs="0"/>
 *         &lt;element ref="{http://www.openclinica.org/ns/odm_ext_v130/v3.1-sb}Age" minOccurs="0"/>
 *         &lt;element name="HealthyVolunteersAccepted" type="{http://www.cdisc.org/ns/odm/v1.3-sb}text" minOccurs="0"/>
 *         &lt;element name="ExpectedTotalEnrollment" type="{http://www.cdisc.org/ns/odm/v1.3-sb}integer"/>
 *         &lt;group ref="{http://www.openclinica.org/ns/odm_ext_v130/v3.1-sb}ConditionsAndEligibilityElementExtension" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attGroup ref="{http://www.openclinica.org/ns/odm_ext_v130/v3.1-sb}ConditionsAndEligibilityAttributeExtension"/>
 *       &lt;attGroup ref="{http://www.openclinica.org/ns/odm_ext_v130/v3.1-sb}ConditionsAndEligibilityAttributeDefinition"/>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "OCodmComplexTypeDefinition-ConditionsAndEligibility", propOrder = {
    "conditions",
    "keywords",
    "eligibilityCriteria",
    "sex",
    "age",
    "healthyVolunteersAccepted",
    "expectedTotalEnrollment"
})
public class OCodmComplexTypeDefinitionConditionsAndEligibility {

    @XmlElement(name = "Conditions")
    protected String conditions;
    @XmlElement(name = "Keywords")
    protected String keywords;
    @XmlElement(name = "EligibilityCriteria")
    protected String eligibilityCriteria;
    @XmlElement(name = "Sex")
    protected String sex;
    @XmlElement(name = "Age")
    protected OCodmComplexTypeDefinitionAge age;
    @XmlElement(name = "HealthyVolunteersAccepted")
    protected String healthyVolunteersAccepted;
    @XmlElement(name = "ExpectedTotalEnrollment", required = true)
    protected BigInteger expectedTotalEnrollment;

    /**
     * Gets the value of the conditions property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getConditions() {
        return conditions;
    }

    /**
     * Sets the value of the conditions property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setConditions(String value) {
        this.conditions = value;
    }

    /**
     * Gets the value of the keywords property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getKeywords() {
        return keywords;
    }

    /**
     * Sets the value of the keywords property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setKeywords(String value) {
        this.keywords = value;
    }

    /**
     * Gets the value of the eligibilityCriteria property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEligibilityCriteria() {
        return eligibilityCriteria;
    }

    /**
     * Sets the value of the eligibilityCriteria property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEligibilityCriteria(String value) {
        this.eligibilityCriteria = value;
    }

    /**
     * Gets the value of the sex property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSex() {
        return sex;
    }

    /**
     * Sets the value of the sex property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSex(String value) {
        this.sex = value;
    }

    /**
     * Gets the value of the age property.
     * 
     * @return
     *     possible object is
     *     {@link OCodmComplexTypeDefinitionAge }
     *     
     */
    public OCodmComplexTypeDefinitionAge getAge() {
        return age;
    }

    /**
     * Sets the value of the age property.
     * 
     * @param value
     *     allowed object is
     *     {@link OCodmComplexTypeDefinitionAge }
     *     
     */
    public void setAge(OCodmComplexTypeDefinitionAge value) {
        this.age = value;
    }

    /**
     * Gets the value of the healthyVolunteersAccepted property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getHealthyVolunteersAccepted() {
        return healthyVolunteersAccepted;
    }

    /**
     * Sets the value of the healthyVolunteersAccepted property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setHealthyVolunteersAccepted(String value) {
        this.healthyVolunteersAccepted = value;
    }

    /**
     * Gets the value of the expectedTotalEnrollment property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getExpectedTotalEnrollment() {
        return expectedTotalEnrollment;
    }

    /**
     * Sets the value of the expectedTotalEnrollment property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setExpectedTotalEnrollment(BigInteger value) {
        this.expectedTotalEnrollment = value;
    }

}
