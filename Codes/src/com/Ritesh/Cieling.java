package com.Ritesh;

import java.util.Scanner;

public class Cieling {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int[] arr = {-13, -11, -5, 0, 1, 3, 6, 8, 12, 17, 18, 24, 34, 56,};
        System.out.print("Enter the target no. to search position: ");
        int target = in.nextInt();
        int ans = cieling(arr, target);
        System.out.println(ans);
    }
    static int cieling(int[] arr, int target){
        if(target > arr[arr.length-1]){
            return -1;
        }
        int start = 0;
        int end = arr.length - 1;
        while (start <= end){
            int mid = start + (end - start)/2;
            if (target < arr[mid]){
                end = mid - 1;
            } else if (target > arr[mid]) {
                start = mid +1;
            }else {
                return mid;
            }
        }
        return start;
    }
}
