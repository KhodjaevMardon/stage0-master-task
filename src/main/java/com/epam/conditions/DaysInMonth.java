package com.epam.conditions;

public class DaysInMonth {

    public void printDays(int year, int month) {
        if (year < 0 || month < 1 || month > 12) {
            System.out.println("invalid date");
            return;
        }

        if (month == 2) {
            System.out.println(28 + (isLeap(year) ? 1 : 0));
        } else if (month % 2 == 0) {
            System.out.println(30);
        } else {
            System.out.println(31);
        }
    }

    private boolean isLeap(int year) {
        return (year % 400 == 0) || ((year % 4 == 0) && (year % 100 != 0));
    }

}
