package com.company;
import java.util.Scanner;

class BankAccount{
    int accountNumber,balance;
    String name;

    BankAccount(String name,int balance, int accountNumber){
        this.name = name;
        this.balance = balance;
        this.accountNumber = accountNumber;
    }
    void deposit(int depAmount){
        balance += depAmount;
    }
    void withdrawl(int withAmount) {
        if (balance == 0) {
            System.out.println("Null Balance ");
        } else {
            balance = balance - withAmount;
        }
    }
    void getBalance(){
        System.out.println("Balance : "+balance);
    }

    void info(){
        System.out.println("Name : "+name);
        System.out.println("Account Number : "+accountNumber);
        System.out.println("Balance : "+balance);
    }

}
public class CWH_15_BankManagement {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        BankAccount b1 = new BankAccount("Chandan Pandey", 5000000, 1001);

        b1.info();

        System.out.print("Enter Money for depositing : ");
        int depAmount = sc.nextInt();
        b1.deposit(depAmount);

        System.out.print("Enter Money for withdrawl : ");
        int withAmount = sc.nextInt();
        b1.withdrawl(withAmount);

        b1.info();




    }
}
