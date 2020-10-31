package com.denislavclasses;

import java.util.Scanner;

public class Histogram {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int nNumbers = Integer.parseInt(scanner.nextLine());

        int p1 = 0;
        int p2 = 0;
        int p3 = 0;
        int p4 = 0;
        int p5 = 0;



        for (int i =1; i <=nNumbers; i++){
            int number = Integer.parseInt(scanner.nextLine());
            if (number < 200){
                p1++;
            } else if (number < 400){
                p2++;
            } else if (number < 600){
                p3++;
            } else if (number < 800){
                p4++;
            } else {
                p5++;
            }
        }
        double p1Result = (p1 * 1.00 / nNumbers) * 100;
        double p2Result = (p2 * 1.00 / nNumbers) * 100;
        double p3Result = (p3 * 1.00 / nNumbers) * 100;
        double p4Result = (p4 * 1.00 / nNumbers) * 100;
        double p5Result = (p5 * 1.00 / nNumbers) * 100;
        System.out.printf("%.2f%%\n", p1Result);
        System.out.printf("%.2f%%\n", p2Result);
        System.out.printf("%.2f%%\n", p3Result);
        System.out.printf("%.2f%%\n", p4Result);
        System.out.printf("%.2f%%", p5Result);
    }
}
