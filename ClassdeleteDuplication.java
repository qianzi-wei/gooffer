package com.offer;

import java.util.List;

/**
 * @program: GoOffer
 * @description: 在一个排序的链表中，存在重复的结点，请删除该链表中重复的结点，重复的结点不保留，返回链表头指针。
 * 例如，链表1->2->3->3->4->4->5 处理后为 1->2->5
 * @author: qianzi
 * @create: 2020-06-04 16:16
 */
public class ClassdeleteDuplication {
    public static ListNode deleteDuplication(ListNode pHead) {
        if (pHead == null) return null;
        ListNode p = pHead;
        ListNode before = new ListNode(Integer.MAX_VALUE);
        ListNode after = before;
        int a = 0;
        before.next = pHead;
        while(p!=null){
            if(p.next!=null&&p.val==p.next.val){
                a = p.val;
               while (p!=null&&p.val==a){
                   before.next = p.next;
                   p = p.next;
               }

            }else{
                p = p.next;
                before = before.next;
            }
        }
        return after.next;
    }

    public static void main(String[] args) {

    }
}
