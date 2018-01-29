package com.spring.ioc.SpringIoc.concepts.ioc;

import com.spring.ioc.SpringIoc.concepts.AbstractConcept;

public class DependsOnBeanDefinition extends AbstractConcept {

    public DependsOnBeanDefinition(String beanDefinitionPath) {
        super(beanDefinitionPath);
    }

    @Override
    public void display() {
        applicationContext.getBean("xmlEmployee");
    }
}
