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
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ODMcomplexTypeDefinition-Protocol complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ODMcomplexTypeDefinition-Protocol"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{http://www.cdisc.org/ns/odm/v1.2}StudyEventRef" maxOccurs="unbounded"/&gt;
 *         &lt;group ref="{http://www.cdisc.org/ns/odm/v1.2}ProtocolElementExtension" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *       &lt;attGroup ref="{http://www.cdisc.org/ns/odm/v1.2}ProtocolAttributeExtension"/&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ODMcomplexTypeDefinition-Protocol", propOrder = {
    "studyEventRef"
})
public class ODMcomplexTypeDefinitionProtocol
    implements Serializable
{

    @XmlElement(name = "StudyEventRef", required = true)
    protected List<ODMcomplexTypeDefinitionStudyEventRef> studyEventRef;

    /**
     * Gets the value of the studyEventRef property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the studyEventRef property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getStudyEventRef().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ODMcomplexTypeDefinitionStudyEventRef }
     * 
     * 
     */
    public List<ODMcomplexTypeDefinitionStudyEventRef> getStudyEventRef() {
        if (studyEventRef == null) {
            studyEventRef = new ArrayList<ODMcomplexTypeDefinitionStudyEventRef>();
        }
        return this.studyEventRef;
    }

    public boolean isSetStudyEventRef() {
        return ((this.studyEventRef!= null)&&(!this.studyEventRef.isEmpty()));
    }

    public void unsetStudyEventRef() {
        this.studyEventRef = null;
    }

}
