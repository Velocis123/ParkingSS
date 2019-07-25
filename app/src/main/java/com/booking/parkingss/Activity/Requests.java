package com.booking.parkingss.Activity;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.widget.LinearLayout;

import com.booking.parkingss.Adapter.Requests_Adapter;
import com.booking.parkingss.Adapter.Service_details_adapter;
import com.booking.parkingss.Model.Users;
import com.booking.parkingss.R;
import com.booking.parkingss.Utility.OnHotelListener;

import java.util.ArrayList;
import java.util.List;

public class Requests extends AppCompatActivity {

    RecyclerView recyclerView;
    List<Users> usersList = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_requests);
requests();

    }


    private void requests(){
        recyclerView = findViewById(R.id.rec_requests);

        Users users = new Users("Akash Gupta","123456789","abcd@gmail.com","",
                "Pickup","Regular","10","",R.drawable.ic_car_black,"","");

        Users users1 = new Users("Akash Gupta","123456789","abcd@gmail.com","",
                "Drop","Regular","10","",R.drawable.ic_car_black,"","");
        Users users2 = new Users("Akash Gupta","123456789","abcd@gmail.com","",
                "Pickup","Temporary","10","",R.drawable.ic_car_black,"","");
        Users users3 = new Users("Akash Gupta","123456789","abcd@gmail.com","",
                "Drop","Regular","10","",R.drawable.ic_car_black,"","");
        Users users4 = new Users("Akash Gupta","123456789","abcd@gmail.com","",
                "Drop","Regular","10","",R.drawable.ic_car_black,"","");
        Users users5 = new Users("Akash Gupta","123456789","abcd@gmail.com","",
                "Pickup","Temporary","10","",R.drawable.ic_car_black,"","");
        Users users6 = new Users("Akash Gupta","123456789","abcd@gmail.com","",
                "Pickup","Regular","10","",R.drawable.ic_car_black,"","");
        Users users7 = new Users("Akash Gupta","123456789","abcd@gmail.com","",
                "Drop","Regular","10","",R.drawable.ic_car_black,"","");


        usersList.add(users);
        usersList.add(users1);
        usersList.add(users2);
        usersList.add(users3);
        usersList.add(users4);
        usersList.add(users5);
        usersList.add(users6);
        usersList.add(users7);

        Requests_Adapter adapter = new Requests_Adapter(Requests.this, usersList, new OnHotelListener() {
            @Override
            public void onItemClick(Users item) {
                Intent intent = new Intent(Requests.this, Acitivity_Details.class);
                startActivity(intent);

            }
        });

        // Service_details_adapter service_details_adapter = new Service_details_adapter(this,usersList);
        recyclerView.setLayoutManager(new LinearLayoutManager(this, LinearLayout.VERTICAL,false));
        recyclerView.setAdapter(adapter);















    }

}
