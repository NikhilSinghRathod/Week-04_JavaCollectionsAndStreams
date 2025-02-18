package com.tit.day05javaragexandjunit.javaragex.extractionproblems.extractallemailaddressesfromatext;
import java.util.List;
public class EmailExtractionSimulation {
    public static void main(String[] args) {
        // Example text for testing
        String text = "Contact us at support@example.com and info@company.org";

        // Extract email addresses from the text
        List<String> emails = EmailExtractor.extractEmails(text);

        // Print each extracted email address
        for (String email : emails) {
            System.out.println(email);
        }
    }
}
