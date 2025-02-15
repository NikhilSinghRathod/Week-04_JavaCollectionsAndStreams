package com.tit.day03javastreams.readalargefilelinebyline;
import java.io.*;

// Creating a class LargeFileReaderSimulation to demonstrate reading a large file
public class LargeFileReaderSimulation {
    public static void main(String[] args) {
        // Creating an object of LargeFileReader
        LargeFileReader fileReader = new LargeFileReader();

        // File path to read
        String filePath = "src/main/resources/500MBFile.txt";

        // Reading the file and printing lines containing "error"
        fileReader.readFileAndPrintErrorLines(filePath);
    }
}
