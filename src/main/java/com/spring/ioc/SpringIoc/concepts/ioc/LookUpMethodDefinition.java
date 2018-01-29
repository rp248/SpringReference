package com.spring.ioc.SpringIoc.concepts.ioc;

import com.spring.ioc.SpringIoc.concepts.AbstractConcept;
import com.spring.ioc.SpringIoc.xmlconfig.beans.MethodInjectionManager;
import com.spring.ioc.SpringIoc.xmlconfig.beans.XmlEmployeePrototype;

public class LookUpMethodDefinition extends AbstractConcept {

    public LookUpMethodDefinition(String beanDefinitionPath) {
        super(beanDefinitionPath);
    }

    @Override
    public void display() {
        MethodInjectionManager injectionManager = (MethodInjectionManager) applicationContext
                .getBean("methodInjectionManager");
        XmlEmployeePrototype prototype1 = injectionManager.createXmlEmployeePrototype();
        XmlEmployeePrototype prototype2 = injectionManager.createXmlEmployeePrototype();

        showMessage(prototype1);
        showMessage(prototype2);

    }
}
