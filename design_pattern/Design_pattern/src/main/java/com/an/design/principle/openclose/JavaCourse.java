package com.an.design.principle.openclose;

public class JavaCourse implements ICourse{

    public JavaCourse(Integer Id, String name, Double price) {
        this.Id = Id;
        this.name = name;
        this.price = price;
    }

    private Integer Id;

    private String name;
    private Double price;

    @Override
    public Integer getId() {
        return this.Id;
    }

    @Override
    public String getName() {
        return this.name;
    }

    @Override
    public Double getPrice() {
        return this.price;
    }


}
