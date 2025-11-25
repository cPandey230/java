package com.company;

class MyThr1 extends Thread{
    public MyThr1(String name){
        super(name);
    }
    public void run(){
        int i=24;
//        System.out.println("Thank You "+this.getName());
        for(int j=0; j<20; j++){
//            System.out.println("I am Thread ");
            System.out.println("Thank You "+this.getName());
        }
    }
}

public class CWH_26_ThreadPriorities {
    public static void main(String[] args) {
        MyThr1 t1 = new MyThr1("Harry1");
        MyThr1 t2 = new MyThr1("Happy2");
        MyThr1 t3 = new MyThr1("Harry3");
        MyThr1 t4 = new MyThr1("Happy4");
        MyThr1 t5 = new MyThr1("Harry5 (most important)");
        t5.setPriority(Thread.MAX_PRIORITY);
        t5.setPriority(Thread.MIN_PRIORITY);
        t1.start();
        t2.start();
        t3.start();
        t4.start();
        t5.start();

    }
}
