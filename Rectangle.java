package com.company;
//AUTHOR: JOSHUA STEIER
public class Rectangle {
    /* A rectange is one of:
    int height: height of rectangle
    int width: width of rectangle
    Computations:
    int perimeter: perimeter of the rectangle
    int area: area of the rectangle

     */
    //Variable declarations
    private int Height;
    private int Width;
    private int Perimeter;
    private int Area;

    public Rectangle(int height, int width){
        Height= height;
        Width= width;


    }
    //REQUIRES: height to be of type int
    //MODIFIES: this
    //EFFECTS: sets Height value to be height entered by user.
    public void setHeight(int height){
        Height= height;
    }
    //REQUIRES: width be of type int
    //MODIFIES: this
    //EFFECTS: sets Width to value width entered by user.
    public void setWidth(int width){
        Width= width;
    }
    //REQUIRES: height and width be of type int
    //MODIFIES: this
    //EFFECTS: returns perimeter value, given height and width
    public int getPerimeter(int height, int width){
        Height= height;
        Width= width;
        return Height + Width;
    }
    //REQUIRES: height, width of type int
    //EFFECTS: returns area given int width and int height
    public int getArea(int height, int width){
        return Height * Width;
    }
    //EFFECTS: returns height value
    public int getHeight(){
        return Height;
    }
    //EFFECTS: returns width value
    public int getWidth(){
        return Width;
    }
}
