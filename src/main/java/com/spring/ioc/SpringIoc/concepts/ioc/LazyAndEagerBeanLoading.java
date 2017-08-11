package com.spring.ioc.SpringIoc.concepts.ioc;

import com.spring.ioc.SpringIoc.concepts.AbstractConcept;

public class LazyAndEagerBeanLoading extends AbstractConcept {

    public LazyAndEagerBeanLoading(String beanDefinitionPath) {
        super(beanDefinitionPath);
    }

    @Override
    public void display() {
        /**
         * XmlEmployee Constructor will be invoked. Observe Logs.
         */
        showMessage("====XmlEmployee Bean will be created while Spring Ioc container initialing====");

        showMessage("====XmlOrganisation Bean will be created after below request by the container====");

        /**
         * XmlOrganisation Constructor will be invoked. Observe Logs.
         */
        applicationContext.getBean("xmlOrganisation");
    }
}
