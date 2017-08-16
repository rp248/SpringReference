package com.spring.ioc.SpringIoc.concepts.ioc.annotationconfig;

import com.spring.ioc.SpringIoc.annotationconfig.beans.LanguageInformation;
import com.spring.ioc.SpringIoc.concepts.AbstractConcept;

public class CustomQualifierAnnotation extends AbstractConcept {

    public CustomQualifierAnnotation(String beanDefinitionPath) {
        super(beanDefinitionPath);
    }

    @Override
    public void display() {
        LanguageInformation information = applicationContext.getBean(LanguageInformation.class);
        showMessage(information.getLanguage().getLanguageName());
        showMessage(information.getLanguageMaintainer().getMaintainerName());
    }
}
