//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.7 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2016.09.14 at 08:43:35 PM EDT 
//


package org.openclinica.ns.odm_ext_v130.v3;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for OCodmComplexTypeDefinition-ItemDetails complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="OCodmComplexTypeDefinition-ItemDetails">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element ref="{http://www.openclinica.org/ns/odm_ext_v130/v3.1-sb}ItemPresentInForm" maxOccurs="unbounded"/>
 *         &lt;group ref="{http://www.openclinica.org/ns/odm_ext_v130/v3.1-sb}ItemDetailsElementExtension" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attGroup ref="{http://www.openclinica.org/ns/odm_ext_v130/v3.1-sb}ItemDetailsAttributeExtension"/>
 *       &lt;attGroup ref="{http://www.openclinica.org/ns/odm_ext_v130/v3.1-sb}ItemDetailsAttributeDefinition"/>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "OCodmComplexTypeDefinition-ItemDetails", propOrder = {
    "itemPresentInForm"
})
public class OCodmComplexTypeDefinitionItemDetails {

    @XmlElement(name = "ItemPresentInForm", required = true)
    protected List<OCodmComplexTypeDefinitionItemPresentInForm> itemPresentInForm;
    @XmlAttribute(name = "ItemOID", required = true)
    protected String itemOID;

    /**
     * Gets the value of the itemPresentInForm property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the itemPresentInForm property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getItemPresentInForm().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link OCodmComplexTypeDefinitionItemPresentInForm }
     * 
     * 
     */
    public List<OCodmComplexTypeDefinitionItemPresentInForm> getItemPresentInForm() {
        if (itemPresentInForm == null) {
            itemPresentInForm = new ArrayList<OCodmComplexTypeDefinitionItemPresentInForm>();
        }
        return this.itemPresentInForm;
    }

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

}
