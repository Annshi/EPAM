/*
 * @(#)DataTypesTester.java 1.3 30/05/18
 * Copyright (c) 1994-1999 Sun Microsystems, Inc.
 * All Rights Reserved.
 */
/**
 *
 * @version          1.3 30 May 2018
 * @author           Shiman Anna
 */
public class Calendar {

    public static final int USUAL_FEBRUARY_DAYS = 28;
    public static final int LEAP_FEBRUARY_DAYS = 29;
    public static final int MONTHS = 12;
    public static final int DAYS_31 = 31;
    public static final int DAYS_30 = 30;

    public static String defineNextDate(int currentDay, int currentMonth, int currentYear) {
        int  daysAmount;
        int  nextDay;
        int  nextMonth;
        int  nextYear;

       daysAmount = defineDaysAmount(currentMonth, currentYear);

       //common case
       nextDay  = currentDay + 1;
       nextMonth = currentMonth;
       nextYear = currentYear;
       //when current day is last in month
       if(nextDay  > daysAmount){
           nextDay = 1;
           nextMonth = currentMonth + 1;
           //when current month is last in year and current day is last in month (31 december)
           if(currentMonth == MONTHS){
               nextMonth = 1;
               nextYear = currentYear + 1;
           }
       }

       return nextDay + ":" + nextMonth + ":" + nextYear;
    }

    public static int defineDaysAmount(int currentMonth, int currentYear) {
        switch (currentMonth) {
            case 4:
            case 6:
            case 9:
            case 11:
                return DAYS_30;
            case 2: //February
                return checkLeapYear(currentYear);
            default:
                return DAYS_31;
        }
    }

    public static int checkLeapYear(int year){

        if(year % 400 == 0 || (year % 4 == 0 && year % 100 != 0)){
            return LEAP_FEBRUARY_DAYS;
        }
        else return USUAL_FEBRUARY_DAYS;
    }
}

