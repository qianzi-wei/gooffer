package com.offer;

import java.util.ArrayList;

/**
 * @program: GoOffer
 * @description: 输入一个矩阵，按照从外向里以顺时针的顺序依次打印出每一个数字，
 * 例如，如果输入如下4 X 4矩阵： 1 2 3 4 5 6 7 8 9 10 11 12 13 14 15 16 则依次打印出数字1,2,3,4,8,12,16,15,14,13,9,5,6,7,11,10.
 * @author: qianzi
 * @create: 2020-05-29 15:55
 */
public class ClassprintMatrix {
    public static ArrayList<Integer> printMatrix(int[][] matrix) {
        ArrayList<Integer> arrayList = new ArrayList<>();
        if (matrix == null || matrix.length < 1) return arrayList;
        for (int i = 0; i < matrix.length / 2 + 1; i++) {
            printM(arrayList, matrix, i);
        }
        return arrayList;
    }

    public static void printM(ArrayList<Integer> arrayList, int[][] matrix, int x) {
        int y = matrix.length - 1- x;
        int r = matrix[0].length - 1 -x;
        if (x > y||x>r) return;
        if (x == y&&x==r) {
            arrayList.add(matrix[x][y]);
            return;
        }
        if(x==y){
            for(int i = x;i<r+1;i++){
                arrayList.add(matrix[x][i]);
            }
            return;
        }
        if(x==r){
            for(int i = x;i<y+1;i++){
                arrayList.add(matrix[i][x]);
            }
            return;
        }
        for (int i = x; i < r; i++) {
            arrayList.add(matrix[x][i]);
        }
        for (int i = x; i < y; i++) {
            arrayList.add(matrix[i][r]);
        }
        for (int i = r; i > x; i--) {
            arrayList.add(matrix[y][i]);
        }
        for (int i = y; i > x; i--) {
            arrayList.add(matrix[i][x]);
        }
    }

    public static void main(String[] args) {
        //int[][] m = {{1,2,3},{4,5,6},{7,8,9}};
        int[][] m = {{1,2},{3,4},{5,6}};
        ArrayList<Integer> arrayList = printMatrix(m);
        for (Integer integer : arrayList) {
            System.out.println(integer);
        }
    }
}
