package com.an.design.principle.openclose;

public class Test {
    public static void main(String[] args) {
        ICourse iCourse = new JavaDiscountCourse(96, "SpringIoc实战", 100.0);
        JavaDiscountCourse javaCourse = (JavaDiscountCourse)iCourse;
        System.out.println("课程Id:" + javaCourse.getId() + ", 课程内容：" + javaCourse.getName() + ", 课程原价" +
                javaCourse.getDiscountPrice() + ", 课程价格：" + javaCourse.getPrice());
    }
}
