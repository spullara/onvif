
package org.onvif.ver10.schema;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAnyElement;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import org.w3c.dom.Element;


/**
 * <p>Java class for VideoSourceConfigurationOptionsExtension2 complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="VideoSourceConfigurationOptionsExtension2">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="SceneOrientationMode" type="{http://www.onvif.org/ver10/schema}SceneOrientationMode" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;any processContents='lax' namespace='http://www.onvif.org/ver10/schema' maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "VideoSourceConfigurationOptionsExtension2", propOrder = {
    "sceneOrientationMode",
    "any"
})
public class VideoSourceConfigurationOptionsExtension2 {

    @XmlElement(name = "SceneOrientationMode")
    @XmlSchemaType(name = "string")
    protected List<SceneOrientationMode> sceneOrientationMode;
    @XmlAnyElement(lax = true)
    protected List<Object> any;

    /**
     * Gets the value of the sceneOrientationMode property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the sceneOrientationMode property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSceneOrientationMode().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SceneOrientationMode }
     * 
     * 
     */
    public List<SceneOrientationMode> getSceneOrientationMode() {
        if (sceneOrientationMode == null) {
            sceneOrientationMode = new ArrayList<SceneOrientationMode>();
        }
        return this.sceneOrientationMode;
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

}
