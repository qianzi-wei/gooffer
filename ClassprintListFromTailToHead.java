package com.offer;


import java.util.ArrayList;

/**
 * @program: GoOffer
 * @description: 输入一个链表，按链表从尾到头的顺序返回一个ArrayList。
 * @author: qianzi
 * @create: 2020-05-27 18:16
 */
public class ClassprintListFromTailToHead {
    public ArrayList<Integer> printListFromTailToHead(ListNode listNode) {
        ArrayList<Integer> arrayList = new ArrayList<>();
        if (listNode == null) return arrayList;
        ListNode node = listNode;
        while (node != null) {
            arrayList.add(0, node.val);
            node = node.next;
        }
        return arrayList;
    }
}
