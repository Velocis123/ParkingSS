package com.booking.parkingss.Adapter;

import android.content.Context;
import android.media.Image;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.booking.parkingss.Model.Users;
import com.booking.parkingss.R;

import java.util.List;

public class Service_details_adapter extends  RecyclerView.Adapter<Service_details_adapter.MyViewHolder> {

    private Context mContext;
    private List<Users> usersList;

    public Service_details_adapter(Context mContext, List<Users> amenitiesList) {
        this.mContext = mContext;
        this.usersList = amenitiesList;
    }

    @NonNull
    @Override
    public MyViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        View itemView = LayoutInflater.from(mContext)
                .inflate(R.layout.fragment_income, viewGroup, false);

        return new MyViewHolder(itemView);


    }

    @Override
    public void onBindViewHolder(@NonNull MyViewHolder myViewHolder, int i) {
//        UniversalImageLoader universalImageLoader = new UniversalImageLoader(mContext);
//        ImageLoader.getInstance().init(universalImageLoader.getConfig());
        Users users = usersList.get(i);
//
//        UniversalImageLoader.setImage(amenities.getAmenities_img(),myViewHolder.img_amenities,null,"https://");

        myViewHolder.name.setText(users.getName());
        myViewHolder.type.setText(users.getType());
        myViewHolder.vtype.setText(users.getVehicle_type());
        myViewHolder.income.setText(users.getCharges() + " /-");
        myViewHolder.img_profile.setImageResource(users.getImg_demo());


    }



    @Override
    public int getItemCount() {

        return usersList.size() ;
    }

    public class MyViewHolder extends RecyclerView.ViewHolder {

TextView name,type,vtype,income;
ImageView img_profile;


        public MyViewHolder(@NonNull View itemView) {
            super(itemView);
name = itemView.findViewById(R.id.txt_name);
            type = itemView.findViewById(R.id.txt_type);
            vtype = itemView.findViewById(R.id.txt_vtype);
            income = itemView.findViewById(R.id.txt_income);
            img_profile = itemView.findViewById(R.id.img_profile);

        }


    }






}