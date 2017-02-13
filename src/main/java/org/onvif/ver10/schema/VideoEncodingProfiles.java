
package org.onvif.ver10.schema;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for VideoEncodingProfiles.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="VideoEncodingProfiles">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="Simple"/>
 *     &lt;enumeration value="AdvancedSimple"/>
 *     &lt;enumeration value="Baseline"/>
 *     &lt;enumeration value="Main"/>
 *     &lt;enumeration value="Main10"/>
 *     &lt;enumeration value="Extended"/>
 *     &lt;enumeration value="High"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "VideoEncodingProfiles")
@XmlEnum
public enum VideoEncodingProfiles {

    @XmlEnumValue("Simple")
    SIMPLE("Simple"),
    @XmlEnumValue("AdvancedSimple")
    ADVANCED_SIMPLE("AdvancedSimple"),
    @XmlEnumValue("Baseline")
    BASELINE("Baseline"),
    @XmlEnumValue("Main")
    MAIN("Main"),
    @XmlEnumValue("Main10")
    MAIN_10("Main10"),
    @XmlEnumValue("Extended")
    EXTENDED("Extended"),
    @XmlEnumValue("High")
    HIGH("High");
    private final String value;

    VideoEncodingProfiles(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static VideoEncodingProfiles fromValue(String v) {
        for (VideoEncodingProfiles c: VideoEncodingProfiles.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
