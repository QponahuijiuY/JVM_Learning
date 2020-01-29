package com.mutong.jvm.test;

/**
 * @description:
 *常量在编译阶段会存入到调用这个常量的方法所在类的常量池中
 * 本质上,调用类并没有直接引用到定义常量的类,所以并不会触发定义常量类的初始化
 *
 * 这里指的是将常量存放到了Test2的常量池中,之后test2与parent2就没有任何的关系了
 * 甚至,可以将parent2的class文件删除
 * @Author: Mutong
 * @Date: 2020/1/24 15:57
 */
public class Test2 {
    public static void main(String[] args) {
        System.out.println(parent2.str);
    }
}
class parent2{
    public static final String str = "hello parent2";

    public static String str1 = null;
    static {
        System.out.println("parent2初始化代码块");
    }
}
