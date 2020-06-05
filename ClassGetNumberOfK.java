package com.offer;

import java.util.Arrays;

/**
 * @program: GoOffer
 * @description: 统计一个数字在排序数组中出现的次数。
 * @author: qianzi
 * @create: 2020-06-03 10:17
 */
public class ClassGetNumberOfK {
    public static int GetNumberOfK(int[] array, int k) {
        int t = Arrays.binarySearch(array, k);
        int count = 1;
        if (t >= 0) {
            int l = t - 1;
            int r = t + 1;
            for (; r < array.length; r++) {
                if (array[r] == k) count++;
                else break;
            }
            for (; l > -1; l--) {
                if (array[l] == k) count++;
                else break;
            }
            return count;
        } else return 0;
    }

    public static void main(String[] args) {
        int[] arr = {1,1,1,1,1,1, 2, 8, 10, 10,11};
        System.out.println(GetNumberOfK(arr,1));
    }
}
