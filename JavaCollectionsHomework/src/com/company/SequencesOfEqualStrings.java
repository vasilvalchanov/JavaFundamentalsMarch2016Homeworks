package com.company;


import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class SequencesOfEqualStrings {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] inputLine = scanner.nextLine().split("\\s+");

        System.out.print(inputLine[0]);

        for (int i = 1; i < inputLine.length; i++) {
            if (inputLine[i].equals(inputLine[i - 1])){
                System.out.print(" " + inputLine[i]);
            }else{
                System.out.println();
                System.out.print(inputLine[i]);
            }

        }

//        This is an another way to solve the task

//        Map<String, Integer> words = new LinkedHashMap<>();
//        for (int i = 0; i < inputLine.length ; i++) {
//            if (!words.containsKey(inputLine[i])){
//                words.put(inputLine[i], 1);
//            }else {
//                Integer count = words.get(inputLine[i]);
//                words.put(inputLine[i], count + 1);
//            }
//        }
//
//        for (Map.Entry<String, Integer> word : words.entrySet()) {
//            for (int i = 0; i < word.getValue() ; i++) {
//                System.out.print(word.getKey() + " ");
//            }
//            System.out.println();
//        }
    }
}
