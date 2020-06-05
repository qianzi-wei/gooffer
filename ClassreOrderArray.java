package com.offer;

import java.util.Collections;

/**
 * @program: GoOffer
 * @description: 输入一个整数数组，实现一个函数来调整该数组中数字的顺序，使得所有的奇数位于数组的前半部分，所有的偶数位于数组的后半部分，并保证奇数和奇数，偶数和偶数之间的相对位置不变。
 * @author: qianzi
 * @create: 2020-05-29 11:34
 */
public class ClassreOrderArray {
    public static void reOrderArray(int[] array) {
        int[] arr = new int[array.length];
        int j = 0;
        for (int i = 0; i < arr.length; i++) {
            if (isEven(array[i])) {
                arr[j] = array[i];
                j++;
            }
        }
        for (int i = 0; i < arr.length; i++) {
            if (!isEven(array[i])) {
                arr[j] = array[i];
                j++;
            }
            array[i] = arr[i];
        }
    }

    public static boolean isEven(int i) {
        if ((i & 1) == 1) return true;
        else return false;
    }

    public static void main(String[] args) {
        int[] a  = { 1,2,3,4,5,6};
        reOrderArray(a);
        for (int i : a) {
            System.out.println(i);
        }
    }
}
