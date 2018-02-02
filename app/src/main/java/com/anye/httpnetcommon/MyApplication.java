package com.anye.httpnetcommon;

import android.app.Application;

import com.anye.lhttpnetlib.util.Utils;

/**
 * Created by anye on 18-2-2.
 */

public class MyApplication extends Application {
    @Override
    public void onCreate() {
        super.onCreate();
        Utils.init(getApplicationContext());
    }
}
