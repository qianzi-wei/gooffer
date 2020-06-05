package com.offer;

import java.util.Arrays;

/**
 * @program: GoOffer
 * @description: 数组中有一个数字出现的次数超过数组长度的一半，请找出这个数字。
 * 例如输入一个长度为9的数组{1,2,3,2,2,2,5,4,2}。由于数字2在数组中出现了5次，超过数组长度的一半，因此输出2。如果不存在则输出0。
 * @author: qianzi
 * @create: 2020-06-02 20:01
 */
public class ClassMoreThanHalfNum_Solution {
    public static int MoreThanHalfNum_Solution(int[] array) {
        if (array == null || array.length <= 0) return 0;
        if (array.length == 1) return array[0];
        Arrays.sort(array);
        int max = array.length / 2 + 1;
        int count = 1;
        int before = array[0];
        for (int i = 1; i < array.length; i++) {
            if (array[i] == before) count++;
            else {
                count = 1;
                before = array[i];
            }
            if (count >= max) return before;
        }
        return 0;
    }

    public static void main(String[] args) {
        int[] arr = {1,2,2,3,31,21,4,4,4,4,4,4};
        System.out.println(MoreThanHalfNum_Solution(arr));
    }
}
