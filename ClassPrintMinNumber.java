package com.offer;

import java.util.Arrays;
import java.util.Comparator;

/**
 * @program: GoOffer
 * @description: 输入一个正整数数组，把数组里所有数字拼接起来排成一个数，打印能拼接出的所有数字中最小的一个。
 * 例如输入数组{3，32，321}，则打印出这三个数字能排成的最小数字为321323。
 * @author: qianzi
 * @create: 2020-06-02 23:43
 */
public class ClassPrintMinNumber {
    public String PrintMinNumber(int[] numbers) {
        if (numbers == null || numbers.length <= 0) return "";
        if (numbers.length == 1) return String.valueOf(numbers[0]);
        String[] strs = new String[numbers.length];
        for (int i = 0; i < numbers.length; i++) {
            strs[i] = String.valueOf(numbers[i]);
        }
        Arrays.sort(strs, new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                String a = o1 + o2;
                String b = o2 + o1;
                return a.compareTo(b);
            }
        });
        StringBuilder sb = new StringBuilder();
        for (String str : strs) {
            sb.append(str);
        }
        return sb.toString();
    }
}
