package com.zd.singleton.lazy;

public class LazyDoubleCheckSingleton {
    private volatile static LazyDoubleCheckSingleton lazy = null;
    private LazyDoubleCheckSingleton(){}
    //双重检查锁
    public static LazyDoubleCheckSingleton getInstance(){
        if(lazy == null){
            synchronized (LazyDoubleCheckSingleton.class) {
                if(lazy == null) {
                    lazy = new LazyDoubleCheckSingleton();
                    //CPU执行时会转换成JVM指令执行
                    //23可能会顺序不同，指令重排序问题，volatile
                    //1、new的时候分配内存空间给这个对象
                    //2、初始化对象
                    //3、将初始化好的对象和内存地址建立关联，赋值
                    //4、用户初次访问
                }
            }
        }
        return lazy;
    }
}
