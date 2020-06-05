package com.offer;

import java.util.List;

/**
 * @program: GoOffer
 * @description: 输入两个单调递增的链表，输出两个链表合成后的链表，当然我们需要合成后的链表满足单调不减规则。
 * @author: qianzi
 * @create: 2020-05-29 14:51
 */
public class ClassMerge {
    public ListNode Merge(ListNode list1, ListNode list2) {
        if (list1 == null) return list2;
        if (list2 == null) return list1;
        ListNode l1 = list1;
        ListNode l2 = list2;
        ListNode l3 = new ListNode(0);
        ListNode l4 = l3;
        while (l1 != null || l2 != null) {
            if (l1 == null) {
                l3.next = l2;
                l2 = l2.next;
                l3 = l3.next;
            } else if (l2 == null) {
                l3.next = l1;
                l1 = l1.next;
                l3 = l3.next;
            } else if (l1.val <= l2.val) {
                l3.next = l1;
                l1 = l1.next;
                l3 = l3.next;
            } else {
                l3.next = l2;
                l2 = l2.next;
                l3 = l3.next;
            }
        }
        return l4.next;
    }
}
