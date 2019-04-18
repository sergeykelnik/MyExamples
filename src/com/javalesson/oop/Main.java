package com.javalesson.oop;

import static com.javalesson.oop.Doge.getDogsCount;

public class Main {

    public static void main(String[] args) {

        Doge taxa = new Doge();
        taxa.setName("Whisky");
        taxa.setBreed("taxa");
        taxa.setSize(Size.SMALL);
        taxa.bite();

        Doge mops = new Doge();
        mops.setName("Pickles");
        mops.setBreed("mops");
        mops.setSize(Size.MEDIUM);
        taxa.bite();

        Doge shepherd = new Doge();
        shepherd.setName("Bamboo");
        shepherd.setBreed("shepherd");
        shepherd.setSize(Size.EXTRA_BIG);
        shepherd.bite();

        System.out.println("Taxa's name is " + taxa.getName() + ". It is " + taxa.getSize());
        taxa.bark();
        System.out.println("Mops's name is " + mops.getName() + ". It is " + mops.getSize());
        mops.bark();
        System.out.println("Shepherd's name is " + shepherd.getName() + ". It is " + shepherd.getSize());
        shepherd.bark();
        System.out.println("Total dogs: " + getDogsCount());

        Size s = Size.SMALL;
        //System.out.println(s.toString());
        Size s1 = Size.valueOf("BIG");
        //System.out.println(s1);
        Size[] values = Size.values();
        for (int i = 0; i < values.length; i++) {
            System.out.println(values[i]);
        }
    }
}