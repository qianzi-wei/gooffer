package com.offer;

/**
 * @program: GoOffer
 * @description: 一只青蛙一次可以跳上1级台阶，也可以跳上2级……它也可以跳上n级。求该青蛙跳上一个n级的台阶总共有多少种跳法。
 * @author: qianzi
 * @create: 2020-05-29 08:51
 */
public class ClassJumpFloorII {
    /**
     * @author qianzi
     * @Description 第一种动态规划
     * @Date 2020/5/29 9:00
     * @Param [target]
     * @Return int
     **/
    public int JumpFloorII(int target) {
        if (target < 1) return 0;
        if (target == 1) return 1;
        int[] dp = new int[target + 1];
        dp[0] = 1;
        dp[1] = 1;
        for (int i = 2; i <= target; i++) {
            for (int j = 1; j < i; j++) {
                dp[i] = dp[i] + dp[j];
            }
        }
        return dp[target];
    }


    public int JumpFloorII2(int target) {
        if (target < 1) return 0;
        else if (target == 1) return 1;
        else {
            return JumpFloorII2(target - 1) * 2;
        }
    }
}
