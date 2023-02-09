package com.sarac.openClosed.example2.good;

public class Calculator {
    public void calculate(Operation operation){

        int num1=10;
        int num2=2;

        operation.calculate(num1,num2);
    }

    public static void main(String[] args) {

        new Addition().calculate(10,2);
        new Substraction().calculate(5,2);
        new Division().calculate(20,5);
        new Multipication().calculate(3,4);
        new Modulus().calculate(10,5);
    }
}
