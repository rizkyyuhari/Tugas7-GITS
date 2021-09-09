package com.example.muhammadrizkyyuhari;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {
    private RecyclerView rv;
    private AdapterRecyclerView homeAdapter;
    private List<Model> model;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initView();
        model = new ArrayList<>();
        homeAdapter = new AdapterRecyclerView(this, model);

        rv.setLayoutManager(new LinearLayoutManager(this));
        rv.setAdapter(homeAdapter);

        setData();

    }

    private void setData() {
        List<Model> dummyData = DataModel.contacList();
        homeAdapter.updateData(dummyData);
    }

    private void initView() {
        rv = findViewById(R.id.recyclerView);
    }
}