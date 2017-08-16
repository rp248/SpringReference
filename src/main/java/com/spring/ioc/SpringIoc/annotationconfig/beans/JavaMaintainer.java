package com.spring.ioc.SpringIoc.annotationconfig.beans;

public class JavaMaintainer implements LanguageMaintainer {
    @Override
    public String getMaintainerName() {
        return "Oracle and OpenJDK Community";
    }
}
