package com.company;
/* Duck class, mimics ducks functionality
Ducks quack, eat, and fly around. They have names, weight and best friend
Preconditions: weight must be a double, name type string
Postconditions: if doesn't return these, throw exception
 */
public class Duck {
    private double weight;
    private String name;
    private Duck bestfriend;

    //constructor
    //REQUIRES: satisfy double, string and type duck
    //MODIFIES: this
    //EFFECTS: creates new Duck object
    public Duck(String name, double weight, Duck bestfriend) {
        this.name = name;
        this.weight= weight;
        this.bestfriend= bestfriend;
    }
    //default constructor
    public Duck(){
        this("Donald", 30.5, null);
    }
    //Mutators and acessors
    //REQUIRES: type String
    //MODIFIES: this
    //EFFECTS: sets name of duck
    public void setName(String name){
        this.name= name;
    }
    //EFFECTS: returns duck's name
    public String getName(){
        return name;
    }
    //REQUIRES: type double
    //MODIFIES: this
    //EFFECTS: sets new weight to weight value
    public void setWeight(double weight){
        this.weight= weight;
    }
    //EFFECTS: returns weight
    public double getWeight(){
        return weight;
    }
    //REQUIRES: type DUCK
    //MODIFIES: this
    //EFFECTS: set new duck to the bestfriend value
    public void setBestFriend(Duck bestfriend){
        this.bestfriend= bestfriend;
    }
    //EFFECTS: returns the best friend
    public Duck getBestfriend(){
        return bestfriend;
    }
    //Quack eat and fly around:
    //EFFECT: quacks
    public void Quack(){
        System.out.println("QUACK");
    }
    //EFFECT: eats
    public void Eat(){
        System.out.println("Im eating!");
    }
    //EFFECT: flies
    public void Fly(){
        System.out.println("Im flying!");
    }

}
