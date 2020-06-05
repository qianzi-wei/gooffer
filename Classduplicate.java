package com.offer;

import javax.swing.plaf.nimbus.NimbusLookAndFeel;

/**
 * @program: GoOffer
 * @description: 题目描述
 * 在一个长度为n的数组里的所有数字都在0到n-1的范围内。 数组中某些数字是重复的，
 * 但不知道有几个数字是重复的。也不知道每个数字重复几次。请找出数组中任意一个重复的数字。
 * 例如，如果输入长度为7的数组{2,3,1,0,2,5,3}，那么对应的输出是第一个重复的数字2。
 * @author: qianzi
 * @create: 2020-05-27 17:26
 */
public class Classduplicate {
    /**
     * @author qianzi
     * @Description 第一种解法：一共n个数，而取值范围也是n，那么不重复只有对号入座
     * @Date 2020/5/27 17:37
     * @Param [numbers, length, duplication]
     * @Return boolean
     **/
    public boolean duplicate(int numbers[], int length, int[] duplication) {
        boolean[] b = new boolean[length];
        for (int i = 0; i < length; i++) {
            if (b[numbers[i]]) {
                duplication[0] = numbers[i];
                return true;
            }
        }
        return false;
    }

    /**
     * @author qianzi
     * @Description 用字符串的index和lastindex
     * @Date 2020/5/27 17:39
     * @Param [numbers, length, duplication]
     * @Return boolean
     **/
    public boolean duplicate2(int numbers[], int length, int[] duplication) {
        StringBuffer sb = new StringBuffer();
        for (int i = 0; i < length; i++) {
            sb.append(numbers[i] + "");
        }
        for (int i = 0; i < length; i++) {
            if (sb.indexOf(numbers[i] + "") != sb.lastIndexOf(numbers[i] + "")) {
                duplication[0] = numbers[i];
                return true;
            }
        }
        return false;
    }
}
