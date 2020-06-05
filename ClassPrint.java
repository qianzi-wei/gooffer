package com.offer;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

/**
 * @program: GoOffer
 * @description: 请实现一个函数按照之字形打印二叉树，即第一行按照从左到右的顺序打印，第二层按照从右至左的顺序打印，
 * 第三行按照从左到右的顺序打印，其他行以此类推。
 * @author: qianzi
 * @create: 2020-06-04 21:06
 */
public class ClassPrint {
    public ArrayList<ArrayList<Integer>> Print(TreeNode pRoot) {
        ArrayList<ArrayList<Integer>> arrayLists = new ArrayList<>();
        if (pRoot == null) return arrayLists;
        Queue<TreeNode> queue = new LinkedList<>();
        queue.add(pRoot);
        while (!queue.isEmpty()) {
            ArrayList<Integer> list = new ArrayList<>();
            int len = queue.size();
            for (int i = 0; i < len; i++) {
                TreeNode t = queue.poll();
                list.add(t.val);
                if (t.left != null) {
                    queue.add(t.left);
                }
                if (t.right != null) {
                    queue.add(t.right);
                }
            }
            arrayLists.add(list);
        }
        return arrayLists;
    }
}
