package com.javalesson.oop;

public class Doge {

    public static final int PAWS = 4;
    public static final int TAIL = 1;
    private static int dogsCount;
    private String name = "";
    private String breed = "";
    private Size size = Size.UNDEFINED;

    public Doge() {
        dogsCount++;
        System.out.println("Here are: " + dogsCount + " dogs!");
    }

    public static int getDogsCount() {
        return dogsCount;
    }

    public Size getSize() {
        return size;
    }

    public void setSize(Size size) {
        this.size = size;
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
        switch (size) {
            case SUPER_SMALL:
            case SMALL:
                System.out.println("tiaf-tiaf");
                break;
            case MEDIUM:
                System.out.println("gav-gav");
                break;
            case BIG:
            case EXTRA_BIG:
                System.out.println("bark-bark");
                break;
            default:
                System.out.println("Size undefined");
        }
    }

    public void bite() {
        if (dogsCount>2){
            System.out.println("Dogs are biting you!");
        }

    }
}
