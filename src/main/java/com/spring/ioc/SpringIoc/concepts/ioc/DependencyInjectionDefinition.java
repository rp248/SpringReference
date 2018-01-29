package com.spring.ioc.SpringIoc.concepts.ioc;

import com.spring.ioc.SpringIoc.concepts.AbstractConcept;
import com.spring.ioc.SpringIoc.xmlconfig.beans.*;

public class DependencyInjectionDefinition extends AbstractConcept {

    public DependencyInjectionDefinition(String beanDefinitionPath) {
        super(beanDefinitionPath);
    }

    @Override
    public void display() {

        RelationCreator relationCreator = (RelationCreator) applicationContext
                .getBean("relationCreator");
        XmlEmployee xmlEmployee = relationCreator.getXmlEmployee();
        showMessage(xmlEmployee);

        XmlEmployeeEditor xmlEmployeeEditor = (XmlEmployeeEditor) applicationContext
                .getBean("xmlEmployeeEditor");
        showMessage(String.valueOf(xmlEmployeeEditor.getId()));

        XmlAddressEditor xmlAddressEditor = (XmlAddressEditor) applicationContext
                .getBean("xmlAddressEditor");
        showMessage(xmlAddressEditor.getLine1());

        XmlOrganisation xmlOrganisation = (XmlOrganisation) applicationContext.getBean("xmlOrg");
        showMessage(xmlOrganisation.getName());

    }
}
