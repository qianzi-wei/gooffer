package com.offer;

/**
 * @program: GoOffer
 * @description: 一只青蛙一次可以跳上1级台阶，也可以跳上2级。求该青蛙跳上一个n级的台阶总共有多少种跳法（先后次序不同算不同的结果）。
 * @author: qianzi
 * @create: 2020-05-29 08:44
 */
public class ClassJumpFloor {
    public int JumpFloor(int target) {
        if (target < 2) return target;
        int one = 1;
        int two = 1;
        int fib = 0;
        for (int i = 2; i <= target; i++) {
            fib = one + two;
            one = two;
            two = fib;
        }
        return fib;
    }
}
