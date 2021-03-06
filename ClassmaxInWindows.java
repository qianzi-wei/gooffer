package com.offer;

import java.util.ArrayList;

/**
 * @program: GoOffer
 * @description: 给定一个数组和滑动窗口的大小，找出所有滑动窗口里数值的最大值。
 * 例如，如果输入数组{2,3,4,2,6,2,5,1}及滑动窗口的大小3，那么一共存在6个滑动窗口，他们的最大值分别为{4,4,6,6,6,5}；
 * 针对数组{2,3,4,2,6,2,5,1}的滑动窗口有以下6个：
 * {[2,3,4],2,6,2,5,1}， {2,[3,4,2],6,2,5,1}， {2,3,[4,2,6],2,5,1}，
 * {2,3,4,[2,6,2],5,1}， {2,3,4,2,[6,2,5],1}， {2,3,4,2,6,[2,5,1]}。
 * @author: qianzi
 * @create: 2020-06-04 22:31
 */
public class ClassmaxInWindows {
    public ArrayList<Integer> maxInWindows(int[] num, int size) {
        ArrayList<Integer> arrayList = new ArrayList<>();
        if (num == null || size < 1 || num.length <= 0) return arrayList;
        for (int i = 0; i < num.length - size+1; i++) {
            int max = num[i];
            for (int j = i; j < i + size; j++) {
                if (num[j] > max) max = num[j];
            }
            arrayList.add(max);
        }
        return arrayList;
    }
}
