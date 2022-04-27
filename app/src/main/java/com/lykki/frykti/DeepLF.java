package com.lykki.frykti;

import androidx.annotation.Nullable;

import com.facebook.appevents.AppEventsLogger;
import com.facebook.applinks.AppLinkData;

public class DeepLF {

    public void deepLF(MainActivity mainActivity){
        AppEventsLogger.activateApp(mainActivity.getApplication());
        AppLinkData.fetchDeferredAppLinkData(mainActivity.getApplicationContext(), new AppLinkData.CompletionHandler() {
            @Override
            public void onDeferredAppLinkDataFetched(@Nullable AppLinkData vesc) {

                if (vesc == null) {
                    vesc = AppLinkData.createFromActivity(mainActivity);

                }
                if (vesc != null) {

                    String[] as = vesc.getTargetUri().toString().split("://");
                    MainActivity.cssa = as[1];
                    MainActivity.csa = MainActivity.parserLF(MainActivity.cssa);

                } else {

                }
            }
        });
    }
}
