package com.lykki.frykti.fragLF;

import static com.lykki.frykti.MainActivity.navControllerLF;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.os.Handler;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import com.lykki.frykti.MainActivity;
import com.lykki.frykti.R;


public class FragmentBtLB extends Fragment {

    public Button buttonSLF;
    public Button buttonCLF;
    public static MainActivity mainActivity;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        View view = inflater.inflate(R.layout.fragment_bt_l_b, container, false);
        buttonSLF = view.findViewById(R.id.buttonSLF);
        buttonCLF = view.findViewById(R.id.buttonCLF);

        buttonSLF.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                navControllerLF.navigate(R.id.fragmentLoginLF);
                new Handler().postDelayed(new Runnable() {
                    @Override
                    public void run() {
                       mainActivity.logLF();
                    }
                },1000);
            }
        });

        buttonCLF.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                mainActivity.finishAffinity();
            }
        });

        return view;
    }
}