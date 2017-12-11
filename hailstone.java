/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package first;

/**
 *
 * @author steierjo
 */
public class hailstone {
    //demonstration of the hailstone sequence
    public static void main(String[]args){
        
        int n = 3;
        while(n != 1){
            System.out.println();
            if (n % 2 ==0){
                n = n/2;
                
            }
            else{
                n= 3 * n + 1;
            }
      
        }
        System.out.println(n);
    }
    
}
