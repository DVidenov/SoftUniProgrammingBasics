package com.denislavclasses;

import java.util.Scanner;

public class CharacterSequence {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        int stringLength = input.length();
        for (int i = 0; i < stringLength; i++){
            char[] eachChar = input.toCharArray();
            System.out.println(eachChar[i]);
        }
    }
}
