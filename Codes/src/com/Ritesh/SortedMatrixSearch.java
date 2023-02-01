package com.Ritesh;

import java.util.Arrays;
import java.util.Scanner;

public class SortedMatrixSearch {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int[][] arr = {
                {12, 13, 15, 20},
                {22, 25, 28, 30},
                {31, 33, 35, 37},
                {45, 48, 51, 54}
        };
        System.out.print("Enter the target to be searched in the array: ");
        int m = in.nextInt();
        System.out.println(Arrays.toString(search(arr, m)));

    }
    static int[] search(int[][] matrix, int target){
        int r = 0;
        int c = matrix.length - 1;
        while (r < matrix.length && c >= 0){
            if (matrix[r][c] == target){
                return new int[]{r, c};
            }if (matrix[r][c] < target){
                r++;
            }else {
                c--;
            }
        }
        return new int[]{-1, -1};
    }
}
