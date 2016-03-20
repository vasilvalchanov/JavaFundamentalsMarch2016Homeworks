package com.company;


import java.util.Arrays;
import java.util.Scanner;

public class SortArrayOfNumbers {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int number = scanner.nextInt();
        int[] numbers = new int[number];

        for (int i = 0; i < number ; i++) {
            numbers[i] = scanner.nextInt();
        }

        Arrays.sort(numbers);
        for (int i = 0; i < numbers.length ; i++) {
            System.out.print(numbers[i] + " ");
        }
    }
}
