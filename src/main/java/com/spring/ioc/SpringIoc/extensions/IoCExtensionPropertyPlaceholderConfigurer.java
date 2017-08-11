package com.spring.ioc.SpringIoc.extensions;

import org.springframework.beans.factory.config.PropertyPlaceholderConfigurer;
import org.springframework.core.io.Resource;

import java.io.IOException;

public class IoCExtensionPropertyPlaceholderConfigurer extends PropertyPlaceholderConfigurer {

    @Override
    public void setLocations(Resource... locations) {
        super.setLocations(locations);
        System.out.println("setLocations");
        for (int i = 0; i < locations.length; i++) {
            System.out.println(locations[i].getFilename());
            try {
                String path = locations[i].getFile().getAbsolutePath();
                System.out.println(path);
            } catch (IOException e) {
                e.printStackTrace();
            }
        }

    }
}
