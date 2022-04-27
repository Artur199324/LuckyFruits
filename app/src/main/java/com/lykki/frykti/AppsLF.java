package com.lykki.frykti;

import static com.lykki.frykti.MainActivity.parserLF;
import static com.lykki.frykti.fragLF.FragmentStLF.decodeLF;

import android.util.Log;

import com.appsflyer.AppsFlyerConversionListener;
import com.appsflyer.AppsFlyerLib;

import java.util.Map;

public class AppsLF {


    public static String twew = "-";
    public static String uytrr;
    public static String jjjh = "dzmmt7ntRT2BUBDRRgqYa";
    public static String rrefd;
    public static String bbgfd;
    public static String bdfrq;
    public AppsLF() {
    }

    public void appsLF(AppLF appLF){
        AppsFlyerLib.getInstance().init(jjjh, new AppsFlyerConversionListener() {
            @Override
            public void onConversionDataSuccess(Map<String, Object> map) {
                twew = map.get(decodeLF("YWZfc3RhdHVz")).toString();
                Log.d("weq", twew);
                if (twew.equals(decodeLF("Tm9uLW9yZ2FuaWM="))){

                    try {
                        rrefd = map.get(decodeLF("Y2FtcGFpZ24=")).toString();
                    }catch (Exception e){

                    }

                    try {

                        bbgfd = map.get(decodeLF("bWVkaWFfc291cmNl")).toString();
                    }catch (Exception e){

                    }

                    try {

                        bdfrq = map.get(decodeLF("YWZfY2hhbm5lbA==")).toString();
                    }catch (Exception e){

                    }



                    uytrr = parserLF(rrefd);

                }
            }

            @Override
            public void onConversionDataFail(String s) {

            }

            @Override
            public void onAppOpenAttribution(Map<String, String> map) {

            }

            @Override
            public void onAttributionFailure(String s) {

            }
        },appLF);
        AppsFlyerLib.getInstance().start(appLF);
    }

}
