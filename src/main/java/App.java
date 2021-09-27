/*
 *  UCF COP3330 Fall 2021 Assignment 1 Solution
 *  Copyright 2021 Koby Montenegro
 */

import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        System.out.print("Enter the price of item 1: ");
        Scanner scanner = new Scanner(System.in);
        int price1 = scanner.nextInt();

        System.out.print("Enter the quantity of item 1: ");
        int quantity1 = scanner.nextInt();

        System.out.print("Enter the price of item 2: ");
        int price2 = scanner.nextInt();

        System.out.print("Enter the quantity of item 2: ");
        int quantity2 = scanner.nextInt();

        System.out.print("Enter the price of item 3: ");
        int price3 = scanner.nextInt();

        System.out.print("Enter the quantity of item 3: ");
        int quantity3 = scanner.nextInt();

        int total1 = price1 * quantity1;
        int total2 = price2 * quantity2;
        int total3 = price3 * quantity3;

        int subtotal = total1 + total2 + total3;

        double tax = Math.round(subtotal *5.5)/100.0;

        double total = subtotal + tax;

        String subout = String.format("Subtotal: $"+ subtotal);
        String taxout = String.format("Tax: $"+ tax);
        String totalout = String.format("Total: $"+ total);

        String output = (subout + "\n" + taxout + "\n" + totalout);

        System.out.print(output);

        scanner.close();
    }
}
