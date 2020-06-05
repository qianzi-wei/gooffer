package com.offer;

/**
 * @program: GoOffer
 * @description: 输入某二叉树的前序遍历和中序遍历的结果，请重建出该二叉树。假设输入的前序遍历和中序遍历的结果中都不含重复的数字。
 * 例如输入前序遍历序列{1,2,4,7,3,5,6,8}和中序遍历序列{4,7,2,1,5,3,8,6}，则重建二叉树并返回。
 * @author: qianzi
 * @create: 2020-05-27 18:23
 */
public class ClassreConstructBinaryTree {
    public TreeNode reConstructBinaryTree(int[] pre, int[] in) {
        if (pre == null || in == null) return null;
        return GetTree(pre, 0, pre.length - 1, in, 0, in.length - 1);
    }

    private TreeNode GetTree(int[] pre, int p, int q, int[] in, int i, int j) {
        if (p > q) return null;
        if (p == q) return new TreeNode(pre[p]);
        int k = i; // 这里k = i，接下来计算要减去i
        while (pre[p] != in[k]) k++;
        TreeNode root = new TreeNode(pre[p]);
        root.left = GetTree(pre, p + 1, p + k - i, in, i, k - 1);
        root.right = GetTree(pre, p + k - i + 1, q, in, k + 1, j);
        return root;
    }
}
