package com.company;


import java.io.*;

public class AllCapitals {
    public static void main(String[] args) {

        try(BufferedReader reader = new BufferedReader(new FileReader(new File("text.txt")))){

            String line = reader.readLine();

            StringBuilder formatedText = new StringBuilder();
            while (line != null){

                formatedText.append(line.toUpperCase() + "\n");
                line = reader.readLine();
            }

            try(PrintWriter writer = new PrintWriter(new FileWriter(new File("text.txt")))){

                writer.append(formatedText.toString());
            } catch (IOException ex){
                ex.printStackTrace();
            }

        } catch (FileNotFoundException ex){
            System.out.println("File is not found");
        } catch (IOException ex){
            ex.printStackTrace();
        }
    }
}
