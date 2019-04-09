package com.zd.singleton.lazy;

public class LazySingleton {
    /**
     * 私有化构造
     * 创建
     */
    private LazySingleton lazySingleton = null;

    private LazySingleton() {}

    public LazySingleton getInstance(){
        if(null == lazySingleton) {
            lazySingleton = new LazySingleton();
        }
        return lazySingleton;
    }


}
