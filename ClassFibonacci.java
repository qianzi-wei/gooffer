package com.offer;

/**
 * @program: GoOffer
 * @description: 大家都知道斐波那契数列，现在要求输入一个整数n，请你输出斐波那契数列的第n项（从0开始，第0项为0，第1项是1）。
 * @author: qianzi
 * @create: 2020-05-29 08:39
 */
public class ClassFibonacci {
    public int Fibonacci(int n) {
        if (n < 2) return n;
        int one = 0;
        int two = 1;
        int fib = 0;
        for (int i = 2; i <= n; i++) {
            fib = one + two;
            one = two;
            two = fib;
        }
        return fib;
    }
}
