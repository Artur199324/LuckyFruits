package com.lykki.frykti.fragLF;


import android.os.Bundle;

import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.fragment.app.Fragment;


import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;


import com.lykki.frykti.R;


public class FragmentGameLF extends Fragment {


    public static ConstraintLayout ccccoo;
    public static Button vdx;
    public static TextView tres, cfeas;


    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);


    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        View view = inflater.inflate(R.layout.fragment_game_l, container, false);
        ccccoo = view.findViewById(R.id.ccccoo);
        vdx = view.findViewById(R.id.button);
        tres = view.findViewById(R.id.textView);
        cfeas =view.findViewById(R.id.textView2);

        return view;
    }
}