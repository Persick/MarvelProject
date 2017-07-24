package ru.dasha.marvelproject.utils;

import android.content.Context;
import android.net.ConnectivityManager;
import android.support.annotation.NonNull;

/***
 * This class check connection to Internet.
 */
public class InternetConnection {
    public static boolean checkConnection(@NonNull Context context) {
        return ((ConnectivityManager) context.getSystemService
                (Context.CONNECTIVITY_SERVICE)).getActiveNetworkInfo() != null;
    }
}
