package com.company;

interface Vehicle {
    void start();   // abstract method

    default void stop() {
        System.out.println("Vehicle stopped");
    }
}

class Car implements Vehicle {
    public void start() {
        System.out.println("Car started");
    }
}

public class CWH_22_defultFunction {
    public static void main(String[] args) {
        Car c = new Car();
        c.start();
        c.stop();
    }

}
