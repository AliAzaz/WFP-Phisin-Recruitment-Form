package edu.aku.hassannaqvi.wfp_recruit_form.other;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class DateUtils {
    public static String getDaysBack(String format, int days){
        Calendar cal = Calendar.getInstance();
        cal.setTime(cal.getTime());
        cal.add(Calendar.DATE, days);
        return new SimpleDateFormat(format).format(cal.getTime()).toString(); //"dd-MM-yyyy HH:mm"
    }
    public static String addDays(String format,String date, int days){
      /*  DateFormat dateformat = new SimpleDateFormat(format);
        Date resultDate = new Date();
        try {
           resultDate = dateformat.parse(date);
        } catch (ParseException e) {
            e.printStackTrace();
        }
        Calendar cal = Calendar.getInstance();
        cal.setTime(resultDate);
        cal.add(Calendar.DATE, days);
        return new SimpleDateFormat(format).format(cal.getTime()).toString(); //"dd-MM-yyyy HH:mm"
        */
        SimpleDateFormat sdf = new SimpleDateFormat(format);
        Date dt = new Date();
        try {
            dt = sdf.parse(date);
        } catch (ParseException e) {
            e.printStackTrace();
        }
        Calendar cal = Calendar.getInstance();
        cal.setTime(dt);
        cal.add(Calendar.DATE, days);
        return new SimpleDateFormat(format).format(cal.getTime()).toString(); //"dd-MM-yyyy HH:mm"
    }
    public static String addSubtractMonths(String format,String date, int months){
        SimpleDateFormat sdf = new SimpleDateFormat(format);
        Date dt = new Date();
        try {
            dt = sdf.parse(date);
        } catch (ParseException e) {
            e.printStackTrace();
        }
       /* DateFormat dateformat = new SimpleDateFormat(format);
        Date resultDate = new Date();
        try {
           resultDate = dateformat.parse(date);
        } catch (ParseException e) {
            e.printStackTrace();
        }*/
        Calendar cal = Calendar.getInstance();
        cal.setTime(dt);
        cal.add(Calendar.MONTH, months);
        return new SimpleDateFormat(format).format(cal.getTime()).toString(); //"dd-MM-yyyy HH:mm"
    }
    public static String getMonthsBack(String format, int months){
        Calendar cal = Calendar.getInstance();
        cal.setTime(cal.getTime());
        cal.add(Calendar.MONTH, months);
        return new SimpleDateFormat(format).format(cal.getTime()).toString(); //"dd-MM-yyyy HH:mm"
    }
    public static String getYearsBack(String format, int year){
        Calendar cal = Calendar.getInstance();
        cal.setTime(cal.getTime());
        cal.add(Calendar.YEAR, year);
        return new SimpleDateFormat(format).format(cal.getTime()).toString(); //"dd-MM-yyyy HH:mm"
    }

    public static String getYearsAndMonthsBack(String format, int month, int year) {
        Calendar cal = Calendar.getInstance();
        cal.setTime(cal.getTime());
        cal.add(Calendar.YEAR, year);
        cal.add(Calendar.MONTH, month);
        return new SimpleDateFormat(format).format(cal.getTime()).toString(); //"dd-MM-yyyy HH:mm"
    }


}
