package com.zd.singleton.lazy;

/**
 * zhangda  2019/4/18
 **/
public class ExectorThread implements Runnable{
    @Override
    public void run() {
        LazySimpleSingleton singleton = LazySimpleSingleton.getInstance();
        System.err.println(Thread.currentThread() + "" + singleton);
    }
}
