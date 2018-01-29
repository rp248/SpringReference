package com.spring.ioc.SpringIoc.annotationconfig.beans;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

public class AndroidNewLanguage {

    @Autowired
    @Qualifier("kotlinLanguage")
    private Language language;

    public Language getLanguage() {
        return language;
    }

    public void setLanguage(Language language) {
        this.language = language;
    }
}
