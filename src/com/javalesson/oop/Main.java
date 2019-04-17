package com.javalesson.oop;

import static com.javalesson.oop.Doge.getDogsCount;

public class Main {

    public static void main(String[] args) {

        Doge taxa = new Doge();
        taxa.setName("Whisky");
        taxa.setBreed("taxa");
        taxa.setPaws(3);
        taxa.setTail(0);
        taxa.setSize("small");

        Doge mops = new Doge();
        mops.setName("Pickles");
        mops.setBreed("mops");
        mops.setPaws(4);
        mops.setTail(1);
        mops.setSize("Average");

        Doge shepherd = new Doge();
        shepherd.setName("Bamboo");
        shepherd.setBreed("shepherd");
        shepherd.setPaws(4);
        shepherd.setTail(1);
        shepherd.setSize("BIG");

        System.out.println("Taxa's name is " + taxa.getName() + ". It is " + taxa.getSize());
        taxa.bark();
        System.out.println("Mops's name is " + mops.getName() + ". It is " + mops.getSize());
        mops.bark();
        System.out.println("Shepherd's name is " + shepherd.getName() + ". It is " + shepherd.getSize());
        shepherd.bark();
        System.out.println("Total dogs: "+getDogsCount());
    }
}