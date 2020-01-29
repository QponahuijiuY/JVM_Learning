package com.mutong.jvm.test;

import java.util.UUID;

/**
 * @description:
 * 当一个常量的值比贵妃编译期间可以确定,那么这个值就不会放到调用类的常量池中,这时在运行程序时,会导致主动使用这个常量所在的类,显然会导致这个类被初始化
 * @Author: Mutong
 * @Date: 2020/1/24 18:16
 */
public class Test3 {
    public static void main(String[] args) {
        System.out.println(Parent3.str3);
    }
}
class Parent3{
    public static final String str3 = UUID.randomUUID().toString();
    static{
        System.out.println("Parent3初始化代码块");
    }
}
