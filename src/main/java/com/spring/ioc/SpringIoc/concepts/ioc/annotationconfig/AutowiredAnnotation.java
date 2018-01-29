package com.spring.ioc.SpringIoc.concepts.ioc.annotationconfig;

import com.spring.ioc.SpringIoc.annotationconfig.beans.AnnotationGame;
import com.spring.ioc.SpringIoc.annotationconfig.beans.AnnotationOrganisation;
import com.spring.ioc.SpringIoc.annotationconfig.beans.AnnotationPayment;
import com.spring.ioc.SpringIoc.concepts.AbstractConcept;

public class AutowiredAnnotation extends AbstractConcept {

    public AutowiredAnnotation(String beanDefinitionPath) {
        super(beanDefinitionPath);
    }

    @Override
    public void display() {
        AnnotationOrganisation organisation = (AnnotationOrganisation) applicationContext.getBean("annotationOrganisation");
        showMessage(organisation.getAnnotationAddress());

        AnnotationPayment AnnotationPayment = (AnnotationPayment) applicationContext.getBean("annotationPayment");
        showMessage(AnnotationPayment.getGateway());

        AnnotationGame game = applicationContext.getBean(AnnotationGame.class);
        showMessage(game.getPlayers().length);//output:3; we have 3 payer beans in xml definition.
        showMessage(game.getPlayerCollection().size());////output:3; we have 3 payer beans in xml definition.
    }

}
