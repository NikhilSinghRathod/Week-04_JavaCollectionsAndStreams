package com.tit.day04exceptionhandling.nestedtrycatch;
import java.util.Scanner;
// Creating a class ArrayDivisionSimulation to demonstrate array division operation
public class ArrayDivisionSimulation
{
    public static void main(String[] args)
    {
        // Creating an object of ArrayDivisionHandler
        ArrayDivisionHandler handler = new ArrayDivisionHandler();

        // Scanner object for user input
        Scanner scanner = new Scanner(System.in);

        // Example array
        Integer[] array = {10, 20, 30, 40, 50};

        // Prompt the user to enter an index
        System.out.print("Enter the index number: ");
        int index = scanner.nextInt();

        // Prompt the user to enter a divisor
        System.out.print("Enter the divisor: ");
        int divisor = scanner.nextInt();

        // Perform the division operation
        handler.divideElementAtIndex(array, index, divisor);

        // Closing the scanner object
        scanner.close();
    }
}