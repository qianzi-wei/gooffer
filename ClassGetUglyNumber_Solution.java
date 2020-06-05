package com.offer;

import com.sun.javafx.geom.transform.Translate2D;

/**
 * @program: GoOffer
 * @description: 把只包含质因子2、3和5的数称作丑数（Ugly Number）。
 * 例如6、8都是丑数，但14不是，因为它包含质因子7。
 * 习惯上我们把1当做是第一个丑数。求按从小到大的顺序的第N个丑数。
 * @author: qianzi
 * @create: 2020-06-03 09:11
 */
public class ClassGetUglyNumber_Solution {
    public int GetUglyNumber_Solution(int index) {
        if (index <= 0) return 0;
        if (index < 7) return index;
        int a2 = 0, a3 = 0, a5 = 0, i;
        int[] res = new int[index];
        for (i = 1; i < index; i++) {
            res[i] = Math.min(res[a2] * 2, Math.min(res[a3] * 3, res[a5] * 5));
            if (res[i] == res[a2] * 2) a2++;
            if (res[i] == res[a3] * 3) a3++;
            if (res[i] == res[a5] * 5) a5++;
        }
        return res[index - 1];
    }
}
