package com.offer;

import com.sun.org.apache.xerces.internal.dom.PSVIAttrNSImpl;

/**
 * @program: GoOffer
 * @description: 请实现一个函数，将一个字符串中的每个空格替换成“%20”。例如，当字符串为We Are Happy.则经过替换之后的字符串为We%20Are%20Happy。
 * @author: qianzi
 * @create: 2020-05-27 18:05
 */
public class ClassreplaceSpace {
    public static String replaceSpace(StringBuffer str) {
        if (str == null || str.length() == 0) return "";
        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);
            if (c == ' ') str.replace(i, i + 1, "%20");
        }
        return str.toString();
    }

    public static void main(String[] args) {
        StringBuffer sb = new StringBuffer("heww  dsa ds");
        System.out.println(replaceSpace(sb));
    }
}