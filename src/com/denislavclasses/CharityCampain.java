package com.denislavclasses;

import java.util.Scanner;

public class CharityCampain {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int daysDuration = Integer.parseInt(sc.nextLine());
        int bakers = Integer.parseInt(sc.nextLine());
        int cakes = Integer.parseInt(sc.nextLine());
        int waffles = Integer.parseInt(sc.nextLine());
        int pancakes = Integer.parseInt(sc.nextLine());

        int cakePrice = cakes * 45;
        double wafflePrice = waffles * 5.80;
        double pancakesPrice =pancakes*  3.20;
        double sumPerBaker = cakePrice + wafflePrice + pancakesPrice;
        double sumAllBakers = sumPerBaker * bakers;
        double sumAllDays = sumAllBakers * daysDuration;
        double expenses = sumAllDays / 8;
        double profit = sumAllDays - expenses;

        System.out.printf("%f.2f", profit);
    }
}
