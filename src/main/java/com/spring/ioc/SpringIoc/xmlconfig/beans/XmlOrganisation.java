package com.spring.ioc.SpringIoc.xmlconfig.beans;

import java.util.List;

public class XmlOrganisation {

    private int Id;
    private String name;

    private List<XmlEmployee> xmlEmployees;

    private XmlAddress xmlAddress;

    public XmlOrganisation() {
        System.out.println("XmlOrganisation Constructor invoked");
    }

    public int getId() {
        return Id;
    }

    public void setId(int id) {
        Id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<XmlEmployee> getXmlEmployees() {
        return xmlEmployees;
    }

    public void setXmlEmployees(List<XmlEmployee> xmlEmployees) {
        this.xmlEmployees = xmlEmployees;
    }

    public XmlAddress getXmlAddress() {
        return xmlAddress;
    }

    public void setXmlAddress(XmlAddress xmlAddress) {
        this.xmlAddress = xmlAddress;
    }

    public static XmlOrganisation createXmlOrganisation() {
        return new XmlOrganisation();
    }
}
