package com.company;
//eliminate duplicate by storing them in a set-> get first names,
//Need a string set, set of strings without duplicates
//PS should be able to implement without java packages
//Write a program that reads in a string of first names, eliminates duplicates and allows search
//first step: use a set since no duplicates
//Then: figure out how to search
import java.util.*;
public class Set0 {
    public static void main(String[] args) {
        Set<String> set1= new HashSet<String>();
        //add first names through add:
        set1.add("Apple");
        set1.add("Johnny");
        set1.add("Seed");
        set1.add("Apple");
        //notice that apple is not seen twice
        for(String s: set1)
            System.out.println(set1.toString());
//need search method
        //iterator go through and see if equal

    //declare iterator
        Iterator<String> itr= set1.iterator();
        while(itr.hasNext()){
            String s= itr.next();
            if (s.equals("Seed")){
                System.out.println("It contains Seed!");
            }
        }

    }
}
