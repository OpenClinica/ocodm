//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.3.2 
// See <a href="https://javaee.github.io/jaxb-v2/">https://javaee.github.io/jaxb-v2/</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2023.05.31 at 06:04:40 PM PKT 
//


package org.cdisc.ns.odm.v121;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import org.openclinica.ns.odm_ext_v121.v31.OCodmComplexTypeDefinitionAuditLogs;
import org.openclinica.ns.odm_ext_v121.v31.OCodmComplexTypeDefinitionDiscrepancyNotes;


/**
 * <p>Java class for ODMcomplexTypeDefinition-FormData complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ODMcomplexTypeDefinition-FormData"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://www.cdisc.org/ns/odm/v1.2}ODMcomplexTypeDefinition-FormData"&gt;
 *       &lt;redefine&gt;
 *         &lt;complexType name="ODMcomplexTypeDefinition-FormData"&gt;
 *           &lt;complexContent&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *               &lt;sequence&gt;
 *                 &lt;element ref="{http://www.cdisc.org/ns/odm/v1.2}AuditRecord" minOccurs="0"/&gt;
 *                 &lt;element ref="{http://www.cdisc.org/ns/odm/v1.2}Signature" minOccurs="0"/&gt;
 *                 &lt;element ref="{http://www.cdisc.org/ns/odm/v1.2}ArchiveLayoutRef" minOccurs="0"/&gt;
 *                 &lt;element ref="{http://www.cdisc.org/ns/odm/v1.2}Annotation" maxOccurs="unbounded" minOccurs="0"/&gt;
 *                 &lt;element ref="{http://www.cdisc.org/ns/odm/v1.2}ItemGroupData" maxOccurs="unbounded" minOccurs="0"/&gt;
 *                 &lt;group ref="{http://www.cdisc.org/ns/odm/v1.2}FormDataElementExtension" maxOccurs="unbounded" minOccurs="0"/&gt;
 *               &lt;/sequence&gt;
 *               &lt;attGroup ref="{http://www.cdisc.org/ns/odm/v1.2}FormDataAttributeExtension"/&gt;
 *               &lt;attGroup ref="{http://www.cdisc.org/ns/odm/v1.2}FormDataAttributeDefinition"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/complexContent&gt;
 *         &lt;/complexType&gt;
 *       &lt;/redefine&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{http://www.openclinica.org/ns/odm_ext_v121/v3.1}AuditLogs" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element ref="{http://www.openclinica.org/ns/odm_ext_v121/v3.1}DiscrepancyNotes" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ODMcomplexTypeDefinition-FormData", propOrder = {
    "auditLogs",
    "discrepancyNotes"
})
public class ODMcomplexTypeDefinitionFormData
    extends OriginalODMcomplexTypeDefinitionFormData
    implements Serializable
{

    @XmlElement(name = "AuditLogs", namespace = "http://www.openclinica.org/ns/odm_ext_v121/v3.1")
    protected List<OCodmComplexTypeDefinitionAuditLogs> auditLogs;
    @XmlElement(name = "DiscrepancyNotes", namespace = "http://www.openclinica.org/ns/odm_ext_v121/v3.1")
    protected List<OCodmComplexTypeDefinitionDiscrepancyNotes> discrepancyNotes;

    /**
     * Gets the value of the auditLogs property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the auditLogs property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAuditLogs().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link OCodmComplexTypeDefinitionAuditLogs }
     * 
     * 
     */
    public List<OCodmComplexTypeDefinitionAuditLogs> getAuditLogs() {
        if (auditLogs == null) {
            auditLogs = new ArrayList<OCodmComplexTypeDefinitionAuditLogs>();
        }
        return this.auditLogs;
    }

    public boolean isSetAuditLogs() {
        return ((this.auditLogs!= null)&&(!this.auditLogs.isEmpty()));
    }

    public void unsetAuditLogs() {
        this.auditLogs = null;
    }

    /**
     * Gets the value of the discrepancyNotes property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the discrepancyNotes property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getDiscrepancyNotes().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link OCodmComplexTypeDefinitionDiscrepancyNotes }
     * 
     * 
     */
    public List<OCodmComplexTypeDefinitionDiscrepancyNotes> getDiscrepancyNotes() {
        if (discrepancyNotes == null) {
            discrepancyNotes = new ArrayList<OCodmComplexTypeDefinitionDiscrepancyNotes>();
        }
        return this.discrepancyNotes;
    }

    public boolean isSetDiscrepancyNotes() {
        return ((this.discrepancyNotes!= null)&&(!this.discrepancyNotes.isEmpty()));
    }

    public void unsetDiscrepancyNotes() {
        this.discrepancyNotes = null;
    }

}
