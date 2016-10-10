//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.11 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2016.10.10 at 02:18:37 PM EDT 
//


package org.openclinica.ns.odm_ext_v130.v31_sb;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for OCodmComplexTypeDefinition-FormDetails complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="OCodmComplexTypeDefinition-FormDetails"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="VersionDescription" type="{http://www.cdisc.org/ns/odm/v1.3-sb}text" minOccurs="0"/&gt;
 *         &lt;element name="RevisionNotes" type="{http://www.cdisc.org/ns/odm/v1.3-sb}text" minOccurs="0"/&gt;
 *         &lt;element ref="{http://www.openclinica.org/ns/odm_ext_v130/v3.1-sb}PresentInEventDefinition" maxOccurs="unbounded"/&gt;
 *         &lt;group ref="{http://www.openclinica.org/ns/odm_ext_v130/v3.1-sb}FormDetailsElementExtension" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *       &lt;attGroup ref="{http://www.openclinica.org/ns/odm_ext_v130/v3.1-sb}FormDetailsAttributeExtension"/&gt;
 *       &lt;attGroup ref="{http://www.openclinica.org/ns/odm_ext_v130/v3.1-sb}FormDetailsAttributeDefinition"/&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "OCodmComplexTypeDefinition-FormDetails", propOrder = {
    "versionDescription",
    "revisionNotes",
    "presentInEventDefinition"
})
public class OCodmComplexTypeDefinitionFormDetails {

    @XmlElement(name = "VersionDescription")
    protected String versionDescription;
    @XmlElement(name = "RevisionNotes")
    protected String revisionNotes;
    @XmlElement(name = "PresentInEventDefinition", required = true)
    protected List<OCodmComplexTypeDefinitionPresentInEventDefinition> presentInEventDefinition;
    @XmlAttribute(name = "FormOID", required = true)
    protected String formOID;
    @XmlAttribute(name = "ParentFormOID")
    protected String parentFormOID;

    /**
     * Gets the value of the versionDescription property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVersionDescription() {
        return versionDescription;
    }

    /**
     * Sets the value of the versionDescription property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVersionDescription(String value) {
        this.versionDescription = value;
    }

    /**
     * Gets the value of the revisionNotes property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRevisionNotes() {
        return revisionNotes;
    }

    /**
     * Sets the value of the revisionNotes property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRevisionNotes(String value) {
        this.revisionNotes = value;
    }

    /**
     * Gets the value of the presentInEventDefinition property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the presentInEventDefinition property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPresentInEventDefinition().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link OCodmComplexTypeDefinitionPresentInEventDefinition }
     * 
     * 
     */
    public List<OCodmComplexTypeDefinitionPresentInEventDefinition> getPresentInEventDefinition() {
        if (presentInEventDefinition == null) {
            presentInEventDefinition = new ArrayList<OCodmComplexTypeDefinitionPresentInEventDefinition>();
        }
        return this.presentInEventDefinition;
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

    /**
     * Gets the value of the parentFormOID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getParentFormOID() {
        return parentFormOID;
    }

    /**
     * Sets the value of the parentFormOID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setParentFormOID(String value) {
        this.parentFormOID = value;
    }

}
