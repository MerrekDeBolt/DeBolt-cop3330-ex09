/*
 *  UCF COP3330 Fall 2021 Exercise 9 Solution
 *  Copyright 2021 Merrek DeBolt
 */

import java.util.Scanner;

public class Main {

    static int areaPerGallon = 350;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("What is the length of the area in feet? ");
        String lengthStr = scanner.nextLine();
        System.out.println("What is the width of the area in feet? ");
        String widthStr = scanner.nextLine();

        int length = Integer.parseInt(lengthStr);
        int width = Integer.parseInt(widthStr);

        double area = length * width;
        double gallonsNeeded = area / areaPerGallon;

        System.out.println("You will need to purchase " + Math.ceil(gallonsNeeded) + " gallons of paint to cover " + area + " square feet.");
    }
}