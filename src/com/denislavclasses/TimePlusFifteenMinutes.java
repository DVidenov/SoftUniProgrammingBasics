package com.denislavclasses;

import java.util.Scanner;

public class TimePlusFifteenMinutes {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int hours = Integer.parseInt(scanner.nextLine());
        int minutes = Integer.parseInt(scanner.nextLine());
        //int currentTime = minutes + 15;

        int currentTimeInMinutes = hours * 60 + minutes;
        int timePlus15Minutes = currentTimeInMinutes + 15;

        int finalHour = timePlus15Minutes / 60;
        int finalMinutes = timePlus15Minutes % 60;

        if (finalHour >= 24) {
            finalHour = 0;
        }
        System.out.printf("%d:%02d", finalHour, finalMinutes);
/*

        if (hours == 23 && currentTime >= 60){
            if (currentTime % 60 >= 10){
                System.out.println(0 + ":" + (currentTime % 60));
            }
            else {
                System.out.println(hours + ":" + currentTime);
            }
        }
        else if (hours <= 22 && currentTime >=60) {
            if (currentTime % 60 > 0){
                System.out.println((hours + 1) + ":" + (currentTime % 60));
            }
            else {
                System.out.println(hours + ":" + currentTime);
            }
        }
        else if (hours <= 22 && currentTime < 60){
            System.out.println(hours + ":" + currentTime);
        }
        else if (hours == 0 && currentTime >=60) {
            if (currentTime % 60 == 0){
                System.out.println("1:00");
            }
            else if (currentTime % 60 > 0){
                System.out.println("1:"+ (currentTime % 60));
            }
        }
        if (hours == 23 && currentTime == 60)
            System.out.println("0:00");
*/

    }
}
