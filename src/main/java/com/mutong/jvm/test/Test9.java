package com.mutong.jvm.test;

/**
 * @description: 调用ClassLoader类的LoadClass方法加载一个类,并不是对类的主动使用,不会导致类的初始化.
 * @Author: Mutong
 * @Date: 2020/1/27 11:50
 */
class CL{
    static {
        System.out.println("CL初始化代码块");
    }
}
public class Test9 {
    public static void main(String[] args)throws Exception {
        ClassLoader classLoader = ClassLoader.getSystemClassLoader();
        Class<?> clazz = classLoader.loadClass("com.mutong.jvm.test.CL");
        System.out.println(clazz);
        System.out.println("____________________");
        /*
        反射是对类的主动使用,所以会输出CL的静态代码块
         */
        clazz = Class.forName("com.mutong.jvm.test.CL");
        System.out.println(clazz);
    }
}
