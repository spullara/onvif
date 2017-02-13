
package org.onvif.ver10.device.wsdl;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for StorageType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="StorageType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="NFS"/>
 *     &lt;enumeration value="CIFS"/>
 *     &lt;enumeration value="CDMI"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "StorageType")
@XmlEnum
public enum StorageType {


    /**
     * NFS protocol
     * 
     */
    NFS,

    /**
     * CIFS protocol
     * 
     */
    CIFS,

    /**
     * CDMI protocol
     * 
     */
    CDMI;

    public String value() {
        return name();
    }

    public static StorageType fromValue(String v) {
        return valueOf(v);
    }

}
