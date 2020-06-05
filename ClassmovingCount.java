package com.offer;

/**
 * @program: GoOffer
 * @description: 地上有一个m行和n列的方格。一个机器人从坐标0,0的格子开始移动，每一次只能向左，右，上，下四个方向移动一格，但是不能进入行坐标和列坐标的数位之和大于k的格子。
 * 例如，当k为18时，机器人能够进入方格（35,37），因为3+5+3+7 = 18。但是，它不能进入方格（35,38），因为3+5+3+8 = 19。请问该机器人能够达到多少个格子？
 * @author: qianzi
 * @create: 2020-06-05 09:18
 */
public class ClassmovingCount {
    int[] dir = {-1, 0, 1, 0, -1};
    int ret = 0;

    public int check(int n) {
        int sum = 0;
        while (n > 0) {
            sum = sum + n % 10;
            n = n / 10;
        }
        return sum;
    }

    public void DFS(int x, int y, int t, int r, int c, int[][] mark) {
        if (x < 0 || x >= r || y < 0 || y >= c || mark[x][y] == 1) {
            return;
        }
        if (check(x) + check(y) > t) {
            return;
        }
        ret++;
        mark[x][y] = 1;
        for (int i = 0; i < 4; i++) {
            DFS(x + dir[i], y + dir[i + 1], t, r, c, mark);
        }
    }

    public int movingCount(int threshold, int rows, int cols) {
        if (threshold <= 0) return 0;
        int[][] mark = new int[rows][cols];
        DFS(0, 0, threshold, rows, cols, mark);
        return ret;
    }
}
