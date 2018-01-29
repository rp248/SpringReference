package com.spring.ioc.SpringIoc.annotationconfig.beans;

public class MysqlDataSource implements DataResource {
    @Override
    public void save(String data) {
        System.out.println("Data saved in Mysql DB");
    }
}
