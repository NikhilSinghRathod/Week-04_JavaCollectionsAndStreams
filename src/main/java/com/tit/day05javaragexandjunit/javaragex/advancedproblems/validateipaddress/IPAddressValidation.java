package com.tit.day05javaragexandjunit.javaragex.advancedproblems.validateipaddress;

import java.util.regex.Pattern;

// Creating a class IPAddressValidationSimulation to demonstrate IP address validation
public class IPAddressValidation {
    public static void main(String[] args) {
        // Example IP addresses for testing
        String[] ipAddresses = {"192.168.0.1", "255.255.255.255", "256.256.256.256", "1.45.67.89"};

        // Validate each IP address and print whether it is valid or invalid
        for (String ipAddress : ipAddresses) {
            if (IPAddressValidator.isValidIPAddress(ipAddress)) {
                System.out.println(ipAddress + " → Valid");
            } else {
                System.out.println(ipAddress + " → Invalid");
            }
        }
    }
}
