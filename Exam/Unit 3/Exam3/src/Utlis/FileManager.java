/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Utlis;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

/**
 *
 * @author HP-LAPTOP-14
 */
public class FileManager {
 
 public static boolean createdFile(String fileName){
    
boolean created = false;
        try {
        
            File file = new File(fileName + ".txt");
            if (file.createNewFile()) {
                System.out.println("file was created");

                created = true;
            } else {
                System.out.println("file already exists");
                created = false;

            }
        } catch (IOException ex) {
                 
            created = false;
        }
        return created;

    }

    public static boolean save(String data, String fileName) {
        boolean saved = false;

        createdFile(fileName);

        try {
            FileWriter myWrite = new FileWriter(fileName + ".csv", true);
            myWrite.write(System.getProperty("line.separator") + data);
            myWrite.close();
            System.out.println("a new record of " + fileName + " was saved");
            saved = true;
        } catch (IOException ex){
            ex.printStackTrace();
        saved =false;
        
    }
        return saved;
    }
    public static String read(String fileShoe) {
        fileShoe = null;
        String text = null;
        String document = "C:\\Users\\HP-LAPTOP-14\\Documents\\codigo\\ESPE202011_FP-GEO-3285\\workshops\\unit03\\WS27ADT\\wildAnimalSystem\\Lions.txt";
        try ( BufferedReader textBr = new BufferedReader(new FileReader(document))) {
            while ((fileShoe = textBr.readLine()) != null) {
                text = fileShoe;
            }
        } catch (IOException ex) {
            System.out.println("Error");
            ex.printStackTrace();
        }
        return text;
    }

 }

    

