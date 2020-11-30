package com.company;

public class Main {

    public static void main(String[] args) {
	    Human human=new Human("Anton",38,'m');
	    System.out.println(human.toString());
	    Leg leg =new Leg("Bronto",14,'m',9);
	    System.out.println(leg.toString());
	    Hand hand=new Hand("Lena",28,'w',120);
	    System.out.println(hand.toString());
	    Head head=new Head("Lexa",48,'m',90);
	    System.out.println(head.toString());
    }
}
