package com.zd.singleton.hungry;

/**
 * zhangda  2019/4/18
 **/
public class HungryStaticSingleton {
    private static final HungryStaticSingleton hungryStaticSingletom;
    static{
        hungryStaticSingletom = new HungryStaticSingleton();
    }
    public static HungryStaticSingleton getInstance(){
        return hungryStaticSingletom;
    }
}
