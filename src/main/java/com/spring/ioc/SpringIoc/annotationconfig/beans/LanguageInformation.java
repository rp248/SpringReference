package com.spring.ioc.SpringIoc.annotationconfig.beans;

import com.spring.ioc.SpringIoc.customannotations.LanguageType;
import com.spring.ioc.SpringIoc.customannotations.Maintainer;
import org.springframework.beans.factory.annotation.Autowired;

public class LanguageInformation {

    @Autowired
    @com.spring.ioc.SpringIoc.customannotations.Language(type = LanguageType.STATICALLY_TYPED)
    private Language language;

    @Autowired
    @com.spring.ioc.SpringIoc.customannotations.LanguageMaintainer(name = Maintainer.JET_BRAINS)
    private LanguageMaintainer languageMaintainer;

    public Language getLanguage() {
        return language;
    }

    public void setLanguage(Language language) {
        this.language = language;
    }

    public LanguageMaintainer getLanguageMaintainer() {
        return languageMaintainer;
    }

    public void setLanguageMaintainer(LanguageMaintainer languageMaintainer) {
        this.languageMaintainer = languageMaintainer;
    }
}
