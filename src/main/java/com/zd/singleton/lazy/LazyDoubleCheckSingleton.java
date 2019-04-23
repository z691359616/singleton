package com.zd.singleton.lazy;

public class LazyDoubleCheckSingleton {
    private static LazyDoubleCheckSingleton lazy = null;
    private LazyDoubleCheckSingleton(){}
    public static LazyDoubleCheckSingleton getInstance(){
        if(lazy == null){
            synchronized (LazyDoubleCheckSingleton.class) {
                lazy = new LazyDoubleCheckSingleton();
            }
        }
        return lazy;
    }
}
