package com.spring.ioc.SpringIoc.concepts.ioc.bean.customization;

import com.spring.ioc.SpringIoc.concepts.AbstractConcept;
import com.spring.ioc.SpringIoc.xmlconfig.beans.bean.customization.XmlGame;
import com.spring.ioc.SpringIoc.xmlconfig.beans.bean.customization.XmlPlayGround;

public class CustomizationFactoryBeanDefinition extends AbstractConcept{

    public CustomizationFactoryBeanDefinition(String beanDefinitionPath) {
        super(beanDefinitionPath);
    }

    @Override
    public void display() {
        XmlGame xmlGame1 = applicationContext.getBean(XmlPlayGround.class).getXmlGame();
        XmlGame xmlGame2 = applicationContext.getBean(XmlPlayGround.class).getXmlGame();

        showMessage(xmlGame1);
        showMessage(xmlGame2);

        /**
         * Change IoCExtensionFactoryBean.isSingleton() return value and
         * Observe logs
         *
         */
    }
}
