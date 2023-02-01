package com.Ritesh;

import java.util.ArrayList;
import java.util.Scanner;

public class ArrayListExample<I extends Number> {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        ArrayList<String> list = new ArrayList<>();
        System.out.print("Enter the list limit: ");
        int a = in.nextInt();
        System.out.print("Enter the Strings: ");
        for (int i = 0; i < a; i++) {
            list.add(in.next());
        }
        System.out.println(list);
    }
}
