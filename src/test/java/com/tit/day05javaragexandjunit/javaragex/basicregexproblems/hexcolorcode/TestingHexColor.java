package com.tit.day05javaragexandjunit.javaragex.basicregexproblems.hexcolorcode;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

// Creating a class TestingHexColorValidator to test hex color code validation operations
class TestingHexColorValidator
{

    // Test method for valid hex color codes
    @Test
    void testValidHexColors() {
        assertTrue(Main.isValidHexColor("#FFA500"));
        assertTrue(Main.isValidHexColor("#ff4500"));
        assertTrue(Main.isValidHexColor("#ABCDEF"));
    }

    // Test method for invalid hex color codes
    @Test
    void testInvalidHexColors() {
        assertFalse(Main.isValidHexColor("#123")); // too short
        assertFalse(Main.isValidHexColor("FFA500")); // missing #
        assertFalse(Main.isValidHexColor("#GGGGGG")); // invalid characters
    }
}
