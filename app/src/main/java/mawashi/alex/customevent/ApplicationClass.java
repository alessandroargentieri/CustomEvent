package mawashi.alex.customevent;

import android.app.Application;
import android.content.Context;

/**
 * Created by alessandro.argentier on 29/09/2016.
 */
public class ApplicationClass extends Application {

    private static Context appContext;

    @Override
    public void onCreate() {
        super.onCreate();
        appContext = getApplicationContext();
    }

    public static Context getContext() {
        return appContext;
    }

}