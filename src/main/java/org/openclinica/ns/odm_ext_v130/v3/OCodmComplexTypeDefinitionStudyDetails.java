//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.7 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2016.09.14 at 08:43:35 PM EDT 
//


package org.openclinica.ns.odm_ext_v130.v3;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for OCodmComplexTypeDefinition-StudyDetails complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="OCodmComplexTypeDefinition-StudyDetails">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element ref="{http://www.openclinica.org/ns/odm_ext_v130/v3.1-sb}StudyDescriptionAndStatus"/>
 *         &lt;element ref="{http://www.openclinica.org/ns/odm_ext_v130/v3.1-sb}ConditionsAndEligibility"/>
 *         &lt;element ref="{http://www.openclinica.org/ns/odm_ext_v130/v3.1-sb}FacilityInformation" minOccurs="0"/>
 *         &lt;element ref="{http://www.openclinica.org/ns/odm_ext_v130/v3.1-sb}RelatedInformation" minOccurs="0"/>
 *         &lt;element ref="{http://www.openclinica.org/ns/odm_ext_v130/v3.1-sb}StudyParameterConfiguration"/>
 *         &lt;group ref="{http://www.openclinica.org/ns/odm_ext_v130/v3.1-sb}StudyDetailsElementExtension" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attGroup ref="{http://www.openclinica.org/ns/odm_ext_v130/v3.1-sb}StudyDetailsAttributeDefinition"/>
 *       &lt;attGroup ref="{http://www.openclinica.org/ns/odm_ext_v130/v3.1-sb}StudyDetailsAttributeExtension"/>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "OCodmComplexTypeDefinition-StudyDetails", propOrder = {
    "studyDescriptionAndStatus",
    "conditionsAndEligibility",
    "facilityInformation",
    "relatedInformation",
    "studyParameterConfiguration"
})
public class OCodmComplexTypeDefinitionStudyDetails {

    @XmlElement(name = "StudyDescriptionAndStatus", required = true)
    protected OCodmComplexTypeDefinitionStudyDescriptionAndStatus studyDescriptionAndStatus;
    @XmlElement(name = "ConditionsAndEligibility", required = true)
    protected OCodmComplexTypeDefinitionConditionsAndEligibility conditionsAndEligibility;
    @XmlElement(name = "FacilityInformation")
    protected OCodmComplexTypeDefinitionFacilityInformation facilityInformation;
    @XmlElement(name = "RelatedInformation")
    protected OCodmComplexTypeDefinitionRelatedInformation relatedInformation;
    @XmlElement(name = "StudyParameterConfiguration", required = true)
    protected OCodmComplexTypeDefinitionStudyParameterConfiguration studyParameterConfiguration;
    @XmlAttribute(name = "StudyOID", required = true)
    protected String studyOID;

    /**
     * Gets the value of the studyDescriptionAndStatus property.
     * 
     * @return
     *     possible object is
     *     {@link OCodmComplexTypeDefinitionStudyDescriptionAndStatus }
     *     
     */
    public OCodmComplexTypeDefinitionStudyDescriptionAndStatus getStudyDescriptionAndStatus() {
        return studyDescriptionAndStatus;
    }

    /**
     * Sets the value of the studyDescriptionAndStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link OCodmComplexTypeDefinitionStudyDescriptionAndStatus }
     *     
     */
    public void setStudyDescriptionAndStatus(OCodmComplexTypeDefinitionStudyDescriptionAndStatus value) {
        this.studyDescriptionAndStatus = value;
    }

    /**
     * Gets the value of the conditionsAndEligibility property.
     * 
     * @return
     *     possible object is
     *     {@link OCodmComplexTypeDefinitionConditionsAndEligibility }
     *     
     */
    public OCodmComplexTypeDefinitionConditionsAndEligibility getConditionsAndEligibility() {
        return conditionsAndEligibility;
    }

    /**
     * Sets the value of the conditionsAndEligibility property.
     * 
     * @param value
     *     allowed object is
     *     {@link OCodmComplexTypeDefinitionConditionsAndEligibility }
     *     
     */
    public void setConditionsAndEligibility(OCodmComplexTypeDefinitionConditionsAndEligibility value) {
        this.conditionsAndEligibility = value;
    }

    /**
     * Gets the value of the facilityInformation property.
     * 
     * @return
     *     possible object is
     *     {@link OCodmComplexTypeDefinitionFacilityInformation }
     *     
     */
    public OCodmComplexTypeDefinitionFacilityInformation getFacilityInformation() {
        return facilityInformation;
    }

    /**
     * Sets the value of the facilityInformation property.
     * 
     * @param value
     *     allowed object is
     *     {@link OCodmComplexTypeDefinitionFacilityInformation }
     *     
     */
    public void setFacilityInformation(OCodmComplexTypeDefinitionFacilityInformation value) {
        this.facilityInformation = value;
    }

    /**
     * Gets the value of the relatedInformation property.
     * 
     * @return
     *     possible object is
     *     {@link OCodmComplexTypeDefinitionRelatedInformation }
     *     
     */
    public OCodmComplexTypeDefinitionRelatedInformation getRelatedInformation() {
        return relatedInformation;
    }

    /**
     * Sets the value of the relatedInformation property.
     * 
     * @param value
     *     allowed object is
     *     {@link OCodmComplexTypeDefinitionRelatedInformation }
     *     
     */
    public void setRelatedInformation(OCodmComplexTypeDefinitionRelatedInformation value) {
        this.relatedInformation = value;
    }

    /**
     * Gets the value of the studyParameterConfiguration property.
     * 
     * @return
     *     possible object is
     *     {@link OCodmComplexTypeDefinitionStudyParameterConfiguration }
     *     
     */
    public OCodmComplexTypeDefinitionStudyParameterConfiguration getStudyParameterConfiguration() {
        return studyParameterConfiguration;
    }

    /**
     * Sets the value of the studyParameterConfiguration property.
     * 
     * @param value
     *     allowed object is
     *     {@link OCodmComplexTypeDefinitionStudyParameterConfiguration }
     *     
     */
    public void setStudyParameterConfiguration(OCodmComplexTypeDefinitionStudyParameterConfiguration value) {
        this.studyParameterConfiguration = value;
    }

    /**
     * Gets the value of the studyOID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStudyOID() {
        return studyOID;
    }

    /**
     * Sets the value of the studyOID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStudyOID(String value) {
        this.studyOID = value;
    }

}
