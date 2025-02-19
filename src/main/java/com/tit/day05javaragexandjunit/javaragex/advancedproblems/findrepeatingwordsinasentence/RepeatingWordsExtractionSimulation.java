package com.tit.day05javaragexandjunit.javaragex.advancedproblems.findrepeatingwordsinasentence;

import java.util.Set;



// Creating a class RepeatingWordsExtractionSimulation to demonstrate repeating words extraction
public class RepeatingWordsExtractionSimulation {
    public static void main(String[] args) {
        // Example text for testing
        String text = "This is is a repeated repeated word test.";

        // Find repeating words in the text
        Set<String> repeatingWords = RepeatingWordsExtractor.findRepeatingWords(text);

        // Print each repeating word
        for (String word : repeatingWords) {
            System.out.println(word);
        }
    }
}