package com.example.application.Modal;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.widget.Toast;

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
        Toast.makeText(this, "onStart Recycler", Toast.LENGTH_SHORT).show();
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
    @Override
    protected void onStart() {
        Toast.makeText(this, "onStart Recycler", Toast.LENGTH_SHORT).show();
        super.onStart();
    }


    @Override
    protected void onResume() {
        Toast.makeText(this, "onResume Recycler", Toast.LENGTH_SHORT).show();
        super.onResume();



    }


    @Override
    protected void onPause() {

        Toast.makeText(this, "onPause Recycler", Toast.LENGTH_SHORT).show();
        super.onPause();
    }

    @Override
    protected void onStop() {

        Toast.makeText(this, "onStop Recycler", Toast.LENGTH_SHORT).show();
        super.onStop();
    }


    @Override
    protected void onRestart() {

        Toast.makeText(this, "onRestart Recycler", Toast.LENGTH_SHORT).show();
        super.onRestart();
    }

    @Override
    protected void onDestroy() {

        Toast.makeText(this, "onDestroy Recycler", Toast.LENGTH_SHORT).show();
        super.onDestroy();
    }

}