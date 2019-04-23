package com.glisboa.ms.java.module1;

import java.text.DecimalFormat;
import java.time.LocalTime;

public class TravelMath {

    public int daysToHours(int days) {
        int hours = days * 24;
        return hours;
    }

    public int daysToMins(int days) {
        int mins = daysToHours(days) * 60;
        return mins;
    }

    public double moneyPerDay(double money, int day) {
        double moneyPerDay = money / day;
        return roundToDecimal(moneyPerDay);
    }

    public double convertCurrencyFromUSD(double amount, double toRate) {
        double convertedAmount = amount * (toRate/1.00);
        return convertedAmount;
    }

    private double roundToDecimal(double value) {
        DecimalFormat df = new DecimalFormat("####.##");
        return Double.valueOf(df.format(value));
    }

    public LocalTime timeWhenNoonInUSA(int hourDifference) {
        LocalTime time = LocalTime.NOON.plusHours(hourDifference);
        return time;

    }

    public LocalTime timeWhenMidnightInUSA(int hourDifference) {
        LocalTime time = LocalTime.MIDNIGHT.plusHours(hourDifference);
        return time;
    }

    public double squareArea(int squareKilometers) {
       return squareKilometers * 0.386102;

    }

}
