package com.spring.ioc.SpringIoc.xmlconfig.beans;

public class XmlEmployeePrototype {

    private int id;
    private String name;

    public XmlEmployeePrototype() {
        System.out.println("XmlEmployeePrototype constructor invoked");
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
