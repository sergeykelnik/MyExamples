package com.javalesson.hello;

public class MethodAndParameter {
    public static void main(String[] args) {
        int summ = Square(6, 6);
        System.out.println(summ);
        double quadrat = Quadrat(5);
        System.out.println(quadrat);
        System.out.println("Total: " + (Square(6, 6) + Quadrat(5)));
    }

    static int Square(int lenght, int width) {
        return lenght * width;
    }

    static double Quadrat(int storona) {
        return Math.pow(storona, 2);
    }
}
