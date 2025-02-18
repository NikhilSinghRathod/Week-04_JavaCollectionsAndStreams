package com.tit.day05javaragexandjunit.javaragex.extractionproblems.extractallcapitalizedwordsfromasentence;
import java.util.*;
public class CapitalizedWordsExtraction {
    public static void main(String[] args) {
        // Example text for testing
        String text = "The Eiffel Tower is in Paris and the Statue of Liberty is in New York.";

        // Extract capitalized words from the text
        List<String> capitalizedWords = CapitalizedWordsExtractor.extractCapitalizedWords(text);

        // Print each extracted capitalized word
        for (String word : capitalizedWords) {
            System.out.println(word);
        }
    }
}
