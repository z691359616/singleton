package com.zd.singleton.lazy;

public class  LazySimpleSingletonTest {
    public static void main(String[] args) {

//        LazySimpleSingleton.getInstance();

        Thread t1 = new Thread(new ExectorThread());
        Thread t2 = new Thread(new ExectorThread());
        t1.start();
        t2.start();
        System.err.println("END");


    }
}
