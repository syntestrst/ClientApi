package com.timefeel.rxmovies.utils;

import android.content.Context;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.os.Build;
import android.util.Log;


import com.timefeel.rxmovies.app.CustomApplication;

import java.io.IOException;
import java.io.InterruptedIOException;

import rx.Observable;

/**
 * Created by test on 27/02/2017.
 */

public class UtilsTF {

    private UtilsTF() {

    }

    private static boolean isNetworkAvailable(Context context) {
        ConnectivityManager connectivityManager = (ConnectivityManager) context.getSystemService(Context.CONNECTIVITY_SERVICE);
        NetworkInfo activeNetworkInfo = connectivityManager.getActiveNetworkInfo();
        return activeNetworkInfo != null && activeNetworkInfo.isConnected();
    }


    public static Observable<Boolean> isNetworkAvailableObservable(Context context) {
        return Observable.just(UtilsTF.isNetworkAvailable(context));
    }

    public static Boolean isOnline() {
        Runtime runtime = Runtime.getRuntime();
        try {
            java.lang.Process ipprocess = runtime.exec("/system/bin/ping -c 8.8.8.8");
        } catch (InterruptedIOException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return false;
    }

    public static String InfoSdk() {
        String device = Build.BRAND + " " + android.os.Build.MODEL;
        String osInt = "Android " + android.os.Build.VERSION.SDK_INT;
        String osRelease = "Android " + Build.VERSION.RELEASE;
        Log.e("TAG", "Device: " + device + " " + osInt + " - " + osRelease);
        return osInt;
    }
}
