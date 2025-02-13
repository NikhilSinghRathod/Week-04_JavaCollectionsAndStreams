package com.tit.day02javacollections.setinterface.symmetricdifference;

import java.util.*;

// Creating a class SetOperationsDemo to demonstrate symmetric difference
public class SetSymmetricDifference
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);

        // Input the elements of Set1
        System.out.print("Enter the elements of Set1 (comma-separated): ");
        String[] input1 = scanner.nextLine().split(",");
        Set<Integer> set1 = new HashSet<>();
        for (String s : input1) {
            set1.add(Integer.parseInt(s.trim()));
        }

        // Input the elements of Set2
        System.out.print("Enter the elements of Set2 (comma-separated): ");
        String[] input2 = scanner.nextLine().split(",");
        Set<Integer> set2 = new HashSet<>();
        for (String s : input2) {
            set2.add(Integer.parseInt(s.trim()));
        }

        // Creating an object of SetOperations
        SetOperations operations = new SetOperations();

        // Computing symmetric difference
        Set<Integer> symmetricDifferenceSet = operations.symmetricDifference(set1, set2);

        // Printing the symmetric difference set
        System.out.println("Symmetric Difference of sets: " + symmetricDifferenceSet);
    }
}

