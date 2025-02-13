package com.tit.day02javacollections.setinterface.checkiftwosetsareequal;

import java.util.*;

// Creating a class EqualSet to demonstrate set equality check
public class EqualSet
{
    public static void main(String[] args) {
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

        // Creating an object of SetEqualityChecker
        SetEqualityChecker checker = new SetEqualityChecker();

        // Checking if the sets are equal
        boolean areEqual = checker.areSetsEqual(set1, set2);
        System.out.println("Are the sets equal? " + areEqual);
    }
}

