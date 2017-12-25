package com.company;
//Author: JOSHUA STEIER
public class Dog {
    /*Dog is one of:
    // bark(string)-> displays a bark
    //int age-> keeps track of dogs age
    //name(string)-> prints out dogs name
    //description(String)-> type of dog/short description
    //make constructor, mutators and accessors*/
    private int Age;
    private String Name;
    private String Desc;
    //constructor
    public Dog(int age, String name, String desc){
        Age= age;
        Name= name;
        Desc= desc;

    }
    //mutators and acessors
    public void setAge(int age){
        Age = age;

    }
    public void setName(String name){
        Name = name;

    }
    public void setDesc(String desc){
        Desc= desc;

    }
    public int getAge() {
        return Age;
    }
    public String getName(){
        return Name;
    }
    public String getDesc(){
        return Desc;

    }
    //barkmessage
    public void barkmessage(){
        System.out.println("BARK!");

    }

}
