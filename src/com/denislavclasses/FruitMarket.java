package com.denislavclasses;

import java.util.Scanner;

public class FruitMarket {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double strawberryPrice = Double.parseDouble(sc.nextLine());
        double bananaKg = Double.parseDouble(sc.nextLine());
        double orangesKg = Double.parseDouble(sc.nextLine());
        double raspberriesKg = Double.parseDouble(sc.nextLine());
        double strawberriesKg = Double.parseDouble(sc.nextLine());

        double sumStrawberry = strawberriesKg * strawberryPrice;
        double raspberriesPrice = strawberryPrice / 2;
        double sumRaspberries = raspberriesKg * raspberriesPrice;
        double orangePrice = raspberriesPrice - raspberriesPrice * 0.4;
        double sumOranges = orangesKg * orangePrice;
        double bananaPrice = raspberriesPrice - 0.8 * raspberriesPrice;
        double sumBananas = bananaKg * bananaPrice;


        double finalPrice = sumBananas + sumOranges + sumRaspberries + sumStrawberry;

        System.out.printf("%.2f", finalPrice);
    }
}
