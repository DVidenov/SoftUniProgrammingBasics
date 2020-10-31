package com.denislavclasses;

import java.util.Scanner;

public class NumberSequence {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numNumbers = Integer.parseInt(scanner.nextLine());
        int lowestNum = Integer.MAX_VALUE;
        int biggestNum = Integer.MIN_VALUE;
        for (int i = 0; i < numNumbers; i++){
            int num = Integer.parseInt(scanner.nextLine());
            if (num > biggestNum){
                biggestNum = num;
            }
            if (num < lowestNum){
                lowestNum = num;
            }
        }
        System.out.printf("Max number: %d\n", biggestNum);
        System.out.printf("Min number: %d", lowestNum);
    }
}
