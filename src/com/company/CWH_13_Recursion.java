package com.company;
import java.util.Scanner;

public class CWH_13_Recursion {
    public static int fact(int n){
        if(n==0 || n ==1){
            return 1;
        }
        return n*fact(n-1);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter The number " );
        int n = sc.nextInt();
        int m = fact(n);
        System.out.println(m);

    }
}
