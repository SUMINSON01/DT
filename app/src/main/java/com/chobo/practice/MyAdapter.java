package com.chobo.practice;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class MyAdapter extends RecyclerView.Adapter<MyAdapter.MyViewHolder> {

    private ArrayList<Item> mList;
    private LayoutInflater mInflate;
    private Context mContext;

    public MyAdapter(Context context, ArrayList<Item> itme) {
        this.mList = itme;
        this.mInflate = LayoutInflater.from(context);
        this.mContext = context;
    }


    @NonNull
    @Override
    public MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = mInflate.inflate(R.layout.itme, parent, false);
        MyViewHolder viewHolder = new MyViewHolder(view);
        return viewHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull MyViewHolder holder, int position) {
        //binding



        holder.predictTime1.setText("5~7분뒤 도착");
        holder.locationNo1.setText("4");
        holder.routeId.setText(mList.get(position).plateNo1);
        switch(mList.get(position).routeId){
            case "200000115": holder.plateNo1.setText("5100"); break;
            case "234000016": holder.plateNo1.setText("1112"); break;
            case "200000112": holder.plateNo1.setText("7000"); break;
            case "200000103": holder.plateNo1.setText("9"); break;
            case "234000884": holder.plateNo1.setText("1560"); break;
            default:holder.plateNo1.setText("경희대학교 버스가 아닙니다.");
        }




        //Click event
    }

    @Override
    public int getItemCount() {
        return mList.size();
    }

    //ViewHolder
    public static class MyViewHolder extends RecyclerView.ViewHolder {
        public TextView locationNo1;
        public TextView plateNo1;
        public TextView routeId;
        public TextView predictTime1;

        public MyViewHolder(View itemView) {
            super(itemView);

            locationNo1 = itemView.findViewById(R.id.tv_locationNo1);
            plateNo1 = itemView.findViewById(R.id.tv_plateNo1);
            routeId = itemView.findViewById(R.id.tv_routeId);
            predictTime1 = itemView.findViewById(R.id.tv_predictTime1);

        }
    }

}