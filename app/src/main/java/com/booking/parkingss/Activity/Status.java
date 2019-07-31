package com.booking.parkingss.Activity;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

import android.content.Context;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import com.booking.parkingss.Application.Flag;
import com.booking.parkingss.Fragments.CarDesk;
import com.booking.parkingss.Fragments.CarDesk_Status;
import com.booking.parkingss.Fragments.Driver;
import com.booking.parkingss.Fragments.Driver_Status;
import com.booking.parkingss.R;
import com.booking.parkingss.Utility.BottomNavHelper;
import com.google.android.material.bottomnavigation.BottomNavigationView;

public class Status extends AppCompatActivity {

    Context context = Status.this;
    private static final int ACTIVITY_NUM = 1;
    Flag flag;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_status);

        BottomNavigationView bottomNavigationView = findViewById(R.id.bottom_nav_view);
        BottomNavHelper.enableNavigation(context,bottomNavigationView);

        Menu menu = bottomNavigationView.getMenu();
        MenuItem menuItem = menu.getItem(ACTIVITY_NUM);
        menuItem.setChecked(true);
        flag=(Flag)getApplicationContext();

        if (flag.isLogin_type()){

            load_fragment(new Driver_Status());


        }else
        {
            load_fragment(new CarDesk_Status());
        }





    }


    private void load_fragment(Fragment fragment){

        FragmentManager fm = getSupportFragmentManager();
        FragmentTransaction fragmentTransaction = fm.beginTransaction();
        fragmentTransaction.replace(R.id.rel_inflate,fragment);
        fragmentTransaction.commit();



    }
}
