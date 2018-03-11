package com.gooker.javajvm.ch7jvmclzload;

import org.junit.jupiter.api.Test;

/**
 * desc : JavaJvm com.gooker.javajvm.ch7jvmclzload
 * Created by : mz on 2017/9/14 10:23.
 */
public class NotInitialization {


    public static void main(String[] args) {

    }


    @Test
    public void test5() {
        System.out.println(ConstClass._HELLO_WORD);
    }


    @Test
    public void test1() {
        System.out.println(SubClass.value);

    }

    @Test
    public void test2() {
        System.out.println(SubClass.age);
    }

    @Test
    public void test3() {
        SuperClass[] superClasses = new SuperClass[10];
        System.out.println(superClasses.length);
    }

    @Test
    public void test4() {
        SubClass[] superClasses = new SubClass[10];
        System.out.println(superClasses.length);
    }

}
