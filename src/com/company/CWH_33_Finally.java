package com.company;

public class CWH_33_Finally {
    public static void main(String[] args) {
        try{
            int a =5;
            int b = 0;
            int c = a/b;
        }
        catch(Exception e){
            System.out.println(e);
        }
        finally{
            System.out.println("This is end of the Program");
        }
    }
}
