package com.denislavclasses;

import java.util.Scanner;

public class BirthDayPartyExpenses {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int rentCenter = Integer.parseInt(sc.nextLine());
        double cake = rentCenter * 0.2;
        double drinks = cake - (cake *0.45);
        double funnyGuy = rentCenter / 3;

        System.out.println(rentCenter + cake + drinks + funnyGuy);
    }
}
