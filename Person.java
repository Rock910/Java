package com.company;
/* A person has a name, age and gender
String Name:-> string of persons name
int Age: persons age
char gender: M or F depending on gender
 */
public class Person {
    private String Name;
    private int Age;
    private char Gender;
    public Person(String Name, int Age, char Gender){
        this.Name= Name;
        this.Age= Age;
        this.Gender= Gender;

    }
    //Mutators and acessors
    //Name
    public void setName(String Name){
        this.Name= Name;
    }

    public String getName() {
        return Name;
    }
    //AGE
    public void setAge(int Age){
        this.Age= Age;
    }
    public int getAge(){
        return Age;
    }
    //GENDER

    public void setGender(char Gender) {
        this.Gender = Gender;
    }
    public char getGender(){
        return Gender;
    }
    //TEST
}
