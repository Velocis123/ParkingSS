package com.booking.parkingss.Activity;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.GestureDetector;
import android.view.Menu;
import android.view.MenuItem;
import android.view.MotionEvent;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import com.booking.parkingss.Application.Flag;
import com.booking.parkingss.Fragments.CarDesk;
import com.booking.parkingss.Fragments.CarDesk_Status;
import com.booking.parkingss.Fragments.Driver;
import com.booking.parkingss.R;
import com.booking.parkingss.Utility.BottomNavHelper;
import com.google.android.material.bottomnavigation.BottomNavigationView;

public class MainActivity extends AppCompatActivity {

    Context context = MainActivity.this;
    private static final int ACTIVITY_NUM = 0;
    Button btn_accepted_req;
    Flag flag;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
       // btn_accepted_req =

        flag=(Flag)getApplicationContext();
        BottomNavigationView bottomNavigationView = findViewById(R.id.bottom_nav_view);
        BottomNavHelper.enableNavigation(context,bottomNavigationView);

        Menu menu = bottomNavigationView.getMenu();
        MenuItem menuItem = menu.getItem(ACTIVITY_NUM);
        menuItem.setChecked(true);




        if (flag.isLogin_type()){

            load_fragment(new Driver());


        }else
        {
            load_fragment(new CarDesk());
        }







    }

    private void load_fragment(Fragment fragment){

        FragmentManager fm = getSupportFragmentManager();
        FragmentTransaction fragmentTransaction = fm.beginTransaction();
        fragmentTransaction.replace(R.id.rel_inflatee,fragment);
        fragmentTransaction.commit();



    }

}

