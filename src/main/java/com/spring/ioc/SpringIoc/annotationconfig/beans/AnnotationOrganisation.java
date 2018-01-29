package com.spring.ioc.SpringIoc.annotationconfig.beans;

import org.springframework.beans.factory.annotation.Autowired;

public class AnnotationOrganisation {
    private int id;
    private String name;

    @Autowired
    private AnnotationAddress annotationAddress;

    public AnnotationOrganisation() {
        System.out.println("AnnotationOrganisation constructor invoked");
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

    public AnnotationAddress getAnnotationAddress() {
        return annotationAddress;
    }

    //@Autowired
    public void setAnnotationAddress(AnnotationAddress annotationAddress) {
        this.annotationAddress = annotationAddress;
    }
}
