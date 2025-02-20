package com.tit.day06javaannotationsandreflection.annotations.exercise.exercise4customannotation;

import java.lang.reflect.Method;

// Creating a main class to test the custom annotation and retrieve annotation details
public class Main {
    public static void main(String[] args) throws Exception {
        // Instantiate a TaskManager object
        TaskManager manager = new TaskManager();

        // Call the methods to see the execution output
        manager.task1();
        manager.task2();

        // Retrieve annotation details using Reflection API
        Method method1 = TaskManager.class.getMethod("task1");
        TaskInfo taskInfo1 = method1.getAnnotation(TaskInfo.class);
        System.out.println("Task 1 - Priority: " + taskInfo1.priority() + ", Assigned to: " + taskInfo1.assignedTo());

        Method method2 = TaskManager.class.getMethod("task2");
        TaskInfo taskInfo2 = method2.getAnnotation(TaskInfo.class);
        System.out.println("Task 2 - Priority: " + taskInfo2.priority() + ", Assigned to: " + taskInfo2.assignedTo());
    }
}
