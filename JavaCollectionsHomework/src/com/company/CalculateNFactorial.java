package com.company;


import java.util.Scanner;

public class CalculateNFactorial {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number in range [1,20]: ");
        long number = scanner.nextLong();
        long factorial = calculateFactorial(number);
        System.out.println(factorial);
    }

    private static long calculateFactorial(long number) {
        if(number == 1 || number == 0) {
            return 1;
        }

        return number * calculateFactorial(number - 1);
    }
    }

