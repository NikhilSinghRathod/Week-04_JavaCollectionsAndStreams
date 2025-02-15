package com.tit.day03javastreams.datastreams;

// Creating a class StudentDataSimulation to demonstrate storing and retrieving student details
public class StudentDataSimulation {
    public static void main(String[] args) {
        // Creating an object of StudentDataHandler
        StudentDataHandler dataHandler = new StudentDataHandler();

        // Creating a student object
        Student student = new Student(101, "Alice", 3.8);

        // File name to store student details
        String fileName = "src/main/resources/student_data.bin";

        // Storing student details
        dataHandler.storeStudentDetails(fileName, student);

        // Retrieving student details
        Student retrievedStudent = dataHandler.retrieveStudentDetails(fileName);

        // Displaying retrieved student details
        System.out.println("Retrieved Student: " + retrievedStudent);
    }
}