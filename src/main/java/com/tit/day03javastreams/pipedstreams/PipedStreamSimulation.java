package com.tit.day03javastreams.pipedstreams;

import java.io.*;

// Creating a class PipedStreamSimulation to demonstrate inter-thread communication using piped streams
public class PipedStreamSimulation
{
    public static void main(String[] args) {
        PipedOutputStream pos = new PipedOutputStream();
        PipedInputStream pis;

        try {
            pis = new PipedInputStream(pos);

            // Creating and starting writer and reader threads
            WriterThread writer = new WriterThread(pos);
            ReaderThread reader = new ReaderThread(pis);

            writer.start();
            reader.start();

            // Ensuring both threads complete
            writer.join();
            reader.join();
        } catch (IOException | InterruptedException e) {
            e.printStackTrace();
        }
    }
}
