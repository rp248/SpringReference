package com.spring.ioc.SpringIoc.xmlconfig.beans.bean.customization;

public class XmlCashPayment {
    private String url;
    private String version;

    public XmlCashPayment() {
        System.out.println("XmlCashPayment Constructor invoked");
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getVersion() {
        return version;
    }

    public void setVersion(String version) {
        this.version = version;
    }
}
