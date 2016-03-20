package com.company;


import java.util.Scanner;

public class ConvertFromDecimalSystemToBase7 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter an integer number: ");
        int number = scanner.nextInt();

        String numberToBase7 = Integer.toString(number, 7);

        System.out.println(numberToBase7);
    }
}
