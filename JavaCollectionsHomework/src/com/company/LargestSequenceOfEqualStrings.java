package com.company;


import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class LargestSequenceOfEqualStrings {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String[] inputLine = scanner.nextLine().split("\\s+");
        List<String> equalStrings = new ArrayList<>();
        List<String> maxEqualStrings = new ArrayList<>();


        equalStrings.add(inputLine[0]);


        for (int i = 1; i < inputLine.length; i++) {
            if (inputLine[i].equals(inputLine[i - 1])){
                equalStrings.add(inputLine[i]);
            }else{
                if (equalStrings.size() > maxEqualStrings.size()){
                    maxEqualStrings.clear();
                    maxEqualStrings.addAll(equalStrings);
                    equalStrings.clear();
                    equalStrings.add(inputLine[i]);
                }else {
                    equalStrings.clear();
                    equalStrings.add(inputLine[i]);
                }
            }
        }

        if (equalStrings.size() > maxEqualStrings.size()){
            maxEqualStrings.clear();
            maxEqualStrings.addAll(equalStrings);
        }

        System.out.println(maxEqualStrings);


    }
}
