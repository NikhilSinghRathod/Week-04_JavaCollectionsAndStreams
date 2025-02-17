package com.tit.day05javaragexandjunit.javaragex.basicregexproblems.validatelicenseplate;
import com.tit.day05javaragexandjunit.javaragex.basicregexproblems.validateusername.UsernameValidator;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

// Creating a class TestingLicensePlateValidator to test license plate validation operations

public class TestingLicensePlate {
    // Test method for valid license plates
    LicensePlate lp = new LicensePlate();

    @Test
    //Method for valid license plate Checker
    public void validLicensePlate() {
        String input = "AB1234";
        Boolean result = lp.isvalidLicensePlate(input);
        Boolean Expected = true;
        assertEquals(Expected, result);
        System.out.println("Test Case Passed");
    }

    @Test
    //Method for invalid license Plate Checker
    public void inValidLicensePlate() {
        String input = "Ab1234";
        Boolean result = lp.isvalidLicensePlate(input);
        Boolean Expected = false;
        assertEquals(Expected, result);
        System.out.println("Test Case failed");
    }
}
