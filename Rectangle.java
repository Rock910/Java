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
    public void setHeight(int height){
        Height= height;
    }
    public void setWidth(int width){
        Width= width;
    }
    public int getPerimeter(int height, int width){
        Height= height;
        Width= width;
        return Height + Width;
    }
    public int getArea(int height, int width){
        return Height * Width;
    }
    public int getHeight(){
        return Height;
    }
    public int getWidth(){
        return Width;
    }
}
