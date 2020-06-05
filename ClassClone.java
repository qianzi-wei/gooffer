package com.offer;

/**
 * @program: GoOffer
 * @description: 输入一个复杂链表
 * （每个节点中有节点值，以及两个指针，一个指向下一个节点，另一个特殊指针random指向一个随机节点），
 * 请对此链表进行深拷贝，并返回拷贝后的头结点。
 * （注意，输出结果中请不要返回参数中的节点引用，否则判题程序会直接返回空）
 * @author: qianzi
 * @create: 2020-06-02 09:16
 */
public class ClassClone {
    public RandomListNode Clone(RandomListNode pHead) {
        if (pHead == null) return null;
        RandomListNode p = pHead;
        while (p != null) {
            RandomListNode node = new RandomListNode(p.label);
            RandomListNode next = p.next;
            p.next = node;
            node.next = next;
            p = next;
        }
        p = pHead;
        while (p != null) {
            if (p.random == null) {
                p.next.random = null;
            } else p.next.random = p.random.next;
            p = p.next.next;
        }
        p = pHead;
        RandomListNode random = p.next;
        while (p != null) {
            RandomListNode clonenext = p.next;
            //这里要保证原链表还存在
            p.next = clonenext.next;
            clonenext.next = clonenext.next == null ? null : clonenext.next.next;
            p = p.next;
        }
        return random;
    }
}
