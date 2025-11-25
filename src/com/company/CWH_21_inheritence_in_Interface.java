package com.company;

interface A {
    void show();
}

interface B {
    void display();
}

interface C extends A, B {
    void play();
}
class Test implements C {
    public void show() {
        System.out.println("Show");
    }
    public void display() {
        System.out.println("Display");
    }
    public void play() {
        System.out.println("Play");
    }
}

public class CWH_21_inheritence_in_Interface {
    public static void main(String[] args) {
        Test a = new Test();
        a.show();
        a.display();
        a.play();
    }
}
