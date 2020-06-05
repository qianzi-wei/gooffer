package com.offer;

/**
 * @program: GoOffer
 * @description: 操作给定的二叉树，将其变换为源二叉树的镜像。
 * @author: qianzi
 * @create: 2020-05-29 15:44
 */
public class ClassMirror {
    public void Mirror(TreeNode root) {
        if (root == null) return;
        TreeNode tmp = root.left;
        root.left = root.right;
        root.right = tmp;
        if (root.right != null)
            Mirror(root.right);
        if (root.left != null)
            Mirror(root.left);
    }
}
