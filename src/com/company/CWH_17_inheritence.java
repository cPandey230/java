package com.company;
import java.util.Scanner;

class Base{
    int x;

    Base(){
        System.out.println(" I am constructor ");
    }
    Base(int x){
        System.out.println("I am overloaded base constructor with value of a as " + x);
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        System.out.println("I am in base and setting x now ");
        this.x = x;
    }

    public void printMe(){
        System.out.println("I am printMe");
    }

}

class Derieved extends Base{
    int y;

    Derieved(){
//        super(0);
        System.out.println("I am Derieved class constructor ");
    }

    Derieved(int x,int y){
        super(3);
        System.out.println("I am overloaded derived constructor with value of a as " + x);
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }
}


public class CWH_17_inheritence {
    public static void main(String[] args) {
//        Base b = new Base();
//        b.setX(4);
//        System.out.println(b.getX());
//
//        Derieved c = new Derieved();
//        c.setX(10);
//        System.out.println(b.getX());
//        c.setY(14);
//        System.out.println(c.getY());

//        Base d = new Base();
//        Derieved c = new Derieved();
        Derieved e = new Derieved(4,8);

    }
}
