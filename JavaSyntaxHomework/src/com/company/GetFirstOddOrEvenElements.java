package com.company;


import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class GetFirstOddOrEvenElements {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] inputLine = scanner.nextLine().split("\\s+");

        int[] numbers = new int[inputLine.length];

        for (int i = 0; i < inputLine.length ; i++) {

            numbers[i] = Integer.parseInt(inputLine[i]);
        }

        String command = scanner.nextLine();

        List<Integer> result = getFirstElements(numbers, command);

        for ( Integer element : result){
            System.out.print(element + " ");
        }

    }

    private static List<Integer> getFirstElements(int[] numbers, String command) {

        String [] commandArgs = command.split("\\s+");
        int count = Integer.parseInt(commandArgs[1]);
        String type = commandArgs[2];

        if (type.equals("even")){

            List<Integer> evenElements = new ArrayList<Integer>();

            for (int element : numbers){
                if (element % 2 == 0){
                    evenElements.add(element);
                }
            }

            if (count > evenElements.size()){
                return evenElements;
            }
            else {

                List<Integer> result = new ArrayList<Integer>();
                result = evenElements.subList(0, count);

                return result;
            }

        }
        else {
            List<Integer> oddElements = new ArrayList<Integer>();

            for (int element : numbers){
                if (element % 2 != 0){
                    oddElements.add(element);
                }
            }

            if (count > oddElements.size()){
                return oddElements;
            }
            else {

                List<Integer> result = new ArrayList<Integer>();
                result = oddElements.subList(0, count);

                return result;
            }


        }
    }
}
