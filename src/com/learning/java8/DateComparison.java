package com.learning.java8;

import java.util.Calendar;
import java.util.Date;
import java.util.concurrent.TimeUnit;

public class DateComparison {

    public static void main(String[] args) {


        Calendar date = Calendar.getInstance();
        System.out.println("Current Date and TIme : " + date.getTime());
        long timeInSecs = date.getTimeInMillis();
        Date afterAdding10Mins = new Date(timeInSecs + (120 * 60 * 1000));
        System.out.println("After adding 10 mins : " + afterAdding10Mins);


        long minutes = TimeUnit.MILLISECONDS.toMinutes(afterAdding10Mins.getTime() - new Date().getTime());
        int hours = (int) minutes / 60;
        minutes = minutes - hours * 60;
        System.out.println(" time in hours = " + hours + " minutes = " + minutes);
    }
}
