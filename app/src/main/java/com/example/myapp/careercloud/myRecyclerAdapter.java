package com.example.myapp.careercloud;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.myapp.R;

import java.util.ArrayList;

public class myRecyclerAdapter extends RecyclerView.Adapter<myRecyclerAdapter.ViewHolder> {
    private ArrayList<Job> data;

    public myRecyclerAdapter() {

    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View v = LayoutInflater.from(parent.getContext()).inflate(R.layout.card_layout, parent, false); //CardView inflated as RecyclerView list item
        ViewHolder viewHolder = new ViewHolder(v);
        return viewHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        holder.name.setText(data.get(position).getName());
        holder.location.setText("Location: " + data.get(position).getLocation());

    }

    @Override
    public int getItemCount() {
        if (data == null)
            return 0;
        else
            return data.size();
    }

    public void setData(ArrayList<Job> data) {
        this.data = data;
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        TextView name;
        TextView location;


        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            name = itemView.findViewById(R.id.card_name);
            location = itemView.findViewById(R.id.card_location);
        }
    }
}