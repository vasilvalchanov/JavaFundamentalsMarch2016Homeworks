package com.company;

import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;


public class MostFrequentWord {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String inputLine = scanner.nextLine().toLowerCase();

        String[] words = inputLine.split("[^a-zA-Z]+");

        Map<String, Integer> wordOccurences = new TreeMap<>();
        int frequency = 0;

        for (int i = 0; i < words.length ; i++) {
            if (!wordOccurences.containsKey(words[i])){
                wordOccurences.put(words[i], 0);
            }

            int count = wordOccurences.get(words[i]);
            wordOccurences.put(words[i], count + 1);

            if (wordOccurences.get(words[i]) > frequency){
                frequency = wordOccurences.get(words[i]);
            }
        }

        for (Map.Entry<String, Integer> pairs : wordOccurences.entrySet()){
            if (pairs.getValue() == frequency){
                System.out.printf("%s -> %d times", pairs.getKey(), pairs.getValue());
                System.out.println();
            }
        }
    }
}
