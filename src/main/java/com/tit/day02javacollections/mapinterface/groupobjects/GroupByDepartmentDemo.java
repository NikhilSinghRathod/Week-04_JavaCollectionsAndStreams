package com.tit.day02javacollections.mapinterface.groupobjects;

import java.util.*;

// Creating a class GroupByDepartmentDemo to demonstrate grouping employees by department
public class GroupByDepartmentDemo {
    public static void main(String[] args) {
        // Creating a list of employees
        List<Employee> employees = List.of(
                new Employee("Alice", "HR"),
                new Employee("Bob", "IT"),
                new Employee("Carol", "HR")
        );

        // Creating an object of GroupByDepartment
        GroupByDepartment groupByDepartment = new GroupByDepartment();

        // Grouping employees by department and printing the result
        Map<String, List<Employee>> departmentMap = groupByDepartment.groupByDepartment(employees);
        System.out.println("Grouped by department: " + departmentMap);
    }
}