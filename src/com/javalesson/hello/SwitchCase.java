package com.javalesson.hello;

public class SwitchCase {
    public static void main(String[] args) {
        String day = "thursday";
        switch (day) {
            case "monday":
                System.out.println("1st day!");
                //break;
        }
        switch (day) {
            case "tuesday":
                System.out.println("2st day!");
                //break;
        }
        switch (day) {
            case "wednesday":
            case "thursday":
                System.out.println("3st day!");
                //break;
        }
    }
}
