//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.7 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2020.11.21 at 05:46:38 PM EST 
//


package org.cdisc.ns.odm.v121;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import org.openclinica.ns.odm_ext_v121.v31.OCodmComplexTypeDefinitionMultiSelectList;
import org.openclinica.ns.odm_ext_v121.v31.OCodmComplexTypeDefinitionStudyGroupClassList;


/**
 * <p>Java class for ODMcomplexTypeDefinition-MetaDataVersion complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ODMcomplexTypeDefinition-MetaDataVersion">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.cdisc.org/ns/odm/v1.2}ODMcomplexTypeDefinition-MetaDataVersion">
 *       &lt;redefine>
 *         &lt;complexType name="ODMcomplexTypeDefinition-MetaDataVersion">
 *           &lt;complexContent>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *               &lt;sequence>
 *                 &lt;group ref="{http://www.cdisc.org/ns/odm/v1.2}MetaDataVersionPreIncludeElementExtension" maxOccurs="unbounded" minOccurs="0"/>
 *                 &lt;element ref="{http://www.cdisc.org/ns/odm/v1.2}Include" minOccurs="0"/>
 *                 &lt;element ref="{http://www.cdisc.org/ns/odm/v1.2}Protocol" minOccurs="0"/>
 *                 &lt;element ref="{http://www.cdisc.org/ns/odm/v1.2}StudyEventDef" maxOccurs="unbounded" minOccurs="0"/>
 *                 &lt;element ref="{http://www.cdisc.org/ns/odm/v1.2}FormDef" maxOccurs="unbounded" minOccurs="0"/>
 *                 &lt;element ref="{http://www.cdisc.org/ns/odm/v1.2}ItemGroupDef" maxOccurs="unbounded" minOccurs="0"/>
 *                 &lt;element ref="{http://www.cdisc.org/ns/odm/v1.2}ItemDef" maxOccurs="unbounded" minOccurs="0"/>
 *                 &lt;element ref="{http://www.cdisc.org/ns/odm/v1.2}CodeList" maxOccurs="unbounded" minOccurs="0"/>
 *                 &lt;element ref="{http://www.cdisc.org/ns/odm/v1.2}ImputationMethod" maxOccurs="unbounded" minOccurs="0"/>
 *                 &lt;element ref="{http://www.cdisc.org/ns/odm/v1.2}Presentation" maxOccurs="unbounded" minOccurs="0"/>
 *                 &lt;group ref="{http://www.cdisc.org/ns/odm/v1.2}MetaDataVersionElementExtension" maxOccurs="unbounded" minOccurs="0"/>
 *               &lt;/sequence>
 *               &lt;attGroup ref="{http://www.cdisc.org/ns/odm/v1.2}MetaDataVersionAttributeExtension"/>
 *               &lt;attGroup ref="{http://www.cdisc.org/ns/odm/v1.2}MetaDataVersionAttributeDefinition"/>
 *             &lt;/restriction>
 *           &lt;/complexContent>
 *         &lt;/complexType>
 *       &lt;/redefine>
 *       &lt;sequence>
 *         &lt;element ref="{http://www.openclinica.org/ns/odm_ext_v121/v3.1}MultiSelectList" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element ref="{http://www.openclinica.org/ns/odm_ext_v121/v3.1}StudyGroupClassList" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ODMcomplexTypeDefinition-MetaDataVersion", propOrder = {
    "multiSelectList",
    "studyGroupClassList"
})
public class ODMcomplexTypeDefinitionMetaDataVersion
    extends OriginalODMcomplexTypeDefinitionMetaDataVersion
{

    @XmlElement(name = "MultiSelectList", namespace = "http://www.openclinica.org/ns/odm_ext_v121/v3.1")
    protected List<OCodmComplexTypeDefinitionMultiSelectList> multiSelectList;
    @XmlElement(name = "StudyGroupClassList", namespace = "http://www.openclinica.org/ns/odm_ext_v121/v3.1")
    protected List<OCodmComplexTypeDefinitionStudyGroupClassList> studyGroupClassList;

    /**
     * Gets the value of the multiSelectList property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the multiSelectList property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getMultiSelectList().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link OCodmComplexTypeDefinitionMultiSelectList }
     * 
     * 
     */
    public List<OCodmComplexTypeDefinitionMultiSelectList> getMultiSelectList() {
        if (multiSelectList == null) {
            multiSelectList = new ArrayList<OCodmComplexTypeDefinitionMultiSelectList>();
        }
        return this.multiSelectList;
    }

    /**
     * Gets the value of the studyGroupClassList property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the studyGroupClassList property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getStudyGroupClassList().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link OCodmComplexTypeDefinitionStudyGroupClassList }
     * 
     * 
     */
    public List<OCodmComplexTypeDefinitionStudyGroupClassList> getStudyGroupClassList() {
        if (studyGroupClassList == null) {
            studyGroupClassList = new ArrayList<OCodmComplexTypeDefinitionStudyGroupClassList>();
        }
        return this.studyGroupClassList;
    }

}
