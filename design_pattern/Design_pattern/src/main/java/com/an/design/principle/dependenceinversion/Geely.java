package com.an.design.principle.dependenceinversion;

public class Geely {
    //构造器方式
    private ICourse iCourse;
//    构造器模式
//    public Geely(ICourse iCourse) {
//        this.iCourse = iCourse;
//    }



    public void studyCourse() {
        iCourse.studyCourse();
    }

    public void setICourse(ICourse iCourse) {
        this.iCourse = iCourse;
    }
//    public void studyCourse(ICourse iCourse) {
//        iCourse.studyCourse();
//    }
}
