package com.spring.ioc.SpringIoc.xmlconfig.beans;

public class XmlAddressEditor {
    private XmlAddress xmlAddress;
    private String line1;

    public void setXmlAddress(XmlAddress xmlAddress) {
        this.xmlAddress = xmlAddress;
        System.out.println("XmlAddressEditor-setXmlAddress() invoked by Spring Ioc container");
    }

    public XmlAddress getXmlAddress() {
        return this.xmlAddress;
    }

    public String getLine1() {
        return line1;
    }

    public void setLine1(String line1) {
        this.line1 = line1;
    }
}
