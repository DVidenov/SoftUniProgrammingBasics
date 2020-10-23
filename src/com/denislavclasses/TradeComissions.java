package com.denislavclasses;

import java.util.Scanner;

public class TradeComissions {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String city = scanner.nextLine();
        double sales = Double.parseDouble(scanner.nextLine());

        switch (city) {
            case "Sofia":
                if (0 <= sales && sales <= 500){
                    double result = sales * 0.05;
                    System.out.printf("%.2f", result);
                    break;
                }
                else if (500 < sales && sales <= 1000) {
                    double result = sales * 0.07;
                    System.out.printf("%.2f", result);
                    break;
                }
                else if (1000 < sales && sales <= 10000){
                    double result = sales * 0.08;
                    System.out.printf("%.2f", result);
                    break;
                }
                else if (10000 < sales) {
                    double result = sales * 0.12;
                    System.out.printf("%.2f", result);
                    break;
                }
            case "Varna":
                if (0 <= sales && sales <= 500){
                    double result = sales * 0.045;
                    System.out.printf("%.2f", result);
                    break;
                }
                else if (500 < sales && sales <= 1000) {
                    double result = sales * 0.075;
                    System.out.printf("%.2f", result);
                    break;
                }
                else if (1000 < sales && sales <= 10000){
                    double result = sales * 0.1;
                    System.out.printf("%.2f", result);
                    break;
                }
                else if (10000 < sales) {
                    double result = sales * 0.13;
                    System.out.printf("%.2f", result);
                    break;
                }
            case "Plovdiv":
                if (0 <= sales && sales <= 500){
                    double result = sales * 0.055;
                    System.out.printf("%.2f", result);
                    break;
                }
                else if (500 < sales && sales <= 1000) {
                    double result = sales * 0.08;
                    System.out.printf("%.2f", result);
                    break;
                }
                else if (1000 < sales && sales <= 10000){
                    double result = sales * 0.12;
                    System.out.printf("%.2f", result);
                    break;
                }
                else if (10000 < sales) {
                    double result = sales * 0.145;
                    System.out.printf("%.2f", result);
                    break;
                }
            default:
                System.out.println("error");
            }
    }
}
