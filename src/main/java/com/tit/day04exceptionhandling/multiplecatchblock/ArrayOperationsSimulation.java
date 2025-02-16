package com.tit.day04exceptionhandling.multiplecatchblock;

import java.util.Scanner;

// Creating a class ArrayOperationsSimulation to demonstrate array operations
public class ArrayOperationsSimulation
{
    public static void main(String[] args)
    {
        // Creating an object of ArrayHandler
        ArrayHandler arrayHandler = new ArrayHandler();

        // Example array
        Integer[] array = {1, 2, 3, 4, 5};

        // Scanner object for user input
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the index number: ");
        int index = scanner.nextInt();

        // Retrieve and print the value at the specified index
        arrayHandler.getValueAtIndex(array, index);

        // Closing the scanner object
        scanner.close();
    }
}
