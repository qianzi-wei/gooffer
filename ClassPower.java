package com.offer;

/**
 * @program: GoOffer
 * @description: 给定一个double类型的浮点数base和int类型的整数exponent。求base的exponent次方。
 * <p>
 * 保证base和exponent不同时为0
 * @author: qianzi
 * @create: 2020-05-29 09:38
 */
public class ClassPower {
    public static double Power(double base, int exponent) {
        if (base == 0 && exponent == 0) return 1;
        if (base == 0) return 0;
        if (exponent == 0) return 1;
        long p = Math.abs(exponent);
        double r = 1;
        while (p>0) {
            long b = p & 1;
            if (b == 1) r = r * base;
            base = base * base;
            p >>= 1;
        }
        return exponent > 0 ? r : 1 / r;
    }

    public static void main(String[] args) {
        System.out.println(Power(0.5, 14));
    }
}
