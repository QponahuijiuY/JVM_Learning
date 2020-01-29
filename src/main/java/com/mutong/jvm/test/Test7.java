package com.mutong.jvm.test;

/**
 * @description:
 * getClassLoader()用来返回加载该类的类加载器
 * "java.lang.String"是由根类加载器加载的,所有它的父类加载器为null.
 * "com.mutong.jvm.test.Test7"是我们自定义一个类,所以她的加载器是由系统应用加载器加载的
 * @Author: Mutong
 * @Date: 2020/1/27 10:45
 */
public class Test7 {
    public static void main(String[] args) throws ClassNotFoundException {
        Class<?> clazz = Class.forName("java.lang.String");
        System.out.println(clazz.getClassLoader());
        Class<?> clazz1 = Class.forName("com.mutong.jvm.test.Test7");
        System.out.println(clazz1.getClassLoader());
    }
}
class C{
}
