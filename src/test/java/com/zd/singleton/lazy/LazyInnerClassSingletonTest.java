package com.zd.singleton.lazy;

import sun.applet.Main;

import java.lang.reflect.Constructor;

/**
 * zhangda  2019/4/24
 **/
public class LazyInnerClassSingletonTest {
    public static void main(String[] args) {
        try {
            Class<?> clazz = LazyInnerClassSingleton.class;
            Constructor c = clazz.getDeclaredConstructor(null);
            c.setAccessible(true);
            Object o1 = c.newInstance();
            Object o2 = LazyInnerClassSingleton.getInstance();
            System.err.println(o1==o2);




        }catch (Exception e){
            e.printStackTrace();
        }

    }
}
