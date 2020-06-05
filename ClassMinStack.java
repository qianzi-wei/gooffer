package com.offer;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

/**
 * @program: GoOffer
 * @description: TODO
 * @author: qianzi
 * @create: 2020-05-29 17:08
 */
public class ClassMinStack {
    private Stack<Integer> stack = new Stack<>();
    private List<Integer> list = new ArrayList<>();

    public void push(int node) {
        stack.push(node);
        list.add(node);
    }

    public void pop() {
        stack.pop();
        list.remove(list.size()-1);
    }

    public int top() {
        return list.get(list.size()-1);
    }

    public int min() {
        int min = list.get(0);
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i) < min) min = list.get(i);
        }
        return min;
    }
}
