package com.tit.day02javacollections.setinterface.convertsettosortedlist;

import java.util.*;

// Creating a class SetToSortedList to convert a HashSet to a sorted list
public class SetToSortedList {

    // Method to convert a HashSet to a sorted list
    public List<Integer> convertToSortedList(Set<Integer> set) {
        List<Integer> sortedList = new ArrayList<>(set);
        Collections.sort(sortedList);
        return sortedList;
    }
}
