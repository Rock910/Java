package com.company;
import java.util.Scanner;
import java.util.Arrays;
public class InsertionSort {
    public static void main(String[] args) {
        int size;
        Scanner input = new Scanner(System.in);
        System.out.print("Enter in a value for size: ");
        size= input.nextInt();
        int[] array= new int[size];
        //for loop to input values into array
        for(int i = 0; i < size; i++){
            System.out.print("Enter in a value to the array: ");
            array[i]= input.nextInt();
            int currentElement= array[i];
            int k;
            for(k = i-1; k>=0 && array[k] > currentElement; k--){
                array[k+ 1]= array[k];
            }
            array[k + 1]= currentElement;
        }
System.out.printf("The array values are: %s\n", Arrays.toString(array));
    }
}
