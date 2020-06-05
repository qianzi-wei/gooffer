package com.offer;

/**
 * @program: GoOffer
 * @description: 输入一棵二叉树，求该树的深度。从根结点到叶结点依次经过的结点（含根、叶结点）形成树的一条路径，最长路径的长度为树的深度。
 * @author: qianzi
 * @create: 2020-06-03 10:34
 */
public class ClassTreeDepth {
    public int TreeDepth(TreeNode root) {
        if (root != null) {
            return Math.max(TreeDepth(root.right), TreeDepth(root.left)) + 1;
        } else return 0;
    }
}
