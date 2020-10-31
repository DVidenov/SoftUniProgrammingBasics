package com.denislavclasses;

import java.util.Scanner;

public class HalfSumElement {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numNumbers = Integer.parseInt(scanner.nextLine());
        int result = 0;
        int max = Integer.MIN_VALUE;
        for (int i =1; i <= numNumbers; i++){
            int number = Integer.parseInt(scanner.nextLine());
            result += number;
            if (number > max){
                max = number;
            }
        }
        int sumWithoutMaxNumber = result - max;
        if (max == sumWithoutMaxNumber){
            System.out.println("Yes");
            System.out.println("Sum = " + max);
        } else {
            int diff = Math.abs(max - sumWithoutMaxNumber);
            System.out.println("No");
            System.out.println("Diff = " + diff);
        }
    }
}
