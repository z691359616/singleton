package com.zd.singleton.lazy;

/**
 * zhangda  2019/4/24
 **/
//性能最优的一种写法，没有用到synchronized
public class LazyInnerClassSingleton {
    private LazyInnerClassSingleton(){
        if(LazyHolder.LAZY != null)
            throw new RuntimeException("不允许勾践多个实例");
    }
    //懒汉式单例
    //LazyHolder里面逻辑需要等到外部方法调用时才会执行
    //巧妙利用了内部类的特性
    //JVM底层执行逻辑，完美避免了线程安全问题
    public static LazyInnerClassSingleton getInstance(){
        return LazyHolder.LAZY;
    }
    private static class LazyHolder{
        private static final LazyInnerClassSingleton LAZY = new LazyInnerClassSingleton();
    }
}
