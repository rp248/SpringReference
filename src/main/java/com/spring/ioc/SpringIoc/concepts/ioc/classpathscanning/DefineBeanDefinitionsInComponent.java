package com.spring.ioc.SpringIoc.concepts.ioc.classpathscanning;

import com.spring.ioc.SpringIoc.concepts.AbstractConcept;

public class DefineBeanDefinitionsInComponent extends AbstractConcept {

    public DefineBeanDefinitionsInComponent(String beanDefinitionPath) {
        super(beanDefinitionPath);
    }

    @Override
    public void display() {
        applicationContext.getBean("customer");
    }
}
