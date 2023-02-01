package com.Ritesh;

import java.util.Arrays;
import java.util.Scanner;

public class Swap {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int[] arr = new int[5];
        System.out.print("Enter the array: ");
        for (int i = 0; i < 5; i++) {
            arr[i] = in.nextInt();
        }
        System.out.println(Arrays.toString(arr));
        reverse(arr);
        System.out.println("The Reverse String is:");
        System.out.println(Arrays.toString(arr));
        reverse(arr);
        System.out.print("Enter the index to be swapped in original array: ");
        int a = in.nextInt();
        int b = in.nextInt();
        swap(arr, a, b);
        System.out.println(Arrays.toString(arr));
    }
    static void reverse(int[] arr){
        int start = 0;
        int end = arr.length-1;

        while(start < end){
            swap(arr, start, end);
            start++;
            end--;
        }
    }
    static void swap(int[] arr, int index1, int index2 ){
        int temp = arr[index1];
        arr[index1] = arr[index2];
        arr[index2] = temp;
    }
}
