package com.denislavclasses;

import java.math.RoundingMode;
import java.text.DecimalFormat;
import java.util.Scanner;

public class FormatDouble {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double sqmeters = Double.parseDouble(scanner.nextLine());
        double Tax = sqmeters * 7.61;
        double discount = 0.18 * Tax;
        double finalTax = Tax - discount;
        DecimalFormat df = new DecimalFormat("#.##");
        df.setRoundingMode(RoundingMode.CEILING);

        System.out.println("The final price is: " + df.format(finalTax) + " lv.");
        System.out.println("The discount is: " + df.format(discount) + " lv.");
    }
}


