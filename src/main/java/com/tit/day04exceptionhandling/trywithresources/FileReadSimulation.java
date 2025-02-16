package com.tit.day04exceptionhandling.trywithresources;

// Creating a class FileReadSimulation to demonstrate file reading operation
public class FileReadSimulation {
    public static void main(String[] args) {
        // Creating an object of FileHandler
        FileHandler fileHandler = new FileHandler();
        // File name
        String fileName = "src/main/resources/data.txt";
        // Reading the first line of the file
        fileHandler.readFirstLine(fileName);
    }
}
