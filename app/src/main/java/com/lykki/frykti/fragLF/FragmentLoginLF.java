package com.lykki.frykti.fragLF;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import com.lykki.frykti.R;

public class FragmentLoginLF extends Fragment {


    public static EditText editTextN, editTextP;
    public static TextView bvsx, bghtr;
    public static Button bnnhgfd;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        View view = inflater.inflate(R.layout.fragment_login_l, container, false);
        editTextN = view.findViewById(R.id.editTextN);
        editTextP = view.findViewById(R.id.editTextP);
        bvsx = view.findViewById(R.id.textView4);
        bnnhgfd = view.findViewById(R.id.button2);
        bghtr = view.findViewById(R.id.textView9);
        return view;
    }
}