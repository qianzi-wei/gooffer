package com.offer;

import java.util.List;

/**
 * @program: GoOffer
 * @description: 输入一个链表，输出该链表中倒数第k个结点。
 * @author: qianzi
 * @create: 2020-05-29 11:55
 */
public class ClassFindKthToTail {
    public ListNode FindKthToTail(ListNode head, int k) {
        ListNode l = head;
        ListNode r = head;
        for (int i = 0; i < k; i++) {
            if (r == null) return null;
            else r = r.next;
        }
        while (r != null) {
            l = l.next;
            r = r.next;
        }
        return l;
    }
}
