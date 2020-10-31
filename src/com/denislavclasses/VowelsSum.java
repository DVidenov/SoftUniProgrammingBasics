package com.denislavclasses;

import java.util.Scanner;

public class VowelsSum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        int inputLength = input.length();
        int sum = 0;
        for (int i = 0; i < inputLength; i++){
            char[] eachChar = input.toCharArray();
            if (String.valueOf(eachChar[i]).equals("a")){
                sum = sum +1;
            }
            else if (String.valueOf(eachChar[i]).equals("e")){
                sum = sum +2;
            }
            else if (String.valueOf(eachChar[i]).equals("i")){
                sum = sum +3;
            }
            else if (String.valueOf(eachChar[i]).equals("o")){
                sum = sum +4;
            }
            else if (String.valueOf(eachChar[i]).equals("u")){
                sum = sum +5;
            }
        }
        System.out.println(sum);
    }
}
