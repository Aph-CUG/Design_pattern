package com.an.design.principle.compostionaggregation;

public class MysqlConnection extends DBConnection{
    @Override
    public String getConnection() {
        return "mysql数据库连接";
    }
}
