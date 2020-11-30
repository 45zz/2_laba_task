package com.company;

public class Leg extends Human {
    int speed;
    public Leg(String name, int age, char gender,int speed) {
        super(name, age, gender);
        this.speed=speed;
    }

    @Override
    public String toString() {
        return "Leg{" +
                "speed=" + speed +
                ", name='" + name + '\'' +
                ", age=" + age +
                ", gender=" + gender +
                '}';
    }
}
