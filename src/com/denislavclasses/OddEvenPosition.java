package com.denislavclasses;

import java.util.Scanner;

public class OddEvenPosition {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int nNumbers = Integer.parseInt(scanner.nextLine());
        double evenSum = 0.0;
        double evenMin = Integer.MAX_VALUE;
        double evenMax = Integer.MIN_VALUE;
        double oddSum = 0.0;
        double oddMin = Integer.MAX_VALUE;
        double oddMax = Integer.MIN_VALUE;

        for (int i = 1; i <= nNumbers; i++){
            double number = Double.parseDouble(scanner.nextLine());
            if (i % 2 != 0){
                oddSum += number;
                if (oddMin > number){
                    oddMin = number;
                }
                if (oddMax < number){
                    oddMax = number;
                }
            } else {
                evenSum += number;
                if (evenMin > number){
                    evenMin = number;
                }
                if (evenMax < number){
                    evenMax = number;
                }
            }
        }
        if (oddSum == 0){
            System.out.printf("OddSum=%.2f,\n", oddSum);
            System.out.println("OddMin=No,");
            System.out.println("OddMax=No,");
        } else {
            System.out.printf("OddSum=%.2f,\n", oddSum);
            System.out.printf("OddMin=%.2f,\n", oddMin);
            System.out.printf("OddMax=%.2f,\n", oddMax);
        }

        if (evenSum == 0){
            System.out.printf("EvenSum=%.2f,\n", evenSum);
            System.out.println("EvenMin=No,");
            System.out.println("EvenMax=No");
        } else {
            System.out.printf("EvenSum=%.2f,\n", evenSum);
            System.out.printf("EvenMin=%.2f,\n", evenMin);
            System.out.printf("EvenMax=%.2f\n", evenMax);
        }
    }
}
