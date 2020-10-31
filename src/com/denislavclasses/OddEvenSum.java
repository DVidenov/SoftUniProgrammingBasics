package com.denislavclasses;

import java.util.Scanner;

public class OddEvenSum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numNumbers = Integer.parseInt(scanner.nextLine());
        int resultEven = 0;
        int resultOdd = 0;
        for (int i=0; i<numNumbers; i++){
            int enteredNumber = Integer.parseInt(scanner.nextLine());
            if (i % 2 == 0){
                resultEven += enteredNumber;
            }else{
                resultOdd += enteredNumber;
            }
        }
        if (resultEven == resultOdd){
            System.out.println("Yes");
            System.out.printf("Sum = %d", resultEven);
        }else {
            if (resultEven > resultOdd){
                int diff = resultEven - resultOdd;
                System.out.println("No");
                System.out.printf("Diff = %d", diff);
            }else{
                int diff = resultOdd - resultEven;
                System.out.println("No");
                System.out.printf("Diff = %d", diff);
            }
        }
    }
}
