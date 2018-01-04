package com.company;
//Demonstration of linear search(my version)
//import scanner and arrays
import java.util.Arrays;
import java.util.Scanner;
public class LinearSearch2 {
    public static void main(String[] args) {
        //initalize scanner, size and search key
        Scanner input = new Scanner(System.in);
        int size;
        int searchKey;
        //Prompt user for input
        System.out.print("Enter in a size value: ");
        size = input.nextInt();
        System.out.print("Enter in a search key: ");
        searchKey = input.nextInt();
        //Declare an array of size: prompt for by user
        int[] array = new int[size];
        for (int i = 0; i < size; i++) {
            //Add values to the array
            System.out.print("Enter in a value to the array: ");
            array[i] = input.nextInt();//Implement the linear search
            if(array[i] == searchKey){
                System.out.printf("Index is %d\n", i);

            }
        }
       
        System.out.printf("The array has values: %s\n", Arrays.toString(array));
        System.out.printf("Search key returned is: %d\n", searchKey);

            }
        }






