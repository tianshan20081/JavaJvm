package com.gooker.javajvm.ch7jvmclzload;

/**
 * desc : JavaJvm com.gooker.javajvm.ch7jvmclzload
 * Created by : mz on 2017/9/14 10:24.
 */
public class SubClass extends SuperClass {
    static {
        System.out.println("SubClass Init !!!");
    }

    public static int age = 234;


}
