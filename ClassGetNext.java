package com.offer;

/**
 * @program: GoOffer
 * @description: 给定一个二叉树和其中的一个结点，请找出中序遍历顺序的下一个结点并且返回。
 * 注意，树中的结点不仅包含左右子结点，同时包含指向父结点的指针。
 * @author: qianzi
 * @create: 2020-06-04 16:34
 */
public class ClassGetNext {
    public TreeLinkNode GetNext(TreeLinkNode pNode) {
        TreeLinkNode temp = null;
        if (pNode == null) return null;
        if (pNode.right != null) {
            temp = pNode.right;
            while (temp.left != null) {
                temp = temp.left;
            }
            return temp;
        }
        temp = pNode;
        while (temp.next != null && temp != temp.next.left) {
            temp = temp.next;
        }
        return temp.next;
    }
}
