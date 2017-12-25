package com.company;

public class RectangleTest {
    public static void main(String[]args){
        Rectangle rec= new Rectangle(10, 20);
        System.out.printf("Rectangle's height is %d\n", rec.getHeight());
        System.out.printf("Rectangle's width is %d\n", rec.getWidth());
        System.out.printf("Area is %d\n", rec.getArea(rec.getHeight(), rec.getWidth()));
        System.out.printf("Perimeter is %d\n", rec.getPerimeter(rec.getHeight(), rec.getWidth()));


    }
}
