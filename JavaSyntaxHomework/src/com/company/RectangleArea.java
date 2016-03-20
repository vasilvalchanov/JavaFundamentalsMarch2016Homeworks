package com.company;

import java.util.Scanner;

public class RectangleArea {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter two sides of rectangle to get its area: ");
        int a = scanner.nextInt();
        int b = scanner.nextInt();

        int area = calculateRectangleArea(a, b);

        System.out.println(area);

    }
    private static int calculateRectangleArea(int sideA, int sideB){
        int area = sideA * sideB;
        return area;
    }
}
