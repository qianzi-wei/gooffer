package com.offer;

import java.util.ArrayList;
import java.util.Arrays;

/**
 * @program: GoOffer
 * @description: 输入一个递增排序的数组和一个数字S，在数组中查找两个数，使得他们的和正好是S，如果有多对数字的和等于S，输出两个数的乘积最小的。
 * @author: qianzi
 * @create: 2020-06-03 14:23
 */
public class ClassFindNumbersWithSum {
    public static ArrayList<Integer> FindNumbersWithSum(int[] array, int sum) {
        ArrayList<Integer> arrayList = new ArrayList<>();
        if (array == null || array.length < 2) return arrayList;
        int b = Arrays.binarySearch(array, sum);
        b = Math.abs(b);
        for (int i = 0; i < b - 1; i++) {
            for (int j = i + 1; j < b; j++) {
                if (array[i] + array[j] == sum) {
                    arrayList.add(array[i]);
                    arrayList.add(array[j]);
                    return arrayList;
                }
            }
        }
        return arrayList;
    }

    public static void main(String[] args) {
        int[] arr = {312,3,2,1,3,5,7,9,96,1,41,51,251,12,13,215,51,211,2};
        ArrayList<Integer> a = FindNumbersWithSum(arr,6);
        for (Integer integer : a) {
            System.out.println(integer);
        }
    }
}
