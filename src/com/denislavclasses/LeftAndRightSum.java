package com.denislavclasses;

import java.util.Scanner;

public class LeftAndRightSum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numberPerSum = Integer.parseInt(scanner.nextLine());
        int num = 0;
        int numb = 0;
        for (int i=0; i<numberPerSum; i++){
            int number1 = Integer.parseInt(scanner.nextLine());
            num += number1;
        }
        for (int y=0; y<numberPerSum; y++){
            int number2 = Integer.parseInt(scanner.nextLine());
            numb += number2;
        }
        if (num == numb){
            System.out.printf("Yes, sum = %d", num);
        }
        else {
            if (num > numb){
                int difference = num - numb;
                System.out.printf("No, diff = %d", difference);
            }
            else {
                int difference = numb - num;
                System.out.printf("No, diff = %d", difference);
            }
        }
    }
}
