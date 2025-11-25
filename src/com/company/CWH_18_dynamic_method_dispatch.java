package com.company;


class Phone{
    public void on (){
        System.out.println("Turning on Phone");
    }
    public void greet (){
        System.out.println("Good Morning ");
    }
}

class Smartphone extends Phone{
    public void on(){
        System.out.println("Turning on smartphone ");
    }
    public void swagat(){
        System.out.println("Aapka swagat hai ");
    }
}
public class CWH_18_dynamic_method_dispatch {
    public static void main(String[] args) {
//        Phone obj = new Phone();
//        Smartphone sobj = new Smartphone();
//        obj.name();p
        Phone obj = new Smartphone();
        obj.greet();
        obj.on();

    }
}
