package com.company;


import java.util.Scanner;

public class CharacterMultiplier {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String firstString = scanner.next();
        String secondString = scanner.next();

        int result = multiplyCharacters(firstString, secondString);

        System.out.println(result);
    }

    private static int multiplyCharacters(String firstString, String secondString) {


        int sum = 0;

        if (firstString.length() >= secondString.length()){

            for (int i = 0; i < firstString.length() ; i++) {

                if (i <= secondString.length() - 1){
                    sum += firstString.charAt(i) * secondString.charAt(i);
                }
                else{
                    sum += firstString.charAt(i);
                }
            }
        }
        else {

            for (int i = 0; i < secondString.length() ; i++) {

                if (i <= firstString.length() - 1){
                    sum += firstString.charAt(i) * secondString.charAt(i);
                }
                else{
                    sum += secondString.charAt(i);
                }
            }
        }

        return sum;

    }
}
