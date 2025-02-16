package com.tit.day04exceptionhandling.finallyblockexecution;
import java.util.Scanner;
// Creating a class DivisionSimulation to demonstrate division operation
public class DivisionSimulation
{
    public static void main(String[] args) {
        // Creating an object of DivisionHandler
        DivisionHandler divisionHandler = new DivisionHandler();

        // Scanner object for user input
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the numerator: ");
        int numerator = scanner.nextInt();
        System.out.print("Enter the denominator: ");
        int denominator = scanner.nextInt();

        // Perform the division
        divisionHandler.performDivision(numerator, denominator);

        // Closing the scanner object
        scanner.close();
    }
}