package com.an.design.principle.compostionaggregation;

public class postgreSQLConnection extends DBConnection{
    @Override
    public String getConnection() {
        return "postgreSQL数据库连接";
    }
}
