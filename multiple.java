/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package first;
import java.util.Scanner;
/**
 *
 * @author steierjo
 */
public class multiples {
    public static void main(String[]args){
       Scanner input= new Scanner(System.in);
       
      //program to see if two integers are multiples of one another
      //declare variables
      int x;
      int y;
      //prompt user for input 
      System.out.print("Please enter input: ");
      x= input.nextInt();
      System.out.print("Please enter new input: ");
      y= input.nextInt();
      //check if x is a multiple of y
      if (x % y ==0)
          System.out.println("True");
      else
          System.out.println("False");
    }
}
