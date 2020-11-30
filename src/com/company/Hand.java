package com.company;

public class Hand extends Human {
    int length;
    public Hand(String name, int age, char gender,int length) {
        super(name, age, gender);
        this.length=length;
    }

    @Override
    public String toString() {
        return "Hand{" +
                "length=" + length +
                ", name='" + name + '\'' +
                ", age=" + age +
                ", gender=" + gender +
                '}';
    }
}
