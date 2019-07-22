package com.booking.parkingss.Utility;

import android.content.Context;
import android.content.Intent;
import android.view.MenuItem;

import androidx.annotation.NonNull;


import com.booking.parkingss.Activity.Income;
import com.booking.parkingss.Activity.MainActivity;
import com.booking.parkingss.Activity.Profile;
import com.booking.parkingss.R;
import com.google.android.material.bottomnavigation.BottomNavigationView;

public class BottomNavHelper {

    public static void enableNavigation(final Context context, BottomNavigationView view){
        view.setOnNavigationItemSelectedListener(new BottomNavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem item) {
                switch (item.getItemId()) {

                    case R.id.home:
                        Intent intent = new Intent(context, MainActivity.class);
                        context.startActivity(intent);
                        break;

                    case R.id.income:
                        Intent intent1 = new Intent(context, Income.class);
                        context.startActivity(intent1);
                        break;

                    case R.id.profile:
                        Intent intent2 = new Intent(context, Profile.class);
                        context.startActivity(intent2);
                        break;


                }
                return false;
            }
        });
    }

}

