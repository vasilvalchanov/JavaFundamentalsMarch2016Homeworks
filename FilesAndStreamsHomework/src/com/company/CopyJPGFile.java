package com.company;


import java.io.*;

public class CopyJPGFile {
    public static void main(String[] args) {

        try (FileInputStream source = new FileInputStream("smile.jpg");
             FileOutputStream destination = new FileOutputStream("my-copied-picture.jpg")) {

            byte[] buffer = new byte[4096];

            while (true) {
                int readBytes = source.read(buffer, 0, buffer.length);

                if (readBytes == -1) {
                    break;
                }

                destination.write(buffer, 0, readBytes);
            }


        } catch (FileNotFoundException ex) {
            System.out.println("File is not found");
        } catch (IOException ex) {
            ex.printStackTrace();
        }

    }

}
