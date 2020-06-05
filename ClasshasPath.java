package com.offer;

/**
 * @program: GoOffer
 * @description: 请设计一个函数，用来判断在一个矩阵中是否存在一条包含某字符串所有字符的路径。
 * 路径可以从矩阵中的任意一个格子开始，每一步可以在矩阵中向左，向右，向上，向下移动一个格子。
 * 如果一条路径经过了矩阵中的某一个格子，则该路径不能再进入该格子。
 * @author: qianzi
 * @create: 2020-06-05 09:08
 */
public class ClasshasPath {
    char[] mat;
    int h = 0, w = 0;
    int slen = 0;
    int[] dir = {-1, 0, 1, 0, -1};

    public boolean dfs(int i, int j, int pos, char[] str) {
        //判空
        if (i < 0 || i >= h || j < 0 || j >= w) {
            return false;
        }
        //判是否匹配
        char c = mat[i * w + j];
        //未匹配
        if (c == '#' || c != str[pos]) {
            return false;
        }
        //匹配
        if (pos + 1 == slen) return true;
        //标记
        mat[i * w + j] = '#';
        //递归匹配
        for (int k = 0; k < 4; ++k) {
            if (dfs(i + dir[k], j + dir[k + 1], pos + 1, str)) {
                return true;
            }
        }
        //回溯
        mat[i * w + j] = c;
        return false;
    }

    public boolean hasPath(char[] matrix, int rows, int cols, char[] str) {
        mat = matrix;
        h = rows;
        w = cols;
        slen = str.length;
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                if (dfs(i, j, 0, str)) {
                    return true;
                }
            }
        }
        return false;
    }
}
