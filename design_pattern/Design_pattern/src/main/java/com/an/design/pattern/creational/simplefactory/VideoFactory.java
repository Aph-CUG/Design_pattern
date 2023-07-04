package com.an.design.pattern.creational.simplefactory;

/**
 * 作为创建各种视频的工厂类
 */
public class VideoFactory {

    /**
     * 方法一
     */

//    public Video getVideo(String type) {
//        if("java".equalsIgnoreCase(type)) {
//            return new JavaVideo();
//        } else if("python".equalsIgnoreCase(type)) {
//            return new PythonVideo();
//        }
//        return null;
//    }

    /**
     * 方法二 利用反射机制
     */

    public Video getVideo(Class c) {
        Video video = null;
        try {
            video = (Video)Class.forName(c.getName()).newInstance();
        } catch (InstantiationException e) {
            throw new RuntimeException(e);
        } catch (IllegalAccessException e) {
             throw new RuntimeException(e);
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        }
        return video;

    }


}
