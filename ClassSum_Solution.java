package com.offer;

/**
 * @program: GoOffer
 * @description: 求1+2+3+...+n，要求不能使用乘除法、for、while、if、else、switch、case等关键字及条件判断语句（A?B:C）。
 * @author: qianzi
 * @create: 2020-06-03 15:28
 */
public class ClassSum_Solution {
    public static int Sum_Solution(int n) {
        int sum = n;
        boolean ans = (n > 0) && (sum += Sum_Solution(n - 1)) > 0;
        return sum;
    }

    public static void main(String[] args) {
        System.out.println(Sum_Solution(10));
    }
}
