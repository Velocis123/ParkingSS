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
    Context context = Profile.this;
    private static final int ACTIVITY_NUM = 3;
    TextView txt_edit;
    Button btn_signout;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_profile);
btn_signout = findViewById(R.id.btn_signout);
        txt_edit = findViewById(R.id.txt_edit);

        BottomNavigationView bottomNavigationView = findViewById(R.id.bottom_nav_view);
        BottomNavHelper.enableNavigation(context,bottomNavigationView);

        Menu menu = bottomNavigationView.getMenu();
        MenuItem menuItem = menu.getItem(ACTIVITY_NUM);
        menuItem.setChecked(true);

        btn_signout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                AlertDialog.Builder ab=new AlertDialog.Builder(Profile.this);

                View v1= LayoutInflater.from(Profile.this).inflate(R.layout.floating_view_signout,null,false);
Button yes = v1.findViewById(R.id.yes);
yes.setOnClickListener(new View.OnClickListener() {
    @Override
    public void onClick(View v) {
        Intent intent = new Intent(Profile.this,Login_User.class);
        startActivity(intent);

    }
});

                ab.setView(v1);

                ab.show();
            }
        });

        txt_edit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Profile.this,Edit_profile.class);
                startActivity(intent);
            }
        });
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
