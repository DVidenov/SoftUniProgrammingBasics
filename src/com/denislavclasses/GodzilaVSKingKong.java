package com.denislavclasses;

import java.util.Scanner;

public class GodzilaVSKingKong {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double budget = Double.parseDouble(scanner.nextLine());
        int countStatists = Integer.parseInt(scanner.nextLine());
        double pricePerStatist = Double.parseDouble(scanner.nextLine());

        double priceDecor = 0.10 * budget;
        double priceStatists = countStatists * pricePerStatist;
        if (countStatists > 150) {
            priceStatists = priceStatists - 0.10 * priceStatists;
        }

        double expenses = priceDecor + priceStatists;
        if (budget >= expenses) {
            double leftMoney = budget - expenses;
            System.out.println("Action!");
            System.out.printf("Wingard starts filming with %.2f leva left.", leftMoney);
        }
        else {
            double needMoney = expenses - budget;
            System.out.println("Not enough money!");
            System.out.printf("Wingard need %.2f leva more", needMoney);
        }
        /*
        Scanner scanner = new Scanner(System.in);
        double budget = Double.parseDouble(scanner.nextLine());
        double statists = Double.parseDouble(scanner.nextLine());
        double clothesPrice = Double.parseDouble(scanner.nextLine());
        double decorePrice = budget * 0.1;
        double discountedClothes = 0;

        if (statists > 150){
            discountedClothes = clothesPrice - (clothesPrice * 0.1);
        }
        if (budget >= 1.00 && budget <= 1000000.00 && statists > 150) {
            if ((discountedClothes + decorePrice) > budget){
                double needMore = ((discountedClothes * statists) + decorePrice) - budget;
                System.out.println("Not enough money!");
                System.out.printf("Wingard need " + "%.2f leva more.", needMore);
            }
            else {
                double moneyLeft = budget - ((discountedClothes * statists) + decorePrice);
                System.out.println("Action!");
                System.out.printf("Wingard starts filming with " + "%.2f leva left.", moneyLeft);
            }
        }
        else if (budget >= 1.00 && budget <= 1000000.00 && statists <= 150) {
            if (((clothesPrice * statists) + decorePrice) > budget){
                double needMore = ((clothesPrice * statists) + decorePrice) - budget;
                System.out.println("Not enough money!");
                System.out.printf("Wingard need " + "%.2f leva more.", needMore);
            }
            else {
                double moneyLeft = budget - ((clothesPrice * statists) + decorePrice);
                System.out.println("Action!");
                System.out.printf("Wingard starts filming with " + "%.2f leva left.", moneyLeft );
            }
        }*/
    }
}
