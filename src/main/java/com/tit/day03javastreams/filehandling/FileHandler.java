package com.tit.day03javastreams.filehandling;
import java.io.*;

//Creating a class to handle the file
public class FileHandler {
    //Method to copy the context from another file
    public void copyFile(String sourceFile ,String destinationFile ){
        FileInputStream fis = null;
        FileOutputStream fos = null;

        try{
            //Check if the file exist
            File Source = new File(sourceFile);
            if(!Source.exists()){
                System.out.println("File doesn't exist");
                return;
            }
            fis = new FileInputStream(sourceFile);
            fos = new FileOutputStream(destinationFile);
            int bytedata;
            while ((bytedata = fis.read()) !=-1){
                  fos.write(bytedata);
            }
            System.out.println("File copied successfully.");
        }
        catch (IOException e){
            e.printStackTrace();
        }
    }
}
