package com.tit.day06javaannotationsandreflection.annotations.exercise.exercise2usedeprecatedtomarkoldmethod;

// Creating a main class to test the deprecated and new methods
public class Main {
    public static void main(String[] args) {
        // Instantiating a LegacyAPI object
        LegacyAPI api = new LegacyAPI();

        // Calling the deprecated method
        api.oldFeature(); // This will show a deprecation warning

        // Calling the new method
        api.newFeature(); // This will not show any warning
    }
}
