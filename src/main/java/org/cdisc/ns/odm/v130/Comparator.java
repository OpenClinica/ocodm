//
// This file was generated by the Eclipse Implementation of JAXB, v3.0.0 
// See https://eclipse-ee4j.github.io/jaxb-ri 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2024.02.26 at 11:51:25 AM PKT 
//


package org.cdisc.ns.odm.v130;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for Comparator.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>
 * &lt;simpleType name="Comparator"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="LT"/&gt;
 *     &lt;enumeration value="LE"/&gt;
 *     &lt;enumeration value="GT"/&gt;
 *     &lt;enumeration value="GE"/&gt;
 *     &lt;enumeration value="EQ"/&gt;
 *     &lt;enumeration value="NE"/&gt;
 *     &lt;enumeration value="IN"/&gt;
 *     &lt;enumeration value="NOTIN"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "Comparator")
@XmlEnum
public enum Comparator {

    LT,
    LE,
    GT,
    GE,
    EQ,
    NE,
    IN,
    NOTIN;

    public String value() {
        return name();
    }

    public static Comparator fromValue(String v) {
        return valueOf(v);
    }

}
