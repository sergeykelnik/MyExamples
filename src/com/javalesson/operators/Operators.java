package com.javalesson.operators;

public class Operators {
    public static void main(String[] args) {
        System.out.println("Hello!");
        int a = 10;
        int b = 3;
        int c = a / b;
        System.out.println(c + "." + a % b);

        a = a + 5;
        System.out.println(a);

        int x = 12;
        int y = 10;
        int res1 = x > y ? x : y;
        System.out.println(res1);
        int res2;
        if (x > y) {
            res2 = x;
        } else {
            res2 = y;
        }
        System.out.println(res2);
    }
}
