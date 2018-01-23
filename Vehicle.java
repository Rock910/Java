package com.company;
/*
Purpose: to be a base for a car class
Vehicle is one of :
Hand steering-> T or F char value
Change gears-> char value of Gear
increase/decrease speed-> double value
add specific stuff to car
 */
public class Vehicle {
    private char HandSteering;
    private char Gears;
    private double Speed;
    public Vehicle(char HandSteering, char Gears, double Speed){
        this.HandSteering= HandSteering;
        this.Gears= Gears;
        this.Speed= Speed;
    }
    //Mutators/Accessors and then increase/decrease on speed

    //REQUIRES: HandSteering be of type char
    //MODIFIES: this
    //EFFECTS: sets HandSteering to value entered by user
    public void setHandSteering(char HandSteering){
        this.HandSteering= HandSteering;
    }
    //EFFECTS: returns HandSteering value
    public char getHandSteering(){
        return HandSteering;
    }
    //REQUIRES: Gear be of type char
    //MODIFIES: this
    //EFFECTS: sets gear to be value determined by user
    public void setGears(char Gears){
        this.Gears= Gears;
    }
    //EFFECTS: returns value of GEARS
    public char getGears(){
        return Gears;
    }
    //REQUIRES: Speed be of type double
    //MODIFIES: this
    //EFFECTS: sets Speed to be value entered by User
    public void setSpeed(double Speed){
        this.Speed= Speed;
    }
    //EFFECTS: returns Speed's value
    public double getSpeed(){
        return Speed;
    }
    //EFFECTS: Increase speed by 1
    public double IncreaseSpeed(){
        return Speed++;
    }
    //EFFECTS: Decrease speed by 1
    public double DecreaseSpeed(){
        return Speed--;
    }

}

