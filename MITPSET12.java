package com.company;
import java.util.*;
import java.util.regex.*;
//Purpose: to find all instances of bob in a string
public class MITPSET12 {
    public static void main(String[] args) {
    //prompt user for input
        Scanner input = new Scanner(System.in);
        String s;
        System.out.print("Enter in a string: ");
        s = input.nextLine();
        //initialize counter
        int bobcounter= 0;
        //can use match to find all occurences of bob(regex)
        Matcher matcher;
        Pattern pattern= Pattern.compile("bob", Pattern.CASE_INSENSITIVE);
        matcher= pattern.matcher(s);
        while(matcher.find()){
            bobcounter++;
        }
        System.out.printf("The amount of bob is: %d\n", bobcounter);
        System.out.println(s);
    }
}
