package com.an.design.principle.openclose;

public interface ICourse {
    Integer getId();
    String getName();
    Double getPrice();

    // 接口中的函数不应该经常变动
    //Double getDiscountPrice();
}
