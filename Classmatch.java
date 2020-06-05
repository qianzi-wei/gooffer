package com.offer;

import com.sun.org.apache.xerces.internal.dom.PSVIAttrNSImpl;

/**
 * @program: GoOffer
 * @description: 请实现一个函数用来匹配包括'.'和'*'的正则表达式。
 * 模式中的字符'.'表示任意一个字符，而'*'表示它前面的字符可以出现任意次（包含0次）。
 * 在本题中，匹配是指字符串的所有字符匹配整个模式。
 * 例如，字符串"aaa"与模式"a.a"和"ab*ac*a"匹配，但是与"aa.a"和"ab*a"均不匹配
 * @author: qianzi
 * @create: 2020-06-03 16:56
 */
public class Classmatch {
    public static boolean match(char[] str, char[] pattern) {
        if (str == null || pattern == null) return false;
        if (str.length == 0 && pattern.length == 0) return true;
        return Gmatch(str, pattern, 0, 0);
    }

    public static boolean Gmatch(char[] s, char[] p, int i, int j) {
        if (i == s.length && j == p.length) return true;
        if (i < s.length && j == p.length) return false;
        if (j < p.length - 1 && p[j + 1] == '*') {
            if ((i < s.length && s[i] == p[j]) || (i < s.length && p[j] == '.')) {
                return Gmatch(s, p, i + 1, j + 2) || Gmatch(s, p, i, j + 2) || Gmatch(s, p, i + 1, j);
            } else {
                return Gmatch(s, p, i, j + 2);
            }
        }
        if ((i < s.length && s[i] == p[j]) || (i < s.length && p[j] == '.')) {
            return Gmatch(s, p, i + 1, j + 1);
        }
        return false;
    }

    public static void main(String[] args) {
        char[] a = {'a', 'a', 'a'};
        char[] b = {'a', 'b', '*', '.', 'a'};
        System.out.println(match(a, b));
    }
}
