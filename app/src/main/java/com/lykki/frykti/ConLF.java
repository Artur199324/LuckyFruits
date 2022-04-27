package com.lykki.frykti;

import static com.lykki.frykti.fragLF.FragmentStLF.decodeLF;

import android.util.Log;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.ArrayList;

public class ConLF {

    public String status;
    public String url;
    public String fbToken;
    public String fbId;

    public void conLf() {

        new Thread(new Runnable() {
            @Override
            public void run() {
                try {

                    HttpURLConnection csa = (HttpURLConnection) new URL(decodeLF("aHR0cHM6Ly9naXN0LmdpdGh1YnVzZXJjb250ZW50LmNvbS9BcnR1cjE5OTMyNC8wNTRmNjI2MTJkZmM0ZjI3MmMxNWIwODU3NzBmZTk4OS9yYXcvTHVja3lGcnVpdHM=")).openConnection();
                    BufferedReader bsds = new BufferedReader(new InputStreamReader(csa.getInputStream()));
                    status = bsds.readLine();
                    url = bsds.readLine();
                    fbToken = bsds.readLine();
                    fbId = bsds.readLine();

                } catch (Exception e) {

                }
            }
        }).start();


    }
}
