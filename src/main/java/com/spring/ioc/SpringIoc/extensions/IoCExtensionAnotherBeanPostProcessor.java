package com.spring.ioc.SpringIoc.extensions;

import com.spring.ioc.SpringIoc.xmlconfig.beans.bean.customization.XmlGame;
import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanPostProcessor;
import org.springframework.core.Ordered;
import org.springframework.lang.Nullable;

public class IoCExtensionAnotherBeanPostProcessor implements BeanPostProcessor, Ordered{

    @Nullable
    @Override
    public Object postProcessBeforeInitialization(Object bean, String beanName) throws BeansException {
        System.out.println("IoCExtensionAnotherBeanPostProcessor-postProcessBeforeInitialization");
        if (bean instanceof XmlGame) {
            System.out.println(((XmlGame) bean).getName());
            System.out.println(((XmlGame) bean).getType());
        }

        return bean;
    }

    @Nullable
    @Override
    public Object postProcessAfterInitialization(Object bean, String beanName) throws BeansException {
        System.out.println("IoCExtensionAnotherBeanPostProcessor-postProcessAfterInitialization");
        if (bean instanceof XmlGame) {
            System.out.println(((XmlGame) bean).getName());
            System.out.println(((XmlGame) bean).getType());
        }
        return bean;
    }

    @Override
    public int getOrder() {
        return 1;
    }
}
