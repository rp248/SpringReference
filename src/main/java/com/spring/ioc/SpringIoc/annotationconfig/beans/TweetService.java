package com.spring.ioc.SpringIoc.annotationconfig.beans;

import javax.annotation.Resource;

public class TweetService {

    private DataResource mysqlDataSource;
    private DataResource mongoDataSource;

    public DataResource getMysqlDataSource() {
        return mysqlDataSource;
    }

    //@Resource
    @Resource(name = "mysqlDataSource")
    public void setMysqlDataSource(DataResource mysqlDataSource) {
        this.mysqlDataSource = mysqlDataSource;
    }

    public DataResource getMongoDataSource() {
        return mongoDataSource;
    }

    //@Resource Spring IoC container will resolve the required bean using parameter name
    @Resource(name = "mongoDataSource")
    public void setMongoDataSource(DataResource mongoDataSource) {
        this.mongoDataSource = mongoDataSource;
    }

    public void saveData(String data) {
        mongoDataSource.save(data);
        mysqlDataSource.save(data);
    }
}
