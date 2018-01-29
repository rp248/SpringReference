package com.spring.ioc.SpringIoc.xmlconfig.beans;

public class RelationCreator {
    private XmlOrganisation xmlOrganisation;
    private XmlEmployee xmlEmployee;

    public RelationCreator(XmlOrganisation xmlOrganisation, XmlEmployee xmlEmployee) {
        this.xmlOrganisation = xmlOrganisation;
        this.xmlEmployee = xmlEmployee;
        System.out.println("RelationCreator Constructor invoked");
    }

    public XmlOrganisation getXmlOrganisation() {
        return xmlOrganisation;
    }

    public void setXmlOrganisation(XmlOrganisation xmlOrganisation) {
        this.xmlOrganisation = xmlOrganisation;
    }

    public XmlEmployee getXmlEmployee() {
        return xmlEmployee;
    }

    public void setXmlEmployee(XmlEmployee xmlEmployee) {
        this.xmlEmployee = xmlEmployee;
    }
}
