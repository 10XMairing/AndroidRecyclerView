package com.androidpopcorn.tenx.recyclerviewexample;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    RecyclerView recyclerView;
    CustomAdapter adapter;
    private List<String> mList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        //initialize the list with some dummy text
        mList = new ArrayList<>();
        mList.add("John");
        mList.add("Richard");
        mList.add("Albert");
        mList.add("Rahul");
        mList.add("Abishek");
        mList.add("Toto");
        mList.add("Andrew");
        mList.add("Rakesh");
        mList.add("Rakesh");
        mList.add("Rakesh");


        recyclerView = findViewById(R.id.recycler);
        adapter = new CustomAdapter(this, mList);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));

        recyclerView.setAdapter(adapter);


    }
}
