package com.company;

import java.util.Scanner;


public class FormattingNumbers {
    public static void main(String[] args) {
        System.out.print("Enter 3 numbers: integer in range [0-500], double, double: ");
        Scanner scanner = new Scanner(System.in);
        int firstNum = scanner.nextInt();
        double secondNum = scanner.nextDouble();
        double thirdNum = scanner.nextDouble();

        System.out.printf(
                "|%-10s|%s|%10.2f|%-10.3f|",
                Integer.toHexString(firstNum).toUpperCase(),
                String.format("%10s", Integer.toBinaryString(firstNum)).replace(' ', '0'),
                secondNum,
                thirdNum);
    }
}
