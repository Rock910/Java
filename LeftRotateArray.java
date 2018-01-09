package com.company;
//Make an array that rotates n members k times
import java.util.Scanner;
import java.util.Arrays;
public class LeftRotateArray {
    public static void main(String[] args) {
        //I want an array with a size n
        int n;
        int k;
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a size for the array: ");
        n= input.nextInt();
        System.out.print("Enter in a shift to the array: ");
        k= input.nextInt();
        //Declare the array
        int[] array1= new int[n];
        //now input elements into the array
        for(int i=0; i< n; i++){
            System.out.print("Enter in a value: ");
            array1[i]= input.nextInt();}
            //want to make the array right rotate so everyone is shifted left
        //shifted left
        int a, temp;
        temp = array1[0];
        for (a = 0; a < n - 1; a++)
            array1[a] = array1[a + 1];
        array1[a] = temp;

            //shifting step
            //need an if to catch the above size declaration

        System.out.println(Arrays.toString(array1));
                }

            }

        //print out the array to verify




