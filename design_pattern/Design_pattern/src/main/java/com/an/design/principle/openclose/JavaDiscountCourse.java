package com.an.design.principle.openclose;

public class JavaDiscountCourse extends JavaCourse{
    public JavaDiscountCourse(Integer Id, String name, Double price) {
        super(Id, name, price);
    }

    public Double getOriginPrice() {
        return super.getPrice();
    }

    @Override
    public Double getPrice() {
        return super.getPrice() * 0.8;
    }
}
