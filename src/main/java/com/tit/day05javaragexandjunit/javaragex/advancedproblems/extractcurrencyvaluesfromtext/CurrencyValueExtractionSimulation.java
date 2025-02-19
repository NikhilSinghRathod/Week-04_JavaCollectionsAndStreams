package com.tit.day05javaragexandjunit.javaragex.advancedproblems.extractcurrencyvaluesfromtext;

import java.util.List;



// Creating a class CurrencyValueExtractionSimulation to demonstrate currency value extraction
public class CurrencyValueExtractionSimulation {
    public static void main(String[] args) {
        // Example text for testing
        String text = "The price is $45.99, and the discount is 10.50.";

        // Extract currency values from the text
        List<String> values = CurrencyValueExtractor.extractCurrencyValues(text);

        // Print each extracted currency value
        for (String value : values) {
            System.out.println(value);
        }
    }
}