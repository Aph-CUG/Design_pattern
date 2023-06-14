package com.an.design.principle.compostionaggregation;

public class Test {
    public static void main(String[] args) {
        ProductDAO productDAO = new ProductDAO();
        productDAO.setDbConnection(new postgreSQLConnection());
        productDAO.addProduct();
    }
}
