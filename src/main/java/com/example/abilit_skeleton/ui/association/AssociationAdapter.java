package com.example.abilit_skeleton.ui.association;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.abilit_skeleton.R;
import com.example.abilit_skeleton.object.association.Association;

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
        View view = LayoutInflater.from(context).inflate(R.layout.asso_card_view,parent, false);
        return new AssociationHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull AssociationHolder holder, int position) {
        Association association = associations.get(position);
        holder.setDetails(association);
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
