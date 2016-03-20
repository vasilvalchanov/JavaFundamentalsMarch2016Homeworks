package com.company;



import java.util.Scanner;

public class GhetoNumeralSystem {
    public static void main(String arg[]){

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter an arbitrary integer number and you will recieve its Ghetto numeral system representation: ");
        String number = scanner.nextLine();

        for (int i = 0; i < number.length() ; i++) {

            convertNumber(number.charAt(i));
        }


    }

    private static void convertNumber(char symbol){

        switch (symbol){
            case '0':
                System.out.print("Gee");
                break;
            case '1':
                System.out.print("Bro");
                break;
            case '2':
                System.out.print("Zuz");
                break;
            case '3':
                System.out.print("Ma");
                break;
            case '4':
                System.out.print("Duh");
                break;
            case '5':
                System.out.print("Yo");
                break;
            case '6':
                System.out.print("This");
                break;
            case '7':
                System.out.print("Hood");
                break;
            case '8':
                System.out.print("Jam");
                break;
            case '9':
                System.out.print("Mack");
                break;

        }
    }
}
