//Program checks if a vlaid phone number is entered
// a valid phone number: xxx-xxx-xxxx where x is a digit from 0-9
package com.company;
//Example of using regular expression matching
import java.util.Scanner;
public class PhoneNumber {
   private static final String STOP= "0";
    private static final String VALID= "Valid phone number";
    private static final String INVALID= "Not a valid phone number";
   private static  final String VALID_PHONE_PATTERN = "[0-9]{3}-[0-9]{3}-[0-9]{4}";
    public static void main(String[] args) {
        Scanner input= new Scanner(System.in);
        String phoneStr, reply;
         while(true){
             System.out.println("Phone#: ");
             System.out.println("Enter 0 to exit");
             //Difference between next line and just next
             phoneStr= input.next();
             if(phoneStr.equals(STOP))break;
             if(phoneStr.matches(VALID_PHONE_PATTERN)){
                 reply= VALID;
             }
             else{
                 reply= INVALID;
             }
             System.out.println(phoneStr + ": " + reply + "\n");
         }
        //Good phone pattern
    }
}
