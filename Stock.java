package com.company;
public class Stock {
    /* Stock contains: symbol: a string representing stock symbol
    name: stock's name
    previousClosingPrice: stores price for previous day-> double
    currentPrice-> stores current stock price double
    constructor
    getChangePercent() returns percent from previous to current
     */
    //declare variables
    //Data Hiding
    private String Symbol;
    private String Name;
    private double previousClosingPrice;
    private double currentPrice;
    public Stock(String Symbol, String Name, double previousClosingPrice, double currentPrice){
       this.Symbol= Symbol;
       this.Name= Name;
       this.previousClosingPrice= previousClosingPrice;
       this.currentPrice= currentPrice;
    }
    //Include mutators and accessors for each variable
    //Symbol first:
    public void setSymbol(String Symbol){
        this.Symbol= Symbol;
    }
    public String getSymbol(){
        return Symbol;
        //Then Name:
    }
    public void setName(String Name){
       this.Name= Name;
    }
    public String getName(){
        return Name;
    }
    //Now Closing Price:
    public void setPreviousClosingPrice(double previousClosingPrice){
        this.previousClosingPrice= previousClosingPrice;
    }
    public double getPreviousClosingPrice(){
        return previousClosingPrice;
    }
    public void setCurrentPrice(double currentPrice){
        this.currentPrice= currentPrice;
    }
    //Now Current Price:
    public double getCurrentPrice(){
        return currentPrice;
    }
    public double getChangePercent(double currentPrice, double previousClosingPrice){
        return (currentPrice-previousClosingPrice)/currentPrice * 100;
    }
}
