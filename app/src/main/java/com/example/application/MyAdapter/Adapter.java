package com.example.application.MyAdapter;

import android.annotation.SuppressLint;
import android.content.Context;
import android.text.Layout;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.application.Modal.UserModal;
import com.example.application.R;

import java.util.ArrayList;

public class Adapter extends RecyclerView.Adapter<Adapter.AdapterViewHolder>{

    private Context context;
    private ArrayList<UserModal>userModals;

    public Adapter() {
    }

    /*
    * This constructor take two parameter context and usermodals .userModals for store all data
    * @Param context
    * @Param userModals
    * */

    public Adapter(Context context, ArrayList<UserModal> userModals) {
        this.context = context;
        this.userModals = userModals;
    }

    @NonNull
    @Override
    public AdapterViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {

        View view=LayoutInflater.from(context).inflate(R.layout.list_item,parent,false);
        return new AdapterViewHolder(view);
    }

    @SuppressLint("ResourceAsColor")
    @Override
    public void onBindViewHolder(@NonNull AdapterViewHolder holder, int position) {
        holder.name.setText(userModals.get(position).getName());
        holder.address.setText(userModals.get(position).getAddress());
    }

    @Override
    public int getItemCount() {
        return userModals.size();
    }

    public class AdapterViewHolder extends RecyclerView.ViewHolder {

        private TextView name,address;

        public AdapterViewHolder(@NonNull View itemView) {
            super(itemView);

            name=itemView.findViewById(R.id.name_text_view);
            address=itemView.findViewById(R.id.address_text_view);
        }
    }
}
