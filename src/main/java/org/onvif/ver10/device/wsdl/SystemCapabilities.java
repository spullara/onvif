
package org.onvif.ver10.device.wsdl;

import java.util.HashMap;
import java.util.Map;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAnyAttribute;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlType;
import javax.xml.namespace.QName;


/**
 * <p>Java class for SystemCapabilities complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="SystemCapabilities">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;attribute name="DiscoveryResolve" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *       &lt;attribute name="DiscoveryBye" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *       &lt;attribute name="RemoteDiscovery" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *       &lt;attribute name="SystemBackup" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *       &lt;attribute name="SystemLogging" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *       &lt;attribute name="FirmwareUpgrade" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *       &lt;attribute name="HttpFirmwareUpgrade" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *       &lt;attribute name="HttpSystemBackup" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *       &lt;attribute name="HttpSystemLogging" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *       &lt;attribute name="HttpSupportInformation" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *       &lt;attribute name="StorageConfiguration" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *       &lt;attribute name="MaxStorageConfigurations" type="{http://www.w3.org/2001/XMLSchema}int" />
 *       &lt;attribute name="GeoLocationEntries" type="{http://www.w3.org/2001/XMLSchema}int" />
 *       &lt;attribute name="AutoGeo" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;anyAttribute processContents='lax'/>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SystemCapabilities")
public class SystemCapabilities {

    @XmlAttribute(name = "DiscoveryResolve")
    protected Boolean discoveryResolve;
    @XmlAttribute(name = "DiscoveryBye")
    protected Boolean discoveryBye;
    @XmlAttribute(name = "RemoteDiscovery")
    protected Boolean remoteDiscovery;
    @XmlAttribute(name = "SystemBackup")
    protected Boolean systemBackup;
    @XmlAttribute(name = "SystemLogging")
    protected Boolean systemLogging;
    @XmlAttribute(name = "FirmwareUpgrade")
    protected Boolean firmwareUpgrade;
    @XmlAttribute(name = "HttpFirmwareUpgrade")
    protected Boolean httpFirmwareUpgrade;
    @XmlAttribute(name = "HttpSystemBackup")
    protected Boolean httpSystemBackup;
    @XmlAttribute(name = "HttpSystemLogging")
    protected Boolean httpSystemLogging;
    @XmlAttribute(name = "HttpSupportInformation")
    protected Boolean httpSupportInformation;
    @XmlAttribute(name = "StorageConfiguration")
    protected Boolean storageConfiguration;
    @XmlAttribute(name = "MaxStorageConfigurations")
    protected Integer maxStorageConfigurations;
    @XmlAttribute(name = "GeoLocationEntries")
    protected Integer geoLocationEntries;
    @XmlAttribute(name = "AutoGeo")
    protected String autoGeo;
    @XmlAnyAttribute
    private Map<QName, String> otherAttributes = new HashMap<QName, String>();

    /**
     * Gets the value of the discoveryResolve property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isDiscoveryResolve() {
        return discoveryResolve;
    }

    /**
     * Sets the value of the discoveryResolve property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setDiscoveryResolve(Boolean value) {
        this.discoveryResolve = value;
    }

    /**
     * Gets the value of the discoveryBye property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isDiscoveryBye() {
        return discoveryBye;
    }

    /**
     * Sets the value of the discoveryBye property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setDiscoveryBye(Boolean value) {
        this.discoveryBye = value;
    }

    /**
     * Gets the value of the remoteDiscovery property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isRemoteDiscovery() {
        return remoteDiscovery;
    }

    /**
     * Sets the value of the remoteDiscovery property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setRemoteDiscovery(Boolean value) {
        this.remoteDiscovery = value;
    }

    /**
     * Gets the value of the systemBackup property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isSystemBackup() {
        return systemBackup;
    }

    /**
     * Sets the value of the systemBackup property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setSystemBackup(Boolean value) {
        this.systemBackup = value;
    }

    /**
     * Gets the value of the systemLogging property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isSystemLogging() {
        return systemLogging;
    }

    /**
     * Sets the value of the systemLogging property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setSystemLogging(Boolean value) {
        this.systemLogging = value;
    }

    /**
     * Gets the value of the firmwareUpgrade property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isFirmwareUpgrade() {
        return firmwareUpgrade;
    }

    /**
     * Sets the value of the firmwareUpgrade property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setFirmwareUpgrade(Boolean value) {
        this.firmwareUpgrade = value;
    }

    /**
     * Gets the value of the httpFirmwareUpgrade property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isHttpFirmwareUpgrade() {
        return httpFirmwareUpgrade;
    }

    /**
     * Sets the value of the httpFirmwareUpgrade property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setHttpFirmwareUpgrade(Boolean value) {
        this.httpFirmwareUpgrade = value;
    }

    /**
     * Gets the value of the httpSystemBackup property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isHttpSystemBackup() {
        return httpSystemBackup;
    }

    /**
     * Sets the value of the httpSystemBackup property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setHttpSystemBackup(Boolean value) {
        this.httpSystemBackup = value;
    }

    /**
     * Gets the value of the httpSystemLogging property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isHttpSystemLogging() {
        return httpSystemLogging;
    }

    /**
     * Sets the value of the httpSystemLogging property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setHttpSystemLogging(Boolean value) {
        this.httpSystemLogging = value;
    }

    /**
     * Gets the value of the httpSupportInformation property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isHttpSupportInformation() {
        return httpSupportInformation;
    }

    /**
     * Sets the value of the httpSupportInformation property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setHttpSupportInformation(Boolean value) {
        this.httpSupportInformation = value;
    }

    /**
     * Gets the value of the storageConfiguration property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isStorageConfiguration() {
        return storageConfiguration;
    }

    /**
     * Sets the value of the storageConfiguration property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setStorageConfiguration(Boolean value) {
        this.storageConfiguration = value;
    }

    /**
     * Gets the value of the maxStorageConfigurations property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getMaxStorageConfigurations() {
        return maxStorageConfigurations;
    }

    /**
     * Sets the value of the maxStorageConfigurations property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setMaxStorageConfigurations(Integer value) {
        this.maxStorageConfigurations = value;
    }

    /**
     * Gets the value of the geoLocationEntries property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getGeoLocationEntries() {
        return geoLocationEntries;
    }

    /**
     * Sets the value of the geoLocationEntries property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setGeoLocationEntries(Integer value) {
        this.geoLocationEntries = value;
    }

    /**
     * Gets the value of the autoGeo property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAutoGeo() {
        return autoGeo;
    }

    /**
     * Sets the value of the autoGeo property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAutoGeo(String value) {
        this.autoGeo = value;
    }

    /**
     * Gets a map that contains attributes that aren't bound to any typed property on this class.
     * 
     * <p>
     * the map is keyed by the name of the attribute and 
     * the value is the string value of the attribute.
     * 
     * the map returned by this method is live, and you can add new attribute
     * by updating the map directly. Because of this design, there's no setter.
     * 
     * 
     * @return
     *     always non-null
     */
    public Map<QName, String> getOtherAttributes() {
        return otherAttributes;
    }

}
