//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.7 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2020.11.21 at 05:46:38 PM EST 
//


package org.cdisc.ns.odm.v130;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for DataType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="DataType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="integer"/>
 *     &lt;enumeration value="float"/>
 *     &lt;enumeration value="date"/>
 *     &lt;enumeration value="datetime"/>
 *     &lt;enumeration value="time"/>
 *     &lt;enumeration value="text"/>
 *     &lt;enumeration value="string"/>
 *     &lt;enumeration value="double"/>
 *     &lt;enumeration value="URI"/>
 *     &lt;enumeration value="boolean"/>
 *     &lt;enumeration value="hexBinary"/>
 *     &lt;enumeration value="base64Binary"/>
 *     &lt;enumeration value="hexFloat"/>
 *     &lt;enumeration value="base64Float"/>
 *     &lt;enumeration value="partialDate"/>
 *     &lt;enumeration value="partialTime"/>
 *     &lt;enumeration value="partialDatetime"/>
 *     &lt;enumeration value="durationDatetime"/>
 *     &lt;enumeration value="intervalDatetime"/>
 *     &lt;enumeration value="incompleteDatetime"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "DataType")
@XmlEnum
public enum DataType {

    @XmlEnumValue("integer")
    INTEGER("integer"),
    @XmlEnumValue("float")
    FLOAT("float"),
    @XmlEnumValue("date")
    DATE("date"),
    @XmlEnumValue("datetime")
    DATETIME("datetime"),
    @XmlEnumValue("time")
    TIME("time"),
    @XmlEnumValue("text")
    TEXT("text"),
    @XmlEnumValue("string")
    STRING("string"),
    @XmlEnumValue("double")
    DOUBLE("double"),
    URI("URI"),
    @XmlEnumValue("boolean")
    BOOLEAN("boolean"),
    @XmlEnumValue("hexBinary")
    HEX_BINARY("hexBinary"),
    @XmlEnumValue("base64Binary")
    BASE_64_BINARY("base64Binary"),
    @XmlEnumValue("hexFloat")
    HEX_FLOAT("hexFloat"),
    @XmlEnumValue("base64Float")
    BASE_64_FLOAT("base64Float"),
    @XmlEnumValue("partialDate")
    PARTIAL_DATE("partialDate"),
    @XmlEnumValue("partialTime")
    PARTIAL_TIME("partialTime"),
    @XmlEnumValue("partialDatetime")
    PARTIAL_DATETIME("partialDatetime"),
    @XmlEnumValue("durationDatetime")
    DURATION_DATETIME("durationDatetime"),
    @XmlEnumValue("intervalDatetime")
    INTERVAL_DATETIME("intervalDatetime"),
    @XmlEnumValue("incompleteDatetime")
    INCOMPLETE_DATETIME("incompleteDatetime");
    private final String value;

    DataType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static DataType fromValue(String v) {
        for (DataType c: DataType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
