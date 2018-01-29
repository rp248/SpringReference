package com.spring.ioc.SpringIoc.xmlconfig.beans;

public class XmlEmployeeEditor {

    private XmlEmployee xmlEmployee;
    private int id;

    public XmlEmployeeEditor(XmlEmployee xmlEmployee, int id) {
        this.xmlEmployee = xmlEmployee;
        this.id = id;
    }

    public XmlEmployee getXmlEmployee() {
        return xmlEmployee;
    }

    public void setXmlEmployee(XmlEmployee xmlEmployee) {
        this.xmlEmployee = xmlEmployee;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
}
