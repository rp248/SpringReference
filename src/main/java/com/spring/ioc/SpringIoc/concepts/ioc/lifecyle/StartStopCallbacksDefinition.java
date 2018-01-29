package com.spring.ioc.SpringIoc.concepts.ioc.lifecyle;

import com.spring.ioc.SpringIoc.concepts.AbstractConcept;

public class StartStopCallbacksDefinition extends AbstractConcept {

    public StartStopCallbacksDefinition(String beanDefinitionPath) {
        super(beanDefinitionPath);
    }

    @Override
    public void display() {
        /**
         * If Lifecycle.isRunning() returns true then Spring IoC container will call stop() callback.
         */
        applicationContext.registerShutdownHook();
    }

}
