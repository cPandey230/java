package com.company;

class MyThr extends Thread{
    public MyThr(String name){
        super(name);
    }
    public void run(){
        int i=24;
        System.out.println("Thank You ");
//        while(true){
//            System.out.println("I am Thread ");
//        }
    }
}
public class CWH_25_ThreadConstructor {
    public static void main(String[] args) {
        MyThr t1 = new MyThr("Harry");
        MyThr t2 = new MyThr("Happy");
        t1.start();
        t2.start();
        System.out.println("Thr id of thread is : "+t1.getId());
        System.out.println("Thr id of thread is : "+t1.getName());
        System.out.println("Thr id of thread is : "+t2.getId());
        System.out.println("Thr id of thread is : "+t2.getName());
    }
}
