package com.offer;

/**
 * @program: GoOffer
 * @description: 将一个字符串转换成一个整数，要求不能使用字符串转换整数的库函数。 数值为0或者字符串不是一个合法的数值则返回0
 * @author: qianzi
 * @create: 2020-06-03 15:48
 */
public class ClassStrToInt {
    public static int StrToInt(String str) {
        if (str == null || str.trim().equals("")) return 0;
        int sum = 0;
        int f = 0;
        if (str.charAt(0) == '-') f = 1;
        for (int i = f; i < str.length(); i++) {
            char c = str.charAt(i);
            if (c == '+') continue;
            int a = c - '0';
            if (a < 0 || a > 9) return 0;
            sum = sum * 10 + a;
        }
        return f==1 ? -sum : sum;
    }

    public static void main(String[] args) {
        System.out.println(StrToInt("-2147483649"));
        System.out.println(Integer.MIN_VALUE);
        System.out.println(Integer.MAX_VALUE);
    }
}
