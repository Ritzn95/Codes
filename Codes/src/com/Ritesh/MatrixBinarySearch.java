package com.Ritesh;

import java.util.Arrays;
import java.util.Scanner;

public class MatrixBinarySearch {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int[][] arr = {
                {11, 12, 13},
                {22, 23, 24},
                {33, 34, 35},
        };
        System.out.print("Enter the target to search: ");
        int n = in.nextInt();
        System.out.println(Arrays.toString(search(arr, n)));
    }
    static int[] binarySearch(int[][] matrix, int row, int cStart, int cEnd, int target){
        while (cStart <= cEnd){
            int mid = cStart + (cEnd - cStart)/2;
            if (matrix[row][mid] == target){
                return new int[]{row, mid};
            }if (matrix[row][mid] < target){
                cStart = mid + 1;
            }else {
                cEnd = mid - 1;
            }
        }
        return new int[]{-1, -1};
    }
    static int[] search(int[][] matrix, int target){
        int rows = matrix.length;
        int cols = matrix[0].length;
        if(cols == 0){
            return new int[]{-1, -1};
        }if (rows == 1){
            return binarySearch(matrix, 0, 0 ,cols - 1, target);
        }
        int rStart = 0;
        int rEnd = rows - 1;
        int cMid = cols/2;

        //run the loop till 2 rows remain
        while (rStart < (rEnd - 1)){
            int mid = rStart + (rEnd - rStart)/2;
            if (matrix[mid][cMid] == target){
                return new int[]{mid, cMid};
            }
            if (rStart < target){
                rStart = mid;
            }else {
                rEnd = mid;
            }
        }
        if (matrix[rStart][cMid] == target){
            return new int[]{rStart, cMid};
        }if (matrix[rStart + 1][cMid] == target){
            return new int[]{rStart + 1, cMid};
        }
        // search in 1st half
        if (target <= matrix[rStart][cMid - 1]) {
            return binarySearch(matrix, rStart, 0, cMid-1, target);
        }
        // search in 2nd half
        if (target >= matrix[rStart][cMid + 1] && target <= matrix[rStart][cols - 1]) {
            return binarySearch(matrix, rStart, cMid + 1, cols - 1, target);
        }
        // search in 3rd half
        if (target <= matrix[rStart + 1][cMid - 1]) {
            return binarySearch(matrix, rStart + 1, 0, cMid-1, target);
        } else {
            return binarySearch(matrix, rStart + 1, cMid + 1, cols - 1, target);
        }
    }
}