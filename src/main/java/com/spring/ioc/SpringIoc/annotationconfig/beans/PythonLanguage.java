package com.spring.ioc.SpringIoc.annotationconfig.beans;

public class PythonLanguage implements Language {

    @Override
    public String getLanguageName() {
        return "Python";
    }
}
