package com.company;


import java.util.Scanner;

public class CalculateExpression {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter three floating point numbers: ");
        double firstNum = scanner.nextDouble();
        double secondNum = scanner.nextDouble();
        double thirdNum = scanner.nextDouble();

        double firstFormulaPow = (firstNum + secondNum + thirdNum) / Math.sqrt(thirdNum);
        double firstFormulaResult = Math.pow(((firstNum * firstNum) + (secondNum * secondNum)) / ((firstNum * firstNum) - (secondNum * secondNum)), firstFormulaPow);

        double secondFormulaPow = firstNum - secondNum;
        double secondFormulaResult = Math.pow(((firstNum * firstNum) + (secondNum * secondNum)) - Math.pow(thirdNum, 3d), secondFormulaPow);

        double averageOfNumbers = (firstNum + secondNum + thirdNum) / 3;
        double averageValueOfTheTwoFormulas = (firstFormulaResult + secondFormulaResult) / 2;
        double result = Math.abs(averageOfNumbers - averageValueOfTheTwoFormulas);

        System.out.printf("F1 result: %.2f; F2 result: %.2f; Diff: %.2f", firstFormulaResult, secondFormulaResult, result);

    }
}
