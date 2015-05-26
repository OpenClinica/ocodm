//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.7 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2015.05.26 at 11:39:25 AM EDT 
//


package org.cdisc.ns.odm.v130_api;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for MethodType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="MethodType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="Computation"/>
 *     &lt;enumeration value="Imputation"/>
 *     &lt;enumeration value="Transpose"/>
 *     &lt;enumeration value="Other"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "MethodType")
@XmlEnum
public enum MethodType {

    @XmlEnumValue("Computation")
    COMPUTATION("Computation"),
    @XmlEnumValue("Imputation")
    IMPUTATION("Imputation"),
    @XmlEnumValue("Transpose")
    TRANSPOSE("Transpose"),
    @XmlEnumValue("Other")
    OTHER("Other");
    private final String value;

    MethodType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static MethodType fromValue(String v) {
        for (MethodType c: MethodType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
