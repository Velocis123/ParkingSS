package com.booking.parkingss.Fragments;

import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.LinearLayout;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.booking.parkingss.Activity.Car_Status;
import com.booking.parkingss.Adapter.Cardesk_status_Adapter;
import com.booking.parkingss.Model.Users;
import com.booking.parkingss.R;
import com.booking.parkingss.Utility.MyCustomListener;

import java.util.ArrayList;
import java.util.List;


public class CarDesk_Status extends Fragment {

    View view;
    Button status;
    RecyclerView rec_cardesk_status;
    List<Users> usersList = new ArrayList<>();




    @Nullable
    @Override
    public View onCreateView(@NonNull final LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {

view = inflater.inflate(R.layout.fragment_cardesk_status,container,false);


setupIncome();


        return view;
    }
    private void setupIncome(){
        rec_cardesk_status = view.findViewById(R.id.rec_car_status);

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

        Cardesk_status_Adapter adapter = new Cardesk_status_Adapter(getContext(), usersList, new MyCustomListener() {
            @Override
            public void onItemClick(Users item) {
                Intent intent = new Intent(getContext(), Car_Status.class);
                startActivity(intent);

            }
        });

        // Service_details_adapter service_details_adapter = new Service_details_adapter(this,usersList);
        rec_cardesk_status.setLayoutManager(new LinearLayoutManager(getContext(), LinearLayout.VERTICAL,false));
        rec_cardesk_status.setAdapter(adapter);















    }


}
