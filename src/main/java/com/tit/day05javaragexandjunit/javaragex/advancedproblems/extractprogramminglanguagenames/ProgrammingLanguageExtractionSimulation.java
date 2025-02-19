package com.tit.day05javaragexandjunit.javaragex.advancedproblems.extractprogramminglanguagenames;

import java.util.List;

// Creating a class ProgrammingLanguageExtractionSimulation to demonstrate programming language extraction
public class ProgrammingLanguageExtractionSimulation {
    public static void main(String[] args) {
        // Example text for testing
        String text = "I love Java, Python, and JavaScript, but I haven't tried Go yet.";

        // Extract programming languages from the text
        List<String> languages = ProgrammingLanguageExtractor.extractProgrammingLanguages(text);

        // Print each extracted programming language name
        for (String language : languages) {
            System.out.println(language);
        }
    }
}