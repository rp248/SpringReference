package com.spring.ioc.SpringIoc.annotationconfig.beans;

import org.springframework.beans.factory.annotation.Autowired;

public class TopRankLanguage {

    @Autowired
    private Language language;

    public Language getLanguage() {
        return language;
    }

    public void setLanguage(Language language) {
        this.language = language;
    }
}
