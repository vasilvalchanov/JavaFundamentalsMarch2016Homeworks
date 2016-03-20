package com.company;


import java.io.*;
import java.util.Arrays;

public class CountCharacters {
    public static void main(String[] args) {

        Character[] vowels = new Character[] {'a', 'e', 'i', 'o', 'u'};
        Character[] punctMarks= new Character[] {'.', ',', '!', '?'};

        try(BufferedReader reader = new BufferedReader(new FileReader(new File("words.txt")))){

            int vowelsCount = 0;
            int punctMarksCount = 0;
            int consonantsCount = 0;

            int ch = reader.read();

            while ( ch != -1){

                char currentChar = (char)ch;
                if (Character.isLetter(currentChar)){

                    if (Arrays.asList(vowels).contains(currentChar)){
                        vowelsCount++;
                    }else {
                        consonantsCount++;
                    }
                }else {

                    if (Arrays.asList(punctMarks).contains(currentChar)){
                        punctMarksCount++;
                    }
                }

                ch = reader.read();
            }

            try(PrintWriter writer = new PrintWriter(new FileWriter(new File("count-chars.txt")))){

                writer.write(java.lang.String.format("Vowels: %d\n" +
                        "Consonants: %d\n" +
                        "Punctuation: %d\n", vowelsCount, consonantsCount, punctMarksCount));
            } catch (IOException ex){
                ex.printStackTrace();
            }


        }catch (FileNotFoundException ex){
            System.out.println("File is not found");
        } catch (IOException ex){
            ex.printStackTrace();
        }
    }
}
