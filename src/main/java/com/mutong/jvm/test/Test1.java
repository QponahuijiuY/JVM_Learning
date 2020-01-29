package com.mutong.jvm.test;

/**
 * @description:
 * 对于一个静态字段来说,只有直接定义了该字段的类才会被初始化
 * 当一个类在初始化时,要求其父类全部都以及那个初始化完毕了
 * -XX:+TraceClassLoading ,用于追踪类的加载信息并打印出来
 * @Author: Mutong
 * @Date: 2020/1/24 15:22
 */
public class Test1 {
    public static void main(String[] args) {
        System.out.println(Parent2.str3);
    }
}
class Parent2{
    public static final String str3 = "hello Parent2";
    static {
        System.out.println("Parent2初始化代码块");
    }
}
class Parent1{
    public static String str1 = "hello parent1";
    static {
        System.out.println("parent1初始化代码块");
    }
}
class Child1 extends Parent1{
    public static String str2 = "hello child1";
    static {
        System.out.println("child1初始化代码块");
    }
}
