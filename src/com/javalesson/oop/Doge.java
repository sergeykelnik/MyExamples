package com.javalesson.oop;

public class Doge {

    public static int dogsCount;

    private int paws = 4;
    private int tail = 1;
    private String name = "";
    private String breed = "";
    private String size = "";

    public Doge() {
        dogsCount++;
        System.out.println("Here are: "+dogsCount+" dogs!");
    }

    public static int getDogsCount() {
        return dogsCount;
    }

    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        if (size.equalsIgnoreCase("big") ||
                size.equalsIgnoreCase("average") ||
                size.equalsIgnoreCase("small")
        ) {
            this.size = size;
        } else {
            System.out.println("Incorrect size");
        }
    }

    public int getPaws() {
        return paws;
    }

    public void setPaws(int paws) {
        this.paws = paws;
    }

    public int getTail() {
        return tail;
    }

    public void setTail(int tail) {
        this.tail = tail;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getBreed() {
        return breed;
    }

    public void setBreed(String breed) {
        this.breed = breed;
    }

    public void bark() {
        if (size.equalsIgnoreCase("small")) {
            System.out.println("tiaf-tiaf");
        } else if (size.equalsIgnoreCase("average")) {
            System.out.println("gav-gav");
        } else if (size.equalsIgnoreCase("big")) {
            System.out.println("bark-bark");
        } else {
            System.out.println("This dog cannot make sounds");
        }
    }

    public void bite() {

    }
}
