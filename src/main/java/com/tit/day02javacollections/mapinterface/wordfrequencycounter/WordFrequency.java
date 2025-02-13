package com.tit.day02javacollections.mapinterface.wordfrequencycounter;

import java.io.IOException;
import java.util.Map;

// Creating a class WordFrequency to demonstrate counting word frequency
public class WordFrequency {
    public static void main(String[] args) {
        String filePath = "src/main/java/com/tit/day02javacollections/mapinterface/wordfrequencycounter/large_text_file.txt";

        // Creating an object of WordFrequencyCounter
        WordFrequencyCounter counter = new WordFrequencyCounter();
        System.out.println("Word frequencies: ");

        try {
            // Counting word frequency and printing the result
            Map<String, Integer> wordCountMap = counter.countWordFrequency(filePath);
            System.out.println(wordCountMap);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
