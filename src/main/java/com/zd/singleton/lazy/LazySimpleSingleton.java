package com.zd.singleton.lazy;

public class LazySimpleSingleton {
    /**
     * 私有化构造
     * 创建
     */
    private static LazySimpleSingleton lazySingleton = null;

    private LazySimpleSingleton() {}

    public static LazySimpleSingleton getInstance(){
        if(null == lazySingleton) {
            lazySingleton = new LazySimpleSingleton();
        }
        return lazySingleton;
    }


}
