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
    // REQUIRES: Name be of type String
    //MODIFIES: this
    //EFFECTS: to set name to value entered by user
    public void setName(String Name) {
        this.Name = Name;
    }
    //EFFECTS: returns the name of the element
    public String getName(){
        return Name;
    }
    //AtomicNumber:
    //REQUIRES: atomic number be of type int
    //MODIFIES: this
    //EFFECTS: to set the atomic number to value entered by user
    public void setAtomicNumber(int AtomicNumber){
        this.AtomicNumber= AtomicNumber;
    }
    //EFFECTS: returns the atomic number
    public int getAtomicNumber(){
        return AtomicNumber;
    }
   
    //AtomicSymbol:
    //REQUIRES: atomic symbol be of type string
    //MODIFIES: this
    //EFFECTS: set atomic symbol to value entered in by user
    public void setAtomicSymbol(String AtomicSymbol){
        this.AtomicSymbol= AtomicSymbol;
    }
    //EFFECTS: returns the atomic symbol
    public String getAtomicSymbol(){
        return AtomicSymbol;
    }
    //AtomicMass:
    //REQUIRES: atomic mass be of type double
    //MODIFIES: this
    //EFFECTS: to set atomic mass to a value entered by user
    public void setAtomicMass(double AtomicMass){
        this.AtomicMass= AtomicMass;
    }
    //EFFECTS: returns atomic mass
    public double getAtomicMass(){
        return AtomicMass;
    }
    //Period
    //REQUIRES: period must be of type int
    //MODIFIES: this
    //EFFECTS: to set period to the new value of period
    public void setPeriod(int Period){
        this.Period= Period;
    }
    //EFFECTS: returns period
    public int getPeriod(){
        return Period;
    }
    //Group:
    //REQUIRES: Group is of type int 
    //MODIFIES: this
    //EFFECTS: sets the value of group to a value entered by the user
    public void setGroup(int Group){
        this.Group= Group;
    }
    //EFFECTS: returns group
    public int getGroup(){
        return Group;
    }
}
