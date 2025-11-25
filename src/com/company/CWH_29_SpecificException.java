package com.company;

import java.util.Scanner;

public class CWH_29_SpecificException {
    public static void main(String[] args) {
        int [] marks = new int[3];
        marks[0] = 7;
        marks[1] = 56;
        marks[1] = 6;
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the Array Index");
        int ind = sc.nextInt();

        System.out.println("Enter the array index");
        int number = sc.nextInt();
        try{
            System.out.print("The Value at array index entered is: "+marks[ind]);
            System.out.print("The Value of array-value/number is : "+marks[ind]/number);
        }
        catch (ArithmeticException e){
            System.out.println("Some Exception occurred! : ");
            System.out.println(e);
        }
        catch(ArrayIndexOutOfBoundsException e){
            System.out.println("ArrayIndexOutOfBoundsException occured");
            System.out.println(e);
        }
        catch(Exception e){
            System.out.println("Some other Exception occured");
            System.out.println(e);
        }

    }
}
