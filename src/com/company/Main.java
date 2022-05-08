package com.company;

import com.company.Calculator;

import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        int[] inputArray = new int[0];
        int[] resultArray;
        int inputArraySize;
        int resultArraySize = 0;
        int resultArrayCounter = 0;
Scanner scanner = new Scanner(System.in);
Calculator calculator = new Calculator();
int a = scanner.nextInt();

        Scanner console = new Scanner(System.in);
        System.out.print("Enter the array inputArraySize: ");
        inputArraySize = console.nextInt();

        inputArray = new int[inputArraySize];

        for (int i = 0; i < inputArray.length; i++) {
            System.out.println("Enter the value: ");
            inputArray[i] = console.nextInt();
        }
        System.out.println("inputArray includes: ");

        for (int i : inputArray) {
            System.out.print("[" + i + "]");
        }
        System.out.println();
        for (int i : inputArray) {
            if (i > 0) {
                resultArraySize++;
            }
        }
        resultArray = new int[resultArraySize];

        for(int i : inputArray) {
            if (i > 0) {
                resultArray[resultArrayCounter] = i;
                resultArrayCounter++;
            }
        }
        for (int i : resultArray) {
            System.out.print("[" + i + "]");
        }
        System.out.println();
    }
}
