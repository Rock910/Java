package com.company;
//Implementation of list of object(person)
import java.util.*;
public class ListPerson {
    public static void main(String[] args) {
        //creating a list of object: person using arraylist
        List<Person> friends = new ArrayList<Person>();

        Person person = new Person("Jane DOE", 20, 'F');
        friends.add(person);
        //Puts Jane doe in the list
        System.out.println(friends.size()); //returns size 1 since only 1 person object in list
    }
}
