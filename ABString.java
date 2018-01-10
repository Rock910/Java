package com.company;
//String with n characters, either of which must be A or B
//Since a string is a char array, I'm just going to make this all String
//Then satisfy the second condition
import java.util.Scanner;
import java.util.Arrays;
public class ABString {
    public static void main(String[] args) {
        //Approach 1 : test for validation using regex
        //prompt user for input
        String s1;
        int size;
        Scanner input = new Scanner(System.in);
        System.out.print("Enter in the size value for the string: ");
        size= input.nextInt();
        System.out.print("Enter in a string: ");
        s1= input.next();
        if(s1.matches("[A-B]*")){ //regex expression, all digits must be either A or B
            System.out.println(s1);
        }
        else{
            System.out.println("Did not follow format! ");
        }



    }
}
