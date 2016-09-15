//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.7 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2016.09.14 at 08:43:35 PM EDT 
//


package org.cdisc.ns.odm.v1;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ODMcomplexTypeDefinition-AdminData complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ODMcomplexTypeDefinition-AdminData">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element ref="{http://www.cdisc.org/ns/odm/v1.3-sb}User" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element ref="{http://www.cdisc.org/ns/odm/v1.3-sb}Location" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element ref="{http://www.cdisc.org/ns/odm/v1.3-sb}SignatureDef" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;group ref="{http://www.cdisc.org/ns/odm/v1.3-sb}AdminDataElementExtension" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attGroup ref="{http://www.cdisc.org/ns/odm/v1.3-sb}AdminDataAttributeDefinition"/>
 *       &lt;attGroup ref="{http://www.cdisc.org/ns/odm/v1.3-sb}AdminDataAttributeExtension"/>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ODMcomplexTypeDefinition-AdminData", propOrder = {
    "user",
    "location",
    "signatureDef"
})
public class ODMcomplexTypeDefinitionAdminData {

    @XmlElement(name = "User")
    protected List<ODMcomplexTypeDefinitionUser> user;
    @XmlElement(name = "Location")
    protected List<ODMcomplexTypeDefinitionLocation> location;
    @XmlElement(name = "SignatureDef")
    protected List<ODMcomplexTypeDefinitionSignatureDef> signatureDef;
    @XmlAttribute(name = "StudyOID")
    protected String studyOID;

    /**
     * Gets the value of the user property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the user property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getUser().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ODMcomplexTypeDefinitionUser }
     * 
     * 
     */
    public List<ODMcomplexTypeDefinitionUser> getUser() {
        if (user == null) {
            user = new ArrayList<ODMcomplexTypeDefinitionUser>();
        }
        return this.user;
    }

    /**
     * Gets the value of the location property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the location property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getLocation().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ODMcomplexTypeDefinitionLocation }
     * 
     * 
     */
    public List<ODMcomplexTypeDefinitionLocation> getLocation() {
        if (location == null) {
            location = new ArrayList<ODMcomplexTypeDefinitionLocation>();
        }
        return this.location;
    }

    /**
     * Gets the value of the signatureDef property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the signatureDef property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSignatureDef().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ODMcomplexTypeDefinitionSignatureDef }
     * 
     * 
     */
    public List<ODMcomplexTypeDefinitionSignatureDef> getSignatureDef() {
        if (signatureDef == null) {
            signatureDef = new ArrayList<ODMcomplexTypeDefinitionSignatureDef>();
        }
        return this.signatureDef;
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
