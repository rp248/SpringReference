package com.spring.ioc.SpringIoc.concepts;

import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.slf4j.LoggerFactory;
import ch.qos.logback.classic.Level;
import ch.qos.logback.classic.Logger;

public abstract class AbstractConcept implements Concept {

    protected ClassPathXmlApplicationContext applicationContext;

    public AbstractConcept(String beanDefinitionPath) {

        Logger root = (Logger)LoggerFactory.getLogger(Logger.ROOT_LOGGER_NAME);
        root.setLevel(Level.OFF);
        applicationContext = new ClassPathXmlApplicationContext(beanDefinitionPath);



    }

    public AbstractConcept() {
        applicationContext = new ClassPathXmlApplicationContext();
    }

    public void showMessage(Object o) {
        System.out.println(o);
    }

    public void showMessage(String message) {
        System.out.println(message);
    }
}
