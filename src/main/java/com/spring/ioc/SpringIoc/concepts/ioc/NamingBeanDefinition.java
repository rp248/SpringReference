package com.spring.ioc.SpringIoc.concepts.ioc;

import com.spring.ioc.SpringIoc.concepts.AbstractConcept;
import com.spring.ioc.SpringIoc.xmlconfig.beans.XmlEmployee;
import com.spring.ioc.SpringIoc.xmlconfig.beans.XmlOrganisation;

public class NamingBeanDefinition extends AbstractConcept {

    public NamingBeanDefinition(String beanDefinitionPath) {
        super(beanDefinitionPath);
    }

    @Override
    public void display() {

        String[] names = applicationContext.getBeanDefinitionNames();
        for (int i = 0; i <names.length ; i++) {
            showMessage("Registered bean identifier with Ioc-"+names[i]);
        }

        String[] aliases = applicationContext.getAliases("xmlOrganisation");
        for (int i = 0; i <aliases.length ; i++) {
            showMessage("Alias name for xmlOrganisation bean identifier- "+aliases[i]);
        }



        showMessage("==========Retrieving using identifier===========================");
        XmlEmployee xmlEmployee = (XmlEmployee) applicationContext.getBean("xmlEmployee");
        XmlOrganisation xmlOrganisation = (XmlOrganisation) applicationContext.getBean("xmlOrganisation");

        showMessage(xmlEmployee);
        showMessage(xmlOrganisation);
        showMessage("==========Retrieving using identifier===========================");

        showMessage("==========Retrieving using aliases===========================");
        XmlOrganisation org = (XmlOrganisation) applicationContext.getBean("Org");
        XmlOrganisation xmlOrg = (XmlOrganisation) applicationContext.getBean("xmlOrg");
        XmlOrganisation organisation = (XmlOrganisation) applicationContext.getBean("Organisation");

        showMessage(org);
        showMessage(xmlOrg);
        showMessage(organisation);
        showMessage("==========Retrieving using aliases===========================");
    }
}
