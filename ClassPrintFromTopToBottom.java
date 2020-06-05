package com.offer;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

/**
 * @program: GoOffer
 * @description: 从上往下打印出二叉树的每个节点，同层节点从左至右打印。
 * @author: qianzi
 * @create: 2020-05-29 17:49
 */
public class ClassPrintFromTopToBottom {
    public ArrayList<Integer> PrintFromTopToBottom(TreeNode root) {
        ArrayList<Integer> arrayList = new ArrayList<>();
        if (root == null) return arrayList;
        Queue<TreeNode> queue = new LinkedList<>();
        queue.add(root);
        TreeNode node = null;
        while (!queue.isEmpty()) {
            int len = queue.size();
            for (int i = 0; i < len; i++) {
                node = queue.poll();
                arrayList.add(node.val);
                if (node.left != null) queue.add(node.left);
                if (node.right != null) queue.add(node.right);
            }
        }
        return arrayList;
    }
}
