package com.denislavclasses;

import java.util.Scanner;

public class newHome {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String flowerType = scanner.nextLine();
        int flowerCount = Integer.parseInt(scanner.nextLine());
        int budget = Integer.parseInt(scanner.nextLine());

        double price = 0;
        switch (flowerType){
            case "Roses":
                price = flowerCount * 5;
                if (flowerCount > 80){
                    price = price - 0.10 * price;
                }
                break;
            case "Dahlias":
                price = flowerCount * 3.80;
                if (flowerCount > 90){
                    price = price - 0.15 * price;
                }
                break;
            case "Tulips":
                price = flowerCount * 2.80;
                if (flowerCount > 80) {
                    price = price - 0.15 * price;
                }
                break;
            case "Narcissus":
                price = flowerCount * 3;
                if (flowerCount < 120){
                    price = price + 0.15 * price;
                }
                break;
            case "Gladiolus":
                price = flowerCount * 2.50;
                if (flowerCount < 80){
                    price = price + 0.20 * price;
                }
                break;
        }
        if (budget >= price) {
            double leftMoney = budget - price;
            System.out.printf("Hey, you have a great garden with %d %s and %.2f leva left.", flowerCount, flowerType, leftMoney);
        }
        else {
            double needMoney = price - budget;
            System.out.printf("Not enough money, you need %.2f leva more.", needMoney);
        }
    }
}
