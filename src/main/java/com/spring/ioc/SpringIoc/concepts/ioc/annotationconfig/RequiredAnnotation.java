package com.spring.ioc.SpringIoc.concepts.ioc.annotationconfig;

import com.spring.ioc.SpringIoc.annotationconfig.beans.AnnotationCustomer;
import com.spring.ioc.SpringIoc.concepts.AbstractConcept;

public class RequiredAnnotation extends AbstractConcept{

    public RequiredAnnotation(String beanDefinitionPath) {
        super(beanDefinitionPath);
    }

    @Override
    public void display() {
        String[] beanDefinitions = applicationContext.getBeanDefinitionNames();
        for (int i = 0; i <beanDefinitions.length ; i++) {
            showMessage(beanDefinitions[i]);
        }

        AnnotationCustomer annotationCustomer = applicationContext.getBean(AnnotationCustomer.class);
        showMessage(annotationCustomer.getAnnotationOrganisation());
    }
}
