package com.offer;

/**
 * @program: GoOffer
 * @description: 给定一个数组A[0, 1, ..., n-1],请构建一个数组B[0,1,...,n-1],其中B中的元素B[i]=A[0]*A[1]*...*A[i-1]*A[i+1]*...*A[n-1]。
 * 不能使用除法。（注意：规定B[0] = A[1] * A[2] * ... * A[n-1]，B[n-1] = A[0] * A[1] * ... * A[n-2];）
 * @author: qianzi
 * @create: 2020-06-03 16:16
 */
public class Classmultiply {
    public int[] multiply(int[] A) {
        if (A == null || A.length <= 0) return null;
        int[] b = new int[A.length];
        for (int i = 0; i < b.length; i++) {
            int n = 1;
            for (int j = 0; j < b.length; j++) {
                if (j != i) {
                    n = n * A[j];
                }
            }
            b[i] = n;
        }
        return b;
    }

    public int[] multiply2(int[] A) {
        if (A == null || A.length <= 0) return null;
        int[] b = new int[A.length];
        b[0] = 1;
        for (int i = 1; i < A.length; i++) {
            b[i] = b[i - 1] * A[i - 1];
        }
        int temp = 1;
        for (int i = A.length - 1; i > -1; i--) {
            b[i] = b[i] * temp;
            temp = temp * A[i];
        }
        return b;
    }
}
