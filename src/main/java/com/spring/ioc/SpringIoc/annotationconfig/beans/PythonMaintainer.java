package com.spring.ioc.SpringIoc.annotationconfig.beans;

public class PythonMaintainer implements LanguageMaintainer {
    @Override
    public String getMaintainerName() {
        return "Python Software Foundation";
    }
}
