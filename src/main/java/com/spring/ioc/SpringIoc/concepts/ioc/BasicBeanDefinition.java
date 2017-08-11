package com.spring.ioc.SpringIoc.concepts.ioc;

import com.spring.ioc.SpringIoc.concepts.AbstractConcept;
import com.spring.ioc.SpringIoc.xmlconfig.beans.XmlAddress;
import com.spring.ioc.SpringIoc.xmlconfig.beans.XmlEmployee;
import com.spring.ioc.SpringIoc.xmlconfig.beans.XmlOrganisation;

public class BasicBeanDefinition extends AbstractConcept {

    public BasicBeanDefinition(String beanDefinitionPath) {
        super(beanDefinitionPath);
    }

    @Override
    public void display() {

        showMessage("==========Retrieving beans from Ioc container using their class name=============");
        XmlAddress xmlAddress = applicationContext.getBean(XmlAddress.class);
        XmlOrganisation xmlOrganisation = applicationContext.getBean(XmlOrganisation.class);
        XmlEmployee xmlEmployee = applicationContext.getBean(XmlEmployee.class);
        showMessage(xmlAddress);
        showMessage(xmlOrganisation);
        showMessage(xmlEmployee);
        showMessage("==========Retrieving beans from Ioc container using their class name=============");

        showMessage("==========Retrieving beans from Ioc container using their id attribute=============");
        XmlAddress xmlAddress1 = (XmlAddress) applicationContext.getBean("xmlAddress");
        XmlOrganisation xmlOrganisation1 = (XmlOrganisation) applicationContext.getBean("xmlOrganisation");
        XmlEmployee xmlEmployee1 = (XmlEmployee) applicationContext.getBean("xmlEmployee");
        showMessage(xmlAddress1);
        showMessage(xmlOrganisation1);
        showMessage(xmlEmployee1);
        showMessage("==========Retrieving beans from Ioc container using their id attribute=============");
    }
}
