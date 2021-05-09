package com.example.serandibtours;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RelativeLayout;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.cardview.widget.CardView;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class RecViewAdapter  extends RecyclerView.Adapter<RecViewAdapter.ViewHolder>{
    private ArrayList<TourPlan> tourPlans = new ArrayList<>();
    private Context context;
    public RecViewAdapter(Context context) {
        this.context = context;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.tour_plan_layout,parent,false);
        ViewHolder holder = new ViewHolder(view);
        return holder;
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        holder.destination.setText(tourPlans.get(position).getDestination());
        holder.noOfDays.setText(tourPlans.get(position).getNoOfDays());
        holder.date.setText(tourPlans.get(position).getDate());
        holder.parent.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(context, tourPlans.get(position).getDestination()+"Selected",Toast.LENGTH_LONG).show();
            }
        });
    }

    @Override
    public int getItemCount() {
        return tourPlans.size();
    }
    //to set values to array from mainActivity
    public void setTourPlans(ArrayList<TourPlan> tourPlans){
        this.tourPlans=tourPlans;
        notifyDataSetChanged();
    }

    //to create a recyclerview
    public class ViewHolder extends RecyclerView.ViewHolder{
        private TextView destination,date,noOfDays;
        private CardView parent;
        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            destination = itemView.findViewById(R.id.destination);
            parent = itemView.findViewById(R.id.parent);
            date = itemView.findViewById(R.id.date);
            noOfDays = itemView.findViewById(R.id.noOfDays);
        }
    }
}
