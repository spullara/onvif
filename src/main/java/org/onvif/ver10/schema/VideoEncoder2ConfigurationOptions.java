
package org.onvif.ver10.schema;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAnyAttribute;
import javax.xml.bind.annotation.XmlAnyElement;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import javax.xml.namespace.QName;
import org.w3c.dom.Element;


/**
 * <p>Java class for VideoEncoder2ConfigurationOptions complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="VideoEncoder2ConfigurationOptions">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Encoding" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="QualityRange" type="{http://www.onvif.org/ver10/schema}FloatRange"/>
 *         &lt;element name="ResolutionsAvailable" type="{http://www.onvif.org/ver10/schema}VideoResolution2" maxOccurs="unbounded"/>
 *         &lt;element name="BitrateRange" type="{http://www.onvif.org/ver10/schema}IntRange"/>
 *         &lt;any processContents='lax' maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attribute name="GovLengthRange" type="{http://www.onvif.org/ver10/schema}IntAttrList" />
 *       &lt;attribute name="FrameRatesSupported" type="{http://www.onvif.org/ver10/schema}FloatAttrList" />
 *       &lt;attribute name="ProfilesSupported" type="{http://www.onvif.org/ver10/schema}StringAttrList" />
 *       &lt;attribute name="ConstantBitRateSupported" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *       &lt;anyAttribute processContents='lax'/>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "VideoEncoder2ConfigurationOptions", propOrder = {
    "encoding",
    "qualityRange",
    "resolutionsAvailable",
    "bitrateRange",
    "any"
})
public class VideoEncoder2ConfigurationOptions {

    @XmlElement(name = "Encoding", required = true)
    protected String encoding;
    @XmlElement(name = "QualityRange", required = true)
    protected FloatRange qualityRange;
    @XmlElement(name = "ResolutionsAvailable", required = true)
    protected List<VideoResolution2> resolutionsAvailable;
    @XmlElement(name = "BitrateRange", required = true)
    protected IntRange bitrateRange;
    @XmlAnyElement(lax = true)
    protected List<Object> any;
    @XmlAttribute(name = "GovLengthRange")
    protected List<Integer> govLengthRange;
    @XmlAttribute(name = "FrameRatesSupported")
    protected List<Float> frameRatesSupported;
    @XmlAttribute(name = "ProfilesSupported")
    protected List<String> profilesSupported;
    @XmlAttribute(name = "ConstantBitRateSupported")
    protected Boolean constantBitRateSupported;
    @XmlAnyAttribute
    private Map<QName, String> otherAttributes = new HashMap<QName, String>();

    /**
     * Gets the value of the encoding property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEncoding() {
        return encoding;
    }

    /**
     * Sets the value of the encoding property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEncoding(String value) {
        this.encoding = value;
    }

    /**
     * Gets the value of the qualityRange property.
     * 
     * @return
     *     possible object is
     *     {@link FloatRange }
     *     
     */
    public FloatRange getQualityRange() {
        return qualityRange;
    }

    /**
     * Sets the value of the qualityRange property.
     * 
     * @param value
     *     allowed object is
     *     {@link FloatRange }
     *     
     */
    public void setQualityRange(FloatRange value) {
        this.qualityRange = value;
    }

    /**
     * Gets the value of the resolutionsAvailable property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the resolutionsAvailable property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getResolutionsAvailable().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link VideoResolution2 }
     * 
     * 
     */
    public List<VideoResolution2> getResolutionsAvailable() {
        if (resolutionsAvailable == null) {
            resolutionsAvailable = new ArrayList<VideoResolution2>();
        }
        return this.resolutionsAvailable;
    }

    /**
     * Gets the value of the bitrateRange property.
     * 
     * @return
     *     possible object is
     *     {@link IntRange }
     *     
     */
    public IntRange getBitrateRange() {
        return bitrateRange;
    }

    /**
     * Sets the value of the bitrateRange property.
     * 
     * @param value
     *     allowed object is
     *     {@link IntRange }
     *     
     */
    public void setBitrateRange(IntRange value) {
        this.bitrateRange = value;
    }

    /**
     * Gets the value of the any property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the any property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAny().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Element }
     * {@link Object }
     * 
     * 
     */
    public List<Object> getAny() {
        if (any == null) {
            any = new ArrayList<Object>();
        }
        return this.any;
    }

    /**
     * Gets the value of the govLengthRange property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the govLengthRange property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getGovLengthRange().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Integer }
     * 
     * 
     */
    public List<Integer> getGovLengthRange() {
        if (govLengthRange == null) {
            govLengthRange = new ArrayList<Integer>();
        }
        return this.govLengthRange;
    }

    /**
     * Gets the value of the frameRatesSupported property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the frameRatesSupported property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getFrameRatesSupported().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Float }
     * 
     * 
     */
    public List<Float> getFrameRatesSupported() {
        if (frameRatesSupported == null) {
            frameRatesSupported = new ArrayList<Float>();
        }
        return this.frameRatesSupported;
    }

    /**
     * Gets the value of the profilesSupported property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the profilesSupported property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getProfilesSupported().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getProfilesSupported() {
        if (profilesSupported == null) {
            profilesSupported = new ArrayList<String>();
        }
        return this.profilesSupported;
    }

    /**
     * Gets the value of the constantBitRateSupported property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isConstantBitRateSupported() {
        return constantBitRateSupported;
    }

    /**
     * Sets the value of the constantBitRateSupported property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setConstantBitRateSupported(Boolean value) {
        this.constantBitRateSupported = value;
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
