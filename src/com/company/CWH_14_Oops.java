package com.company;
import java.util.Scanner;

class Student {
    private String name;
    private int age;
    private int marks;

    public Student(String name,int age, int marks){
        this.name = name;
        this.age = age;
        this.marks = marks;
    }
    public String getName(){
        return name;
    }
    public void setName(String name){
        this.name =name;
    }
    public void setAge(int age){
        if(age>0){
            this.age = age;
        }else{
            System.out.println("Invalid Age");
        }
    }
    public int getMarks(){
        return marks;
    }
    public void setMarks(int marks){
        this.marks = marks;
    }
    public String checkResult(){
        if(marks >= 40){
            return "Pass";
        } else {
            return "fail";
        }
    }
    public void displayInfo(){
        System.out.println("Name : "+name);
        System.out.println("Age : "+age);
        System.out.println("Marks : "+marks);
        System.out.println("Result : "+checkResult());
    }
}


public class CWH_14_Oops {

    public static void main(String[] args) {

        Student s1 = new Student("Amit",20,85);
        s1.displayInfo();

        System.out.println("------ Updating Details -------");

        s1.setName("Rahul");
        s1.setAge(22);
        s1.setMarks(35);

        s1.displayInfo();
    }
}
