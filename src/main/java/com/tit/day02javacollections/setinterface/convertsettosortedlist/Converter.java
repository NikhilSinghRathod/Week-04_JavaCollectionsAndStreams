package com.tit.day02javacollections.setinterface.convertsettosortedlist;

import java.util.*;

// Creating a class Converter to demonstrate converting a HashSet to a sorted list
public class Converter
{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input the elements of the HashSet
        System.out.print("Enter the elements of the HashSet (comma-separated): ");
        String[] input = scanner.nextLine().split(",");
        Set<Integer> set = new HashSet<>();
        for (String s : input) {
            set.add(Integer.parseInt(s.trim()));
        }

        // Creating an object of SetToSortedList
        SetToSortedList converter = new SetToSortedList();

        // Converting the HashSet to a sorted list
        List<Integer> sortedList = converter.convertToSortedList(set);

        // Printing the sorted list
        System.out.println("Sorted list: " + sortedList);
    }
}



