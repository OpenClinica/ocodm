//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.3.2 
// See <a href="https://javaee.github.io/jaxb-v2/">https://javaee.github.io/jaxb-v2/</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2023.05.31 at 04:47:56 PM PKT 
//


package org.openclinica.ns.odm_ext_v130.v31;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;
import org.cdisc.ns.odm.v130.ODMcomplexTypeDefinitionUserRef;


/**
 * <p>Java class for OCodmComplexTypeDefinition-ChildNote complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="OCodmComplexTypeDefinition-ChildNote"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Description" type="{http://www.cdisc.org/ns/odm/v1.3}text" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="DetailedNote" type="{http://www.cdisc.org/ns/odm/v1.3}text" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element ref="{http://www.cdisc.org/ns/odm/v1.3}UserRef" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;group ref="{http://www.openclinica.org/ns/odm_ext_v130/v3.1}ChildNoteElementExtension" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *       &lt;attGroup ref="{http://www.openclinica.org/ns/odm_ext_v130/v3.1}ChildNoteAttributeDefinition"/&gt;
 *       &lt;attGroup ref="{http://www.openclinica.org/ns/odm_ext_v130/v3.1}ChildNoteAttributeExtension"/&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "OCodmComplexTypeDefinition-ChildNote", propOrder = {
    "description",
    "detailedNote",
    "userRef"
})
public class OCodmComplexTypeDefinitionChildNote
    implements Serializable
{

    @XmlElement(name = "Description")
    protected List<String> description;
    @XmlElement(name = "DetailedNote")
    protected List<String> detailedNote;
    @XmlElement(name = "UserRef", namespace = "http://www.cdisc.org/ns/odm/v1.3")
    protected List<ODMcomplexTypeDefinitionUserRef> userRef;
    @XmlAttribute(name = "ID")
    protected String id;
    @XmlAttribute(name = "Status")
    protected String status;
    @XmlAttribute(name = "DateCreated")
    protected XMLGregorianCalendar dateCreated;

    /**
     * Gets the value of the description property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the description property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getDescription().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getDescription() {
        if (description == null) {
            description = new ArrayList<String>();
        }
        return this.description;
    }

    public boolean isSetDescription() {
        return ((this.description!= null)&&(!this.description.isEmpty()));
    }

    public void unsetDescription() {
        this.description = null;
    }

    /**
     * Gets the value of the detailedNote property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the detailedNote property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getDetailedNote().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getDetailedNote() {
        if (detailedNote == null) {
            detailedNote = new ArrayList<String>();
        }
        return this.detailedNote;
    }

    public boolean isSetDetailedNote() {
        return ((this.detailedNote!= null)&&(!this.detailedNote.isEmpty()));
    }

    public void unsetDetailedNote() {
        this.detailedNote = null;
    }

    /**
     * Gets the value of the userRef property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the userRef property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getUserRef().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ODMcomplexTypeDefinitionUserRef }
     * 
     * 
     */
    public List<ODMcomplexTypeDefinitionUserRef> getUserRef() {
        if (userRef == null) {
            userRef = new ArrayList<ODMcomplexTypeDefinitionUserRef>();
        }
        return this.userRef;
    }

    public boolean isSetUserRef() {
        return ((this.userRef!= null)&&(!this.userRef.isEmpty()));
    }

    public void unsetUserRef() {
        this.userRef = null;
    }

    /**
     * Gets the value of the id property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getID() {
        return id;
    }

    /**
     * Sets the value of the id property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setID(String value) {
        this.id = value;
    }

    public boolean isSetID() {
        return (this.id!= null);
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
     * Gets the value of the dateCreated property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getDateCreated() {
        return dateCreated;
    }

    /**
     * Sets the value of the dateCreated property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setDateCreated(XMLGregorianCalendar value) {
        this.dateCreated = value;
    }

    public boolean isSetDateCreated() {
        return (this.dateCreated!= null);
    }

}
