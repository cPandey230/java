package com.company;

class NegativeRadiusException extends Exception{
    @Override
    public String toString(){
        return "Radius Cannot be Negative  ";
    }
    @Override
    public String getMessage(){
        return "Radius Cannot be Negative ";
    }
}
public class CWH_32_Throw_Throws {
    public static double area(int r) throws NegativeRadiusException{
        if(r<0){
            throw new NegativeRadiusException();
        }
        double result = Math.PI*r*r;
        return result;

    }
    public static int divide (int a,int b) throws ArithmeticException{
        int result = a/b;
        return result;
    }
    public static void main(String[] args) {
        try {
            int c = divide(6, 0);
            System.out.println(c);
        }catch(Exception e){
            System.out.println("Exception"+e);
        }
        try {
            int r = 3;
            System.out.println(area(r));
        }catch(Exception e){
            System.out.println("Exception"+e);
        }
    }
}
