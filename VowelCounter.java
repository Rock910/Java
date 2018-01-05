package com.company;
import java.util.Scanner;
import java.util.Arrays;
//Purpose: to count vowels given a string
//Plan: take in string, convert to chararray and check in the array for vowels, convert string to lowercase before convert
//Reprint out as an array
//Need to know enchanced for loop
public class VowelCounter {
    public static void main(String[] args) {
       Scanner input= new Scanner(System.in);
       String s;
       System.out.print("Enter in a value for s: ");
       s= input.nextLine();
       s= s.toLowerCase(); // converted to lower case
       char[] charArray= s.toCharArray();
       int vowelCount= 0;
       //convert to an array
        //check for vowels
        for(int i= 0; i<s.length(); i++){
            char letter= s.charAt(i);
            if((letter == 'a') || (letter == 'e') || (letter == 'o') || (letter == 'u') || (letter == 'i')){
                vowelCount++;

            }
        }
 System.out.printf("The string is: %s\n", s);
System.out.printf("Vowel count is %d\n", vowelCount);
    }
}
