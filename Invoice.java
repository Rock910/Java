//package is default package for my java IDE-> IntelliJ
package com.company;
//Invoice class is one of:
//a string(part number)
// a string (part description)
// an integer value for quantity of said part
// a double for the price per a particular item
//Author: Joshua Steier, 12/19/2017, 8:30 PM
public class Invoice {
    //Invoice class
    //private for data hiding
    private String partNumber;
    private String partDescription;
    private int quantity;
    private double PricePerItem;

    //make constructor
    public Invoice(String number, String description, int quant, double price){

    partNumber = number;
    partDescription= description;
    quantity= quant;
    PricePerItem= price;

}
//getters and setter for each variable
//set takes void
public void setPartNumber(String number){
        partNumber= number;


}


public void setPartDescription(String description){
        partDescription= description;



    }
public void setQuantity(int quant){
        quantity= quant;
}
    public void setPricePerItem(double price){
        PricePerItem= price;
    }

    //getters for each variable
    public String getPartNumber(){
        return partNumber;
    }

    public String getPartDescription(){


    return partDescription;

}
    public int getQuantity(){
    return quantity; }
    public double getPricePerItem(){
        return PricePerItem;
    }
//if the quantity and price per item are 0, it doesn't make sense to have
    // a negative value so we just make it go to 0.
   public double getinvoiceAmount(double amount) {
       if (quantity < 0 && PricePerItem < 0) {
           return 0;

       } else {
           amount = quantity * PricePerItem;
           return amount;
       }


   }}
