package com.company;
import java.util.Scanner;
import java.util.Arrays;
//Going to use arrays to sort the array
public class BinarySearch {
    public static void main(String[] args) {
        Scanner input= new Scanner(System.in);
        int size;
        int l =0;

        System.out.print("Enter in a value size for the array: ");
        size= input.nextInt();
        int searchValue;
        int[] array= new int[size];
        int r= array.length-1;
        System.out.print("Enter in a value to search for: ");
        searchValue= input.nextInt();
        for(int i =0; i < size; i++){
            //focus on sorting the array first
            System.out.print("Enter values into the array: ");
            array[i]= input.nextInt();
        }
        while(l<= r){
            int m = l + (r-1)/2;
            if(array[m] == searchValue){
                System.out.println(m);
            }
            if(array[m] < searchValue){
                l = m + 1;
            }
            else{
                r= m-1;
            }
        }
//prints out the index of searched value

        System.out.printf("The values for the array are: %s\n", Arrays.toString(array));
    }

}
