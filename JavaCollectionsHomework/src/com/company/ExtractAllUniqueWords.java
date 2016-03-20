package com.company;


import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.stream.Collectors;

public class ExtractAllUniqueWords {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String inputLine = scanner.nextLine().toLowerCase();

        String[] words = inputLine.split("[^a-zA-Z]+");

        List<String> result =  Arrays.stream(words).sorted().distinct().collect(Collectors.toList());

        for (int i = 0; i < result.size() ; i++) {
            System.out.print(result.get(i) + " ");
        }


    }
}
