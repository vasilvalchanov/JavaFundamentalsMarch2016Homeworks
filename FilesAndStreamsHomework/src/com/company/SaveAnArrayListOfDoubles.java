package com.company;


import java.io.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class SaveAnArrayListOfDoubles {
    public static void main(String[] args) {

        List<Double> doublesNumbers = new ArrayList<Double>();
        doublesNumbers.addAll(Arrays.asList(2.2, 5.6, 1.1, 0.5, 9.3));

        try(ObjectOutputStream destination = new ObjectOutputStream(new FileOutputStream("doubles.list"))){

            for(Double num : doublesNumbers){
                destination.writeDouble(num);
            }


        }catch (FileNotFoundException ex){
            System.out.println("File is not found");
        } catch (IOException ex){
            ex.printStackTrace();
        }

        try(ObjectInputStream source = new ObjectInputStream(new FileInputStream("doubles.list"))){

            for (int i = 0; i < doublesNumbers.size() ; i++) {
                Double num = source.readDouble();
                System.out.println(num);
            }

        }catch (FileNotFoundException ex){
            System.out.println("File is not found");
        } catch (IOException ex){
            ex.printStackTrace();
        }

    }
}
