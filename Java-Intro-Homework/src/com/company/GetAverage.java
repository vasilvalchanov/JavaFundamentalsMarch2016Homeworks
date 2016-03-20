package com.company;


import java.util.Scanner;

public class GetAverage {
    public static void main(String arg[]){

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter three arbitrary numbers to recieve their average: ");
        double firstNumber = scanner.nextDouble();
        double secondNumber = scanner.nextDouble();
        double thirdNumber = scanner.nextDouble();

        double averageNum = calculateAverageByThreeNumbers(firstNumber, secondNumber, thirdNumber);

        System.out.printf("%.2f",averageNum );
    }

    private static double calculateAverageByThreeNumbers(double first, double second, double third){

        double averageNumber = (first + second + third) / 3;

        return averageNumber;
    }
}
