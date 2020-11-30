package com.company;

public class Head extends Human {
    int intellect;
    public Head(String name, int age, char gender,int intellect) {
        super(name, age, gender);
        this.intellect=intellect;
    }

    @Override
    public String toString() {
        return "Head{" +
                "intellect=" + intellect +
                ", name='" + name + '\'' +
                ", age=" + age +
                ", gender=" + gender +
                '}';
    }
}
