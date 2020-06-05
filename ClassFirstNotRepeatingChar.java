package com.offer;

import java.util.LinkedHashMap;
import java.util.Map;

/**
 * @program: GoOffer
 * @description: 在一个字符串(0 < = 字符串长度 < = 10000 ， 全部由字母组成)中找到第一个只出现一次的字符,
 * 并返回它的位置, 如果没有则返回 -1（需要区分大小写）.（从0开始计数）
 * @author: qianzi
 * @create: 2020-06-03 09:22
 */
public class ClassFirstNotRepeatingChar {
    public static int FirstNotRepeatingChar(String str) {
        if (str == null || str.length() <= 0) return -1;
        LinkedHashMap<Character, Integer> hashMap = new LinkedHashMap<>();
        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);
            if (hashMap.containsKey(c)) {
                hashMap.put(c, -1);
            } else {
                hashMap.put(c, i);
            }
        }
        for (Map.Entry<Character, Integer> map : hashMap.entrySet()) {
            if (map.getValue() != -1) return map.getValue();
        }
        return -1;
    }

    public static void main(String[] args) {
        System.out.println(FirstNotRepeatingChar("mmmbbbna"));
    }
}
