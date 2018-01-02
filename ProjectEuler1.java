package com.company;
//Project Euler # 1: Find multiples of 3 or 5 below N, and sum them
import java.util.Scanner;
public class ProjectEuler1 {
    public static void main(String[] args) {
        //Prompt user for input
        int N;
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a value for N: ");
        N= input.nextInt();
        //Initalize a total to keep track of values
        int total= 0;
        //for loop to iterate through until N
        for(int i= 0; i<N; i++){
            //Test for multiples, by definition this is where % 3 or % 5 return 0
            if(i % 3 ==0 || i % 5 ==0){
                //add each previous number where this occurs
               total = total + i;
            }
        }
        //Print out total
        System.out.printf("The answer is: %d\n", total);
    }
}
