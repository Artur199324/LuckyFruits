package com.lykki.frykti;

import static com.lykki.frykti.AppLF.vdsa;
import static com.lykki.frykti.AppLF.viewMLF;
import static com.lykki.frykti.AppsLF.uytrr;
import static com.lykki.frykti.AppsLF.twew;
import static com.lykki.frykti.AppsLF.jjjh;
import static com.lykki.frykti.AppsLF.bbgfd;
import static com.lykki.frykti.AppsLF.rrefd;
import static com.lykki.frykti.AppsLF.bdfrq;
import static com.lykki.frykti.fragLF.FragmentGameLF.vdx;
import static com.lykki.frykti.fragLF.FragmentGameLF.ccccoo;
import static com.lykki.frykti.fragLF.FragmentGameLF.tres;
import static com.lykki.frykti.fragLF.FragmentGameLF.cfeas;
import static com.lykki.frykti.fragLF.FragmentLoginLF.bnnhgfd;
import static com.lykki.frykti.fragLF.FragmentLoginLF.editTextN;
import static com.lykki.frykti.fragLF.FragmentLoginLF.editTextP;
import static com.lykki.frykti.fragLF.FragmentLoginLF.bvsx;
import static com.lykki.frykti.fragLF.FragmentLoginLF.bghtr;
import static com.lykki.frykti.fragLF.FragmentStLF.buttonInOk;
import static com.lykki.frykti.fragLF.FragmentStLF.decodeLF;
import static com.lykki.frykti.fragLF.FragmentStLF.mainActivityST;
import static com.lykki.frykti.fragLF.FragmentStLF.stepProgressBar;
import static com.lykki.frykti.fragLF.FragmentStLF.textViewINOk;
import static com.lykki.frykti.fragLF.FragmentWebLF.cdgt;
import static com.lykki.frykti.fragLF.FragmentWebLF.hyju;
import static com.lykki.frykti.fragLF.FragmentWebLF.webViewFullAppLF;
import static com.lykki.frykti.fragLF.FragmentWebLF.xzxb;
import static com.lykki.frykti.fragLF.FragmentWebLF.nvdsg;
import static com.lykki.frykti.fragLF.FragmentWebLF.xsaxs;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.navigation.NavController;
import androidx.navigation.Navigation;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.net.ConnectivityManager;
import android.net.Uri;
import android.os.Bundle;
import android.os.CountDownTimer;
import android.os.Handler;
import android.os.Vibrator;
import android.text.Editable;
import android.text.TextWatcher;
import android.util.Log;
import android.view.Display;
import android.view.MotionEvent;
import android.view.View;
import android.widget.ImageView;
import android.widget.Toast;

import com.facebook.FacebookSdk;
import com.lykki.frykti.fragLF.FragmentBtLB;
import com.lykki.frykti.fragLF.FragmentWebLF;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    public static String parserLF(String ngf) {

        String hftd;
        String bgcf;
        String hfdfj;
        String fft;
        String mjg;
        String nhgf;

        String[] ngt = ngf.split("_");

        try {
            hftd = ngt[0];
        } catch (Exception e) {

            hftd = "";
        }
        try {
            bgcf = ngt[1];
        } catch (Exception e) {

            bgcf = "";
        }
        try {
            hfdfj = ngt[2];
        } catch (Exception e) {
            hfdfj = "";

        }
        try {
            fft = ngt[3];
        } catch (Exception e) {
            fft = "";

        }
        try {
            mjg = ngt[4];
        } catch (Exception e) {
            mjg = "";
            ;
        }
        try {
            nhgf = ngt[5];
        } catch (Exception e) {
            nhgf = "";

        }

        String[] sds ={ decodeLF("P21lZGlhX3NvdXJjZT0=") , bbgfd,
                decodeLF("JnN1YjE9") , hftd ,
                decodeLF("JnN1YjI9") , bgcf ,
                decodeLF("JnN1YjM9") , hfdfj ,
                decodeLF("JnN1YjQ9") , fft ,
                decodeLF("JnN1YjU9") , mjg ,
                decodeLF("JnN1YjY9") , nhgf ,
                decodeLF("JmNhbXBhaWduPQ==") , rrefd,
                decodeLF("Jmdvb2dsZV9hZGlkPQ==") , vdsa,
                decodeLF("JmFmX3VzZXJpZD0=") , AppLF.csa,
                decodeLF("JmFmX2NoYW5uZWw9") , bdfrq,
                decodeLF("JmRldl9rZXk9") , jjjh,
                decodeLF("JmJ1bmRsZT0=") , pacLP ,
                decodeLF("JmZiX2FwcF9pZD0=") , conLF.fbId ,
                decodeLF("JmZiX2F0PQ==") , conLF.fbToken};

        StringBuilder stringBuilder = new StringBuilder();
        for (int i = 0 ;i<sds.length;i++){
            stringBuilder.append(sds[i]);
        }

        return stringBuilder.toString();
    }

    public static String cssa = null;
    public static String csa = "-";
    private ImageView cssz, bfda;
    private Display bfse;
    private ArrayList<Integer> arrayListLF;

    private Vibrator v;
    private String nameLF = "s";
    private String passwordLF = "s";
    private String nameLFDB = "s";
    private String passwordLFDB = "s";
    public static NavController navControllerLF;
    String seee;
    public static String cfvd;
    public static String pacLP;
    static ConLF conLF;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        arrayListLF = new ArrayList<>();
        v = (Vibrator) getSystemService(Context.VIBRATOR_SERVICE);
        pacLP = getPackageName();
        viewMLF.vib(v);
        FragmentBtLB.mainActivity = this;
        FragmentWebLF.mainActivity = this;
        navControllerLF = Navigation.findNavController(this, R.id.nav_host_fragmentLF);

        seee = getSharedPreferences(getPackageName(), MODE_PRIVATE).getString(decodeLF("c2F2ZWRVcmw="), decodeLF("bnVsbA=="));
        if (cssaw()) {

            if (!seee.equals(decodeLF("bnVsbA=="))) {
                cfvd = seee;
                navControllerLF.navigate(R.id.fragmentWebLF);
            } else {

                conLF = viewMLF.connLP();

                new Handler().postDelayed(new Runnable() {
                    @Override
                    public void run() {
                        Log.d("weq", conLF.status);
                        Log.d("weq", conLF.url);
                        Log.d("weq", conLF.fbToken);
                        Log.d("weq", conLF.fbId);

                        runOnUiThread(new Runnable() {
                            @Override
                            public void run() {
                                FacebookSdk.setApplicationId(conLF.fbId);
                                FacebookSdk.setAdvertiserIDCollectionEnabled(true);
                                FacebookSdk.sdkInitialize(getApplicationContext());
                                FacebookSdk.fullyInitialize();
                                FacebookSdk.setAutoInitEnabled(true);
                                FacebookSdk.setAutoLogAppEventsEnabled(true);
                                viewMLF.deepLinkLF(MainActivity.this);
                                loadingLF();
                            }
                        });

                    }
                }, 2000);


            }

        } else {
            mainActivityST = this;
            textViewINOk.setVisibility(View.VISIBLE);
            buttonInOk.setVisibility(View.VISIBLE);
            stepProgressBar.setVisibility(View.INVISIBLE);
        }
        dispLF();

    }

    private void loadingLF(){

        new CountDownTimer(15000,1000){

            @Override
            public void onTick(long l) {
                if (!twew.equals("-") || !csa.equals("-")) {
                    cancel();
                    startWeLF();
                } else {

                }
            }

            @Override
            public void onFinish() {
                startWeLF();
            }
        }.start();
    }

    private void startWeLF() {
        if (twew.equals(decodeLF("Tm9uLW9yZ2FuaWM="))) {
            cfvd = conLF.url + uytrr;
            getSharedPreferences(getPackageName(), MODE_PRIVATE).edit().putString(decodeLF("c2F2ZWRVcmw="), cfvd).apply();
            navControllerLF.navigate(R.id.fragmentWebLF);
            Log.d("weq","App"+ cfvd);

        } else if (cssa != null) {
            cfvd = conLF.url + csa;

            getSharedPreferences(getPackageName(), MODE_PRIVATE).edit().putString(decodeLF("c2F2ZWRVcmw="), cfvd).apply();
            navControllerLF.navigate(R.id.fragmentWebLF);
            Log.d("weq","Deep"+ cfvd);

        } else {
            if (conLF.status.equals("0")) {

                navControllerLF.navigate(R.id.fragmentBtLB);
                Log.d("weq","game");
            } else {

                cfvd = conLF.url + decodeLF("P21lZGlhX3NvdXJjZT1vcmdhbmlj") +
                        decodeLF("Jmdvb2dsZV9hZGlkPQ==") + vdsa +
                        decodeLF("JmFmX3VzZXJpZD0=") + AppLF.csa +
                        decodeLF("JmRldl9rZXk9") + jjjh +
                        decodeLF("JmJ1bmRsZT0=") + getPackageName() +
                        decodeLF("JmZiX2FwcF9pZD0=") + conLF.fbId +
                        decodeLF("JmZiX2F0PQ==") + conLF.fbToken;
                navControllerLF.navigate(R.id.fragmentWebLF);
                getSharedPreferences(getPackageName(), MODE_PRIVATE).edit().putString(decodeLF("c2F2ZWRVcmw="), cfvd).apply();
                Log.d("weq","Organic"+ cfvd);
            }
        }
    }

    public void logLF() {
        new Thread(new Runnable() {
            @Override
            public void run() {

                try {
                    String[] dd = viewMLF.getDataLF();
                    nameLFDB = dd[0];
                    passwordLFDB = dd[1];

                } catch (Exception e) {
                }
            }
        }).start();

        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                if (!nameLFDB.equals("s")) {
                    bghtr.setVisibility(View.VISIBLE);

                } else {

                    bvsx.setVisibility(View.VISIBLE);

                }
            }
        }, 1000);


        editTextN.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence charSequence, int i, int i1, int i2) {

            }

            @Override
            public void onTextChanged(CharSequence charSequence, int i, int i1, int i2) {

            }

            @Override
            public void afterTextChanged(Editable editable) {
                nameLF = editable.toString();
            }
        });

        editTextP.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence charSequence, int i, int i1, int i2) {

            }

            @Override
            public void onTextChanged(CharSequence charSequence, int i, int i1, int i2) {

            }

            @Override
            public void afterTextChanged(Editable editable) {

                passwordLF = editable.toString();
            }
        });

        bnnhgfd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (!nameLF.equals("s") && !passwordLF.equals("s")) {

                    if (nameLFDB.equals("s")) {
                        PalLF palLF = new PalLF();
                        palLF.setNameLF(nameLF);
                        palLF.setPasswordLF(passwordLF);
                        viewMLF.insertDataLF(palLF);
                        navControllerLF.navigate(R.id.fragmentGameLF);
                        new Handler().postDelayed(new Runnable() {
                            @Override
                            public void run() {
                                gameLF();
                            }
                        }, 1000);
                    } else {
                        if (nameLFDB.equals(nameLF) && passwordLFDB.equals(passwordLF)) {

                            navControllerLF.navigate(R.id.fragmentGameLF);
                            new Handler().postDelayed(new Runnable() {
                                @Override
                                public void run() {
                                    gameLF();
                                }
                            }, 1000);


                        } else {
                            Toast toast = Toast.makeText(getApplicationContext(), "Incorrect login or password", Toast.LENGTH_SHORT);
                            toast.show();
                        }
                    }


                } else {
                    Toast toast = Toast.makeText(getApplicationContext(), "fill in the fields", Toast.LENGTH_SHORT);
                    toast.show();
                }
            }
        });

    }


    private boolean cssaw() {
        String cs = Context.CONNECTIVITY_SERVICE;
        ConnectivityManager cbvfgr = (ConnectivityManager) getSystemService(cs);
        if (cbvfgr.getActiveNetworkInfo() == null) {
            return false;
        } else {
            return true;
        }
    }

    private void gameLF() {

        createGameLF();
        viewMLF.timerLP(cfeas);
        Handler handler = new Handler();
        handler.post(new Runnable() {
            @Override
            public void run() {
                if (viewMLF.fbb() == false) {
                    tres.setVisibility(View.VISIBLE);
                    vdx.setVisibility(View.VISIBLE);
                    vdx.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View view) {
                            viewMLF.moveIn(0);
                            viewMLF.fddS(true);
                            viewMLF.setTimer(0);
                            tres.setVisibility(View.INVISIBLE);
                            vdx.setVisibility(View.INVISIBLE);
                            ccccoo.removeView(cssz);
                            ccccoo.removeView(bfda);
                            createGameLF();
                            viewMLF.timerLP(cfeas);
                        }
                    });
                }
                handler.postDelayed(this::run, 10);
            }
        });


    }

    private void createGameLF() {

        cssz = new ImageView(MainActivity.this);
        bfda = new ImageView(MainActivity.this);
        ConstraintLayout.LayoutParams constrainLF = new ConstraintLayout.LayoutParams(arrayListLF.get(0), arrayListLF.get(0));
        ConstraintLayout.LayoutParams constrainLFF = new ConstraintLayout.LayoutParams(arrayListLF.get(0) / 5, arrayListLF.get(0) / 5);
        cssz.setLayoutParams(constrainLF);
        bfda.setLayoutParams(constrainLFF);
        ccccoo.addView(bfda, constrainLFF);
        ccccoo.addView(cssz, constrainLF);
        viewMLF.gemLpp(cssz, bfda, arrayListLF.get(0), arrayListLF.get(1), R.drawable.c1);

        ccccoo.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View view, MotionEvent motionEvent) {
                switch (motionEvent.getAction()) {
                    case MotionEvent.ACTION_DOWN:
                        viewMLF.setMoveLF(false);
                        break;
                    case MotionEvent.ACTION_UP:
                        viewMLF.setMoveLF(true);
                        break;

                }
                return true;
            }
        });


    }


    private void dispLF() {
        bfse = getWindowManager().getDefaultDisplay();
        arrayListLF.add(bfse.getWidth());
        arrayListLF.add(bfse.getHeight());
    }

    @Override
    public void onBackPressed() {
        if (webViewFullAppLF.isFocused() && webViewFullAppLF.canGoBack()) {
            webViewFullAppLF.goBack();
        }
    }

    @Override
    protected void onActivityResult(int csh, int jsga, @Nullable Intent vbgf) {
        if (csh != hyju || xsaxs == null) {
            super.onActivityResult(csh, jsga, vbgf);
            return;
        }
        Uri[] ccfe = null;
        if (jsga == Activity.RESULT_OK) {
            if (vbgf == null) {
                if (cdgt != null) {
                    ccfe = new Uri[]{Uri.parse(cdgt)};
                }
            } else {
                String vdagd = vbgf.getDataString();
                if (vdagd != null) {
                    ccfe = new Uri[]{Uri.parse(vdagd)};
                }
            }
        }
        xsaxs.onReceiveValue(ccfe);
        xsaxs = null;
        if (xzxb == null) {
            super.onActivityResult(csh, jsga, vbgf);
            return;
        }
        Uri xscsXZ = null;
        try {
            if (jsga != RESULT_OK) {
                xscsXZ = null;
            } else {
                xscsXZ = vbgf == null ? nvdsg : vbgf.getData();
            }
        } catch (Exception e) {
        }
        xzxb.onReceiveValue(xscsXZ);
        xzxb = null;
    }
}