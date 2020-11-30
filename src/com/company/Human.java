package com.company;

public class Human {
    String name;
    int age;
    char gender;
    public Human (String name,int age, char gender){
        this.age=age;
        this.gender=gender;
        this.name=name;
    }

    @Override
    public String toString() {
        return "Human{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", gender=" + gender +
                '}';
    }
}
