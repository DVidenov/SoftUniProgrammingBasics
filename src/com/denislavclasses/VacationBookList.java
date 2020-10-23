package com.denislavclasses;

import java.util.Scanner;

public class VacationBookList {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int pages = Integer.parseInt(scanner.nextLine());
        int pagesPerHour = Integer.parseInt(scanner.nextLine());
        int daysToReadBook = Integer.parseInt(scanner.nextLine());
        int hoursPerBook = pages / pagesPerHour;
        int result = hoursPerBook /daysToReadBook;

        System.out.println(result);
    }
}
