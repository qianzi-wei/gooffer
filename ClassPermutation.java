package com.offer;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;



/**
 * @program: GoOffer
 * @description: 输入一个字符串, 按字典序打印出该字符串中字符的所有排列。
 * 例如输入字符串abc,则打印出由字符a,b,c所能排列出来的所有字符串abc,acb,bac,bca,cab和cba。
 * @author: qianzi
 * @create: 2020-06-02 10:15
 */
public class ClassPermutation {
    static ArrayList<String> arrayList = new ArrayList<>();
    public static ArrayList<String> Permutation(String str) {
        if (str == null || str.trim().equals("")) return arrayList;
        char[] characters = str.toCharArray();
        Arrays.sort(characters);
        GetALL(characters, 0, characters.length - 1);
        Collections.sort(arrayList);
        for(int i = 0;i<arrayList.size();i++){
            if(i+1<arrayList.size()){
                if(arrayList.get(i) .equals(arrayList.get(i+1))){
                    arrayList.remove(i+1);
                }
            }
        }
        return arrayList;
    }

    private static void GetALL(char[] characters, int start, int end) {
        if (start == end) {
            arrayList.add(String.valueOf(characters));
            return;

        }
        for (int i = start; i <= end; i++) {
            swap(characters, i, start);
            GetALL(characters, start + 1, end);
            swap(characters, i, start);
        }

    }

    private static void swap(char[] c, int i, int j) {
        char temp = c[i];
        c[i] = c[j];
        c[j] = temp;
    }

    public static void main(String[] args) {
        String str = "aa";
        ArrayList<String> arrayList = Permutation(str);
        for (String s : arrayList) {
            System.out.println(s);
        }

    }


}
