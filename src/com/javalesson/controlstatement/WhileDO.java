package com.javalesson.controlstatement;

public class WhileDO {
    public static void main(String[] args) {
        int finalbalance = 1000000;
        double currentbalace = 0;
        int remains = 10000;
        int years = 0;
        double percent = 0.035;
        do {
            currentbalace += remains;
            currentbalace = (currentbalace + currentbalace * percent);
            years++;
            System.out.println(years + " - " + currentbalace);
        } while (finalbalance > currentbalace || years > 15);
    }
}
