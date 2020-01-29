package com.mutong.jvm.test;

/**
 * @description:
 * @Author: Mutong
 * @Date: 2020/1/25 13:33
 */
public class Test6 {
    public static void main(String[] args) {
        System.out.println(Child6.i);
    }
}
interface Parent6{
    int i = 1;
}
interface Child6 extends Parent6 {

    int j = 2;
}
