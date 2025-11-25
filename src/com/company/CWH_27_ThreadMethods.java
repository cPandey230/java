package com.company;

class MyNewThr1 extends Thread{
    public void run(){
//        System.out.println("Thank You "+this.getName());
        for(int j=0; j<20; j++){
            System.out.println("Thank You ");
        }
    }
}
class MyNewThr2 extends Thread{
    public void run(){
        for(int j=0; j<20; j++){
//            System.out.println("I am Thread ");
            System.out.println("Thank You ");
        }
    }
}

public class CWH_27_ThreadMethods {
    public static void main(String[] args) {
        MyNewThr1 t1 = new MyNewThr1();
        MyNewThr1 t2 = new MyNewThr1();
        t1.start();
        try{
            t1.join();
        } catch (Exception e){
            System.out.println(e);
        }
        t2.start();

    }
}
