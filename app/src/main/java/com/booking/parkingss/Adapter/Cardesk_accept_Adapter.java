package com.booking.parkingss.Adapter;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AlertDialog;
import androidx.cardview.widget.CardView;
import androidx.recyclerview.widget.RecyclerView;

import com.booking.parkingss.Activity.Status;
import com.booking.parkingss.Model.Users;
import com.booking.parkingss.R;

import java.util.List;

public class Cardesk_accept_Adapter extends  RecyclerView.Adapter<Cardesk_accept_Adapter.MyViewHolder> {

    private Context mContext;
    private List<Users> usersList;


    public Cardesk_accept_Adapter(Context mContext, List<Users> usersList) {
        this.mContext = mContext;
        this.usersList = usersList;

    }

    @NonNull
    @Override
    public MyViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        View itemView = LayoutInflater.from(mContext)
                .inflate(R.layout.fragment_cardesk_status_inflate, viewGroup, false);

        return new MyViewHolder(itemView);


    }

    @Override
    public void onBindViewHolder(@NonNull final MyViewHolder myViewHolder, int i) {
//        UniversalImageLoader universalImageLoader = new UniversalImageLoader(mContext);
//        ImageLoader.getInstance().init(universalImageLoader.getConfig());


        Users users = usersList.get(i);
//
//        UniversalImageLoader.setImage(amenities.getAmenities_img(),myViewHolder.img_amenities,null,"https://");


myViewHolder.accept.setOnClickListener(new View.OnClickListener() {
    @Override
    public void onClick(View v) {
        AlertDialog.Builder ab=new AlertDialog.Builder(mContext);

        final View v1= LayoutInflater.from(mContext).inflate(R.layout.floating_view_keys_taken,null,false);

        Button b=v1.findViewById(R.id.ok);
        b.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(mContext, Status.class);
                mContext.startActivity(intent);

            }
        });

        ab.setView(v1);

        ab.show();



    }
});



    }



    @Override
    public int getItemCount() {

        return usersList.size() ;
    }

    public class MyViewHolder extends RecyclerView.ViewHolder {

        TextView name,type,date,income,time;
        ImageView img_profile;
        Button accept;

        CardView card3;
        public MyViewHolder(@NonNull View itemView) {
            super(itemView);

accept = itemView.findViewById(R.id.btn_accept);
        }

    }
}
