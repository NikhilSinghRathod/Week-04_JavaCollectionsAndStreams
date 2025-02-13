package com.tit.day02javacollections.listinterface.reversealist;
import java.net.StandardSocketOptions;
import java.util.*;

// Creating a class ReverseAList to demonstrate reversing ArrayList and LinkedList
public class ReverseAList {
    public static void main(String[] args) {
        // Creating an object of ListReverser
        ArrayList<Integer> numbers = new ArrayList<>();
        numbers.add(1);
        numbers.add(2);
        numbers.add(3);
        numbers.add(4);
        numbers.add(5);
        System.out.println("Reverse the number using the Arraylist");
        System.out.println("Numbers before the reverse"+numbers+" ");
       Reverse.reverse(numbers);
        System.out.println("Numbers After the reverse"+numbers+" ");
        System.out.println("--------------------------------------");

        //creating the object of the Linked List
        LinkedList<Integer> ll = new LinkedList<>();
        ll.add(1);
        ll.add(2);
        ll.add(3);
        ll.add(4);
        ll.add(5);
        System.out.println("Reverse the number using the Linked list");
        System.out.println("Numbers before the reverse"+ll+" ");
        Reverse.reverse(ll);
        System.out.println("Numbers After the reverse"+ll+" ");



    }

}
