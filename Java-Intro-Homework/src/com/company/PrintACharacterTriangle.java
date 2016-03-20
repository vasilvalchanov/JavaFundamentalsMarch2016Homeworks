package com.company;


import java.util.Scanner;

public class PrintACharacterTriangle {
    public static void main(String arg[]){

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a number ");
        int number = scanner.nextInt();

        char symbol = 'a';
        for (int i = 0; i <= number ; i++) {
            for (int j = 0; j < i ; j++) {

                System.out.print((char)(symbol + j) + " ");

            }
            System.out.println();
        }

        for (int i = number - 1; i >= 0; i--){
            for (int j = 0; j < i ; j++) {

                System.out.print((char)(symbol + j) + " ");

            }
            System.out.println();
        }
    }
}
