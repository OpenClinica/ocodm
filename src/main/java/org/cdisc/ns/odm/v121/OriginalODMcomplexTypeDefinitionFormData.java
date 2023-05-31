//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.3.2 
// See <a href="https://javaee.github.io/jaxb-v2/">https://javaee.github.io/jaxb-v2/</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2023.05.31 at 07:00:09 PM PKT 
//


package org.cdisc.ns.odm.v121;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for ODMcomplexTypeDefinition-FormData complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ODMcomplexTypeDefinition-FormData"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{http://www.cdisc.org/ns/odm/v1.2}AuditRecord" minOccurs="0"/&gt;
 *         &lt;element ref="{http://www.cdisc.org/ns/odm/v1.2}Signature" minOccurs="0"/&gt;
 *         &lt;element ref="{http://www.cdisc.org/ns/odm/v1.2}ArchiveLayoutRef" minOccurs="0"/&gt;
 *         &lt;element ref="{http://www.cdisc.org/ns/odm/v1.2}Annotation" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element ref="{http://www.cdisc.org/ns/odm/v1.2}ItemGroupData" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;group ref="{http://www.cdisc.org/ns/odm/v1.2}FormDataElementExtension" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *       &lt;attGroup ref="{http://www.cdisc.org/ns/odm/v1.2}FormDataAttributeExtension"/&gt;
 *       &lt;attGroup ref="{http://www.cdisc.org/ns/odm/v1.2}FormDataAttributeDefinition"/&gt;
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
    "archiveLayoutRef",
    "annotation",
    "itemGroupData"
})
@XmlSeeAlso({
    ODMcomplexTypeDefinitionFormData.class
})
public class OriginalODMcomplexTypeDefinitionFormData
    implements Serializable
{

    @XmlElement(name = "AuditRecord")
    protected ODMcomplexTypeDefinitionAuditRecord auditRecord;
    @XmlElement(name = "Signature")
    protected ODMcomplexTypeDefinitionSignature signature;
    @XmlElement(name = "ArchiveLayoutRef")
    protected ODMcomplexTypeDefinitionArchiveLayoutRef archiveLayoutRef;
    @XmlElement(name = "Annotation")
    protected List<ODMcomplexTypeDefinitionAnnotation> annotation;
    @XmlElement(name = "ItemGroupData")
    protected List<ODMcomplexTypeDefinitionItemGroupData> itemGroupData;
    @XmlAttribute(name = "Version", namespace = "http://www.openclinica.org/ns/odm_ext_v121/v3.1")
    protected String version;
    @XmlAttribute(name = "InterviewerName", namespace = "http://www.openclinica.org/ns/odm_ext_v121/v3.1")
    protected String interviewerName;
    @XmlAttribute(name = "InterviewDate", namespace = "http://www.openclinica.org/ns/odm_ext_v121/v3.1")
    protected XMLGregorianCalendar interviewDate;
    @XmlAttribute(name = "Status", namespace = "http://www.openclinica.org/ns/odm_ext_v121/v3.1")
    protected String status;
    @XmlAttribute(name = "FormOID", required = true)
    protected String formOID;
    @XmlAttribute(name = "FormRepeatKey")
    protected String formRepeatKey;
    @XmlAttribute(name = "TransactionType")
    protected TransactionType transactionType;

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
     * Gets the value of the archiveLayoutRef property.
     * 
     * @return
     *     possible object is
     *     {@link ODMcomplexTypeDefinitionArchiveLayoutRef }
     *     
     */
    public ODMcomplexTypeDefinitionArchiveLayoutRef getArchiveLayoutRef() {
        return archiveLayoutRef;
    }

    /**
     * Sets the value of the archiveLayoutRef property.
     * 
     * @param value
     *     allowed object is
     *     {@link ODMcomplexTypeDefinitionArchiveLayoutRef }
     *     
     */
    public void setArchiveLayoutRef(ODMcomplexTypeDefinitionArchiveLayoutRef value) {
        this.archiveLayoutRef = value;
    }

    public boolean isSetArchiveLayoutRef() {
        return (this.archiveLayoutRef!= null);
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
     * Gets the value of the itemGroupData property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the itemGroupData property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getItemGroupData().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ODMcomplexTypeDefinitionItemGroupData }
     * 
     * 
     */
    public List<ODMcomplexTypeDefinitionItemGroupData> getItemGroupData() {
        if (itemGroupData == null) {
            itemGroupData = new ArrayList<ODMcomplexTypeDefinitionItemGroupData>();
        }
        return this.itemGroupData;
    }

    public boolean isSetItemGroupData() {
        return ((this.itemGroupData!= null)&&(!this.itemGroupData.isEmpty()));
    }

    public void unsetItemGroupData() {
        this.itemGroupData = null;
    }

    /**
     * Gets the value of the version property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVersion() {
        return version;
    }

    /**
     * Sets the value of the version property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVersion(String value) {
        this.version = value;
    }

    public boolean isSetVersion() {
        return (this.version!= null);
    }

    /**
     * Gets the value of the interviewerName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInterviewerName() {
        return interviewerName;
    }

    /**
     * Sets the value of the interviewerName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInterviewerName(String value) {
        this.interviewerName = value;
    }

    public boolean isSetInterviewerName() {
        return (this.interviewerName!= null);
    }

    /**
     * Gets the value of the interviewDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getInterviewDate() {
        return interviewDate;
    }

    /**
     * Sets the value of the interviewDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setInterviewDate(XMLGregorianCalendar value) {
        this.interviewDate = value;
    }

    public boolean isSetInterviewDate() {
        return (this.interviewDate!= null);
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
     * Gets the value of the formOID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFormOID() {
        return formOID;
    }

    /**
     * Sets the value of the formOID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFormOID(String value) {
        this.formOID = value;
    }

    public boolean isSetFormOID() {
        return (this.formOID!= null);
    }

    /**
     * Gets the value of the formRepeatKey property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFormRepeatKey() {
        return formRepeatKey;
    }

    /**
     * Sets the value of the formRepeatKey property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFormRepeatKey(String value) {
        this.formRepeatKey = value;
    }

    public boolean isSetFormRepeatKey() {
        return (this.formRepeatKey!= null);
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

}
