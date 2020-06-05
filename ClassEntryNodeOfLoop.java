package com.offer;


import java.util.HashSet;

/**
 * @program: GoOffer
 * @description: 给一个链表，若其中包含环，请找出该链表的环的入口结点，否则，输出null。
 * @author: qianzi
 * @create: 2020-06-03 22:32
 */
public class ClassEntryNodeOfLoop {
    public ListNode EntryNodeOfLoop(ListNode pHead) {
        if (pHead == null) return null;
        ListNode p = pHead;
        HashSet<ListNode> hashSet = new HashSet<>();
        while (p != null) {
            if (hashSet.contains(p)) {
                return p;
            } else {
                hashSet.add(p);
                p = p.next;
            }
        }
        return null;
    }
}
