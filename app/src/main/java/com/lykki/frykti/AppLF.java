package com.lykki.frykti;

import android.app.Application;

import androidx.lifecycle.ViewModelProvider;

import com.appsflyer.AppsFlyerLib;
import com.google.android.gms.ads.identifier.AdvertisingIdClient;
import com.onesignal.OneSignal;

public class AppLF extends Application {
    public static ViewMLF viewMLF;
    public static String vdsa;
    public static String csa;
    @Override
    public void onCreate() {
        super.onCreate();
        viewMLF = new ViewModelProvider
                .AndroidViewModelFactory(this)
                .create(ViewMLF.class);

        OneSignal.setLogLevel(OneSignal.LOG_LEVEL.VERBOSE, OneSignal.LOG_LEVEL.NONE);
        OneSignal.initWithContext(this);
        OneSignal.setAppId("4250e0a6-97c1-4995-827b-96607568a0fe");

        new Thread(new Runnable() {
            @Override
            public void run() {
                try {
                    vdsa = AdvertisingIdClient.getAdvertisingIdInfo(getApplicationContext()).getId();
                }catch (Exception e){

                }
            }
        }).start();

        csa = AppsFlyerLib.getInstance().getAppsFlyerUID(this);
        viewMLF.app(this);
    }
}
