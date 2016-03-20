package com.company;


import java.util.*;

public class RandomizeNumbersFromNToM {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter two integers : ");

        int N = scanner.nextInt();
        int M = scanner.nextInt();

        Random random = new Random();
        int minNumber = Math.min(N, M);
        int maxNumber = Math.max(N, M);
        List<Integer> numbers = new ArrayList<>();

        for (int i = minNumber; i <= maxNumber ; i++) {

            numbers.add(i);
        }

        Collections.shuffle(numbers);

        for (int i = 0; i < numbers.size(); i++) {
            System.out.print(numbers.get(i) + " ");
        }
    }
}
