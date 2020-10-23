package com.denislavclasses;

import java.util.Scanner;

public class MetricConverter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double num = Double.parseDouble(scanner.nextLine());
        String distance = scanner.nextLine();
        String convertedDistance = scanner.nextLine();

        if (distance.equals("mm")){
            if (convertedDistance.equals("mm")){
                System.out.printf("%.3f", num);
            }
            else if (convertedDistance.equals("cm")){
                double result = num / 10;
                System.out.printf("%.3f", result);
            }
            else if (convertedDistance.equals("m")){
                double result = num / 1000;
                System.out.printf("%.3f", result);
            }
        }
        else if (distance.equals("cm")) {
            if (convertedDistance.equals("mm")) {
                double result = num * 10;
                System.out.printf("%.3f", result);
            }
            else if (convertedDistance.equals("cm")) {
                System.out.println(num);
            }
            else if (convertedDistance.equals("m")) {
                double result = num / 100;
                System.out.printf("%.3f", result);
            }
        }
        else if (distance.equals("m")) {
            if (convertedDistance.equals("mm")){
                double result = num * 1000;
                System.out.printf("%.3f", result);
            }
            else if (convertedDistance.equals("cm")){
                double result = num * 100;
                System.out.printf("%.3f", result);
            }
            else if (convertedDistance.equals("m")) {
                System.out.println(num);
            }
        }
    }
}
