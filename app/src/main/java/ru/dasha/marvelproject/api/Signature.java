package ru.dasha.marvelproject.api;

import android.support.annotation.NonNull;

import java.util.Calendar;
import java.util.TimeZone;

import ru.dasha.marvelproject.utils.HashUtil;

/***
 * This class has all the parameters we use for request.
 * IMPORTANT! You need to paste your public and private keys to make it works.
 * The dates we choose in FirstActivity go here and then build the general date for request.
 * Also hash signature is made here.
 */
public class Signature {
    public static final String PUBLIC_KEY = "PASTE_YOUR_PUBLIC_KEY";
    public static final String PRIVATE_KEY = "PASTE_YOUR_PRIVATE_KEY";
    private static Calendar calendar = Calendar.getInstance(TimeZone.getTimeZone("UTC"));
    private static String dateFrom = calendar.get(Calendar.YEAR) + "-" + (calendar.get(Calendar.MONTH) - 1) + "-" + calendar.get(Calendar.DAY_OF_MONTH);
    private static String dateTo = calendar.get(Calendar.YEAR) + "-" + calendar.get(Calendar.MONTH) + "-" + calendar.get(Calendar.DAY_OF_MONTH);

    public static String getTimeStamp() {
        long timeStamp = calendar.getTimeInMillis() / 1000L;
        String sTimeStamp = Long.toString(timeStamp);
        return sTimeStamp;
    }

    @NonNull
    public static String getHashSignature() {
        return HashUtil.md5(String.valueOf(getTimeStamp()) + PRIVATE_KEY + PUBLIC_KEY);
    }

    public static String getDate() {
        return dateFrom + "," + dateTo;
    }

    public static void setDateFrom(String dateFrom) {
        Signature.dateFrom = dateFrom;
    }

    public static void setDateTo(String dateTo) {
        Signature.dateTo = dateTo;
    }

    public static Calendar getCalendar() {
        return calendar;
    }
}
