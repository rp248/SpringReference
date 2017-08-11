package com.spring.ioc.SpringIoc.concepts.ioc.bean.customization;

import com.spring.ioc.SpringIoc.concepts.AbstractConcept;

public class CustomizationBeanPostProcessor extends AbstractConcept {

    public CustomizationBeanPostProcessor(String beanDefinitionPath) {
        super(beanDefinitionPath);
    }

    @Override
    public void display() {
        /**
         * Observe logs
         */
    }
}
