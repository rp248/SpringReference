package com.spring.ioc.SpringIoc.annotationconfig.beans;

public class MongoDataSource implements DataResource {

    @Override
    public void save(String data) {
        System.out.println("Data is saved in Mongo DB");
    }
}
