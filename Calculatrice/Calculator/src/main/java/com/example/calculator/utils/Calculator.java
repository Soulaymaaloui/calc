package com.example.calculator.utils;

public class Calculator {
    private int num1;
    private int num2;

    // Constructors
    public Calculator() {}

    public Calculator(int num1, int num2) {
        this.num1 = num1;
        this.num2 = num2;
    }

    // Getters and Setters
    public int getNum1() {
        return num1;
    }

    public void setNum1(int num1) {
        this.num1 = num1;
    }

    public int getNum2() {
        return num2;
    }

    public void setNum2(int num2) {
        this.num2 = num2;
    }

    // Methods for operations
    public int add() {
        return num1 + num2;
    }

    public int subtract() {
        return num1 - num2;
    }

    public int multiply() {
        return num1 * num2;
    }

    public double divide() {
        if (num2 != 0) {
            return (double) num1 / num2;
        } else {
            throw new ArithmeticException("Division by zero is not allowed.");
        }
    }
}
