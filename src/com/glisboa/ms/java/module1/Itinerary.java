package com.glisboa.ms.java.module1;

import java.util.Locale;
import java.util.Scanner;

public class Itinerary {

    Scanner input = new Scanner(System.in).useLocale(Locale.US);
    TravelMath calculate = new TravelMath();

    public void welcome() {
        System.out.println("Welcome to Vacation Planner! What is your name? ");
        String name = input.nextLine();

        System.out.println("Nice to meet you " + name + "!");
        System.out.println("Where are you traveling to? ");
        String travelToCity = input.nextLine();

        System.out.println("Great! " + travelToCity + " sounds like a great trip.");
        System.out.println("**********************************\n");
    }

    public void timeOfStayAndHowMuchMoney() {
        System.out.println("How many days are you going to spend traveling?");
        int daysTraveling = input.nextInt();

        System.out.println("How much money, in USD, are you planning to spend on your trip?");
        double moneyToSpend = input.nextDouble();
        input.nextLine();

        System.out.println("What is the the currency symbol for your travel destination?");
        String currencySymbol = input.nextLine();

        System.out.println("How many " + currencySymbol + " are in $1 USD?");
        double exchangeToRate = input.nextDouble();

        System.out.println("If you are traveling for " + daysTraveling +" days that is the same as " +
                calculate.daysToHours(daysTraveling) + " hours or " + calculate.daysToMins(daysTraveling) +
                " minutes.");

        System.out.println("If you are going to spend " + moneyToSpend +" " +
                "USD that means per day you can spend up to " + calculate.moneyPerDay(moneyToSpend, daysTraveling) +
                " USD.");

        double totalBudget = calculate.convertCurrencyFromUSD(moneyToSpend, exchangeToRate);

        System.out.println("Your total budget in " + currencySymbol +" is " +
                totalBudget + " " + currencySymbol + " , which per day is " + calculate.moneyPerDay(totalBudget, daysTraveling) +
                " " + currencySymbol);
        System.out.println("********************************************\n");
    }

    public void timeZone() {
        System.out.println("What is the time difference, in hours, between your home and your destination?");
        int hourDifference = input.nextInt();
        input.nextLine();

        System.out.println("That means when it is midnight at home it will be "
                + calculate.timeWhenMidnightInUSA(hourDifference) + " in your travel destination. "
                + "And when it is noon at home it will be " + calculate.timeWhenNoonInUSA(hourDifference));
        System.out.println("******************************************\n");
    }

    public void squareArea() {
        System.out.println("What is the square area of your destination country in square kilometers(km2)?");
        int squareKilometers = input.nextInt();
        System.out.println("In square miles (m2) that is "
                +  String.format("%.1f", calculate.squareArea(squareKilometers)));
        System.out.println("*************************************************************");

    }

}