package com.denislavclasses;

import java.util.Scanner;

public class Cinema {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String typeProjection = scanner.nextLine();
        int row = Integer.parseInt(scanner.nextLine());
        int colon = Integer.parseInt(scanner.nextLine());
        double price = 0;
        double result = 0;

        switch (typeProjection) {
            case "Premiere":
                price = 12.00;
                result = row * colon * price;
                System.out.printf("%.2f", result);
                break;
            case "Normal":
                price = 7.50;
                result = row * colon * price;
                System.out.printf("%.2f", result);
                break;
            case "Discount":
                price = 5.00;
                result = row * colon * price;
                System.out.printf("%.2f", result);
                break;
        }
    }
}
