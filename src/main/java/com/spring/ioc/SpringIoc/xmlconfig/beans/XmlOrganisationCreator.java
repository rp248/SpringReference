package com.spring.ioc.SpringIoc.xmlconfig.beans;

public class XmlOrganisationCreator {

    public XmlOrganisation createXmlOrganisation(XmlAddress xmlAddress, String name) {
        XmlOrganisation xmlOrganisation = new XmlOrganisation();
        xmlOrganisation.setXmlAddress(xmlAddress);
        xmlOrganisation.setName(name);
        return xmlOrganisation;
    }
}
