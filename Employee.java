package com.company;
//Employee class is one of:
//first name(string)-> string
// last name(string)-> string
//monthly salary(double)-> double
//constructor->set, get, if monthly not pos don't set value
//Write a test application to test this
public class Employee {
    private String firstName;
    private String lastName;
    private double montlySalary;
    //provide constructor
    public Employee( String firstname, String lastname, double monthlysalary) {
        firstName = firstname;
        lastName = lastname;
        montlySalary = monthlysalary;
    }
    //Need setter/getter methods for each variable
    //REQUIRES: firstname be of type String
    //MODIFIES: this
    //EFFECTS: set firstName to value entered by user.
    public void setFirstName(String firstname) {
        firstName = firstname;
    }
    //REQUIRES: lastname be of type String
    //MODIFIES: this
    //EFFECTS: sets lastName to be lastname entered by user.
    public void setLastName(String lastname) {
        lastName = lastname;
    }
    //REQUIRES: monthlysalary be of type double
    //MODIFIES: this
    //EFFECTS: sets montlySalary to monthlysalary(value entered by user)
    public void setMontlySalary(double monthlysalary) {


                montlySalary = monthlysalary;
    }
//EFFECTS: returns monthlysalary
    public double getMontlySalary() {
        return montlySalary;
    }
    //EFFECTS: returns the firstname
    public String getFirstName(){
        return firstName;}
    //EFFECTS: returns last name
    public String getLastName(){
        return lastName;}


}









}
