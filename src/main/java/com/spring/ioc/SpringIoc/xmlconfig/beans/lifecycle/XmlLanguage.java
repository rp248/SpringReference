package com.spring.ioc.SpringIoc.xmlconfig.beans.lifecycle;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

public class XmlLanguage implements InitializingBean, DisposableBean{
    private int id;
    private String name;

    public XmlLanguage() {
        System.out.println("XmlLanguage Constructor invoked");
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    /**
     * called by Spring IoC container after bean is instantiated and
     * supplying dependencies to the bean.
     * @throws Exception
     */
    @Override
    public void afterPropertiesSet() throws Exception {
        System.out.println("XmlLanguage afterPropertiesSet() invoked");
    }

    /**
     * called by Spring IoC container before the bean destroyed; removing from the container.
     * @throws Exception
     */
    @Override
    public void destroy() throws Exception {
        System.out.println("XmlLanguage destroy() invoked");
    }
}
