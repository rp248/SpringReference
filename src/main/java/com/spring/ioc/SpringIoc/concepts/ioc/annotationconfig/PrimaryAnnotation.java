package com.spring.ioc.SpringIoc.concepts.ioc.annotationconfig;

import com.spring.ioc.SpringIoc.annotationconfig.beans.TopRankLanguage;
import com.spring.ioc.SpringIoc.concepts.AbstractConcept;

public class PrimaryAnnotation extends AbstractConcept{

    public PrimaryAnnotation(String beanDefinitionPath) {
        super(beanDefinitionPath);
    }

    @Override
    public void display() {
        TopRankLanguage rankLanguage = applicationContext.getBean(TopRankLanguage.class);
        showMessage(rankLanguage.getLanguage().getLanguageName());
    }
}
