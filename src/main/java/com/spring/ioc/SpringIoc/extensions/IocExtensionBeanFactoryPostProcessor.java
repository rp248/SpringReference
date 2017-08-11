package com.spring.ioc.SpringIoc.extensions;

import com.spring.ioc.SpringIoc.xmlconfig.beans.bean.customization.XmlGame;
import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.beans.factory.config.BeanFactoryPostProcessor;
import org.springframework.beans.factory.config.ConfigurableListableBeanFactory;

public class IocExtensionBeanFactoryPostProcessor implements BeanFactoryPostProcessor {

    @Override
    public void postProcessBeanFactory(ConfigurableListableBeanFactory beanFactory) throws BeansException {
        BeanDefinition xmlGameDefinition = beanFactory.getBeanDefinition("xmlGame");
        xmlGameDefinition.getPropertyValues().addPropertyValue("name", "Carroms");

        XmlGame xmlGame = (XmlGame) beanFactory.getBean("xmlGame");
        System.out.println(xmlGame.getName());
        System.out.println(xmlGame.getType());
    }
}
