package com.spring.ioc.SpringIoc.concepts.ioc.classpathscanning;

import com.spring.ioc.SpringIoc.classpathscanning.beans.CPAddressComponent;
import com.spring.ioc.SpringIoc.classpathscanning.beans.CPCustomerComponent;
import com.spring.ioc.SpringIoc.classpathscanning.beans.CPOrganisationComponent;
import com.spring.ioc.SpringIoc.concepts.AbstractConcept;

public class AutoDetectAndRegisterBeans extends AbstractConcept{

    public AutoDetectAndRegisterBeans(String beanDefinitionPath) {
        super(beanDefinitionPath);
    }

    @Override
    public void display() {
        CPCustomerComponent customerComponent = applicationContext.getBean(CPCustomerComponent.class);
        CPOrganisationComponent organisationComponent = applicationContext.getBean(CPOrganisationComponent.class);
        CPAddressComponent addressComponent =applicationContext.getBean(CPAddressComponent.class);

        showMessage(customerComponent);
        showMessage(organisationComponent);
        showMessage(addressComponent);
    }
}
