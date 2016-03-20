package com.company;


import java.util.Scanner;

public class TrianglesArea {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter integer coordinates X and Y of three points: ");
       int aX = scanner.nextInt();
       int aY = scanner.nextInt();
       int bX = scanner.nextInt();
       int bY = scanner.nextInt();
       int cX = scanner.nextInt();
       int cY = scanner.nextInt();

        boolean canFormTriangle = checkIfThesePointsFormTriangle(aX, aY, bX, bY, cX, cY);
        double trianglesArea = 0d;

        if (canFormTriangle){
            trianglesArea = calculateTrianglesArea(aX, aY, bX, bY, cX, cY);
        }

        System.out.println((int)trianglesArea);
    }

    private static double calculateTrianglesArea(int aX, int aY, int bX, int bY, int cX, int cY) {

        double area = Math.abs(aX * (bY - cY) + bX * (cY - aY)+ cX * (aY - bY)) / 2;

        return area;
    }

    private static boolean checkIfThesePointsFormTriangle(int aX, int aY, int bX, int bY, int cX, int cY) {
        double distanceAB = Math.sqrt(((bX - aX)*(bX - aX)) + ((bY - aY)*(bY - aY)));
        double distanceAC = Math.sqrt(((cX - aX)*(cX - aX)) + ((cY - aY)*(cY - aY)));
        double distanceBC = Math.sqrt(((cX - bX)*(cX - bX)) + ((cY - bY)*(cY - bY)));

        if (distanceAB + distanceAC > distanceBC && distanceAB + distanceBC > distanceAC && distanceAC + distanceBC > distanceAB){

            return true;
        }

        return false;
    }
}
