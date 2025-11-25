package com.company;
import java.util.Scanner;

public class CWH_12_Arrays {
    public static void main(String[] args) {
//        int [] marks =  new int[5];
//        marks[0] = 59;
//        marks[1] = 60;
//        marks[2] = 61;
//        marks[3] = 62;
//        marks[4] = 63;
//        System.out.println(marks[3]);
//    }
        Scanner sc = new Scanner(System.in);

        int[] marks = new int[5];
        System.out.println("Enter Array element");
        for (int i = 0; i < 5; i++) {
            System.out.print("Marks[" + i + "] : ");
            marks[i] = sc.nextInt();
        }
        System.out.print("{ ");
        for (int i = 0; i < 5; i++) {
            System.out.print(marks[i] + " ");
        }
        System.out.print(" }");

    }
}
