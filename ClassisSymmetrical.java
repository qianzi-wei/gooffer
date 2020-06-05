package com.offer;


/**
 * @program: GoOffer
 * @description: 请实现一个函数，用来判断一颗二叉树是不是对称的。
 * 注意，如果一个二叉树同此二叉树的镜像是同样的，定义其为对称的。
 * @author: qianzi
 * @create: 2020-06-04 17:21
 */
public class ClassisSymmetrical {

    boolean isSymmetrical(TreeNode pRoot) {
        if (pRoot == null) return true;
        return GetIn(pRoot.left, pRoot.right);
    }

    public boolean GetIn(TreeNode left, TreeNode right) {
        if (left == null && right == null) return true;
        if (left == null || right == null) return false;
        if (left.val == right.val) {
            return GetIn(left.left, right.right) && GetIn(right.left, left.right);
        }
        return false;
    }
}
