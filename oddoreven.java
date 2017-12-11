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
public class oddoreven {
   public static void main(String[]args){
       Scanner input = new Scanner(System.in);
       //declare variable
       int x;
       //prompt user for input
       System.out.print("Enter in an integer: ");
       x = input.nextInt();
       //test for odd or even
       if (x % 2 == 0)
           System.out.printf("%d is even\n", x);
       else
           System.out.printf("%d is odd\n", x);
       
       
   } 
}
