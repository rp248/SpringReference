package com.spring.ioc.SpringIoc.concepts.ioc.annotationconfig;

import com.spring.ioc.SpringIoc.annotationconfig.beans.TweetService;
import com.spring.ioc.SpringIoc.concepts.AbstractConcept;

public class ResourceAnnotation extends AbstractConcept {

    public ResourceAnnotation(String beanDefinitionPath) {
        super(beanDefinitionPath);
    }

    @Override
    public void display() {
        TweetService service = applicationContext.getBean(TweetService.class);
        service.saveData("Spring Resource Annotation example");
    }
}
