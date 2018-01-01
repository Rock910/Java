package com.company;
//Demonstration of compare to for strings
import java.util.Scanner;
public class CompareTo {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        //Declare variables
        String s1;
        String s2;
        //Prompt for input
        System.out.print("Enter in a value for string 1: ");
        s1= input.nextLine();
        System.out.print("Enter in value for string 2: ");
        s2= input.nextLine();
        if(s1.compareTo(s2) == 0 ){
            System.out.printf("%s is equal to %s\n", s1, s2);
        }
        else{
            if(s1.compareTo((s2))>0 ){
                System.out.printf("%s is > than %s\n", s1, s2);
            }
            else{
                System.out.printf("%s is < than %s\n", s1, s2);
            }
        }
    }
}
