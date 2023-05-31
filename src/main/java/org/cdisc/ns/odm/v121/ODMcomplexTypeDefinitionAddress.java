//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.3.2 
// See <a href="https://javaee.github.io/jaxb-v2/">https://javaee.github.io/jaxb-v2/</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2023.05.31 at 04:47:56 PM PKT 
//


package org.cdisc.ns.odm.v121;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ODMcomplexTypeDefinition-Address complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ODMcomplexTypeDefinition-Address"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{http://www.cdisc.org/ns/odm/v1.2}StreetName" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element ref="{http://www.cdisc.org/ns/odm/v1.2}City" minOccurs="0"/&gt;
 *         &lt;element ref="{http://www.cdisc.org/ns/odm/v1.2}StateProv" minOccurs="0"/&gt;
 *         &lt;element ref="{http://www.cdisc.org/ns/odm/v1.2}Country" minOccurs="0"/&gt;
 *         &lt;element ref="{http://www.cdisc.org/ns/odm/v1.2}PostalCode" minOccurs="0"/&gt;
 *         &lt;element ref="{http://www.cdisc.org/ns/odm/v1.2}OtherText" minOccurs="0"/&gt;
 *         &lt;group ref="{http://www.cdisc.org/ns/odm/v1.2}AddressElementExtension" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *       &lt;attGroup ref="{http://www.cdisc.org/ns/odm/v1.2}AddressAttributeExtension"/&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ODMcomplexTypeDefinition-Address", propOrder = {
    "streetName",
    "city",
    "stateProv",
    "country",
    "postalCode",
    "otherText"
})
public class ODMcomplexTypeDefinitionAddress
    implements Serializable
{

    @XmlElement(name = "StreetName")
    protected List<ODMcomplexTypeDefinitionStreetName> streetName;
    @XmlElement(name = "City")
    protected ODMcomplexTypeDefinitionCity city;
    @XmlElement(name = "StateProv")
    protected ODMcomplexTypeDefinitionStateProv stateProv;
    @XmlElement(name = "Country")
    protected ODMcomplexTypeDefinitionCountry country;
    @XmlElement(name = "PostalCode")
    protected ODMcomplexTypeDefinitionPostalCode postalCode;
    @XmlElement(name = "OtherText")
    protected ODMcomplexTypeDefinitionOtherText otherText;

    /**
     * Gets the value of the streetName property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the streetName property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getStreetName().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ODMcomplexTypeDefinitionStreetName }
     * 
     * 
     */
    public List<ODMcomplexTypeDefinitionStreetName> getStreetName() {
        if (streetName == null) {
            streetName = new ArrayList<ODMcomplexTypeDefinitionStreetName>();
        }
        return this.streetName;
    }

    public boolean isSetStreetName() {
        return ((this.streetName!= null)&&(!this.streetName.isEmpty()));
    }

    public void unsetStreetName() {
        this.streetName = null;
    }

    /**
     * Gets the value of the city property.
     * 
     * @return
     *     possible object is
     *     {@link ODMcomplexTypeDefinitionCity }
     *     
     */
    public ODMcomplexTypeDefinitionCity getCity() {
        return city;
    }

    /**
     * Sets the value of the city property.
     * 
     * @param value
     *     allowed object is
     *     {@link ODMcomplexTypeDefinitionCity }
     *     
     */
    public void setCity(ODMcomplexTypeDefinitionCity value) {
        this.city = value;
    }

    public boolean isSetCity() {
        return (this.city!= null);
    }

    /**
     * Gets the value of the stateProv property.
     * 
     * @return
     *     possible object is
     *     {@link ODMcomplexTypeDefinitionStateProv }
     *     
     */
    public ODMcomplexTypeDefinitionStateProv getStateProv() {
        return stateProv;
    }

    /**
     * Sets the value of the stateProv property.
     * 
     * @param value
     *     allowed object is
     *     {@link ODMcomplexTypeDefinitionStateProv }
     *     
     */
    public void setStateProv(ODMcomplexTypeDefinitionStateProv value) {
        this.stateProv = value;
    }

    public boolean isSetStateProv() {
        return (this.stateProv!= null);
    }

    /**
     * Gets the value of the country property.
     * 
     * @return
     *     possible object is
     *     {@link ODMcomplexTypeDefinitionCountry }
     *     
     */
    public ODMcomplexTypeDefinitionCountry getCountry() {
        return country;
    }

    /**
     * Sets the value of the country property.
     * 
     * @param value
     *     allowed object is
     *     {@link ODMcomplexTypeDefinitionCountry }
     *     
     */
    public void setCountry(ODMcomplexTypeDefinitionCountry value) {
        this.country = value;
    }

    public boolean isSetCountry() {
        return (this.country!= null);
    }

    /**
     * Gets the value of the postalCode property.
     * 
     * @return
     *     possible object is
     *     {@link ODMcomplexTypeDefinitionPostalCode }
     *     
     */
    public ODMcomplexTypeDefinitionPostalCode getPostalCode() {
        return postalCode;
    }

    /**
     * Sets the value of the postalCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link ODMcomplexTypeDefinitionPostalCode }
     *     
     */
    public void setPostalCode(ODMcomplexTypeDefinitionPostalCode value) {
        this.postalCode = value;
    }

    public boolean isSetPostalCode() {
        return (this.postalCode!= null);
    }

    /**
     * Gets the value of the otherText property.
     * 
     * @return
     *     possible object is
     *     {@link ODMcomplexTypeDefinitionOtherText }
     *     
     */
    public ODMcomplexTypeDefinitionOtherText getOtherText() {
        return otherText;
    }

    /**
     * Sets the value of the otherText property.
     * 
     * @param value
     *     allowed object is
     *     {@link ODMcomplexTypeDefinitionOtherText }
     *     
     */
    public void setOtherText(ODMcomplexTypeDefinitionOtherText value) {
        this.otherText = value;
    }

    public boolean isSetOtherText() {
        return (this.otherText!= null);
    }

}
