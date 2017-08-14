package com.spring.ioc.SpringIoc.annotationconfig.beans;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Required;

public class AnnotationCustomer {

    private int id;
    private String name;

    @Autowired
    private AnnotationOrganisation annotationOrganisation;
    private AnnotationAddress annotationAddress;

    public AnnotationCustomer() {
        System.out.println("AnnotationCustomer Constructor invoked");
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

    public AnnotationOrganisation getAnnotationOrganisation() {
        return annotationOrganisation;
    }

    @Required
    public void setAnnotationOrganisation(AnnotationOrganisation annotationOrganisation) {
        System.out.println("AnnotationCustomer-getAnnotationOrganisation() invoked");
        this.annotationOrganisation = annotationOrganisation;
    }

    public AnnotationAddress getAnnotationAddress() {
        return annotationAddress;
    }

    public void setAnnotationAddress(AnnotationAddress annotationAddress) {
        this.annotationAddress = annotationAddress;
    }
}
