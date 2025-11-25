package com.company;

abstract class Parent{
    public Parent(){
        System.out.println("Mai base 2 ka constructor hoon ");
    }
    public void sayHello(){
        System.out.println("Hello ");
    }
    abstract public void greet();
}

class Child extends Parent{
    @Override
    public void greet(){
        System.out.println("good Morning");
    }
}
public class CWH_19_abstract {
    public static void main(String[] args) {
//        Parent  p = new Parent();--erro
        Child c = new Child();
    }
}
