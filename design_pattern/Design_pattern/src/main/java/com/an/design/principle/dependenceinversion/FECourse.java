package com.an.design.principle.dependenceinversion;

public class FECourse implements ICourse{
    @Override
    public void studyCourse() {
        System.out.println("geely在学习前端课程");
    }
}
