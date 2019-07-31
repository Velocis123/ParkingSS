package com.booking.parkingss.Fragments;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.booking.parkingss.Adapter.Cardesk_accept_Adapter;
import com.booking.parkingss.Model.Users;
import com.booking.parkingss.R;

import java.util.ArrayList;
import java.util.List;

public class Drop_cardesk extends Fragment {
    RecyclerView recyclerView;
    List<Users> usersList = new ArrayList<>();
    View view;

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        view = inflater.inflate(R.layout.fragment_drop,container,false);

        requests();


        return view;
    }


    private void requests(){
        recyclerView = view.findViewById(R.id.recycle_user_requests);

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

        Cardesk_accept_Adapter adapter = new Cardesk_accept_Adapter(getContext(),usersList);

        // Service_details_adapter service_details_adapter = new Service_details_adapter(this,usersList);
        recyclerView.setLayoutManager(new LinearLayoutManager(getContext(), LinearLayout.VERTICAL,false));
        recyclerView.setAdapter(adapter);















    }

}
