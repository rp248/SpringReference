package com.spring.ioc.SpringIoc.xmlconfig.beans;

public abstract class MethodInjectionManager {

    public XmlEmployeePrototype createXmlEmployeePrototype() {
        return createPrototypeXmlEmployee();
    }

    protected abstract XmlEmployeePrototype createPrototypeXmlEmployee();
}
