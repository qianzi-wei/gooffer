package com.offer;

/**
 * @program: GoOffer
 * @description: 输入两棵二叉树A，B，判断B是不是A的子结构。（ps：我们约定空树不是任意一个树的子结构）
 * @author: qianzi
 * @create: 2020-05-29 15:08
 */
public class ClassHasSubtree {
    public static boolean HasSubtree(TreeNode root1, TreeNode root2) {
        if (root2 == null || root1 == null) return false;
        return HasSubtree(root1.left, root2) || HasSubtree(root1.right, root2) || isSame(root1, root2);
    }

    public static boolean isSame(TreeNode p, TreeNode q) {
        if (q == null)
            return true;
        if (p == null)
            return false;
        return isSame(p.left, q.left) && isSame(p.right, q.right) && p.val == q.val;
    }

    public static void main(String[] args) {
        TreeNode l = new TreeNode(1);
        TreeNode r = new TreeNode(2);
        System.out.println(HasSubtree(l, r));
    }
}
