package com.company;
import java.util.Scanner;

public class CWH_06_StudentMarks {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int sub1,sub2,sub3,sub4,sub5;

        System.out.print("Enter Sub1 Marks : ");
        sub1 = sc.nextInt();
        System.out.print("Enter Sub2 Marks : ");
        sub2 = sc.nextInt();
        System.out.print("Enter Sub3 Marks : ");
        sub3 = sc.nextInt();
        System.out.print("Enter Sub4 Marks : ");
        sub4 = sc.nextInt();
        System.out.print("Enter Sub5 Marks : ");
        sub5 = sc.nextInt();
        int tmarks = sub1+sub2+sub3+sub4+sub5;
        System.out.print("Total Marks : "+tmarks);
        System.out.println();
        float percentMarks = tmarks/5;
        System.out.println("Percentage "+ percentMarks);
        System.out.println();
    }
}
