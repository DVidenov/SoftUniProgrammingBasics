package com.denislavclasses;

import java.util.Scanner;

public class ClassAnimal {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String animal = scanner.nextLine();

        switch (animal) {
            case "dog":
                System.out.println("mammal");
            case "crocodile":
            case "tortoise":
            case "snake":
                System.out.println("reptile");
            default:
                System.out.println("unknown");
        }
    }
}
