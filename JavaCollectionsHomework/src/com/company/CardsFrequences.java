package com.company;


import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class CardsFrequences {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String inputLine = scanner.nextLine();

        String[] cards = inputLine.split("\\s+");

        Map<String, Integer> cardsOccurences = new LinkedHashMap<>();

        for (int i = 0; i < cards.length ; i++) {
            String cardFace = cards[i].substring(0, cards[i].length() - 1);
            if (!cardsOccurences.containsKey(cardFace)){
                cardsOccurences.put(cardFace, 0);
            }

            int count = cardsOccurences.get(cardFace);
            cardsOccurences.put(cardFace, count + 1);
        }

        for (Map.Entry pair : cardsOccurences.entrySet()){

            System.out.printf("%s -> %.2f%%", pair.getKey(),((int)pair.getValue() / (double)cards.length) * 100);
            System.out.println();
        }
    }
}
