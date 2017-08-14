package com.spring.ioc.SpringIoc.extensions;

import org.springframework.beans.factory.config.PropertyOverrideConfigurer;
import org.springframework.core.io.Resource;

public class IoCExtenstionPropertyOverrideConfigurer extends PropertyOverrideConfigurer {

    @Override
    public void setLocations(Resource... locations) {
        super.setLocations(locations);
    }


}
