package com.company;
//Date is one of:
//Month-> type int, day-> int, year-> int, getters, setters constructor
public class Date {
    //initalize variables
    private int Month;
    private int Day;
    private int Year;
    public Date(int month, int day, int year){
        Month= month;
        Day= day;
        Year= year;

    }
    //getters and setters

    public void setMonth(int month){
        Month= month;
    }
    public void setDay(int day){
        Day= day;

    }
    public void setYear(int year){
        Year= year;
    }
//getters


    public int getDay() {
        return Day;
    }

    public int getMonth() {
        return Month;
    }

    public int getYear() {
        return Year;
    }
}
