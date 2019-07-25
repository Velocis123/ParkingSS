package com.booking.parkingss.Fragments;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import com.booking.parkingss.R;


public class Details_Paying extends Fragment {

    View view;

    @Nullable
    @Override
    public View onCreateView(@NonNull final LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {

view = inflater.inflate(R.layout.fragment_details_p,container,false);




        return view;
    }
}
