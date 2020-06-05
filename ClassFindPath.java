package com.offer;

import java.util.ArrayList;

/**
 * @program: GoOffer
 * @description: 输入一颗二叉树的根节点和一个整数，打印出二叉树中结点值的和为输入整数的所有路径。
 * 路径定义为从树的根结点开始往下一直到叶结点所经过的结点形成一条路径。
 * @author: qianzi
 * @create: 2020-06-02 08:58
 */
public class ClassFindPath {
    public ArrayList<ArrayList<Integer>> arrayLists = new ArrayList<>();
    public ArrayList<Integer> arrayList = new ArrayList<>();

    public ArrayList<ArrayList<Integer>> FindPath(TreeNode root, int target) {
        if (root == null) return arrayLists;
        arrayList.add(root.val);
        target = target - root.val;
        if (root.right == null && root.left == null && target == 0) {
            //记住这里add new ArrayList 如果加入旧的arraylist，可能会改变。
            arrayLists.add(new ArrayList<Integer>(arrayList));
        }
        FindPath(root.left, target);
        FindPath(root.right, target);
        arrayList.remove(arrayList.size() - 1);
        return arrayLists;
    }
}
