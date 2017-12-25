package com.company;

public class DogTest {

    public static  void main(String[]args){

        Dog fido= new Dog(5, "fido", "Corgi");
        fido.barkmessage();
        // Print out fido's name and age
        System.out.printf("Dog's name is %s\n", fido.getName());
        System.out.printf("Dog's age is %d\n", fido.getAge());
        fido.setAge(6);
        System.out.printf("Dog's new age is %d\n", fido.getAge());
        //adjust name as well if needed
        fido.setName("John");
        System.out.printf("Dog's new name is %s\n", fido.getName());
        //get description of dog
        System.out.printf("Dog is a %s\n", fido.getDesc());

    }



}
