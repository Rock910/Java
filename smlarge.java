
package first;
import java.util.Scanner;
/**
 *
 * @author steierjo
 */
public class smlrge {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
       //Arithmetic, Smallest, largest
       //Joshua Steier
       //sum average product smallest and largest
       //declare variables needed
     int num1;
     int num2;
     int num3;
     int sum;
     float average;
     int product;
     //prompt user for input on 3 inputs
     System.out.print("Enter in a value for integer 1: ");
     num1= input.nextInt();
     System.out.print("Enter in a value for integer 2: ");
     num2= input.nextInt();
     System.out.print("Enter in a value for integer 3: ");
     num3= input.nextInt();
     //compute product, sum average, and then do conditionals
     sum = num1 + num2 + num3;
     product= num1 * num2 * num3;
     average= sum/3;
     //conditionals
     if (num1> num2 && num1>num3)
         System.out.printf("%d is greater than both %d and %d\n", num1, num2, num3);
     if (num2> num1 && num2 > num3)
         System.out.printf("%d is greater than both %d and %d\n", num2, num1, num3);
     if (num3 > num1 && num3 > num2)
         System.out.printf("%d is greater than both %d and %d\n", num3, num1, num2);
//     else
//         System.out.printf("")
//       
    System.out.printf("The sum is %d, the average is %f, and the product is %d\n", sum, average, product);  
    }
}
