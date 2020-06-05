package com.offer;

import java.util.Stack;


/**
 * @program: GoOffer
 * @description: 输入一棵二叉搜索树，将该二叉搜索树转换成一个排序的双向链表。要求不能创建任何新的结点，只能调整树中结点指针的指向。
 * @author: qianzi
 * @create: 2020-06-02 09:46
 */
public class ClassConvert {
    TreeNode head = null;
    TreeNode realHead = null;

    public TreeNode Convert(TreeNode pRootOfTree) {
        if (pRootOfTree == null) return pRootOfTree;
        InLook(pRootOfTree);
        return realHead;
    }

    public void InLook(TreeNode root) {
        if (root == null) return;
        InLook(root.left);
        if (head == null) {
            head = root;
            realHead = root;
        } else {
            //head的右指针指向next
            head.right = root;
            //next的左指针指向head
            root.left = head;
            //更新head
            head = root;
        }
        InLook(root.right);
    }
}
