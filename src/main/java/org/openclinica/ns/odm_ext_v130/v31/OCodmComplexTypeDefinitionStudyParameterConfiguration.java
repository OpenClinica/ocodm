//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.11 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2018.09.24 at 01:05:42 PM EDT 
//


package org.openclinica.ns.odm_ext_v130.v31;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for OCodmComplexTypeDefinition-StudyParameterConfiguration complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="OCodmComplexTypeDefinition-StudyParameterConfiguration"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{http://www.openclinica.org/ns/odm_ext_v130/v3.1}StudyParameterListRef" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element ref="{http://www.openclinica.org/ns/odm_ext_v130/v3.1}StudyParameterList" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;group ref="{http://www.openclinica.org/ns/odm_ext_v130/v3.1}StudyParameterConfigurationElementExtension" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *       &lt;attGroup ref="{http://www.openclinica.org/ns/odm_ext_v130/v3.1}StudyParameterConfigurationAttributeExtension"/&gt;
 *       &lt;attGroup ref="{http://www.openclinica.org/ns/odm_ext_v130/v3.1}StudyParameterConfigurationAttributeDefinition"/&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "OCodmComplexTypeDefinition-StudyParameterConfiguration", propOrder = {
    "studyParameterListRef",
    "studyParameterList"
})
public class OCodmComplexTypeDefinitionStudyParameterConfiguration {

    @XmlElement(name = "StudyParameterListRef")
    protected List<OCodmComplexTypeDefinitionStudyParameterListRef> studyParameterListRef;
    @XmlElement(name = "StudyParameterList")
    protected List<OCodmComplexTypeDefinitionStudyParameterList> studyParameterList;

    /**
     * Gets the value of the studyParameterListRef property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the studyParameterListRef property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getStudyParameterListRef().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link OCodmComplexTypeDefinitionStudyParameterListRef }
     * 
     * 
     */
    public List<OCodmComplexTypeDefinitionStudyParameterListRef> getStudyParameterListRef() {
        if (studyParameterListRef == null) {
            studyParameterListRef = new ArrayList<OCodmComplexTypeDefinitionStudyParameterListRef>();
        }
        return this.studyParameterListRef;
    }

    /**
     * Gets the value of the studyParameterList property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the studyParameterList property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getStudyParameterList().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link OCodmComplexTypeDefinitionStudyParameterList }
     * 
     * 
     */
    public List<OCodmComplexTypeDefinitionStudyParameterList> getStudyParameterList() {
        if (studyParameterList == null) {
            studyParameterList = new ArrayList<OCodmComplexTypeDefinitionStudyParameterList>();
        }
        return this.studyParameterList;
    }

}
