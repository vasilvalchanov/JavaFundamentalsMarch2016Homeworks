package com.company;


import java.util.Scanner;

public class CountAllWords {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String sentence = scanner.nextLine();

        String[] words = sentence.split("[^a-zA-Z]+");
        System.out.println(words.length);
    }
}
