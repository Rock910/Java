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
    public void setFirstName(String firstname) {
        firstName = firstname;
    }
    public void setLastName(String lastname) {
        lastName = lastname;
    }
    public void setMontlySalary(double monthlysalary) {


                montlySalary = monthlysalary;
    }

    public double getMontlySalary() {
        return montlySalary;
    }
    public String getFirstName(){
        return firstName;}
    public String getLastName(){
        return lastName;}


}









}
