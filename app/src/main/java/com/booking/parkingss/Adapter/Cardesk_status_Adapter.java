package com.booking.parkingss.Adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.cardview.widget.CardView;
import androidx.recyclerview.widget.RecyclerView;

import com.booking.parkingss.Model.Users;
import com.booking.parkingss.R;
import com.booking.parkingss.Utility.MyCustomListener;

import java.util.List;

public class Cardesk_status_Adapter extends  RecyclerView.Adapter<Cardesk_status_Adapter.MyViewHolder> {

    private Context mContext;
    private List<Users> usersList;
    private MyCustomListener listener;

    public Cardesk_status_Adapter(Context mContext, List<Users> usersList, MyCustomListener listener) {
        this.mContext = mContext;
        this.usersList = usersList;
        this.listener = listener;
    }

    @NonNull
    @Override
    public MyViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        View itemView = LayoutInflater.from(mContext)
                .inflate(R.layout.fragment_cardesk_req_inflate, viewGroup, false);

        return new MyViewHolder(itemView);


    }

    @Override
    public void onBindViewHolder(@NonNull MyViewHolder myViewHolder, int i) {
//        UniversalImageLoader universalImageLoader = new UniversalImageLoader(mContext);
//        ImageLoader.getInstance().init(universalImageLoader.getConfig());

        myViewHolder.bind(usersList.get(i), listener);
        Users users = usersList.get(i);
//
//        UniversalImageLoader.setImage(amenities.getAmenities_img(),myViewHolder.img_amenities,null,"https://");






    }



    @Override
    public int getItemCount() {

        return usersList.size() ;
    }

    public class MyViewHolder extends RecyclerView.ViewHolder {

        TextView name,type,date,income,time;
        ImageView img_profile;


        CardView card3;
        public MyViewHolder(@NonNull View itemView) {
            super(itemView);

        }
        public void bind(final Users hotel, final MyCustomListener listener) {

            itemView.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    listener.onItemClick(hotel);
                }
            });
        }

    }
}
