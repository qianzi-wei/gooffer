package com.offer;

import com.sun.org.apache.xerces.internal.dom.PSVIAttrNSImpl;

/**
 * @program: GoOffer
 * @description: 输入一个整数，输出该数二进制表示中1的个数。其中负数用补码表示。
 * @author: qianzi
 * @create: 2020-05-29 09:29
 */
public class ClassNumberOf1 {
    public static int NumberOf1(int n) {
        int count = 0;
        while (n != 0) {
            count++;
            n = n & (n - 1);
            System.out.println(Integer.toBinaryString(n));
        }
        return count;
    }

    public static void main(String[] args) {
        int n = 123;
        System.out.println(NumberOf1(n));
        System.out.println(Integer.bitCount(n));
    }
}
