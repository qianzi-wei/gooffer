package com.offer;

/**
 * @program: GoOffer
 * @description: 一个整型数组里除了两个数字之外，其他的数字都出现了两次。请写程序找出这两个只出现一次的数字。
 * @author: qianzi
 * @create: 2020-06-03 13:49
 */
public class ClassFindNumsAppearOnce {
    public void FindNumsAppearOnce(int[] array, int num1[], int num2[]) {
        if (array == null || array.length < 2) return;
        int res = 0;
        for (int value : array) {
            res = res ^ value;
        }
        int Bit = 0;
        for (int i = 0; i < 32; i++) {
            if (((res >> i) & 1) == 1) {
                Bit = i;
                break;
            }
        }
        num1[0] = 0;
        num2[0] = 0;
        for (int value : array) {
            if (((value >> Bit) & 1) == 1) {
                num1[0] ^= value;
            } else {
                num2[0] ^= value;
            }
        }
    }
}
