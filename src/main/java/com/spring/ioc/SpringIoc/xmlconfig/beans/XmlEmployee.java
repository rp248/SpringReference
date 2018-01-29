package com.spring.ioc.SpringIoc.xmlconfig.beans;

public class XmlEmployee {

    private int Id;
    private String name;
    private String emailId;

    private XmlOrganisation xmlOrganisation;

    private XmlAddress xmlAddress;

    public XmlEmployee() {
        System.out.println("XmlEmployee Constructor invoked");
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

    public String getEmailId() {
        return emailId;
    }

    public void setEmailId(String emailId) {
        this.emailId = emailId;
    }

    public XmlOrganisation getXmlOrganisation() {
        return xmlOrganisation;
    }

    public void setXmlOrganisation(XmlOrganisation xmlOrganisation) {
        this.xmlOrganisation = xmlOrganisation;
        System.out.println("XmlEmployee-setXmlOrganisation invoked");
    }

    public XmlAddress getXmlAddress() {
        return xmlAddress;
    }

    public void setXmlAddress(XmlAddress xmlAddress) {
        this.xmlAddress = xmlAddress;
        System.out.println("XmlEmployee-setXmlAddress invoked");
    }
}
