package com.denislavclasses;

import java.util.Scanner;

public class AreaOfFigures {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        if (input.equals("square")) {
            double squareNum = Double.parseDouble(scanner.nextLine());
            double result = squareNum*squareNum;
            System.out.printf("%.3f", result);
        }
        else if (input.equals("triangle")){
            double sideA = Double.parseDouble(scanner.nextLine());
            double sideHA = Double.parseDouble(scanner.nextLine());
            double result = sideA * sideHA /2;
            System.out.printf("%.3f", result);
        }
        else if (input.equals("circle")){
            double radius = Double.parseDouble(scanner.nextLine());
            double result = radius * radius * Math.PI;
            System.out.printf("%.3f", result);
        }
        else {
            double a = Double.parseDouble(scanner.nextLine());
            double b = Double.parseDouble(scanner.nextLine());
            double result = a * b;
            System.out.printf("%.3f", result);
        }
    }
}
