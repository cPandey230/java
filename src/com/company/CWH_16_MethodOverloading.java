package com.company;
import java.util.Scanner;

class Addition{
    int p,q,r,s,t;

    int  add(int p,int q){
        return p+q;
    }
    int  add(int p,int q,int r){
        return p+q+r;
    }
    int  add(int p,int q,int r,int s){
        return p+q+r+s;
    }
    int  add(int p,int q,int r,int s,int t){
        return p+q+r+s+t;
    }

}

public class CWH_16_MethodOverloading {
    public static void main(String[] args) {

        Addition a = new Addition();
        System.out.println("2 no. addition  : "+a.add(1,2));
        System.out.println("3 no. addition  : "+a.add(1,2,3));
        System.out.println("4 no. addition  : "+a.add(1,2,3,4));
        System.out.println("5 no. addition  : "+a.add(1,2,3,4,5));

    }
}
