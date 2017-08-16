package com.spring.ioc.SpringIoc.annotationconfig.beans;

public class KotlinMaintainer implements LanguageMaintainer {
    @Override
    public String getMaintainerName() {
        return "JetBrains and Community";
    }
}
