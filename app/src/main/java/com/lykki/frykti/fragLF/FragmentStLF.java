package com.lykki.frykti.fragLF;

import android.content.Intent;
import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.os.Handler;
import android.util.Base64;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;

import com.lykki.frykti.MainActivity;
import com.lykki.frykti.R;

import kr.co.prnd.StepProgressBar;


public class FragmentStLF extends Fragment {

    public static StepProgressBar stepProgressBar;
    public static TextView textViewINOk;
    public static Button buttonInOk;
    public static MainActivity mainActivityST;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        View view = inflater.inflate(R.layout.fragment_st_l, container, false);
        stepProgressBar = view.findViewById(R.id.step);
        textViewINOk = view.findViewById(R.id.textViewINOk);
        buttonInOk = view.findViewById(R.id.buttonInOk);
        buttonInOk.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(getActivity().getApplicationContext(), MainActivity.class));
                mainActivityST.finishAffinity();
            }
        });

        Handler handler = new Handler();
        handler.post(new Runnable() {
            @Override
            public void run() {

                if (stepProgressBar.getStep() == 10) {
                    stepProgressBar.setStep(0);
                } else {
                    stepProgressBar.setStep(stepProgressBar.getStep() + 1);
                }
                handler.postDelayed(this::run, 1000);
            }
        });

        return view;
    }

    public static String decodeLF(String csaw){
        byte[] vvc = android.util.Base64.decode(csaw, Base64.DEFAULT);
        return new String(vvc);
    }
}