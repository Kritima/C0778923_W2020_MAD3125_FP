package com.lambton.c0778923_w2020_mad3125_fp.fragments;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;

import com.lambton.c0778923_w2020_mad3125_fp.R;

public class HydroFragment extends Fragment {


    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {

        View root = inflater.inflate(R.layout.fragment_hydro, container, false);
        final TextView textViewHydroOne = root.findViewById(R.id.hydroField1);
        final TextView textViewHydroTwo = root.findViewById(R.id.hydroField2);
        final TextView textViewHydroThree = root.findViewById(R.id.hydroField3);
        final TextView textViewHydroFour = root.findViewById(R.id.hydroField4);
        final TextView textViewHydroFive = root.findViewById(R.id.hydroField5);


        textViewHydroOne.setText("hi");

        return root;
    }
}
