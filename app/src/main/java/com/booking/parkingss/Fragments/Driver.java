package com.booking.parkingss.Fragments;

import android.content.Intent;
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
import androidx.viewpager.widget.ViewPager;

import com.booking.parkingss.Activity.Acitivity_Details;
import com.booking.parkingss.Activity.Requests;
import com.booking.parkingss.Adapter.Requests_Adapter;
import com.booking.parkingss.Model.Users;
import com.booking.parkingss.R;
import com.booking.parkingss.Utility.MyCustomListener;
import com.booking.parkingss.Utility.SectionsPagerAdapter;
import com.google.android.material.tabs.TabLayout;

import java.util.ArrayList;
import java.util.List;

public class Driver extends Fragment {

    View view;

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
view = inflater.inflate(R.layout.fragment_driver_home,container,false);

setupViewPager();

return view;
    }



    private void setupViewPager(){
        SectionsPagerAdapter adapter = new SectionsPagerAdapter(getChildFragmentManager());
        adapter.addFragment(new Pickup()); //index 0
        adapter.addFragment(new Drop()); //index 1
              ViewPager viewPager = view.findViewById(R.id.container);
        viewPager.setAdapter(adapter);

        TabLayout tabLayout =view.findViewById(R.id.tabs);
        tabLayout.setupWithViewPager(viewPager);

        tabLayout.getTabAt(0).setText("Pickup");
        tabLayout.getTabAt(1).setText("Drop");

    }


}
