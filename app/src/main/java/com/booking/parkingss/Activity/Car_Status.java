package com.booking.parkingss.Activity;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.booking.parkingss.R;

public class Car_Status extends AppCompatActivity {

    Button status;
    boolean flag ;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_car__status);

        status = findViewById(R.id.btn_status);
        if (flag){

            status.setText("Parked");
            status.setBackgroundColor(getResources().getColor(R.color.colorLightGreen));
            flag = false;


        }else{
            status.setText("Not Parked");
            status.setBackgroundColor(getResources().getColor(R.color.colorRed));
            flag = true;



        }

        status.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {



                if (flag){

                    status.setText("Parked");
                    status.setBackgroundColor(getResources().getColor(R.color.colorLightGreen));
                    flag = false;


                }else{
                    status.setText("Not Parked");
                    status.setBackgroundColor(getResources().getColor(R.color.colorRed));
                    flag = true;



                }
            }
        });

    }
}
