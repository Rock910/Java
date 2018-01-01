package com.company;
//Purpose: compute product of integers from 1 to 15, odd

public class OddIntegerProduct {
    public static void main(String[] args) {
        int product = 1;
        for(int counter = 1; counter <= 15; counter= counter + 2){
            product = product * counter;

        }
        System.out.printf("Total is %d\n", product);
    }
}
