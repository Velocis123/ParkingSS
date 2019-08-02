package com.booking.parkingss.Activity;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.booking.parkingss.R;
import com.booking.parkingss.Utility.BottomNavHelper;
import com.google.android.material.bottomnavigation.BottomNavigationView;

public class Profile extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_profile);





    }

    public void fun(View v)
    {
        AlertDialog.Builder ab=new AlertDialog.Builder(this);

        View v1= LayoutInflater.from(this).inflate(R.layout.floating_view_signout,null,false);

        Button b=v1.findViewById(R.id.ok);
        b.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Profile.this,Login.class);
                startActivity(intent);
            }
        });
        ab.setView(v1);

        ab.show();

    }
}
