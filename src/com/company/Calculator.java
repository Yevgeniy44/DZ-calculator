package com.company;

import java.util.Scanner;

public class Calculator {
    int sum(int... values){
        System.out.println("This is int");
        int result = 0;
        for (int i : values) {
            result = result + i;
        }
        return result;
    }
    int sum(long... values) {
        System.out.println("This is long");
        int result = 0;
        for (long i : values) {
            result = (int) (result + i);
        }
        return result;
    }
    int sum(float... values){
        System.out.println("This is float");
        int result = 0;
        for (float i : values) {
            result = (int) (result + i);
        }
        return result;
    }
    int sum(double... values){
        System.out.println("This is double");
        int result = 0;
        for (double i : values) {
            result = (int) (result + i);
        }
        return result;
    }
    public static int calc(int num1, int num2, char operation){
        int result;
        switch (operation){
            case '+':
                result = num1+num2;
                break;
            case '-':
                result = num1-num2;
                break;
            case '*':
                result = num1*num2;
                break;
            case '/':
                result = num1/num2;
                break;
            default:
                System.out.println("Операция не распознана. Повторите ввод.");
                result = calc(num1, num2, getOperation());
        }
        return result;
    }

    private static char getOperation() {
        return 0;
    }
}
