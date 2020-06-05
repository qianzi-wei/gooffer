package com.offer;

/**
 * @program: GoOffer
 * @description: 我们可以用2*1的小矩形横着或者竖着去覆盖更大的矩形。请问用n个2*1的小矩形无重叠地覆盖一个2*n的大矩形，总共有多少种方法？
 * <p>
 * 比如n=3时，2*3的矩形块有3种覆盖方法：
 * @author: qianzi
 * @create: 2020-05-29 09:05
 */
public class ClassRectCover {
    public int RectCover(int target) {
        if (target < 2) return target;
        int l = 1;
        int r = 1;
        int rec = 0;
        for (int i = 2; i <= target; i++) {
            rec = l + r;
            l = r;
            r = rec;
        }
        return rec;
    }
}
