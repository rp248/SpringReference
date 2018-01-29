package com.spring.ioc.SpringIoc.concepts.ioc;

import com.spring.ioc.SpringIoc.concepts.AbstractConcept;
import com.spring.ioc.SpringIoc.xmlconfig.beans.lifecycle.XmlLanguage;

public class LifecycleCallbacksBeanDefinition extends AbstractConcept {

    public LifecycleCallbacksBeanDefinition(String beanDefinitionPath) {
        super(beanDefinitionPath);
    }

    @Override
    public void display() {
        XmlLanguage xmlLanguage = (XmlLanguage) applicationContext.getBean("xmlLanguage");
        applicationContext.registerShutdownHook();
        /**
         * Observe logs
         * Note: Its better to use init-method, destroy-method attributes of the bean element, as it
         * de-couples the code from spring API.
         * using InitializingBean, DisposableBean makes the code tightly couples with Spring API.
         *
         */
    }
}
