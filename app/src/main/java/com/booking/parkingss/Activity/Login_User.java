package com.booking.parkingss.Activity;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;
import android.widget.Toast;

import com.booking.parkingss.Application.Flag;
import com.booking.parkingss.R;

public class Login_User extends AppCompatActivity {
    TextView txt_register;
    Button btn_login;
    RadioGroup radioGroup;
    int selectedid;
    RadioButton radioButton1,radioButton2;
    Flag flag;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login__user);

        txt_register = findViewById(R.id.txt_register);
        btn_login = findViewById(R.id.btn_login);
        radioGroup = findViewById(R.id.radio);
        radioButton2 = findViewById(R.id.cardesk);

        flag=(Flag)getApplicationContext();
flag.setFlag(true);

   radioButton1 = findViewById(R.id.driver);


        btn_login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Login_User.this,MainActivity.class);




                if (radioButton1.isChecked()){

                    flag.setLogin_type(true);


                }
                else {
                    flag.setLogin_type(false);

                }

                startActivity(intent);

            }
        });

        txt_register.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Login_User.this,Login.class);
                startActivity(intent);
            }
        });








    }
}
