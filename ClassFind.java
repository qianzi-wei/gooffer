package com.offer;

/**
 * @program: GoOffer
 * @description: 在一个二维数组中（每个一维数组的长度相同），每一行都按照从左到右递增的顺序排序，每一列都按照从上到下递增的顺序排序。
 * 请完成一个函数，输入这样的一个二维数组和一个整数，判断数组中是否含有该整数。
 * @author: qianzi
 * @create: 2020-05-27 17:46
 */
public class ClassFind {
    public boolean Find(int target, int[][] array) {
        boolean find = false;
        if (array == null || array[0] == null) return find;
        int l = 0;
        int r = array[0].length - 1;
        while (l < array.length && r > -1) {
            if (array[l][r] < target) {
                l++;
            } else if (array[l][r] > target) {
                r--;
            } else {
                find = true;
                break;
            }
        }
        return find;
    }
}
