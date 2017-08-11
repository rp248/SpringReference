package com.spring.ioc.SpringIoc.concepts.ioc.bean.inheritance;

import com.spring.ioc.SpringIoc.concepts.AbstractConcept;
import com.spring.ioc.SpringIoc.xmlconfig.beans.bean.inheritance.XmlCustomer;

public class BeanInheritanceDefinition extends AbstractConcept {

    public BeanInheritanceDefinition(String beanDefinitionPath) {
        super(beanDefinitionPath);
    }

    @Override
    public void display() {
        XmlCustomer xmlCustomer = (XmlCustomer) applicationContext.getBean("xmlCustomer");
        XmlCustomer xmlMobileCustomer = (XmlCustomer) applicationContext.getBean("xmlMobileCustomer");
        XmlCustomer xmlTvCustomer = (XmlCustomer) applicationContext.getBean("xmlTvCustomer");

        String rating = "XmlCustomer's rating-"+xmlCustomer.getRating()+"||"+
                "XmlMobileCustomer's rating-"+xmlMobileCustomer.getRating()+"||"+
                "XmlTvCustomer's rating-"+xmlTvCustomer.getRating();


        String email = "XmlCustomer's email-"+xmlCustomer.getEmail()+"||"+
                "XmlMobileCustomer's email-"+xmlMobileCustomer.getEmail()+"||"+
                "XmlTvCustomer's email-"+xmlTvCustomer.getEmail();

        showMessage(rating);
        showMessage(email);
    }
}
