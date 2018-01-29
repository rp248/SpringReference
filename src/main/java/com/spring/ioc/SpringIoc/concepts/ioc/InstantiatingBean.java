package com.spring.ioc.SpringIoc.concepts.ioc;

import com.spring.ioc.SpringIoc.concepts.AbstractConcept;
import com.spring.ioc.SpringIoc.xmlconfig.beans.XmlEmployee;
import com.spring.ioc.SpringIoc.xmlconfig.beans.XmlOrganisation;

public class InstantiatingBean extends AbstractConcept {

    public InstantiatingBean(String beanDefinitionPath) {
        super(beanDefinitionPath);
    }

    @Override
    public void display() {

        showMessage("============calling zero args constructor==============");
        XmlEmployee xmlEmployee = (XmlEmployee) applicationContext.getBean("xmlEmployee");
        showMessage(xmlEmployee);
        showMessage("============calling zero args constructor==============");

        showMessage("============calling static factory method of a bean to instantiate it==============");
        XmlOrganisation xmlOrganisation = (XmlOrganisation) applicationContext.getBean("xmlOrganisation");
        showMessage(xmlOrganisation);
        showMessage("============calling static factory method of a bean to instantiate it==============");

        showMessage("=========calling a service bean's factory method to instantiate a bean========");
        XmlOrganisation xmlOrg = (XmlOrganisation) applicationContext.getBean("xmlOrg");
        showMessage("=========calling a service bean's factory method to instantiate a bean========");

    }
}
