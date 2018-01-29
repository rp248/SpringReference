package com.spring.ioc.SpringIoc.concepts.ioc.aware.interfaces;

import com.spring.ioc.SpringIoc.concepts.AbstractConcept;

public class BeanAwareBeanDefinition extends AbstractConcept {

    public BeanAwareBeanDefinition(String beanDefinitionPath) {
        super(beanDefinitionPath);
    }

    @Override
    public void display() {
        /**
         * Observe logs
         */
    }
}
