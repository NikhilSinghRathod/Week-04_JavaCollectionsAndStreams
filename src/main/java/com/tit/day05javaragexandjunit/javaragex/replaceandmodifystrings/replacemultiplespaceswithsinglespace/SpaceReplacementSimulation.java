package com.tit.day05javaragexandjunit.javaragex.replaceandmodifystrings.replacemultiplespaceswithsinglespace;

// Creating a class SpaceReplacementSimulation to demonstrate space replacement
public class SpaceReplacementSimulation {
    public static void main(String[] args) {
        // Example text for testing
        String text = "This  is  an   example   with    multiple spaces.";

        // Replace multiple spaces in the text
        String result = SpaceReplacer.replaceMultipleSpaces(text);

        // Print the result
        System.out.println(result);
    }
}