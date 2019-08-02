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

import com.booking.parkingss.Activity.Car_Status;
import com.booking.parkingss.Activity.CardDesk_type;
import com.booking.parkingss.Activity.MainActivity;
import com.booking.parkingss.Activity.Requests;
import com.booking.parkingss.Activity.Status;
import com.booking.parkingss.R;

import de.hdodenhof.circleimageview.CircleImageView;


public class CarDesk extends Fragment {

    View view;

    ImageView img_status;
    TextView txt_status;
    Boolean flag= false;
    GestureDetector gestureDetector;
    Button btn_req;


    @Nullable
    @Override
    public View onCreateView(@NonNull final LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {

view = inflater.inflate(R.layout.fragment_car_desk_home,container,false);

        txt_status=view.findViewById(R.id.txt_status);
        img_status = view.findViewById(R.id.img_status);
        btn_req = view.findViewById(R.id.btn_accreq);
        gestureDetector = new GestureDetector(getContext(),new MyGesturesListener() );

        btn_req.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getContext(), CardDesk_type.class);
                startActivity(intent);
            }
        });

        img_status.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View v, MotionEvent event) {

                gestureDetector.onTouchEvent(event);
                return true;
            }
        });




        return view;
    }

    class MyGesturesListener extends GestureDetector.SimpleOnGestureListener{
        @Override
        public boolean onSingleTapUp(MotionEvent ev) {
            img_status.setImageResource(R.drawable.ic_unavailable);
            txt_status.setText("Unavailable");
            txt_status.setTextColor(getResources().getColor(R.color.colorRed));
            return true;
        }
        @Override
        public boolean onDoubleTap(MotionEvent ev) {
            img_status.setImageResource(R.drawable.ic_available);
            txt_status.setText("Available");
            txt_status.setTextColor(getResources().getColor(R.color.colorLightGreen));
            return true;
        }
    }
}
