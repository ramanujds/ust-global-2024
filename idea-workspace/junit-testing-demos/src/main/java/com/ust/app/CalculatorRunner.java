package com.ust.app;

import java.util.SortedMap;

public class CalculatorRunner {

    public static void main(String[] args) {

        Calculator calc = new Calculator();

        int num1 = Integer.parseInt(args[0]);
        int num2 = Integer.parseInt(args[1]);

        System.out.println("Input-1 : "+num1);
        System.out.println("Input-2 : "+num2);

        System.out.println("Result of addition : "+calc.add(num1,num2));
        System.out.println("Result of subtraction : "+calc.subtract(num1,num2));
        System.out.println("Result of multiplication : "+calc.multiply(num1,num2));
        System.out.println("Result of division : "+calc.divide(num1,num2));

    }
}
