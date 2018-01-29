package com.spring.ioc.SpringIoc.annotationconfig.beans;

public class AnnotationPayment {
    private AnnotationGateway gateway;

    public AnnotationPayment(AnnotationGateway gateway) {
        this.gateway = gateway;
    }

    public AnnotationGateway getGateway() {
        return gateway;
    }

    public void setGateway(AnnotationGateway gateway) {
        this.gateway = gateway;
    }
}
