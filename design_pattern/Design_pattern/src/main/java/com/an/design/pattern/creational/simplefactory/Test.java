package com.an.design.pattern.creational.simplefactory;

public class Test {
    //简单工厂模式（不符合开闭原则）
    public static void main(String[] args) {
//        VideoFactory videoFactory = new VideoFactory();
//        Video video = videoFactory.getVideo("java");
//        if(video == null) {
//            return;
//        }
//        video.produce();

        VideoFactory videoFactory = new VideoFactory();
        Video video = videoFactory.getVideo(JavaVideo.class);
        if(video == null) {
            return;
        }
        video.produce();
    }
}
