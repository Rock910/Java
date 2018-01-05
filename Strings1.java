import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        
        Scanner sc=new Scanner(System.in);
        String A=sc.next();
        String B=sc.next();
        /* Enter your code here. Print output to STDOUT. */
        System.out.println(A.length() + B.length());
        String s1 = A.substring(0, 1);
        String s2 = B.substring(0,1);
        
       
        
        
       
        if ( A.compareTo(B) == 1){
            System.out.println("Yes");
        }
        else{
            System.out.println("No");
        }
        //Now for method to uppercase 
        //How do we pick out the first letter? //getcharat[0] and touppercase it
       System.out.println(s1.toUpperCase() + A.substring(1) + " " + s2.toUpperCase() + B.substring(1));
    }
}
