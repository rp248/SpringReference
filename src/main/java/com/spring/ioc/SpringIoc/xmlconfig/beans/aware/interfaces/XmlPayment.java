package com.spring.ioc.SpringIoc.xmlconfig.beans.aware.interfaces;

import org.springframework.beans.BeansException;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;

public class XmlPayment implements ApplicationContextAware {

    @Override
    public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
        XmlGatewayInfo xmlGatewayInfo = (XmlGatewayInfo) applicationContext
                .getBean("xmlGatewayInfo");
        System.out.println(xmlGatewayInfo);
    }
}
