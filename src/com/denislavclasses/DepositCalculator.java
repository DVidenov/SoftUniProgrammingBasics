package com.denislavclasses;

import java.util.Scanner;

public class DepositCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double deposit = Double.parseDouble(scanner.nextLine());
        double period = Double.parseDouble(scanner.nextLine());
        double interest = Double.parseDouble(scanner.nextLine());
        double result = deposit + period * ((deposit * (interest/100)) / 12);

        System.out.printf("%.2f %n", result);

    }
}
