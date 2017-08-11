package com.spring.ioc.SpringIoc.xmlconfig.beans.bean.customization;

public class XmlGame {

    private String name;
    private String type;

    public XmlGame() {
        System.out.println("XmlGame Constructor invoked");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }
}
