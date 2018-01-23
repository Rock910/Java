package com.company;
//Car extends vehicle but has a specific color and make
public class Car extends Vehicle {
    //CAR HAS STRING COLOR AND STRING MAKE
    private String Color;
    private String Make;



    //CONSTRUCTOR
    Car(char HandSteering, char Gears, double Speed, String Color, String Make){
        super(HandSteering, Gears, Speed);
        this.Color= Color;
        this.Make= Make;
    }
    //MUTATORS/ACESSORS

    //REQUIRES: Color be of type String
    //MODIFIES: this
    //EFFECTS: sets color to new value entered by user
    public void setColor(String Color){
        this.Color= Color;
    }
    //EFFECTS: returns Color value
    public String getColor(){
        return Color;
    }
    //REQUIRES: Make be of type String
    //MODIFIES: this
    //EFFECTS: sets Make to value entered by user
    public void setMake(String Make){
        this.Make = Make;
    }
    //EFFECTS: returns Make's value
    public String getMake(){
        return Make;
    }


}
