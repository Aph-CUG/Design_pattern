package com.an.design.principle.dependenceinversion;

public class JavaCourse implements ICourse{
    @Override
    public void studyCourse() {
        System.out.println("geely在学习Java课程");
    }
}
