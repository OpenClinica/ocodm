//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.7 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2021.01.11 at 04:46:33 PM EST 
//


package org.cdisc.ns.odm.v130;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import org.openclinica.ns.odm_ext_v130.v31.OCodmComplexTypeDefinitionFormDetails;
import org.openclinica.ns.odm_ext_v130.v31.OCodmComplexTypeDefinitionFormLayoutDef;


/**
 * <p>Java class for ODMcomplexTypeDefinition-FormDef complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ODMcomplexTypeDefinition-FormDef">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element ref="{http://www.cdisc.org/ns/odm/v1.3}Description" minOccurs="0"/>
 *         &lt;element ref="{http://www.cdisc.org/ns/odm/v1.3}ItemGroupRef" maxOccurs="unbounded"/>
 *         &lt;element ref="{http://www.cdisc.org/ns/odm/v1.3}ArchiveLayout" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;group ref="{http://www.cdisc.org/ns/odm/v1.3}FormDefElementExtension" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attGroup ref="{http://www.cdisc.org/ns/odm/v1.3}FormDefAttributeDefinition"/>
 *       &lt;attGroup ref="{http://www.cdisc.org/ns/odm/v1.3}FormDefAttributeExtension"/>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ODMcomplexTypeDefinition-FormDef", propOrder = {
    "description",
    "itemGroupRef",
    "archiveLayout",
    "formLayoutDef",
    "formDetails"
})
public class ODMcomplexTypeDefinitionFormDef {

    @XmlElement(name = "Description")
    protected ODMcomplexTypeDefinitionDescription description;
    @XmlElement(name = "ItemGroupRef", required = true)
    protected List<ODMcomplexTypeDefinitionItemGroupRef> itemGroupRef;
    @XmlElement(name = "ArchiveLayout")
    protected List<ODMcomplexTypeDefinitionArchiveLayout> archiveLayout;
    @XmlElement(name = "FormLayoutDef", namespace = "http://www.openclinica.org/ns/odm_ext_v130/v3.1")
    protected List<OCodmComplexTypeDefinitionFormLayoutDef> formLayoutDef;
    @XmlElement(name = "FormDetails", namespace = "http://www.openclinica.org/ns/odm_ext_v130/v3.1")
    protected OCodmComplexTypeDefinitionFormDetails formDetails;
    @XmlAttribute(name = "OID", required = true)
    protected String oid;
    @XmlAttribute(name = "Name", required = true)
    protected String name;
    @XmlAttribute(name = "Repeating", required = true)
    protected YesOrNo repeating;
    @XmlAttribute(name = "Status")
    protected String status;
    @XmlAttribute(name = "StudyEventOIDs", namespace = "http://www.openclinica.org/ns/odm_ext_v130/v3.1")
    protected String studyEventOIDs;

    /**
     * Gets the value of the description property.
     * 
     * @return
     *     possible object is
     *     {@link ODMcomplexTypeDefinitionDescription }
     *     
     */
    public ODMcomplexTypeDefinitionDescription getDescription() {
        return description;
    }

    /**
     * Sets the value of the description property.
     * 
     * @param value
     *     allowed object is
     *     {@link ODMcomplexTypeDefinitionDescription }
     *     
     */
    public void setDescription(ODMcomplexTypeDefinitionDescription value) {
        this.description = value;
    }

    /**
     * Gets the value of the itemGroupRef property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the itemGroupRef property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getItemGroupRef().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ODMcomplexTypeDefinitionItemGroupRef }
     * 
     * 
     */
    public List<ODMcomplexTypeDefinitionItemGroupRef> getItemGroupRef() {
        if (itemGroupRef == null) {
            itemGroupRef = new ArrayList<ODMcomplexTypeDefinitionItemGroupRef>();
        }
        return this.itemGroupRef;
    }

    /**
     * Gets the value of the archiveLayout property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the archiveLayout property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getArchiveLayout().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ODMcomplexTypeDefinitionArchiveLayout }
     * 
     * 
     */
    public List<ODMcomplexTypeDefinitionArchiveLayout> getArchiveLayout() {
        if (archiveLayout == null) {
            archiveLayout = new ArrayList<ODMcomplexTypeDefinitionArchiveLayout>();
        }
        return this.archiveLayout;
    }

    /**
     * Gets the value of the formLayoutDef property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the formLayoutDef property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getFormLayoutDef().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link OCodmComplexTypeDefinitionFormLayoutDef }
     * 
     * 
     */
    public List<OCodmComplexTypeDefinitionFormLayoutDef> getFormLayoutDef() {
        if (formLayoutDef == null) {
            formLayoutDef = new ArrayList<OCodmComplexTypeDefinitionFormLayoutDef>();
        }
        return this.formLayoutDef;
    }

    /**
     * Gets the value of the formDetails property.
     * 
     * @return
     *     possible object is
     *     {@link OCodmComplexTypeDefinitionFormDetails }
     *     
     */
    public OCodmComplexTypeDefinitionFormDetails getFormDetails() {
        return formDetails;
    }

    /**
     * Sets the value of the formDetails property.
     * 
     * @param value
     *     allowed object is
     *     {@link OCodmComplexTypeDefinitionFormDetails }
     *     
     */
    public void setFormDetails(OCodmComplexTypeDefinitionFormDetails value) {
        this.formDetails = value;
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
     * Gets the value of the name property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getName() {
        return name;
    }

    /**
     * Sets the value of the name property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setName(String value) {
        this.name = value;
    }

    /**
     * Gets the value of the repeating property.
     * 
     * @return
     *     possible object is
     *     {@link YesOrNo }
     *     
     */
    public YesOrNo getRepeating() {
        return repeating;
    }

    /**
     * Sets the value of the repeating property.
     * 
     * @param value
     *     allowed object is
     *     {@link YesOrNo }
     *     
     */
    public void setRepeating(YesOrNo value) {
        this.repeating = value;
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

    /**
     * Gets the value of the studyEventOIDs property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStudyEventOIDs() {
        return studyEventOIDs;
    }

    /**
     * Sets the value of the studyEventOIDs property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStudyEventOIDs(String value) {
        this.studyEventOIDs = value;
    }

}
