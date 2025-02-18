package com.tit.day05javaragexandjunit.javaragex.basicregexproblems.hexcolorcode;

// Creating a class HexColorValidationSimulation to demonstrate hex color code validation
public class HexColorCode {
    public static void main(String[] args) {
        // Example hex color codes for testing
        String[] hexColors = {"#FFA500", "#ff4500", "#123", "#ABCDEF"};

        // Validate each hex color code and print whether it is valid or invalid
        for (String hexColor : hexColors) {
            if (Main.isValidHexColor(hexColor)) {
                System.out.println(hexColor + " → Valid");
            } else {
                System.out.println(hexColor + " → Invalid");
            }
        }
    }
}