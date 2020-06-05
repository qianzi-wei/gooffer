package com.offer;

/**
 * @program: GoOffer
 * @description: 输入一棵二叉树，判断该二叉树是否是平衡二叉树。
 * 在这里，我们只需要考虑其平衡性，不需要考虑其是不是排序二叉树
 * @author: qianzi
 * @create: 2020-06-03 10:37
 */
public class ClassIsBalanced_Solution {
    public boolean IsBalanced_Solution(TreeNode root) {
        if (root == null) return true;
        return Math.abs(GetMaxHigh(root.left) - GetMaxHigh(root.right)) < 2 && IsBalanced_Solution(root.left) && IsBalanced_Solution(root.right);
    }

    public int GetMaxHigh(TreeNode root) {
        if (root != null) {
            return Math.max(GetMaxHigh(root.right), GetMaxHigh(root.left)) + 1;
        } else return 0;
    }
}
