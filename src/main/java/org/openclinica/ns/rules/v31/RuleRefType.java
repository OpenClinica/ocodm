//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.7 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2016.09.14 at 08:47:21 PM EDT 
//


package org.openclinica.ns.rules.v31;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for RuleRefType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="RuleRefType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element ref="{http://www.openclinica.org/ns/rules/v3.1}DiscrepancyNoteAction" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element ref="{http://www.openclinica.org/ns/rules/v3.1}EmailAction" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element ref="{http://www.openclinica.org/ns/rules/v3.1}ShowAction" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element ref="{http://www.openclinica.org/ns/rules/v3.1}HideAction" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element ref="{http://www.openclinica.org/ns/rules/v3.1}InsertAction" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element ref="{http://www.openclinica.org/ns/rules/v3.1}EventAction" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element ref="{http://www.openclinica.org/ns/rules/v3.1}NotificationAction" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attGroup ref="{http://www.openclinica.org/ns/rules/v3.1}RuleRefAttributeType"/>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "RuleRefType", propOrder = {
    "discrepancyNoteAction",
    "emailAction",
    "showAction",
    "hideAction",
    "insertAction",
    "eventAction",
    "notificationAction"
})
public class RuleRefType {

    @XmlElement(name = "DiscrepancyNoteAction")
    protected List<DiscrepancyNoteActionType> discrepancyNoteAction;
    @XmlElement(name = "EmailAction")
    protected List<EmailActionType> emailAction;
    @XmlElement(name = "ShowAction")
    protected List<ShowActionType> showAction;
    @XmlElement(name = "HideAction")
    protected List<HideActionType> hideAction;
    @XmlElement(name = "InsertAction")
    protected List<InsertActionType> insertAction;
    @XmlElement(name = "EventAction")
    protected List<EventActionType> eventAction;
    @XmlElement(name = "NotificationAction")
    protected List<NotificationActionType> notificationAction;
    @XmlAttribute(name = "OID", required = true)
    protected String oid;

    /**
     * Gets the value of the discrepancyNoteAction property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the discrepancyNoteAction property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getDiscrepancyNoteAction().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link DiscrepancyNoteActionType }
     * 
     * 
     */
    public List<DiscrepancyNoteActionType> getDiscrepancyNoteAction() {
        if (discrepancyNoteAction == null) {
            discrepancyNoteAction = new ArrayList<DiscrepancyNoteActionType>();
        }
        return this.discrepancyNoteAction;
    }

    /**
     * Gets the value of the emailAction property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the emailAction property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getEmailAction().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link EmailActionType }
     * 
     * 
     */
    public List<EmailActionType> getEmailAction() {
        if (emailAction == null) {
            emailAction = new ArrayList<EmailActionType>();
        }
        return this.emailAction;
    }

    /**
     * Gets the value of the showAction property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the showAction property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getShowAction().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ShowActionType }
     * 
     * 
     */
    public List<ShowActionType> getShowAction() {
        if (showAction == null) {
            showAction = new ArrayList<ShowActionType>();
        }
        return this.showAction;
    }

    /**
     * Gets the value of the hideAction property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the hideAction property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getHideAction().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link HideActionType }
     * 
     * 
     */
    public List<HideActionType> getHideAction() {
        if (hideAction == null) {
            hideAction = new ArrayList<HideActionType>();
        }
        return this.hideAction;
    }

    /**
     * Gets the value of the insertAction property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the insertAction property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getInsertAction().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link InsertActionType }
     * 
     * 
     */
    public List<InsertActionType> getInsertAction() {
        if (insertAction == null) {
            insertAction = new ArrayList<InsertActionType>();
        }
        return this.insertAction;
    }

    /**
     * Gets the value of the eventAction property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the eventAction property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getEventAction().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link EventActionType }
     * 
     * 
     */
    public List<EventActionType> getEventAction() {
        if (eventAction == null) {
            eventAction = new ArrayList<EventActionType>();
        }
        return this.eventAction;
    }

    /**
     * Gets the value of the notificationAction property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the notificationAction property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getNotificationAction().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link NotificationActionType }
     * 
     * 
     */
    public List<NotificationActionType> getNotificationAction() {
        if (notificationAction == null) {
            notificationAction = new ArrayList<NotificationActionType>();
        }
        return this.notificationAction;
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

}
