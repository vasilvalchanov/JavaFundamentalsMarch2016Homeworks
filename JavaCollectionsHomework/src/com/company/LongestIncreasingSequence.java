package com.company;


import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class LongestIncreasingSequence {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] inputLine = scanner.nextLine().split("\\s+");
        int[] numbers = new int[inputLine.length];
        for (int i = 0; i < numbers.length ; i++) {
            numbers[i] = Integer.parseInt(inputLine[i]);
        }

        List<Integer> increasingSequence = new ArrayList<>();
        List<Integer> maxIncreasingSequence = new ArrayList<>();


        increasingSequence.add(numbers[0]);


        for (int i = 1; i < numbers.length; i++) {
            if (numbers[i] > numbers[i - 1]){
                increasingSequence.add(numbers[i]);
            }else{
                if (increasingSequence.size() > maxIncreasingSequence.size()){
                    maxIncreasingSequence.clear();
                    maxIncreasingSequence.addAll(increasingSequence);
                    printSequence(increasingSequence);
                    increasingSequence.clear();
                    increasingSequence.add(numbers[i]);
                }else {
                    printSequence(increasingSequence);
                    increasingSequence.clear();
                    increasingSequence.add(numbers[i]);
                }
            }
        }

        if (increasingSequence.size() > maxIncreasingSequence.size()){
            maxIncreasingSequence.clear();
            maxIncreasingSequence.addAll(increasingSequence);
        }
            printSequence(increasingSequence);


        System.out.print("Longest: ");
        printSequence(maxIncreasingSequence);
    }

    private static void printSequence(List<Integer> numbers){
        for (int i = 0; i < numbers.size() ; i++) {
            System.out.print(numbers.get(i) + " ");
        }

        System.out.println();
    }
}
