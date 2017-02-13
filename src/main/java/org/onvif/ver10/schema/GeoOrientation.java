
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
import javax.xml.bind.annotation.XmlType;
import javax.xml.namespace.QName;


/**
 * <p>Java class for GeoOrientation complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="GeoOrientation">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;any maxOccurs="unbounded"/>
 *       &lt;/sequence>
 *       &lt;attribute name="roll" type="{http://www.w3.org/2001/XMLSchema}float" />
 *       &lt;attribute name="pitch" type="{http://www.w3.org/2001/XMLSchema}float" />
 *       &lt;attribute name="yaw" type="{http://www.w3.org/2001/XMLSchema}float" />
 *       &lt;anyAttribute/>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "GeoOrientation", propOrder = {
    "any"
})
public class GeoOrientation {

    @XmlAnyElement(lax = true)
    protected List<Object> any;
    @XmlAttribute(name = "roll")
    protected Float roll;
    @XmlAttribute(name = "pitch")
    protected Float pitch;
    @XmlAttribute(name = "yaw")
    protected Float yaw;
    @XmlAnyAttribute
    private Map<QName, String> otherAttributes = new HashMap<QName, String>();

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
     * Gets the value of the roll property.
     * 
     * @return
     *     possible object is
     *     {@link Float }
     *     
     */
    public Float getRoll() {
        return roll;
    }

    /**
     * Sets the value of the roll property.
     * 
     * @param value
     *     allowed object is
     *     {@link Float }
     *     
     */
    public void setRoll(Float value) {
        this.roll = value;
    }

    /**
     * Gets the value of the pitch property.
     * 
     * @return
     *     possible object is
     *     {@link Float }
     *     
     */
    public Float getPitch() {
        return pitch;
    }

    /**
     * Sets the value of the pitch property.
     * 
     * @param value
     *     allowed object is
     *     {@link Float }
     *     
     */
    public void setPitch(Float value) {
        this.pitch = value;
    }

    /**
     * Gets the value of the yaw property.
     * 
     * @return
     *     possible object is
     *     {@link Float }
     *     
     */
    public Float getYaw() {
        return yaw;
    }

    /**
     * Sets the value of the yaw property.
     * 
     * @param value
     *     allowed object is
     *     {@link Float }
     *     
     */
    public void setYaw(Float value) {
        this.yaw = value;
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
