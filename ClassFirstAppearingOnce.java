package com.offer;

import sun.security.x509.CertificatePolicyMap;

/**
 * @program: GoOffer
 * @description: 请实现一个函数用来找出字符流中第一个只出现一次的字符。
 * 例如，当从字符流中只读出前两个字符"go"时，第一个只出现一次的字符是"g"。
 * 当从该字符流中读出前六个字符“google"时，第一个只出现一次的字符是"l"。
 * @author: qianzi
 * @create: 2020-06-03 22:17
 */
public class ClassFirstAppearingOnce {
    int count[] = new int[256];
    //Insert one char from stringstream
    int index = 1;

    public void Insert(char ch) {
        if (count[ch] == 0) {
            count[ch] = index++;
        } else {
            count[ch] = -1;
        }

    }

    //return the first appearence once char in current stringstream
    public char FirstAppearingOnce() {
        int max = Integer.MAX_VALUE;
        char c = '#';
        for (int i = 0; i < count.length; i++) {
            if (count[i] != 0 && count[i] != -1 && count[i] < max) {
                max = count[i];
                c = (char) i;
            }
        }
        return c;
    }
}
