package com.spring.ioc.SpringIoc.xmlconfig.beans.aware.interfaces;

import org.springframework.beans.factory.BeanNameAware;

public class XmlGatewayInfo implements BeanNameAware {

    private String url;
    private String userName;
    private String password;

    @Override
    public void setBeanName(String s) {
        System.out.println("XmlGatewayInfo bean name-"+s);
    }
}
