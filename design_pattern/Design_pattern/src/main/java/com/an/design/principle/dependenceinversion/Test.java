package com.an.design.principle.dependenceinversion;

public class Test {
    public static void main(String[] args) {
//        Geely geely = new Geely();
//        //高层次模块不应该依赖
//        //geely.studyJavaCourse();
//        //geely.studyFECourse();
//
//        geely.studyCourse(new JavaCourse());
//        geely.studyCourse(new FECourse());

//        //构造器方式
//        Geely geely = new Geely(new JavaCourse());
//        geely.studyCourse();

          Geely geely = new Geely();
          geely.setICourse(new JavaCourse());
          geely.studyCourse();

          geely.setICourse(new FECourse());
          geely.studyCourse();




    }
}
