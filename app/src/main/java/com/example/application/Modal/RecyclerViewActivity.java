package com.example.application.Modal;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import com.example.application.MyAdapter.Adapter;
import com.example.application.R;

import java.util.ArrayList;

public class RecyclerViewActivity extends AppCompatActivity {

    ArrayList<UserModal>arrayList;

    Adapter adapter;

    RecyclerView recyclerView;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_recycler_view);

        arrayList=new ArrayList<>();
        arrayList.add(new UserModal("Rashindra","Janakpur"));
        arrayList.add(new UserModal("Tejas","Kathmandu"));
        arrayList.add(new UserModal("Aarav","Biratnagar"));
        arrayList.add(new UserModal("AAyu","Pokhara"));
        arrayList.add(new UserModal("Somnath","Janakpur"));


        adapter=new Adapter(getApplicationContext(),arrayList);


        recyclerView=findViewById(R.id.recyclerview);

        recyclerView.setLayoutManager(new LinearLayoutManager(this));

        recyclerView.setAdapter(adapter);

    }
}