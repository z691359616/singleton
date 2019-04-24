package com.zd.singleton.lazy;

import com.zd.singleton.register.EnumSingleton;
import com.zd.singleton.seriable.SeriableSingleton;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.lang.reflect.Constructor;

/**
 * zhangda  2019/4/24
 **/
public class EnumSingletonTest {
    public static void main(String[] args) {

        EnumSingleton s1 = null;
        EnumSingleton s2 = EnumSingleton.getInstance();

        FileOutputStream fos = null;
        try {
//            fos = new FileOutputStream("EnumSingleton.obj");
//            ObjectOutputStream oos = new ObjectOutputStream(fos);
//            oos.writeObject(s2);
//            oos.flush();
//            oos.close();
//
//
//            FileInputStream fis = new FileInputStream("EnumSingleton.obj");
//            ObjectInputStream ois = new ObjectInputStream(fis);
//            s1 = (EnumSingleton)ois.readObject();
//            ois.close();
//
//            System.out.println(s1);
//            System.out.println(s2);
//            System.out.println(s1 == s2);


            Class<?> clazz = EnumSingleton.class;
            Constructor c = clazz.getDeclaredConstructor(String.class, int.class);
            c.setAccessible(true);
            EnumSingleton obj = (EnumSingleton)c.newInstance("zzz",33);
            System.err.println(obj);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
