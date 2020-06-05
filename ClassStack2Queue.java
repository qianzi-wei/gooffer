package com.offer;

import java.util.Stack;

/**
 * @program: GoOffer
 * @description: 用两个栈来实现一个队列，完成队列的Push和Pop操作。 队列中的元素为int类型。
 * @author: qianzi
 * @create: 2020-05-28 09:33
 */
public class ClassStack2Queue {
    Stack<Integer> stack1 = new Stack<Integer>();
    Stack<Integer> stack2 = new Stack<Integer>();

    public void push(int node) {
        if (stack1.isEmpty() && stack2.isEmpty()) stack1.push(node);
        else {
            while (!stack1.isEmpty()) {
                stack2.push(stack1.pop());
            }
            stack1.push(node);
            while (!stack2.isEmpty()) {
                stack1.push(stack2.pop());
            }
        }
    }

    public int pop() {
        if (stack1.isEmpty() && stack2.isEmpty()) return -1;
        return stack1.pop();
    }

    public static void main(String[] args) {
        ClassStack2Queue s = new ClassStack2Queue();
        s.push(1);
        s.push(2);
        s.push(3);
        System.out.println(s.pop());
        System.out.println(s.pop());
    }
}
