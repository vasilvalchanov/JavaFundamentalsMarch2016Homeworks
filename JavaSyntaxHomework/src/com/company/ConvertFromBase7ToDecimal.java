package com.company;


import java.util.Scanner;

public class ConvertFromBase7ToDecimal {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter an integer number: ");
        String numberBase7 = scanner.next();

        int decimalNumber = Integer.valueOf(numberBase7, 7);

        System.out.println(decimalNumber);

    }

}
