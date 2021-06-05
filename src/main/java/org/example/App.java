package org.example;

/*
 *  UCF COP3330 Summer 2021 Assignment 1 Solution
 *  Copyright 2021 Asad merouani
 */


import java.util.Scanner;

public class App {
    public static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        App app = new App();

        app.processInterest(scanner);
    }
    private void processInterest(Scanner scanner) {
        float principle;
        float interest;
        int years;
        int compound;
        double total;

        System.out.println("Enter the principal:");
        principle = Float.parseFloat(scanner.nextLine());

        System.out.println("Enter the rate of interest:");
        interest = Float.parseFloat(scanner.nextLine());

        System.out.println("Enter the number of years:");
        years = Integer.parseInt(scanner.nextLine());

        System.out.println("What is the number of times the interest is compounded per year?\n");
        compound = Integer.parseInt(scanner.nextLine());

        total= principle* Math.pow((1+((interest*0.01f)/compound)),compound*years);
        System.out.printf("$%.2f invested at at %.2f%%, for %d years compounded %d times per year is $%.2f.",principle,interest, years,compound,total);

    }
}

