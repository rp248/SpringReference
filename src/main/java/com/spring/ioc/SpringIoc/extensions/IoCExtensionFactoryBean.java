package com.spring.ioc.SpringIoc.extensions;

import com.spring.ioc.SpringIoc.xmlconfig.beans.bean.customization.XmlGame;
import org.springframework.beans.factory.FactoryBean;
import org.springframework.lang.Nullable;

public class IoCExtensionFactoryBean implements FactoryBean<XmlGame> {

    @Nullable
    @Override
    public XmlGame getObject() throws Exception {
        return new XmlGame();
    }

    @Nullable
    @Override
    public Class<?> getObjectType() {
        return XmlGame.class;
    }

    @Override
    public boolean isSingleton() {
        return true;
    }
}
