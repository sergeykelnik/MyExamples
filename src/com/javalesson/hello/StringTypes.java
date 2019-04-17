package com.javalesson.hello;

public class StringTypes {

    public static void main(String[] args) { //public - can be called from any class

        int summ = Square(6, 6);
        System.out.println(summ);
        double quadrat = Quadrat(5);
        System.out.println(quadrat);
        System.out.println("Total: " + (Square(6, 6) + Quadrat(5)));


        String str1 = "Anastasia";
        System.out.println(str1.toUpperCase());
        System.out.println(str1.toLowerCase());
        String str2 = str1;
        String str3 = "Anastasia!!!";
        str3.startsWith("!", 3);
        System.out.println(str3.substring(0, 9));
        boolean b = str1 == str2;
        System.out.println(b);
        char a = 'D';
        System.out.println(a + str1);
        int aaa = 12;
        short bbb = 12;
        aaa = bbb;
        bbb = (short) aaa;


    }

    static int Square(int lenght, int width) {
        return lenght * width;
    }

    static double Quadrat(int storona) {
        return Math.pow(storona, 2);
    }
}
