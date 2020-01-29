package com.mutong.jvm.test;

/**
 * @description:
 * @Author: Mutong
 * @Date: 2020/1/24 18:47
 */
public class Test4 {
    public static void main(String[] args) {
        Parent4[] p = new Parent4[3];
        System.out.println(p.getClass());
        System.out.println(p.getClass().getSuperclass());

    }
}
class Parent4{
    static {
        System.out.println("Parent4初始化代码块");
    }
}
