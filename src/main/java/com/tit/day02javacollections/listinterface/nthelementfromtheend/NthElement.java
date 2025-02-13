package com.tit.day02javacollections.listinterface.nthelementfromtheend;

import java.util.*;

// Creating a class NthElement to demonstrate finding the Nth element from the end
public class NthElement
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);

        // Input the elements of the LinkedList
        System.out.print("Enter the elements of the LinkedList (comma-separated): ");
        String[] input = scanner.nextLine().split(",");
        LinkedList<String> list = new LinkedList<>();
        for (String s : input) {
            list.add(s.trim());
        }

        // Input the position N
        System.out.print("Enter the value of N: ");
        int n = scanner.nextInt();

        // Creating an object of NthElementFinder
        NthElementFinder finder = new NthElementFinder();

        // Finding the Nth element from the end
        try {
            String nthElement = finder.findNthFromEnd(list, n);
            System.out.println("The " + n + "th element from the end is: " + nthElement);
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }
    }
}
