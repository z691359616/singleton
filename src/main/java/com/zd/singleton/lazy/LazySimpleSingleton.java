package com.zd.singleton.lazy;

public class LazySimpleSingleton {
    /**
     * 私有化构造
     * 创建
     */
    private static LazySimpleSingleton lazySingleton = null;

    private LazySimpleSingleton() {}

    //JDK1.6后对synchronized 优化了很多，但是还是存在一定的性能问题
    public synchronized static LazySimpleSingleton getInstance(){
        if(null == lazySingleton) {
            lazySingleton = new LazySimpleSingleton();
        }
        return lazySingleton;
    }


}
