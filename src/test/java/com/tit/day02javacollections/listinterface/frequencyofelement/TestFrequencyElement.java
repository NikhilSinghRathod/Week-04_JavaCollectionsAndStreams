package com.tit.day02javacollections.listinterface.frequencyofelement;

import org.junit.jupiter.api.Test;
import java.util.*;
import static org.junit.jupiter.api.Assertions.assertEquals;

// Creating a class TestingFrequency of Element
public class TestFrequencyElement {

    // Test method for counting frequency of elements in FrequencyCounterTest
    @Test
    void testFrequencyCounter() {
        //Creating an object of frequency Counter
        FrequencyCounter counter = new FrequencyCounter();
        //List of Strings
        List<String>l = Arrays.asList("apple", "banana", "apple", "orange");
        // Expected frequency map
        Map<String, Integer> expected = new HashMap<>();
        expected.put("apple", 2);
        expected.put("banana", 1);
        expected.put("orange", 1);
        // Counting frequency of elements
        Map<String, Integer> frequencyMap = counter.countFrequency(l);
        // Asserting the frequency map
        assertEquals(expected, frequencyMap);
        System.out.println("Frequency Counter Test Passed");

    }
}
