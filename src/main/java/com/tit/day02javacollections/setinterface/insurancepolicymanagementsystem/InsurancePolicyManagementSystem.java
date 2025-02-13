package com.tit.day02javacollections.setinterface.insurancepolicymanagementsystem;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;


import java.util.Date;

// Creating a class InsurancePolicyManagementSystem to demonstrate the PolicyManager
public class InsurancePolicyManagementSystem {
    public static void main(String[] args) throws ParseException {
        PolicyManager manager = new PolicyManager();

        // Adding some policies
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        manager.addPolicy(new Policy("P123", "John Doe", sdf.parse("2025-12-15"), "Health", 1000.0));
        manager.addPolicy(new Policy("P124", "Jane Smith", sdf.parse("2025-11-20"), "Auto", 800.0));
        manager.addPolicy(new Policy("P125", "Alice Johnson", sdf.parse("2025-10-30"), "Home", 1200.0));
        manager.addPolicy(new Policy("P126", "Bob Brown", sdf.parse("2025-12-10"), "Health", 1000.0));
        manager.addPolicy(new Policy("P123", "John Doe", sdf.parse("2025-12-15"), "Health", 1000.0));

        // Retrieving all unique policies
        Set<Policy> uniquePolicies = manager.getAllUniquePolicies();
        System.out.println("All unique policies:");
        uniquePolicies.forEach(System.out::println);

        // Retrieving policies expiring soon
        Set<Policy> expiringSoon = manager.getPoliciesExpiringSoon(30);
        System.out.println("\nPolicies expiring within the next 30 days:");
        expiringSoon.forEach(System.out::println);

        // Retrieving policies with specific coverage type
        Set<Policy> healthPolicies = manager.getPoliciesByCoverageType("Health");
        System.out.println("\nPolicies with Health coverage:");
        healthPolicies.forEach(System.out::println);

        // Retrieving duplicate policies
        Set<Policy> duplicatePolicies = manager.getDuplicatePolicies();
        System.out.println("\nDuplicate policies:");
        duplicatePolicies.forEach(System.out::println);

        // Performance comparison
        Policy newPolicy = new Policy("P127", "Chris Evans", sdf.parse("2025-11-25"), "Auto", 900.0);
        manager.comparePerformance(newPolicy);
    }
}

