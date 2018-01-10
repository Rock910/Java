package com.company;

//Write a function called polysum that takes 2 arguments, n and s.
       // This function should sum the area and square of the perimeter of the regular polygon.
     //   The function returns the sum, rounded to 4 decimal places.
public class PolySum {
    private double n;
    private double s;
    PolySum(double n, double s){
        this.n = n;
        this.s = s;
        //mutators and acessors for n and s
        //n:
    }
    public void setN(double n){
        this.n = n;
    }
    public double getN(){
        return n;
    }
    public void setS(double s){
        this.s = s;
    }
    public double getS(){
        return s;
    }
    //Now computations:
    //getArea
    public double getArea(double n, double s){
        return (0.25 * n * s * s)/(Math.tan(Math.PI/n));
    }
}
