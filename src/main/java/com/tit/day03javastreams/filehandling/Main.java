package com.tit.day03javastreams.filehandling;

public class Main {
    public static void main(String[] args) {
       //creating the object of the class File handler
        FileHandler fh = new FileHandler();

        //Giving the file path
        String source = "src/main/java/com/tit/day03javastreams/filehandling/LargeText.txt";
        String destination = "src/main/java/com/tit/day03javastreams/filehandling/CopyFileText.txt";
         //calling the method
        fh.copyFile(source,destination);

    }
}
