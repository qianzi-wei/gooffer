package com.offer;

import java.util.ArrayList;

/**
 * @program: GoOffer
 * @description: 小明很喜欢数学, 有一天他在做数学作业时, 要求计算出9~16的和,他马上就写出了正确答案是100。
 * 但是他并不满足于此,他在想究竟有多少种连续的正数序列的和为100(至少包括两个数)。
 * 没多久,他就得到另一组连续正数和为100的序列:18,19,20,21,22。
 * 现在把问题交给你,你能不能也很快的找出所有和为S的连续正数序列? Good Luck!
 * @author: qianzi
 * @create: 2020-06-03 14:05
 */
public class ClassFindContinuousSequence {
    public static ArrayList<ArrayList<Integer>> FindContinuousSequence(int sum) {
        ArrayList<ArrayList<Integer>> arrayLists = new ArrayList<>();
        if (sum < 3) return arrayLists;
        int l = 1, r = 1;
        int temp = 0;
        for (; r < sum; r++) {
            temp = temp + r;
            while (temp > sum) {
                temp = temp - l;
                l++;
            }
            if (temp == sum) {
                ArrayList<Integer> arrayList = new ArrayList<>();
                for (int i = l; i <= r; i++) {
                    arrayList.add(i);
                }
                arrayLists.add(arrayList);
            }
        }
        return arrayLists;
    }

    public static void main(String[] args) {
        ArrayList<ArrayList<Integer>> arrayLists = FindContinuousSequence(100);
        for (ArrayList<Integer> arrayList : arrayLists) {
            for (Integer integer : arrayList) {
                System.out.print(integer+"   ");
            }
            System.out.println("");
        }
    }
}
