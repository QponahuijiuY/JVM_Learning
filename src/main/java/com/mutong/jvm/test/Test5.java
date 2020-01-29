package com.mutong.jvm.test;

/**
 * @description:
 * @Author: Mutong
 * @Date: 2020/1/25 13:08
 */

public class Test5 {
    public static void main(String[] args) {
        Parent5 p = new Parent5();

    }

}

class Parent5{

    static {
        int i = 0;
        System.out.println("i="+i);
    }
    static int i= 0;
}
