package com.denislavclasses;

import java.util.Scanner;

public class Salary {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int tabs = Integer.parseInt(scanner.nextLine());
        int salary = Integer.parseInt(scanner.nextLine());

        for (int i = 1; i <= tabs; i++){
            String sites = scanner.nextLine();
            if ("Facebook".equals(sites)){
                salary = salary - 150;
            } else if ("Instagram".equals(sites)){
                salary = salary - 100;
            } else if ("Reddit".equals(sites)){
                salary = salary - 50;
            }
        }
        if (salary <= 0){
            System.out.println("You have lost your salary.");
        } else {
            System.out.println(salary);
        }
    }
}
