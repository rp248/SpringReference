package com.spring.ioc.SpringIoc.concepts.ioc.bean.customization;

import com.spring.ioc.SpringIoc.concepts.AbstractConcept;
import com.spring.ioc.SpringIoc.xmlconfig.beans.bean.customization.XmlCashPayment;

public class CustomizationPropertyPlaceholderConfigurer extends AbstractConcept {

    public CustomizationPropertyPlaceholderConfigurer(String beanDefinitionPath) {
        super(beanDefinitionPath);
    }

    @Override
    public void display() {
        XmlCashPayment xmlCashPayment = (XmlCashPayment) applicationContext.getBean("xmlCashPayment");
        showMessage(xmlCashPayment.getUrl());
        showMessage(xmlCashPayment.getVersion());
    }
}
