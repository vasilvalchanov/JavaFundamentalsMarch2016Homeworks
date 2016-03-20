package com.company;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class CombineListOfLetters {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        String[] inputLine = scanner.nextLine().split("\\s");
        List<Character> firstList = new ArrayList<>();

        for (int i = 0; i < inputLine.length ; i++) {
            firstList.add(inputLine[i].charAt(0));
        }

        inputLine = scanner.nextLine().split("\\s");
        List<Character> secondtList = new ArrayList<>();

        for (int i = 0; i < inputLine.length ; i++) {
            secondtList.add(inputLine[i].charAt(0));
        }

        List<Character> workingList = new ArrayList<>();
        for (int i = 0; i < secondtList.size() ; i++) {
            if (!firstList.contains(secondtList.get(i))){
                workingList.add(secondtList.get(i));
            }
        }

        firstList.addAll(workingList);

        for (Character ch: firstList){
            System.out.print(ch + " ");
        }
    }
}
