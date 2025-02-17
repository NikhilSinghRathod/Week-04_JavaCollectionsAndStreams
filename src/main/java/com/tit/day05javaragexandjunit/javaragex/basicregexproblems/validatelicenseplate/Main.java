package com.tit.day05javaragexandjunit.javaragex.basicregexproblems.validatelicenseplate;

import java.util.List;

//Creating the class to demonstrate the Validate the license the valid number plate
public class Main {
    public static void main(String[] args) {
        //Creating an array of number plates
        String[] numberPlates = {"AB1234","Ab1238","1234ab","ZZ12345"};
        //Traversing through each String and Checking
        for(String plate : numberPlates){
            if(LicensePlate.isvalidLicensePlate(plate)){
                System.out.println("The number is valid "+plate);
            }
            else{
                System.out.println("The number is invalid "+plate);
            }
        }
    }
}
