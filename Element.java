package com.company;
/*Element is a chemical element:
String name: chemical element name
int AtomicNumber: Atomic number of the element
String AtomicSymbol: Atomic symbol of the element
double AtomicMass: atomic mass of the element
int period: 1-7
int group 1-18
Let's make constructor: setter and getters
 */

public class Element {
    private String Name;
    private int AtomicNumber;
    private String AtomicSymbol;
    private double AtomicMass;
    private int Period;
    private int Group;
    //Default constructor will set all to 0/null etc, it's ok to leave like this
    //Declare getters and setters for each variable
    //Name:

    public void setName(String Name) {
        this.Name = Name;
    }
    public String getName(){
        return Name;
    }
    //AtomicNumber:
    public void setAtomicNumber(int AtomicNumber){
        this.AtomicNumber= AtomicNumber;
    }
    public int getAtomicNumber(){
        return AtomicNumber;
    }
    //AtomicSymbol:
    public void setAtomicSymbol(String AtomicSymbol){
        this.AtomicSymbol= AtomicSymbol;
    }
    public String getAtomicSymbol(){
        return AtomicSymbol;
    }
    //AtomicMass:
    public void setAtomicMass(double AtomicMass){
        this.AtomicMass= AtomicMass;
    }
    public double getAtomicMass(){
        return AtomicMass;
    }
    //Period
    public void setPeriod(int Period){
        this.Period= Period;
    }
    public int getPeriod(){
        return Period;
    }
    //Group:
    public void setGroup(int Group){
        this.Group= Group;
    }
    public int getGroup(){
        return Group;
    }
}
