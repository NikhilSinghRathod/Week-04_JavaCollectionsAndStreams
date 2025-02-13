package com.tit.day02javacollections.listinterface.reversealist;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
import java.util.*;

// Creating a class TestingListReversal to test reversing ArrayList and LinkedList

public class TestReverseList {
    // Test method for reversing an ArrayList in ListReversalTest
    @Test
    void testListReverse(){
        //creating an arraylist
        Reverse rev = new Reverse();
        //creating and reversing a array list
        List<Integer>Al = new ArrayList<>(Arrays.asList(1,2,3,4,5));
        rev.reverse(Al);
        //Excepted array list
        List<Integer>excepted = Arrays.asList(5,4,3,2,1);
        //Asserting the reversed arraylist
        assertEquals(excepted , Al);
        System.out.println("Arrays list reversal Passed");

    }
    // Test method for reversing a LinkedList in ListReversalTest
    @Test
    void testLinkedListReverse(){
        //creating the linked list
        Reverse rev = new Reverse();
        //creating and reversing the linked list
        List<Integer>ll = new ArrayList<>(Arrays.asList(10,11,12,13,14,15));
        rev.reverse(ll);
        //Excepted linked list
        List<Integer>excepted = Arrays.asList(15,14,13,12,11,10);
        //check the output of the program
        assertEquals(excepted, ll);
        System.out.println("Linked list reverse passed ");
    }
}
