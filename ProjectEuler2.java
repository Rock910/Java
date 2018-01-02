package com.company;
import java.util.Scanner;
public class ProjectEuler2 {
    //Idea: First generate fibonacci numbers
    //Second: find all evens using an if statement and keep track of a total
    public static void main(String[] args) {
        //First generate fibonacci numbers
        int n1= 0;
        int n2= 1;
        int n3;
        int i;
        int count;
        int total= 0;
        Scanner input= new Scanner(System.in);
        //Input some arbitrary count to end at
        System.out.print("Enter in a count value: ");
        count = input.nextInt();
        System.out.printf(n1 + " " + n2);
        for(i = 2; i < count; ++i){
            n3 = n1 + n2;
            System.out.print(" " + n3);
            n1= n2;
            n2 = n3;
            if(n1 % 2 == 0){
                total = total + n1;

            }


        }
        System.out.printf("Total is %d\n", total);
    }




}
