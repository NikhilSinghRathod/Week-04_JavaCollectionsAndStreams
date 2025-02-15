package com.tit.day03javastreams.bufferedstreams;

public class Main {
    public static void main(String[] args) {
        // Creating an object of FileHandler
        FileHandler fileHandler = new FileHandler();

        // Source and destination file paths
        String sourceFile = "src/main/java/com/tit/day03javastreams/bufferedstreams/LargeText.txt";
        String destinyFileBuffered = "src/main/resources/copiedBuffered.txt";
        String destinyFileUnbuffered = "src/main/resources/copiedUnbuffered.txt";

        // Copy file using buffered streams and measure time
        long bufferedTime = fileHandler.copyFileUsingBufferedStreams(sourceFile, destinyFileBuffered);

        // Copy file using unbuffered streams and measure time
        long unbufferedTime = fileHandler.copyFileUsingUnbufferedStreams(sourceFile, destinyFileUnbuffered);

        // Print execution times
        System.out.println("Buffered Streams Time: " + bufferedTime + " ns");
        System.out.println("Unbuffered Streams Time: " + unbufferedTime + " ns");
    }
}
