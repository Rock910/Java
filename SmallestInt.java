package com.company;
import java.util.Scanner;
public class SmallestValue {
    public static void main(String[] args) {
        //finds smallest of several integers
        //first value read specifies number of values to input
        Scanner input= new Scanner(System.in);
        int size;
        int newInt;
        int smallestInt= 0;
        System.out.print("Enter in the amount of integers: ");
        size= input.nextInt();
        //goes until greater than size with a counter
        //how do we declare integers 1 to n?
        for(int counter= 0; counter < size; counter++){
            System.out.print("Enter in an integer: ");
            newInt= input.nextInt();
            if (counter == 0){
                smallestInt= newInt;
            }
            else{
                if(newInt < smallestInt){
                    smallestInt= newInt;
                }
            }

        }
        System.out.printf("The smallest int is %d\n", smallestInt);
    }

}
