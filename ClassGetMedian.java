package com.offer;

import java.util.*;

/**
 * @program: GoOffer
 * @description: 如何得到一个数据流中的中位数？
 * 如果从数据流中读出奇数个数值，那么中位数就是所有数值排序之后位于中间的数值。
 * 如果从数据流中读出偶数个数值，那么中位数就是所有数值排序之后中间两个数的平均值。
 * 我们使用Insert()方法读取数据流，使用GetMedian()方法获取当前读取数据的中位数。
 * @author: qianzi
 * @create: 2020-06-04 21:58
 */
public class ClassGetMedian {
    ArrayList<Integer> arrayList = new ArrayList<>();

    public void Insert(Integer num) {
       arrayList.add(num);
       Collections.sort(arrayList);
    }

    public Double GetMedian() {
        int len = arrayList.size();
        if(arrayList.size()%2==0){
            return ((double)arrayList.get(len / 2 - 1) + (double) arrayList.get(len / 2)) / 2;
        }
        else return Double.valueOf(arrayList.get(len/2));
    }
}
