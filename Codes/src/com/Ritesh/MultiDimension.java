package com.Ritesh;

import java.util.Arrays;
import java.util.Scanner;

public class MultiDimension {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the Dimensions of Matrix: ");
        int n = in.nextInt();
        int m = in.nextInt();
        int [][] arr = new int[n][m];
        System.out.println(arr.length);
        System.out.println("Enter the 2D com.Ritesh.Array: ");
        for (int row = 0; row < arr.length; row++) {
            for (int col = 0; col < arr[row].length; col++) {
                arr[row][col] = in.nextInt();
            }
//        }for (int row = 0; row < arr.length; row++) {
//            for (int col = 0; col < arr[row].length; col++) {
//                System.out.print(arr[row][col] + " ");
//            }
//            System.out.println();
        }
        for (int[] a: arr){
            System.out.println(Arrays.toString(a));
        }
    }
}
