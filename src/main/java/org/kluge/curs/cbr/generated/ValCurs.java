//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2015.10.16 at 05:30:21 PM MSK 
//


package org.kluge.curs.cbr.generated;

import javax.xml.bind.annotation.*;
import java.util.ArrayList;
import java.util.List;


/**
 * <p>Java class for anonymous complex type.
 * <p/>
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p/>
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Record" maxOccurs="unbounded" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="Nominal" type="{http://www.w3.org/2001/XMLSchema}byte"/>
 *                   &lt;element name="Value" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                 &lt;/sequence>
 *                 &lt;attribute name="Date" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                 &lt;attribute name="Id" type="{http://www.w3.org/2001/XMLSchema}string" />
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *       &lt;/sequence>
 *       &lt;attribute name="ID" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="DateRange1" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="DateRange2" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="name" type="{http://www.w3.org/2001/XMLSchema}string" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
        "record"
})
@XmlRootElement(name = "ValCurs")
public class ValCurs {

    @XmlElement(name = "Record")
    private List<ValCurs.Record> record;
    @XmlAttribute(name = "ID")
    private String id;
    @XmlAttribute(name = "DateRange1")
    private String dateRange1;
    @XmlAttribute(name = "DateRange2")
    private String dateRange2;
    @XmlAttribute(name = "name")
    private String name;

    /**
     * Gets the value of the record property.
     * <p/>
     * <p/>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the record property.
     * <p/>
     * <p/>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getRecord().add(newItem);
     * </pre>
     * <p/>
     * <p/>
     * <p/>
     * Objects of the following type(s) are allowed in the list
     * {@link ValCurs.Record }
     */
    public List<ValCurs.Record> getRecord() {
        if (record == null) {
            record = new ArrayList<ValCurs.Record>();
        }
        return this.record;
    }

    /**
     * Gets the value of the id property.
     *
     * @return possible object is
     * {@link String }
     */
    public String getID() {
        return id;
    }

    /**
     * Sets the value of the id property.
     *
     * @param value allowed object is
     *              {@link String }
     */
    public void setID(String value) {
        this.id = value;
    }

    /**
     * Gets the value of the dateRange1 property.
     *
     * @return possible object is
     * {@link String }
     */
    public String getDateRange1() {
        return dateRange1;
    }

    /**
     * Sets the value of the dateRange1 property.
     *
     * @param value allowed object is
     *              {@link String }
     */
    public void setDateRange1(String value) {
        this.dateRange1 = value;
    }

    /**
     * Gets the value of the dateRange2 property.
     *
     * @return possible object is
     * {@link String }
     */
    public String getDateRange2() {
        return dateRange2;
    }

    /**
     * Sets the value of the dateRange2 property.
     *
     * @param value allowed object is
     *              {@link String }
     */
    public void setDateRange2(String value) {
        this.dateRange2 = value;
    }

    /**
     * Gets the value of the name property.
     *
     * @return possible object is
     * {@link String }
     */
    public String getName() {
        return name;
    }

    /**
     * Sets the value of the name property.
     *
     * @param value allowed object is
     *              {@link String }
     */
    public void setName(String value) {
        this.name = value;
    }


    /**
     * <p>Java class for anonymous complex type.
     * <p/>
     * <p>The following schema fragment specifies the expected content contained within this class.
     * <p/>
     * <pre>
     * &lt;complexType>
     *   &lt;complexContent>
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *       &lt;sequence>
     *         &lt;element name="Nominal" type="{http://www.w3.org/2001/XMLSchema}byte"/>
     *         &lt;element name="Value" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *       &lt;/sequence>
     *       &lt;attribute name="Date" type="{http://www.w3.org/2001/XMLSchema}string" />
     *       &lt;attribute name="Id" type="{http://www.w3.org/2001/XMLSchema}string" />
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
            "nominal",
            "value"
    })
    public static class Record {

        @XmlElement(name = "Nominal")
        byte nominal;
        @XmlElement(name = "Value", required = true)
        String value;
        @XmlAttribute(name = "Date")
        String date;
        @XmlAttribute(name = "Id")
        String id;

        /**
         * Gets the value of the nominal property.
         */
        public byte getNominal() {
            return nominal;
        }

        /**
         * Sets the value of the nominal property.
         */
        public void setNominal(byte value) {
            this.nominal = value;
        }

        /**
         * Gets the value of the value property.
         *
         * @return possible object is
         * {@link String }
         */
        public String getValue() {
            return value;
        }

        /**
         * Sets the value of the value property.
         *
         * @param value allowed object is
         *              {@link String }
         */
        public void setValue(String value) {
            this.value = value;
        }

        /**
         * Gets the value of the date property.
         *
         * @return possible object is
         * {@link String }
         */
        public String getDate() {
            return date;
        }

        /**
         * Sets the value of the date property.
         *
         * @param value allowed object is
         *              {@link String }
         */
        public void setDate(String value) {
            this.date = value;
        }

        /**
         * Gets the value of the id property.
         *
         * @return possible object is
         * {@link String }
         */
        public String getId() {
            return id;
        }

        /**
         * Sets the value of the id property.
         *
         * @param value allowed object is
         *              {@link String }
         */
        public void setId(String value) {
            this.id = value;
        }

    }

}
