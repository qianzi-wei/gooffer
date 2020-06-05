package com.offer;

import java.util.List;

/**
 * @program: GoOffer
 * @description: 输入一个链表，反转链表后，输出新链表的表头。
 * @author: qianzi
 * @create: 2020-05-29 11:59
 */
public class ClassReverseList {
    public ListNode ReverseList(ListNode head) {
        ListNode node = head;
        ListNode list = null;
        ListNode next = null;
        while (node != null) {
            next = node.next;
            node.next = list;
            list = node;
            node = next;
        }
        return list;
    }
}
