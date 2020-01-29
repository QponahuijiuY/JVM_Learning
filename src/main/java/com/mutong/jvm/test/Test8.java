package com.mutong.jvm.test;

/**
 * @description:
 * @Author: Mutong
 * @Date: 2020/1/27 11:38
 */
public class Test8 {
    public static void main(String[] args) {
        /*
           对于一个静态字段(包括变量和方法)来说,只有直接定义了该字段的类才会被初始化,
           并不表示对Child8的一个主动使用,而是对Parent8的一个主动使用,用到了它里面的静态字段
         */

        System.out.println(Child8.i);

        Child8.test();
    }
}

class Parent8{
    static int i = 3;
    static {
        System.out.println("parent8初始化代码块");
    }
    static void test(){
        System.out.println("测试代码块");
    }
}
class Child8 extends Parent8{
    /*
    这段代码没有被打印
     */
    static {
        System.out.println("child8初始化代码块");
    }
}
