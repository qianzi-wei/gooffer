package com.offer;

/**
 * @program: GoOffer
 * @description: 写一个函数，求两个整数之和，要求在函数体内不得使用+、-、*、/四则运算符号。
 * @author: qianzi
 * @create: 2020-06-03 15:39
 */
public class ClassAdd {
    public int Add(int num1, int num2) {
        while (num2 != 0) {
            int a = (num1 & num2) << 1;
            num1 = num1 ^ num2;
            num2 = a;
        }
        return num1;
    }
}
