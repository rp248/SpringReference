package com.spring.ioc.SpringIoc.annotationconfig.beans;

public class JavaLanguage implements Language{
    @Override
    public String getLanguageName() {
        return "Java";
    }
}
