package com.spring.ioc.SpringIoc.annotationconfig.beans;

public class KotlinLanguage implements Language {

    @Override
    public String getLanguageName() {
        return "Kotlin";
    }
}
