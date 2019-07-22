package com.booking.parkingss.Activity;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.os.Bundle;
import android.view.GestureDetector;
import android.view.Menu;
import android.view.MenuItem;
import android.view.MotionEvent;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import com.booking.parkingss.R;
import com.booking.parkingss.Utility.BottomNavHelper;
import com.google.android.material.bottomnavigation.BottomNavigationView;

public class MainActivity extends AppCompatActivity {

    Context context = MainActivity.this;
    private static final int ACTIVITY_NUM = 0;
ImageView img_status;
TextView txt_status;
Boolean flag= false;
GestureDetector gestureDetector;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

txt_status=findViewById(R.id.txt_status);
img_status = findViewById(R.id.img_status);

gestureDetector = new GestureDetector(this,new MyGesturesListener() );
        BottomNavigationView bottomNavigationView = findViewById(R.id.bottom_nav_view);
        BottomNavHelper.enableNavigation(context,bottomNavigationView);

        Menu menu = bottomNavigationView.getMenu();
        MenuItem menuItem = menu.getItem(ACTIVITY_NUM);
        menuItem.setChecked(true);

img_status.setOnTouchListener(new View.OnTouchListener() {
    @Override
    public boolean onTouch(View v, MotionEvent event) {

gestureDetector.onTouchEvent(event);
        return true;
    }
});


    }


    class MyGesturesListener extends GestureDetector.SimpleOnGestureListener{
        @Override
        public boolean onSingleTapUp(MotionEvent ev) {
         img_status.setImageResource(R.drawable.ic_unavailable);
         txt_status.setText("Unavailable");
         txt_status.setTextColor(getResources().getColor(R.color.colorRed));
            return true;
        }
        @Override
        public boolean onDoubleTap(MotionEvent ev) {
            img_status.setImageResource(R.drawable.ic_available);
            txt_status.setText("Available");
            txt_status.setTextColor(getResources().getColor(R.color.colorLightGreen));
            return true;
        }
    }
}
