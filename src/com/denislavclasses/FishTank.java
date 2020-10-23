package com.denislavclasses;

import java.util.Scanner;

public class FishTank {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double height = Double.parseDouble(sc.nextLine());
        double width = Double.parseDouble(sc.nextLine());
        double depth = Double.parseDouble(sc.nextLine());
        double percentage = Double.parseDouble(sc.nextLine());

        double volume = height * width * depth;
        double totalLiters = volume * 0.001;
        double percentageCalculated = percentage * 0.01;

        double result = totalLiters * (1 - percentageCalculated);

        System.out.println(result);
    }
}
