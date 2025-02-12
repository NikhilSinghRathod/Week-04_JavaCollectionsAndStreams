package com.tit.day01javagenerics.aidrivenresumescreeningsystem;

import java.util.ArrayList;
import java.util.List;

// Creating a class AIResumeScreeningSystem to demonstrate the Resume Screening System
public class AIResumeScreeningSystem {
    public static void main(String[] args) {
        // Creating resume objects for different job roles
        JobRole softwareEngineerResume = new SoftwareEngineer("Software Engineer Resume");
        JobRole dataScientistResume = new DataScientist("Data Scientist Resume");
        JobRole productManagerResume = new ProductManager("Product Manager Resume");

        // Creating Resume objects to manage resumes for each job role
        Resume<SoftwareEngineer> softwareEngineerResumes = new Resume<>();
        softwareEngineerResumes.addResume((SoftwareEngineer) softwareEngineerResume);

        Resume<DataScientist> dataScientistResumes = new Resume<>();
        dataScientistResumes.addResume((DataScientist) dataScientistResume);

        Resume<ProductManager> productManagerResumes = new Resume<>();
        productManagerResumes.addResume((ProductManager) productManagerResume);

        // Display all resumes in each category
        System.out.println("Software Engineer Resumes:");
        softwareEngineerResumes.displayAllResumes();

        System.out.println("\nData Scientist Resumes:");
        dataScientistResumes.displayAllResumes();

        System.out.println("\nProduct Manager Resumes:");
        productManagerResumes.displayAllResumes();

        // Using ResumeScreeningSystem class to display all resumes regardless of their job role
        System.out.println("\nDisplaying all resumes in the screening system:");
        List<JobRole> allResumes = new ArrayList<>();
        allResumes.add(softwareEngineerResume);
        allResumes.add(dataScientistResume);
        allResumes.add(productManagerResume);

        ResumeScreeningSystem.displayAllResumes(allResumes);
    }
}


