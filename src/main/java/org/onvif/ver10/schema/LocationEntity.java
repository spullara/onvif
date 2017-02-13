
package org.onvif.ver10.schema;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for LocationEntity complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="LocationEntity">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="GeoLocation" type="{http://www.onvif.org/ver10/schema}GeoLocation" minOccurs="0"/>
 *         &lt;element name="GeoOrientation" type="{http://www.onvif.org/ver10/schema}GeoOrientation" minOccurs="0"/>
 *         &lt;element name="LocalLocation" type="{http://www.onvif.org/ver10/schema}LocalLocation" minOccurs="0"/>
 *         &lt;element name="LocalOrientation" type="{http://www.onvif.org/ver10/schema}LocalOrientation" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attribute name="Entity" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="Token" type="{http://www.onvif.org/ver10/schema}ReferenceToken" />
 *       &lt;attribute name="Fixed" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *       &lt;attribute name="GeoSource" type="{http://www.w3.org/2001/XMLSchema}anyURI" />
 *       &lt;attribute name="AutoGeo" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "LocationEntity", propOrder = {
    "geoLocation",
    "geoOrientation",
    "localLocation",
    "localOrientation"
})
public class LocationEntity {

    @XmlElement(name = "GeoLocation")
    protected GeoLocation geoLocation;
    @XmlElement(name = "GeoOrientation")
    protected GeoOrientation geoOrientation;
    @XmlElement(name = "LocalLocation")
    protected LocalLocation localLocation;
    @XmlElement(name = "LocalOrientation")
    protected LocalOrientation localOrientation;
    @XmlAttribute(name = "Entity")
    protected String entity;
    @XmlAttribute(name = "Token")
    protected String token;
    @XmlAttribute(name = "Fixed")
    protected Boolean fixed;
    @XmlAttribute(name = "GeoSource")
    @XmlSchemaType(name = "anyURI")
    protected String geoSource;
    @XmlAttribute(name = "AutoGeo")
    protected Boolean autoGeo;

    /**
     * Gets the value of the geoLocation property.
     * 
     * @return
     *     possible object is
     *     {@link GeoLocation }
     *     
     */
    public GeoLocation getGeoLocation() {
        return geoLocation;
    }

    /**
     * Sets the value of the geoLocation property.
     * 
     * @param value
     *     allowed object is
     *     {@link GeoLocation }
     *     
     */
    public void setGeoLocation(GeoLocation value) {
        this.geoLocation = value;
    }

    /**
     * Gets the value of the geoOrientation property.
     * 
     * @return
     *     possible object is
     *     {@link GeoOrientation }
     *     
     */
    public GeoOrientation getGeoOrientation() {
        return geoOrientation;
    }

    /**
     * Sets the value of the geoOrientation property.
     * 
     * @param value
     *     allowed object is
     *     {@link GeoOrientation }
     *     
     */
    public void setGeoOrientation(GeoOrientation value) {
        this.geoOrientation = value;
    }

    /**
     * Gets the value of the localLocation property.
     * 
     * @return
     *     possible object is
     *     {@link LocalLocation }
     *     
     */
    public LocalLocation getLocalLocation() {
        return localLocation;
    }

    /**
     * Sets the value of the localLocation property.
     * 
     * @param value
     *     allowed object is
     *     {@link LocalLocation }
     *     
     */
    public void setLocalLocation(LocalLocation value) {
        this.localLocation = value;
    }

    /**
     * Gets the value of the localOrientation property.
     * 
     * @return
     *     possible object is
     *     {@link LocalOrientation }
     *     
     */
    public LocalOrientation getLocalOrientation() {
        return localOrientation;
    }

    /**
     * Sets the value of the localOrientation property.
     * 
     * @param value
     *     allowed object is
     *     {@link LocalOrientation }
     *     
     */
    public void setLocalOrientation(LocalOrientation value) {
        this.localOrientation = value;
    }

    /**
     * Gets the value of the entity property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEntity() {
        return entity;
    }

    /**
     * Sets the value of the entity property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEntity(String value) {
        this.entity = value;
    }

    /**
     * Gets the value of the token property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getToken() {
        return token;
    }

    /**
     * Sets the value of the token property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setToken(String value) {
        this.token = value;
    }

    /**
     * Gets the value of the fixed property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isFixed() {
        return fixed;
    }

    /**
     * Sets the value of the fixed property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setFixed(Boolean value) {
        this.fixed = value;
    }

    /**
     * Gets the value of the geoSource property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getGeoSource() {
        return geoSource;
    }

    /**
     * Sets the value of the geoSource property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setGeoSource(String value) {
        this.geoSource = value;
    }

    /**
     * Gets the value of the autoGeo property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isAutoGeo() {
        return autoGeo;
    }

    /**
     * Sets the value of the autoGeo property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setAutoGeo(Boolean value) {
        this.autoGeo = value;
    }

}
