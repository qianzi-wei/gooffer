package com.offer;

/**
 * @program: GoOffer
 * @description: 把一个数组最开始的若干个元素搬到数组的末尾，我们称之为数组的旋转。
 * 输入一个非递减排序的数组的一个旋转，输出旋转数组的最小元素。
 * 例如数组{3,4,5,1,2}为{1,2,3,4,5}的一个旋转，该数组的最小值为1。
 * NOTE：给出的所有元素都大于0，若数组大小为0，请返回0。
 * @author: qianzi
 * @create: 2020-05-28 10:31
 */
public class ClassminNumberInRotateArray {
    //其实本题的考点是二分查找，这样写显然不是很好。
    public int minNumberInRotateArray(int[] array) {
        if (array == null || array.length == 0) return 0;
        if (array.length == 1) return array[0];
        for (int i = 0; i < array.length - 1; i++) {
            if (array[i] > array[i + 1]) {
                return array[i + 1];
            } else if (i == array.length - 2) return array[0];
        }
        return 0;
    }

    //二分查找
    public int minNumberInRotateArray1(int[] array) {
        if (array == null || array.length == 0) return 0;
        int l = 0;
        int r = array.length - 1;
        int mid = 0;
        while (l < r) {
            mid = l + (r - l) / 2;
            if (array[mid] > array[r]) {
                l = mid + 1;
            } else if (array[mid] < array[r]) {
                r = mid;
            } else l++;
        }
        return array[l];
    }
}
