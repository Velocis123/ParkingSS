package com.booking.parkingss.Activity;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import com.booking.parkingss.R;
import com.booking.parkingss.Utility.BottomNavHelper;
import com.google.android.material.bottomnavigation.BottomNavigationView;

public class Status extends AppCompatActivity {

    Context context = Status.this;
    private static final int ACTIVITY_NUM = 1;
    Button status;

boolean flag ;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_status);
        status = findViewById(R.id.btn_status);
        BottomNavigationView bottomNavigationView = findViewById(R.id.bottom_nav_view);
        BottomNavHelper.enableNavigation(context,bottomNavigationView);

        Menu menu = bottomNavigationView.getMenu();
        MenuItem menuItem = menu.getItem(ACTIVITY_NUM);
        menuItem.setChecked(true);



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
