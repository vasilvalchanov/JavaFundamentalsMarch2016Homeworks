package com.company;


import java.util.Arrays;
import java.util.Scanner;

public class CountSpecifiedWord {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String sentence = scanner.nextLine().toLowerCase();
        String currentWord = scanner.nextLine().toLowerCase();
        int counter = 0;

        String[] words = sentence.split("[^a-zA-Z]+");

        for (int i = 0; i < words.length ; i++) {

            if (words[i].equals(currentWord)){
                counter++;
            }
        }

        System.out.println(counter);

    }
}
