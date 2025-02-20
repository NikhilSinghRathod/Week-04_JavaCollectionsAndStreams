package com.tit.day06javaannotationsandreflection.annotations.exercise.exercise5repeatableannotation;

import java.lang.reflect.Method;
import java.util.Arrays;

// Creating a main class to test the repeatable annotation and retrieve annotation details
public class Main {
    public static void main(String[] args) throws Exception {
        // Instantiate a BugTracker object
        BugTracker tracker = new BugTracker();

        // Call the method to see the execution output
        tracker.processBugs();

        // Retrieve annotation details using Reflection API
        Method method = BugTracker.class.getMethod("processBugs");
        BugReport[] bugReports = method.getAnnotationsByType(BugReport.class);

        // Print all bug reports
        Arrays.stream(bugReports)
                .forEach(bug -> System.out.println("Bug description: " + bug.description()));
    }
}