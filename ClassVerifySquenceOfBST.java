package com.offer;

/**
 * @program: GoOffer
 * @description: 输入一个整数数组，判断该数组是不是某二叉搜索树的后序遍历的结果。
 * 如果是则输出Yes,否则输出No。假设输入的数组的任意两个数字都互不相同。
 * @author: qianzi
 * @create: 2020-06-02 08:46
 */
public class ClassVerifySquenceOfBST {
    public boolean VerifySquenceOfBST(int[] sequence) {
        if (sequence == null || sequence.length == 0) return false;
        if (sequence.length == 1) return true;
        int len = sequence.length - 1;
        int i = 0;
        while (len > 0) {
            while (sequence[i] < sequence[len]) {
                i++;
            }
            while (sequence[i] > sequence[len]) {
                i++;
            }
            if (i < len) return false;
            len--;
            i = 0;
        }
        return true;
    }
}
