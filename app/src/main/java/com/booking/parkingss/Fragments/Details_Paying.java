package com.booking.parkingss.Fragments;

import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AlertDialog;
import androidx.fragment.app.Fragment;

import com.booking.parkingss.Activity.Login;
import com.booking.parkingss.Activity.Profile;
import com.booking.parkingss.R;


public class Details_Paying extends Fragment {

    View view;
    ImageView img_qr;

    @Nullable
    @Override
    public View onCreateView(@NonNull final LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {

view = inflater.inflate(R.layout.fragment_details_p,container,false);

img_qr =  view.findViewById(R.id.img_qr);
img_qr.setOnClickListener(new View.OnClickListener() {
    @Override
    public void onClick(View v) {
        AlertDialog.Builder ab=new AlertDialog.Builder(getContext());

        View v1= LayoutInflater.from(getContext()).inflate(R.layout.floating_view_qr,null,false);


        ab.setView(v1);

        ab.show();
    }
});



        return view;
    }
}
