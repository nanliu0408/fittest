//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, vhudson-jaxb-ri-2.1-833 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2014.02.10 at 12:49:15 PM CET 
//


package eu.fbk.se.fsm.cte;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for anonymous complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;attribute name="dontCare" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="true" type="{http://www.w3.org/2001/XMLSchema}string" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "")
@XmlRootElement(name = "Marks")
public class Marks {

    @XmlAttribute
    protected String dontCare;
    @XmlAttribute(name = "true")
    protected String _true;

    /**
     * Gets the value of the dontCare property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDontCare() {
        return dontCare;
    }

    /**
     * Sets the value of the dontCare property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDontCare(String value) {
        this.dontCare = value;
    }

    /**
     * Gets the value of the true property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTrue() {
        return _true;
    }

    /**
     * Sets the value of the true property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTrue(String value) {
        this._true = value;
    }

}
