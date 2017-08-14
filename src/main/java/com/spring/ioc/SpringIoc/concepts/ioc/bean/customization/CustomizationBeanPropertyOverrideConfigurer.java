package com.spring.ioc.SpringIoc.concepts.ioc.bean.customization;

import com.spring.ioc.SpringIoc.concepts.AbstractConcept;
import com.spring.ioc.SpringIoc.xmlconfig.beans.bean.customization.XmlCashPayment;

public class CustomizationBeanPropertyOverrideConfigurer extends AbstractConcept {

    public CustomizationBeanPropertyOverrideConfigurer(String beanDefinitionPath) {
        super(beanDefinitionPath);
    }

    @Override
    public void display() {
        XmlCashPayment xmlCashPayment = (XmlCashPayment) applicationContext.getBean("xmlCashPayment");
        showMessage(xmlCashPayment.getUrl());
        showMessage(xmlCashPayment.getVersion());
    }
}
