
package org.onvif.ver10.schema;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ProfileStatus complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ProfileStatus">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="ActiveConnections" type="{http://www.onvif.org/ver10/schema}ActiveConnection" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="Extension" type="{http://www.onvif.org/ver10/schema}ProfileStatusExtension" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ProfileStatus", propOrder = {
    "activeConnections",
    "extension"
})
public class ProfileStatus {

    @XmlElement(name = "ActiveConnections")
    protected List<ActiveConnection> activeConnections;
    @XmlElement(name = "Extension")
    protected ProfileStatusExtension extension;

    /**
     * Gets the value of the activeConnections property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the activeConnections property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getActiveConnections().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ActiveConnection }
     * 
     * 
     */
    public List<ActiveConnection> getActiveConnections() {
        if (activeConnections == null) {
            activeConnections = new ArrayList<ActiveConnection>();
        }
        return this.activeConnections;
    }

    /**
     * Gets the value of the extension property.
     * 
     * @return
     *     possible object is
     *     {@link ProfileStatusExtension }
     *     
     */
    public ProfileStatusExtension getExtension() {
        return extension;
    }

    /**
     * Sets the value of the extension property.
     * 
     * @param value
     *     allowed object is
     *     {@link ProfileStatusExtension }
     *     
     */
    public void setExtension(ProfileStatusExtension value) {
        this.extension = value;
    }

}
