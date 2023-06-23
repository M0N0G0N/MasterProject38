package com.example.abilit_skeleton.ui.association;

import static androidx.core.app.ActivityCompat.startActivityForResult;
import static androidx.core.content.ContextCompat.startActivity;

import android.content.Context;
import android.content.Intent;
import android.app.Activity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.abilit_skeleton.MainActivity;
import com.example.abilit_skeleton.R;
import com.example.abilit_skeleton.object.association.Association;
import com.example.abilit_skeleton.ui.dashboard.DashboardFragment;
import com.google.android.material.card.MaterialCardView;

import java.util.ArrayList;

public class AssociationAdapter extends RecyclerView.Adapter<AssociationAdapter.AssociationHolder> {

    // AssociationAdapter class
    private Context context;
    private ArrayList<Association> associations;

    // Constructor
    public AssociationAdapter(Context context, ArrayList<Association> associations) {
        this.context = context;
        this.associations = associations;
    }

    @NonNull
    @Override
    public AssociationHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(context).inflate(R.layout.asso_card,parent, false);
        return new AssociationHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull AssociationHolder holder, int position) {
        Association association = associations.get(position);
        holder.setDetails(association);

        holder.itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(context,"you clicked: " +association.getId(), Toast.LENGTH_SHORT ).show();
                Intent myIntent = new Intent(context, MainActivity.class);
                context.startActivity(myIntent);
            }
        });
    }

    @Override
    public int getItemCount() {
        return associations.size();
    }

    // View holder : AssociationHolder
    class AssociationHolder extends RecyclerView.ViewHolder{
        private ImageView logo;
        private TextView name, desc;

        AssociationHolder(View itemView){
            super(itemView);
            logo = itemView.findViewById(R.id.assoLogo);
            name = itemView.findViewById(R.id.assoName);
            desc = itemView.findViewById(R.id.assoDesc);
        }

        void setDetails(Association association){
            logo.setImageResource(association.getLogo());
            name.setText(association.getName());
            desc.setText(association.getDesc());
        }
    }
}
