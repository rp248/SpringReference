package com.spring.ioc.SpringIoc.xmlconfig.beans;

public class XmlAddress {

    private int Id;
    private String line1;
    private String line2;
    private String line3;

    public XmlAddress() {
        System.out.println("XmlAddress Constructor invoked");
    }

    public int getId() {
        return Id;
    }

    public void setId(int id) {
        Id = id;
    }

    public String getLine1() {
        return line1;
    }

    public void setLine1(String line1) {
        this.line1 = line1;
    }

    public String getLine2() {
        return line2;
    }

    public void setLine2(String line2) {
        this.line2 = line2;
    }

    public String getLine3() {
        return line3;
    }

    public void setLine3(String line3) {
        this.line3 = line3;
    }
}
