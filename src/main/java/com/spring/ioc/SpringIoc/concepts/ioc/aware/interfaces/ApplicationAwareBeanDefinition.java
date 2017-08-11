package com.spring.ioc.SpringIoc.concepts.ioc.aware.interfaces;

import com.spring.ioc.SpringIoc.concepts.AbstractConcept;

public class ApplicationAwareBeanDefinition extends AbstractConcept {

    public ApplicationAwareBeanDefinition(String beanDefinitionPath) {
        super(beanDefinitionPath);
    }

    @Override
    public void display() {

    }
}
