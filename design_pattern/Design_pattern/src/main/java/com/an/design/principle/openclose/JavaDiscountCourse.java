package com.an.design.principle.openclose;

public class JavaDiscountCourse extends JavaCourse{
    public JavaDiscountCourse(Integer Id, String name, Double price) {
        super(Id, name, price);
    }

    public Double getDiscountPrice() {
        return super.getPrice() * 0.8;
    }

    @Override
    public Double getPrice() {
        return super.getPrice();
    }
}
