//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.3.2 
// See <a href="https://javaee.github.io/jaxb-v2/">https://javaee.github.io/jaxb-v2/</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2023.05.31 at 04:47:56 PM PKT 
//


package org.cdisc.ns.odm.v130;

import java.io.Serializable;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ODMcomplexTypeDefinition-ItemRef complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ODMcomplexTypeDefinition-ItemRef"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;group ref="{http://www.cdisc.org/ns/odm/v1.3}ItemRefElementExtension" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *       &lt;attGroup ref="{http://www.cdisc.org/ns/odm/v1.3}ItemRefAttributeDefinition"/&gt;
 *       &lt;attGroup ref="{http://www.cdisc.org/ns/odm/v1.3}RefAttributeSharedDefinition"/&gt;
 *       &lt;attGroup ref="{http://www.cdisc.org/ns/odm/v1.3}ItemRefAttributeExtension"/&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ODMcomplexTypeDefinition-ItemRef")
public class ODMcomplexTypeDefinitionItemRef
    implements Serializable
{

    @XmlAttribute(name = "ItemOID", required = true)
    protected String itemOID;
    @XmlAttribute(name = "KeySequence")
    protected BigInteger keySequence;
    @XmlAttribute(name = "MethodOID")
    protected String methodOID;
    @XmlAttribute(name = "ImputationMethodOID")
    protected String imputationMethodOID;
    @XmlAttribute(name = "Role")
    @XmlSchemaType(name = "NMTOKENS")
    protected List<String> role;
    @XmlAttribute(name = "RoleCodeListOID")
    protected String roleCodeListOID;
    @XmlAttribute(name = "OrderNumber")
    protected BigInteger orderNumber;
    @XmlAttribute(name = "Mandatory", required = true)
    protected YesOrNo mandatory;
    @XmlAttribute(name = "CollectionExceptionConditionOID")
    protected String collectionExceptionConditionOID;
    @XmlAttribute(name = "Status")
    protected String status;
    @XmlAttribute(name = "SourceDataVerificationCode", namespace = "http://www.openclinica.org/ns/odm_ext_v130/v3.1")
    protected String sourceDataVerificationCode;

    /**
     * Gets the value of the itemOID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getItemOID() {
        return itemOID;
    }

    /**
     * Sets the value of the itemOID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setItemOID(String value) {
        this.itemOID = value;
    }

    public boolean isSetItemOID() {
        return (this.itemOID!= null);
    }

    /**
     * Gets the value of the keySequence property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getKeySequence() {
        return keySequence;
    }

    /**
     * Sets the value of the keySequence property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setKeySequence(BigInteger value) {
        this.keySequence = value;
    }

    public boolean isSetKeySequence() {
        return (this.keySequence!= null);
    }

    /**
     * Gets the value of the methodOID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMethodOID() {
        return methodOID;
    }

    /**
     * Sets the value of the methodOID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMethodOID(String value) {
        this.methodOID = value;
    }

    public boolean isSetMethodOID() {
        return (this.methodOID!= null);
    }

    /**
     * Gets the value of the imputationMethodOID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getImputationMethodOID() {
        return imputationMethodOID;
    }

    /**
     * Sets the value of the imputationMethodOID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setImputationMethodOID(String value) {
        this.imputationMethodOID = value;
    }

    public boolean isSetImputationMethodOID() {
        return (this.imputationMethodOID!= null);
    }

    /**
     * Gets the value of the role property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the role property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getRole().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getRole() {
        if (role == null) {
            role = new ArrayList<String>();
        }
        return this.role;
    }

    public boolean isSetRole() {
        return ((this.role!= null)&&(!this.role.isEmpty()));
    }

    public void unsetRole() {
        this.role = null;
    }

    /**
     * Gets the value of the roleCodeListOID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRoleCodeListOID() {
        return roleCodeListOID;
    }

    /**
     * Sets the value of the roleCodeListOID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRoleCodeListOID(String value) {
        this.roleCodeListOID = value;
    }

    public boolean isSetRoleCodeListOID() {
        return (this.roleCodeListOID!= null);
    }

    /**
     * Gets the value of the orderNumber property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getOrderNumber() {
        return orderNumber;
    }

    /**
     * Sets the value of the orderNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setOrderNumber(BigInteger value) {
        this.orderNumber = value;
    }

    public boolean isSetOrderNumber() {
        return (this.orderNumber!= null);
    }

    /**
     * Gets the value of the mandatory property.
     * 
     * @return
     *     possible object is
     *     {@link YesOrNo }
     *     
     */
    public YesOrNo getMandatory() {
        return mandatory;
    }

    /**
     * Sets the value of the mandatory property.
     * 
     * @param value
     *     allowed object is
     *     {@link YesOrNo }
     *     
     */
    public void setMandatory(YesOrNo value) {
        this.mandatory = value;
    }

    public boolean isSetMandatory() {
        return (this.mandatory!= null);
    }

    /**
     * Gets the value of the collectionExceptionConditionOID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCollectionExceptionConditionOID() {
        return collectionExceptionConditionOID;
    }

    /**
     * Sets the value of the collectionExceptionConditionOID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCollectionExceptionConditionOID(String value) {
        this.collectionExceptionConditionOID = value;
    }

    public boolean isSetCollectionExceptionConditionOID() {
        return (this.collectionExceptionConditionOID!= null);
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
     * Gets the value of the sourceDataVerificationCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSourceDataVerificationCode() {
        return sourceDataVerificationCode;
    }

    /**
     * Sets the value of the sourceDataVerificationCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSourceDataVerificationCode(String value) {
        this.sourceDataVerificationCode = value;
    }

    public boolean isSetSourceDataVerificationCode() {
        return (this.sourceDataVerificationCode!= null);
    }

}
