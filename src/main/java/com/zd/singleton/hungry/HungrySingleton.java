package com.zd.singleton.hungry;

/**
 * zhangda  2019/4/18
 **/
public class HungrySingleton {

    private static  final  HungrySingleton hungrySingleton = new HungrySingleton();
    private HungrySingleton() {}
    public static HungrySingleton getInstance(){
        return hungrySingleton;
    }
}
