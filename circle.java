/* Diameter circumference and area of a circle

*/
package first;
import java.util.Scanner;
/**
 *
 * @author steierjo
 */
public class circle {
    public static void main(String[]args){
        //declare variables
        Scanner input = new Scanner(System.in);
        double r;
        double diameter;
        double circumference;
        double area;
        //prompt for user input
        System.out.print("Enter in a value for r: ");
        r = input.nextInt();
        //assign values to formulas
        diameter = 2 * r;
        circumference= 2 * Math.PI * r;
        area= Math.PI * r * r;
        //print out result
        System.out.printf("The diameter is %f, the circumference is %f, the area is %f\n",   diameter, circumference, area);
        
        
        
    }
}
