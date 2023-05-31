//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.3.2 
// See <a href="https://javaee.github.io/jaxb-v2/">https://javaee.github.io/jaxb-v2/</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2023.05.31 at 04:47:56 PM PKT 
//


package org.cdisc.ns.odm.v121;

import java.io.Serializable;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ODMcomplexTypeDefinition-StudyEventData complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ODMcomplexTypeDefinition-StudyEventData"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{http://www.cdisc.org/ns/odm/v1.2}AuditRecord" minOccurs="0"/&gt;
 *         &lt;element ref="{http://www.cdisc.org/ns/odm/v1.2}Signature" minOccurs="0"/&gt;
 *         &lt;element ref="{http://www.cdisc.org/ns/odm/v1.2}Annotation" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element ref="{http://www.cdisc.org/ns/odm/v1.2}FormData" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;group ref="{http://www.cdisc.org/ns/odm/v1.2}StudyEventDataElementExtension" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *       &lt;attGroup ref="{http://www.cdisc.org/ns/odm/v1.2}StudyEventDataAttributeDefinition"/&gt;
 *       &lt;attGroup ref="{http://www.cdisc.org/ns/odm/v1.2}StudyEventDataAttributeExtension"/&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "auditRecord",
    "signature",
    "annotation",
    "formData"
})
@XmlSeeAlso({
    ODMcomplexTypeDefinitionStudyEventData.class
})
public class OriginalODMcomplexTypeDefinitionStudyEventData
    implements Serializable
{

    @XmlElement(name = "AuditRecord")
    protected ODMcomplexTypeDefinitionAuditRecord auditRecord;
    @XmlElement(name = "Signature")
    protected ODMcomplexTypeDefinitionSignature signature;
    @XmlElement(name = "Annotation")
    protected List<ODMcomplexTypeDefinitionAnnotation> annotation;
    @XmlElement(name = "FormData")
    protected List<ODMcomplexTypeDefinitionFormData> formData;
    @XmlAttribute(name = "StudyEventOID", required = true)
    protected String studyEventOID;
    @XmlAttribute(name = "StudyEventRepeatKey")
    protected String studyEventRepeatKey;
    @XmlAttribute(name = "TransactionType")
    protected TransactionType transactionType;
    @XmlAttribute(name = "StudyEventLocation", namespace = "http://www.openclinica.org/ns/odm_ext_v121/v3.1")
    protected String studyEventLocation;
    @XmlAttribute(name = "StartDate", namespace = "http://www.openclinica.org/ns/odm_ext_v121/v3.1")
    protected String startDate;
    @XmlAttribute(name = "EndDate", namespace = "http://www.openclinica.org/ns/odm_ext_v121/v3.1")
    protected String endDate;
    @XmlAttribute(name = "Status", namespace = "http://www.openclinica.org/ns/odm_ext_v121/v3.1")
    protected String status;
    @XmlAttribute(name = "SubjectAgeAtEvent", namespace = "http://www.openclinica.org/ns/odm_ext_v121/v3.1")
    protected BigInteger subjectAgeAtEvent;

    /**
     * Gets the value of the auditRecord property.
     * 
     * @return
     *     possible object is
     *     {@link ODMcomplexTypeDefinitionAuditRecord }
     *     
     */
    public ODMcomplexTypeDefinitionAuditRecord getAuditRecord() {
        return auditRecord;
    }

    /**
     * Sets the value of the auditRecord property.
     * 
     * @param value
     *     allowed object is
     *     {@link ODMcomplexTypeDefinitionAuditRecord }
     *     
     */
    public void setAuditRecord(ODMcomplexTypeDefinitionAuditRecord value) {
        this.auditRecord = value;
    }

    public boolean isSetAuditRecord() {
        return (this.auditRecord!= null);
    }

    /**
     * Gets the value of the signature property.
     * 
     * @return
     *     possible object is
     *     {@link ODMcomplexTypeDefinitionSignature }
     *     
     */
    public ODMcomplexTypeDefinitionSignature getSignature() {
        return signature;
    }

    /**
     * Sets the value of the signature property.
     * 
     * @param value
     *     allowed object is
     *     {@link ODMcomplexTypeDefinitionSignature }
     *     
     */
    public void setSignature(ODMcomplexTypeDefinitionSignature value) {
        this.signature = value;
    }

    public boolean isSetSignature() {
        return (this.signature!= null);
    }

    /**
     * Gets the value of the annotation property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the annotation property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAnnotation().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ODMcomplexTypeDefinitionAnnotation }
     * 
     * 
     */
    public List<ODMcomplexTypeDefinitionAnnotation> getAnnotation() {
        if (annotation == null) {
            annotation = new ArrayList<ODMcomplexTypeDefinitionAnnotation>();
        }
        return this.annotation;
    }

    public boolean isSetAnnotation() {
        return ((this.annotation!= null)&&(!this.annotation.isEmpty()));
    }

    public void unsetAnnotation() {
        this.annotation = null;
    }

    /**
     * Gets the value of the formData property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the formData property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getFormData().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ODMcomplexTypeDefinitionFormData }
     * 
     * 
     */
    public List<ODMcomplexTypeDefinitionFormData> getFormData() {
        if (formData == null) {
            formData = new ArrayList<ODMcomplexTypeDefinitionFormData>();
        }
        return this.formData;
    }

    public boolean isSetFormData() {
        return ((this.formData!= null)&&(!this.formData.isEmpty()));
    }

    public void unsetFormData() {
        this.formData = null;
    }

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

    public boolean isSetStudyEventOID() {
        return (this.studyEventOID!= null);
    }

    /**
     * Gets the value of the studyEventRepeatKey property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStudyEventRepeatKey() {
        return studyEventRepeatKey;
    }

    /**
     * Sets the value of the studyEventRepeatKey property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStudyEventRepeatKey(String value) {
        this.studyEventRepeatKey = value;
    }

    public boolean isSetStudyEventRepeatKey() {
        return (this.studyEventRepeatKey!= null);
    }

    /**
     * Gets the value of the transactionType property.
     * 
     * @return
     *     possible object is
     *     {@link TransactionType }
     *     
     */
    public TransactionType getTransactionType() {
        return transactionType;
    }

    /**
     * Sets the value of the transactionType property.
     * 
     * @param value
     *     allowed object is
     *     {@link TransactionType }
     *     
     */
    public void setTransactionType(TransactionType value) {
        this.transactionType = value;
    }

    public boolean isSetTransactionType() {
        return (this.transactionType!= null);
    }

    /**
     * Gets the value of the studyEventLocation property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStudyEventLocation() {
        return studyEventLocation;
    }

    /**
     * Sets the value of the studyEventLocation property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStudyEventLocation(String value) {
        this.studyEventLocation = value;
    }

    public boolean isSetStudyEventLocation() {
        return (this.studyEventLocation!= null);
    }

    /**
     * Gets the value of the startDate property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStartDate() {
        return startDate;
    }

    /**
     * Sets the value of the startDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStartDate(String value) {
        this.startDate = value;
    }

    public boolean isSetStartDate() {
        return (this.startDate!= null);
    }

    /**
     * Gets the value of the endDate property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEndDate() {
        return endDate;
    }

    /**
     * Sets the value of the endDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEndDate(String value) {
        this.endDate = value;
    }

    public boolean isSetEndDate() {
        return (this.endDate!= null);
    }

    /**
     * Gets the value of the status property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStatus() {
        return status;
    }

    /**
     * Sets the value of the status property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStatus(String value) {
        this.status = value;
    }

    public boolean isSetStatus() {
        return (this.status!= null);
    }

    /**
     * Gets the value of the subjectAgeAtEvent property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getSubjectAgeAtEvent() {
        return subjectAgeAtEvent;
    }

    /**
     * Sets the value of the subjectAgeAtEvent property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setSubjectAgeAtEvent(BigInteger value) {
        this.subjectAgeAtEvent = value;
    }

    public boolean isSetSubjectAgeAtEvent() {
        return (this.subjectAgeAtEvent!= null);
    }

}
