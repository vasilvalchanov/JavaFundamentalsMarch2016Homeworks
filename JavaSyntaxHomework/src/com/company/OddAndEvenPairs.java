package com.company;


import java.util.Scanner;

public class OddAndEvenPairs {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String[] inputLine = scanner.nextLine().split("\\s+");

        if (inputLine.length % 2 != 0){
            System.out.println("Invalid length");
        }
        else {

            int[]numbers = new int[inputLine.length];

            for (int i = 0; i < numbers.length ; i++) {

                numbers[i] = Integer.parseInt(inputLine[i]);
            }

            for (int i = 0; i < numbers.length - 1  ; i+=2) {

                if (numbers[i] % 2 == 0 && numbers[i + 1] % 2 == 0){
                    System.out.printf("%d, %d -> both are even", numbers[i], numbers[i + 1]);
                    System.out.println();
                }

                if (numbers[i] % 2 != 0 && numbers[i + 1] % 2 != 0){
                    System.out.printf("%d, %d -> both are odd", numbers[i], numbers[i + 1]);
                    System.out.println();
                }

                if ((numbers[i] % 2 != 0 && numbers[i + 1] % 2 == 0) || (numbers[i] % 2 == 0 && numbers[i + 1] % 2 != 0) ){
                    System.out.printf("%d, %d -> different", numbers[i], numbers[i + 1]);
                    System.out.println();
                }
            }
        }


    }
}
