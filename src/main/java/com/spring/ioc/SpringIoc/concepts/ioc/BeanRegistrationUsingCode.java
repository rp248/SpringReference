package com.spring.ioc.SpringIoc.concepts.ioc;

import com.spring.ioc.SpringIoc.concepts.AbstractConcept;
import com.spring.ioc.SpringIoc.xmlconfig.beans.XmlEmployee;
import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.beans.factory.support.AbstractBeanDefinition;
import org.springframework.beans.factory.support.DefaultListableBeanFactory;
import org.springframework.beans.factory.support.GenericBeanDefinition;

public class BeanRegistrationUsingCode extends AbstractConcept {
    @Override
    public void display() {

        AbstractBeanDefinition xmlEmpBeanDefinition = new GenericBeanDefinition();
        xmlEmpBeanDefinition.setBeanClass(XmlEmployee.class);
        xmlEmpBeanDefinition.setScope(BeanDefinition.SCOPE_PROTOTYPE);

        /**
         * You must call refresh(); by calling this method we will inform spring to create
         * a BeanFactory, which is responsible for maintaining BeanDefinition objects.
         */
        applicationContext.refresh();

        DefaultListableBeanFactory beanFactory = (DefaultListableBeanFactory) applicationContext.getBeanFactory();
        beanFactory.registerBeanDefinition("xmlEmpBeanDefinitionUsingBean", xmlEmpBeanDefinition);

        XmlEmployee xmlEmployee = (XmlEmployee) applicationContext.getBean("xmlEmpBeanDefinitionUsingBean");

        boolean isSingleton = beanFactory.getBeanDefinition("xmlEmpBeanDefinitionUsingBean").isSingleton();
        String scope = beanFactory.getBeanDefinition("xmlEmpBeanDefinitionUsingBean").getScope();
        String name = beanFactory.getBeanDefinition("xmlEmpBeanDefinitionUsingBean").getBeanClassName();
        int role = beanFactory.getBeanDefinition("xmlEmpBeanDefinitionUsingBean").getRole();

        showMessage("XmlEmployee is singleton-"+String.valueOf(isSingleton));
        showMessage("XmlEmployee scope-"+scope);
        showMessage("XmlEmployee class name-"+name);
        showMessage("XmlEmployee role-"+String.valueOf(role));


    }
}
