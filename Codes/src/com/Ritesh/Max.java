package com.Ritesh;

import java.util.Arrays;
import java.util.Scanner;

public class Max {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int[] arr = new int[5];
        System.out.print("Enter the array: ");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = in.nextInt();
        }
        System.out.println(Arrays.toString(arr));
        System.out.println("The max value in array is: " + max(arr));
        System.out.print("Enter the Range to find max: ");
        int a = in.nextInt();
        int b = in.nextInt();
        System.out.println(maxRange(arr, a, b));
    }

    static int maxRange(int[] arr, int start, int end) {
        if (start > end){
            return -1;
        }
        if(arr == null){
            return -1;
        }
        int maxVal = arr[start];
        for (int i = start; i <= end ; i++) {
            if(arr[i] > maxVal){
                maxVal = arr[i];
            }
        }
        return maxVal;
    }
    static int max(int[] arr) {
        if (arr.length == 0) {
            return -1;
        }
        int maxVal = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > maxVal) {
                maxVal = arr[i];
            }
        }
        return maxVal;
    }
}
