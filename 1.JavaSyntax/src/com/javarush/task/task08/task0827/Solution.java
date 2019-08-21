package com.javarush.task.task08.task0827;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.Locale;

/* 
Работа с датой
*/

public class Solution {
    public static void main(String[] args) {
        System.out.println(isDateOdd("JANUARY 1 2000"));
        System.out.println(isDateOdd("JANUARY 2 2020"));
    }

    public static boolean isDateOdd(String date) {
        //Date date2 = new Date(date);
        DateFormat dateFormat = new SimpleDateFormat("MMMMM d yyyy", Locale.ENGLISH);
        Date date1 = new Date();
        try {
            date1 = dateFormat.parse(date);
//            System.out.println(date1);
        } catch (ParseException e) {
            e.printStackTrace();
        }
        Date newDate = new Date();
        newDate.setYear(date1.getYear());
       // System.out.println(date1.getYear());
        newDate.setDate(0);
        newDate.setMonth(0);
        newDate.setHours(0);
        newDate.setMinutes(0);
        newDate.setSeconds(0);

        long time = date1.getTime()-newDate.getTime();
      //  System.out.println(time);
        double day = (double)time/(double)86400000;
        int roundDay = (int) Math.round(day);
     //   System.out.println(Math.round(day));
        if(roundDay%2 !=0 ) return true;
        else return false;
    }
}
