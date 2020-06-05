package com.offer;

/**
 * @program: GoOffer
 * @description: 在数组中的两个数字，如果前面一个数字大于后面的数字，则这两个数字组成一个逆序对。
 * 输入一个数组,求出这个数组中的逆序对的总数P。并将P对1000000007取模的结果输出。 即输出P%1000000007
 * @author: qianzi
 * @create: 2020-06-03 09:52
 */
public class ClassInversePairs {
    //暴力解法---未通过
    public int InversePairs(int[] array) {
        if (array == null || array.length < 2) return 0;
        int count = 0;
        for (int i = 0; i < array.length - 1; i++) {
            for (int j = i + 1; j < array.length; j++) {
                if (array[i] > array[j]) count++;
                if (count > 1000000007) count = count % 1000000007;
            }
        }
        return count;
    }

    // 归并排序方法
    int ct = 0;

    public int InversePairs2(int[] array) {
        if (array == null || array.length < 2) return 0;
        margeSort(array, 0, array.length - 1);
        return ct;
    }

    public void margeSort(int[] array, int l, int r) {
        if (l >= r) return;
        int mid = l + ((r - l) >> 1);
        margeSort(array, l, mid);
        margeSort(array, mid + 1, r);
        marge(array, l, mid, r);
    }

    private void marge(int[] arr, int lo, int mid, int hi) {
        int[] temp = new int[hi - lo + 1];
        int index = 0;
        int p1 = lo, p2 = mid + 1;
        while (p1 <= mid && p2 <= hi) {
            // 与归并排序不同的地方，在merge过程中统计逆序对数
            if (arr[p1] > arr[p2]) {
                ct += mid - p1 + 1;
                ct = ct % 1000000007;
                temp[index++] = arr[p2++];
            } else {
                temp[index++] = arr[p1++];
            }
        }
        while (p1 <= mid) {
            temp[index++] = arr[p1++];
        }
        while (p2 <= hi) {
            temp[index++] = arr[p2++];
        }
        for (int value : temp) {
            arr[lo++] = value;
        }
    }

}
