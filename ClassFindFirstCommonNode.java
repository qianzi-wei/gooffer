package com.offer;

/**
 * @program: GoOffer
 * @description: 输入两个链表，找出它们的第一个公共结点。
 * （注意因为传入数据是链表，所以错误测试数据的提示是用其他方式显示的，保证传入数据是正确的）
 * @author: qianzi
 * @create: 2020-06-03 10:12
 */
public class ClassFindFirstCommonNode {
    public ListNode FindFirstCommonNode(ListNode pHead1, ListNode pHead2) {
        if (pHead1 == null || pHead2 == null) return null;
        ListNode p1 = pHead1;
        ListNode p2 = pHead2;
        while (p1 != null || p2 != null) {
            if (p1 == p2) return p1;
            p1 = p1 != null ? p1.next : pHead2;
            p2 = p2 != null ? p2.next : pHead1;
        }
        return null;
    }
}
