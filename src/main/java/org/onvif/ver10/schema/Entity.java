
package org.onvif.ver10.schema;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for Entity.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="Entity">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="Device"/>
 *     &lt;enumeration value="VideoSource"/>
 *     &lt;enumeration value="AudioSource"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "Entity")
@XmlEnum
public enum Entity {

    @XmlEnumValue("Device")
    DEVICE("Device"),
    @XmlEnumValue("VideoSource")
    VIDEO_SOURCE("VideoSource"),
    @XmlEnumValue("AudioSource")
    AUDIO_SOURCE("AudioSource");
    private final String value;

    Entity(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static Entity fromValue(String v) {
        for (Entity c: Entity.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
