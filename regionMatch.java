package com.company;
import java.util.Scanner;
//demonstration of regionmatch for strings
public class RegionMatch {
    public static void main(String[] args) {
        Scanner input= new Scanner(System.in);
        String s1;
        String s2;
        int index;
        System.out.print("Enter in value for string1: ");
        s1= input.nextLine();
        System.out.print("Enter in value for string2: ");
        s2= input.nextLine();
        System.out.print("Enter in a value for index: ");
        index= input.nextInt();
        if(s1.regionMatches(true, 0, s2, 0, index)){
            System.out.printf("First %d characters are the same!\n", index);

        }
        else{
            System.out.printf("The first %d characters do not match!\n", index);
        }


    }




}
