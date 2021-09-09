package com.example.muhammadrizkyyuhari;

import android.content.Context;
import android.view.Display;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

public class AdapterRecyclerView extends RecyclerView.Adapter<AdapterRecyclerView.ViewHolder> {

    private List<Model> model = new ArrayList<>();
    private Context context;

    AdapterRecyclerView(Context context, List<Model> model) {
        this.context = context;
        this.model = model;
    }

    public void updateData(List<Model> contact) {
        this.model = contact;
        notifyDataSetChanged();
    }


    static class ViewHolder extends RecyclerView.ViewHolder {

        TextView textViewName;
        TextView textViewPhoneNumber;

        ViewHolder(View v) {

            super(v);

            textViewName = v.findViewById(R.id.name);
            textViewPhoneNumber = v.findViewById(R.id.phonenumber);
        }
    }

    @NonNull
    @Override
    public AdapterRecyclerView.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {

        View view = LayoutInflater.from(context).inflate(R.layout.list_item, parent, false);

        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(ViewHolder holder, int position) {

        holder.textViewName.setText(model.get(position).getName());
        holder.textViewPhoneNumber.setText(model.get(position).getPhoneNumber());
    }

    @Override
    public int getItemCount() {

        return model.size();
    }
}