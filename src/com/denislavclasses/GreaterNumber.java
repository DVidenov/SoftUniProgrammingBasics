package com.denislavclasses;

import java.util.Scanner;

public class GreaterNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int firstDig = Integer.parseInt(scanner.nextLine());
        int secondDig = Integer.parseInt(scanner.nextLine());

        if (firstDig > secondDig){
            System.out.println(firstDig);
        }
        else {
            System.out.println(secondDig);
        }
    }
}
