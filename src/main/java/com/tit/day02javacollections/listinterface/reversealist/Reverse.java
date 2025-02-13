package com.tit.day02javacollections.listinterface.reversealist;
//import java.util.*;
import java.util.List;

public class Reverse {
    //creating a method to reverse the list
    public static void reverse( List<Integer> num){
        //checking whether it is empty or not
        if(num.size()<=1){
            return ;
        }
        int start = 0;
        int end = num.size()-1;
        while(start<=end){
            int temp = num.get(start);
            num.set(start , num.get(end));
            num.set(end,temp);
            start++;
            end--;
        }
    }
}
