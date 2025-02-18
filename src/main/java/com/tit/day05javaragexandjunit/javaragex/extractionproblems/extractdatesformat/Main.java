package com.tit.day05javaragexandjunit.javaragex.extractionproblems.extractdatesformat;
import com.tit.day05javaragexandjunit.javaragex.extractionproblems.extractallemailaddressesfromatext.EmailExtractor;

import java.util.*;
public class Main {
    public static void main(String[] args) {
        // Example text for testing
        String text = "The events are scheduled for 12/05/2023, 15/08/2024, and 29/02/2020.";
        // Extract dates from the text
        List<String> dates = DateExtractor.extractDates(text);
        // Print each extracted email address
        for (String date : dates) {
            System.out.println(date);
        }
    }
}
