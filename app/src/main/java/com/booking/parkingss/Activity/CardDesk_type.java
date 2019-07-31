package com.booking.parkingss.Activity;

import androidx.appcompat.app.AppCompatActivity;
import androidx.viewpager.widget.ViewPager;

import android.os.Bundle;

import com.booking.parkingss.Fragments.Drop;
import com.booking.parkingss.Fragments.Drop_cardesk;
import com.booking.parkingss.Fragments.Pickup;
import com.booking.parkingss.Fragments.Pickup_cardesk;
import com.booking.parkingss.R;
import com.booking.parkingss.Utility.SectionsPagerAdapter;
import com.google.android.material.tabs.TabLayout;

public class CardDesk_type extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_card_desk_type);

        setupViewPager();
    }

    private void setupViewPager(){
        SectionsPagerAdapter adapter = new SectionsPagerAdapter(getSupportFragmentManager());
        adapter.addFragment(new Pickup_cardesk()); //index 0
        adapter.addFragment(new Drop_cardesk()); //index 1
        ViewPager viewPager = findViewById(R.id.container);
        viewPager.setAdapter(adapter);

        TabLayout tabLayout =findViewById(R.id.tabs);
        tabLayout.setupWithViewPager(viewPager);

        tabLayout.getTabAt(0).setText("Pickup");
        tabLayout.getTabAt(1).setText("Drop");

    }
}
