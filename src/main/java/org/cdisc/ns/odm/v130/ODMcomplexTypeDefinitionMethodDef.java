//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.3.2 
// See <a href="https://javaee.github.io/jaxb-v2/">https://javaee.github.io/jaxb-v2/</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2023.05.31 at 04:47:56 PM PKT 
//


package org.cdisc.ns.odm.v130;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ODMcomplexTypeDefinition-MethodDef complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ODMcomplexTypeDefinition-MethodDef"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{http://www.cdisc.org/ns/odm/v1.3}Description"/&gt;
 *         &lt;element ref="{http://www.cdisc.org/ns/odm/v1.3}FormalExpression" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;group ref="{http://www.cdisc.org/ns/odm/v1.3}MethodDefElementExtension"/&gt;
 *       &lt;/sequence&gt;
 *       &lt;attGroup ref="{http://www.cdisc.org/ns/odm/v1.3}MethodDefAttributeExtension"/&gt;
 *       &lt;attGroup ref="{http://www.cdisc.org/ns/odm/v1.3}MethodDefAttributeDefinition"/&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ODMcomplexTypeDefinition-MethodDef", propOrder = {
    "description",
    "formalExpression"
})
public class ODMcomplexTypeDefinitionMethodDef
    implements Serializable
{

    @XmlElement(name = "Description", required = true)
    protected ODMcomplexTypeDefinitionDescription description;
    @XmlElement(name = "FormalExpression")
    protected List<ODMcomplexTypeDefinitionFormalExpression> formalExpression;
    @XmlAttribute(name = "OID", required = true)
    protected String oid;
    @XmlAttribute(name = "Name", required = true)
    protected String name;
    @XmlAttribute(name = "Type")
    protected MethodType type;

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

    public boolean isSetDescription() {
        return (this.description!= null);
    }

    /**
     * Gets the value of the formalExpression property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the formalExpression property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getFormalExpression().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ODMcomplexTypeDefinitionFormalExpression }
     * 
     * 
     */
    public List<ODMcomplexTypeDefinitionFormalExpression> getFormalExpression() {
        if (formalExpression == null) {
            formalExpression = new ArrayList<ODMcomplexTypeDefinitionFormalExpression>();
        }
        return this.formalExpression;
    }

    public boolean isSetFormalExpression() {
        return ((this.formalExpression!= null)&&(!this.formalExpression.isEmpty()));
    }

    public void unsetFormalExpression() {
        this.formalExpression = null;
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

    public boolean isSetOID() {
        return (this.oid!= null);
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

    public boolean isSetName() {
        return (this.name!= null);
    }

    /**
     * Gets the value of the type property.
     * 
     * @return
     *     possible object is
     *     {@link MethodType }
     *     
     */
    public MethodType getType() {
        return type;
    }

    /**
     * Sets the value of the type property.
     * 
     * @param value
     *     allowed object is
     *     {@link MethodType }
     *     
     */
    public void setType(MethodType value) {
        this.type = value;
    }

    public boolean isSetType() {
        return (this.type!= null);
    }

}
