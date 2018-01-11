package com.company;
//Purpose: determine where the robot has returned to it's original position
//Given moves are Up,(U), Down(D), Left(L), Right(R).
//Example: UD-> True, since up and down return the robot to it's original
//LL-> False, since left and left return the robot to two positions leftward
//If we analyze this like a cartesian plane, U and D effect the y axis, and L and R effect the x axis
//robot starts at (0,0)
import java.util.Scanner;
import java.util.Arrays;
public class RobotMoves {
    public static void main(String[] args) {
        //prompt user to enter this as a string
        Scanner input = new Scanner(System.in);
        int y= 0;
        int x= 0;
        String s;
        System.out.print("Enter in a string value: ");
        s= input.nextLine();
        //now that we have the string let's convert to a char array
        for(char c: s.toCharArray()){
            if(c == 'U'){
                y++;
            }
            if(c== 'D'){
                y--;
            }
            if(c== 'L'){
                x--;
            }
            if(c== 'R'){
                x++;
            }

        }
System.out.println( x == 0 && y ==0);
    }
}
