package com.tit.day02javacollections.setinterface.unionandintersection;

import java.util.*;

// Creating a class UnionIntersect to demonstrate union and intersection
public class UnionIntersect
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

        // Computing union and intersection
        Set<Integer> unionSet = operations.union(set1, set2);
        Set<Integer> intersectionSet = operations.intersection(set1, set2);

        // Printing the union and intersection sets
        System.out.println("Union of sets: " + unionSet);
        System.out.println("Intersection of sets: " + intersectionSet);
    }
}
