package com.tit.day04exceptionhandling.customexception;

import java.util.Scanner;

// Creating a class AgeValidationSimulation to demonstrate age validation
public class AgeValidationSimulation {
    public static void main(String[] args) {
        // Create a Scanner object for user input
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter your age: ");

        // Read the user's age
        int age = scanner.nextInt();

        try {
            // Validate the age
            AgeValidator.validateAge(age);
        } catch (InvalidAgeException e) {
            // Print the exception message if an exception occurs
            System.out.println(e.getMessage());
        } finally {
            // Close the Scanner object
            scanner.close();
        }
    }
}
