package com.booking.parkingss.Fragments;

import android.content.Intent;
import android.os.Bundle;
import android.view.GestureDetector;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import com.booking.parkingss.Activity.Requests;
import com.booking.parkingss.R;


public class Driver_Status extends Fragment {

    View view;





    @Nullable
    @Override
    public View onCreateView(@NonNull final LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {

view = inflater.inflate(R.layout.fragment_driver_status,container,false);






        return view;
    }


}
