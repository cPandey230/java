package com.company;
import java.util.Scanner;

public class CWH_10_ConditionalStatement {
    public static void main(String[] Args){
        Scanner sc = new Scanner(System.in);

//        System.out.println("Enter the Numbers : ");
//        System.out.print("Number 1 : ");
//        int a1 = sc.nextInt();
//        System.out.print("Number 2 : ");
//        int a2 = sc.nextInt();
//        System.out.print("Number 3 : ");
//        int a3 = sc.nextInt();
//
//        if(a1>a2 && a1>a3){
//            System.out.println(a1+" is bigger");
//        }
//        else if(a2>a1 && a2>a1){
//            System.out.println(a2+" is bigger");
//        }
//        else if(a3>a1 && a3>a1){
//            System.out.println(a3+" is bigger");
//        }
//        else {
//            System.out.println("All are Equal");
//        }
        System.out.println("Enter The Day number");
        int day = sc.nextInt();

        switch(day){
            case 1:
                System.out.println("Monday");
                break;
            case 2:
                System.out.println("Tuesday");
                break;
            case 3:
                System.out.println("Wednesday");
                break;
            case 4:
                System.out.println("Thursday");
                break;
            case 5:
                System.out.println("Friday");
                break;
            case 6:
                System.out.println("Saturday");
                break;
            case 7:
                System.out.println("Sunday");
                break;
        }


    }
}
