package com.spring.ioc.SpringIoc.concepts.ioc.annotationconfig;

import com.spring.ioc.SpringIoc.annotationconfig.beans.AndroidNewLanguage;
import com.spring.ioc.SpringIoc.concepts.AbstractConcept;

public class QualifierAnnotation extends AbstractConcept{

    public QualifierAnnotation(String beanDefinitionPath) {
        super(beanDefinitionPath);
    }

    @Override
    public void display() {
        AndroidNewLanguage newLanguage = applicationContext.getBean(AndroidNewLanguage.class);
        showMessage(newLanguage.getLanguage().getLanguageName());
    }
}
