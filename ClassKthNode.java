package com.offer;

import java.util.Stack;

/**
 * @program: GoOffer
 * @description: 给定一棵二叉搜索树，请找出其中的第k小的结点。
 * 例如， （5，3，7，2，4，6，8）    中，按结点数值大小顺序第三小结点的值为4。
 * @author: qianzi
 * @create: 2020-06-04 21:51
 */
public class ClassKthNode {
    TreeNode KthNode(TreeNode pRoot, int k) {
        if (pRoot == null) return null;
        Stack<TreeNode> stack = new Stack<>();
        stack.push(pRoot);
        while (!stack.isEmpty()) {
            if (pRoot != null && pRoot.left != null) {
                stack.push(pRoot.left);
                pRoot = pRoot.left;
            } else {
                pRoot = stack.pop();
                k--;
                if (k == 0) return pRoot;
                if (pRoot != null && pRoot.right != null) {
                    stack.push(pRoot.right);
                    pRoot = pRoot.right;
                } else pRoot = null;
            }
        }
        return null;
    }
}
