package com.denislavclasses;

import java.util.Scanner;

public class FruitShop {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String fruit = scanner.nextLine();
        String dayOfWeek = scanner.nextLine();
        double quantity = Double.parseDouble(scanner.nextLine());

        switch (dayOfWeek) {
            case "Monday":
            case "Tuesday":
            case "Wednesday":
            case "Thursday":
            case "Friday":
                if (fruit.equals("banana")){
                    double banana = 2.50;
                    double price = banana * quantity;
                    System.out.printf("%.2f", price);
                    break;
                }
                else if (fruit.equals("apple")){
                    double apple = 1.20;
                    double price = apple * quantity;
                    System.out.printf("%.2f", price);
                    break;
                }
                else if (fruit.equals("orange")){
                    double orange = 0.85;
                    double price = orange * quantity;
                    System.out.printf("%.2f", price);
                    break;
                }
                else if (fruit.equals("grapefruit")){
                    double grapefruit = 1.45;
                    double price = grapefruit * quantity;
                    System.out.printf("%.2f", price);
                    break;
                }
                else if (fruit.equals("kiwi")){
                    double kiwi = 2.70;
                    double price = kiwi * quantity;
                    System.out.printf("%.2f", price);
                    break;
                }
                else if (fruit.equals("pineapple")){
                    double pineapple = 5.50;
                    double price = pineapple * quantity;
                    System.out.printf("%.2f", price);
                    break;
                }
                else if (fruit.equals("grapes")){
                    double grapes = 3.85;
                    double price = grapes * quantity;
                    System.out.printf("%.2f", price);
                    break;
                }
            case "Saturday":
            case "Sunday":
                if (fruit.equals("banana")){
                    double banana = 2.70;
                    double price = banana * quantity;
                    System.out.printf("%.2f", price);
                    break;
                }
                else if (fruit.equals("apple")){
                    double apple = 1.25;
                    double price = apple * quantity;
                    System.out.printf("%.2f", price);
                    break;
                }
                else if (fruit.equals("orange")){
                    double orange = 0.90;
                    double price = orange * quantity;
                    System.out.printf("%.2f", price);
                    break;
                }
                else if (fruit.equals("grapefruit")){
                    double grapefruit = 1.60;
                    double price = grapefruit * quantity;
                    System.out.printf("%.2f", price);
                    break;
                }
                else if (fruit.equals("kiwi")){
                    double kiwi = 3.00;
                    double price = kiwi * quantity;
                    System.out.printf("%.2f", price);
                    break;
                }
                else if (fruit.equals("pineapple")){
                    double pineapple = 5.60;
                    double price = pineapple * quantity;
                    System.out.printf("%.2f", price);
                    break;
                }
                else if (fruit.equals("grapes")) {
                    double grapes = 4.20;
                    double price = grapes * quantity;
                    System.out.printf("%.2f", price);
                    break;
                }
            default:
                System.out.println("error");
                break;
        }
    }
}
