package com.company;
import java.util.Scanner;
//Plan: declare vars and use scanner for sentinel controlled rep
//Further: use ifs to branch each item and keep some sort of counter
//While loop then if's and else's
public class SalesCommissionCalc {
    public static void main(String[] args) {
        //Declare variables
        double item;
        double value= 0;
        double total= 0;
        int counter= 0;
        //Keep in mind: main total is 200 + 0.09 * sum total
        Scanner input = new Scanner(System.in);
        System.out.print("Please enter a value for item: ");
        item= input.nextDouble();
        while(item != -1){
            System.out.print("Please enter a value for item: ");
            item= input.nextDouble();
            total = total + value;
            counter= counter++;
            //Probably a better way than all these if's
            if (item == 1){
                value = 239.99;
            }
            if (item == 2){
                value = 129.75;
            }
            if (item == 3){
                value= 99.95;
            }
            if(item == 4){
                value= 350.89;
            }
            }
        System.out.printf("The total commision for this employee is %f\n", 200 + 0.09 * total);

        }


    }



