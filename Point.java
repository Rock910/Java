package com.company;
/* A point has a private int xCoordinate and a private int yCoordinate
Preconditions: a point must be of integer value
Postconditions: if nonint given, then return -1(adjust for this)
 */
public class Point {
    public static final int MAX_VALUE= 1024;
 private int xCoordinate;
 private int yCoordinate;
 //REQUIRES: xCoordinate and yCoordinate to be integers
    //MODIFIES: This
    //EFFECTS: Constructor for a point-> creates a point
 public Point(int xCoordinate, int yCoordinate){
     this.xCoordinate= xCoordinate;
     this.yCoordinate= yCoordinate;

 }
 //another constructor
 public Point(){
     this(0, 0);
 }
 //mutators and acessors
    //REQUIRES: integer value
    //MODIFIES: this
    //EFFECTS: sets the x coordinate value to some value entered by the user
    public void setxCoordinate(int xCoordinate){
     this.xCoordinate= xCoordinate;
    }
    //EFFECTS: returns the x coordinate value of the point
    public int getxCoordinate(){
     return xCoordinate;
    }
    //REQUIRES: integer value
    //MODIFIES: this
    //EFFECTS: sets the ycoordinate to the new value entered by the user
    public void setyCoordinate(int yCoordinate){
     this.yCoordinate= yCoordinate;
    }
    //EFFECTS: returns y coordinate
    public int getyCoordinate(){
     return yCoordinate;
    }
    //REQUIRES: both x and y to be integer values
    //MODIFIES: this
    //EFFECTS: sets both x and y values to those dictated by the user
    //setXY
    public void setXY(int xCoordinate, int yCoordinate){
     this.xCoordinate= xCoordinate;
     this.yCoordinate= yCoordinate;
    }
}
