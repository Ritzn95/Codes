package com.Ritesh;

import java.util.ArrayList;
import java.util.Scanner;

public class Array {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        ArrayList list = new ArrayList<>();
        int a = in.nextInt();
        for (int i = 0; i < a; i++) {
             list.add(in.next());
        }
        System.out.println(list);
    }
}
