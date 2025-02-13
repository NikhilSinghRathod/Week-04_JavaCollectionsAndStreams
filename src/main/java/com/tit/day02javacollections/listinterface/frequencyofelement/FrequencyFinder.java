package com.tit.day02javacollections.listinterface.frequencyofelement;
import java.util.*;

// Creating a class FrequencyFinder to demonstrate counting frequency of elements
public class FrequencyFinder {
    public static void main(String[] args) {
        // Creating an object of FrequencyCounter
        FrequencyCounter counter = new FrequencyCounter();
       //list of strings
        ArrayList<String>Al= new ArrayList<>(Arrays.asList("Apple","Banana","Orange","Apple"));

        //counting frequency of elements
        Map<String,Integer>frequencyMap = counter.countFrequency(Al);

        //Print the Frequency Map
        System.out.println("Elements are :"+frequencyMap);
    }
}
