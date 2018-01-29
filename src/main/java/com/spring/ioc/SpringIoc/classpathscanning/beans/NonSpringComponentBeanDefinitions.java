package com.spring.ioc.SpringIoc.classpathscanning.beans;

import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;

@Component
public class NonSpringComponentBeanDefinitions {

    @Bean(value = {"customer", "base_customer", "generic_customer"})
    public NonSpringComponentCustomer createCustomer() {
        return new NonSpringComponentCustomer();
    }

    @Bean
    public NonSpringComponentCustomer createTVCustomer() {
        return new NonSpringComponentCustomer();
    }

    @Bean
    public NonSpringComponentOrganisation createOrganisation() {
        return new NonSpringComponentOrganisation();
    }

    @Bean
    public NonSpringComponentAddress createAddress() {
        return new NonSpringComponentAddress();
    }
}
