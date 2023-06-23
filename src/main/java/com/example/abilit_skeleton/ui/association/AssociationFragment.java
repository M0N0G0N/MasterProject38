package com.example.abilit_skeleton.ui.association;

import android.os.Bundle;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;


import com.example.abilit_skeleton.R;
import com.example.abilit_skeleton.databinding.FragmentAssociationBinding;
import com.example.abilit_skeleton.object.association.Association;
import com.example.abilit_skeleton.object.tag.Tag;
import com.google.android.material.card.MaterialCardView;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;


public class AssociationFragment extends Fragment {

    private FragmentAssociationBinding binding;
    private RecyclerView recyclerView;
    private AssociationAdapter adapter;
    private ArrayList<Association> associationArrayList;

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {

        binding = FragmentAssociationBinding.inflate(inflater, container, false);


        return binding.getRoot();
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        InitializeCardView();
    }

    private void InitializeCardView() {
        recyclerView = (RecyclerView)getView().findViewById(R.id.recyclerViewCard);
        recyclerView.setLayoutManager(new LinearLayoutManager(this.getContext()));
        associationArrayList = new ArrayList<>();

        CreateData();

        adapter = new AssociationAdapter(this.getContext(), associationArrayList);
        recyclerView.setAdapter(adapter);
    }

    private void CreateData() {
        List<Integer> images = Arrays.asList(R.drawable.ic_dashboard_black_24dp);
        List<Tag> tags = Arrays.asList(Tag.Basketball,Tag.Sports);

        Association association = new Association(1, "1", "1", "1", "1", R.drawable.ic_dashboard_black_24dp, "hello comment tu vas", images, tags);
        associationArrayList.add(association);
        Association association2 = new Association(2, "1", "2", "1", "1", R.drawable.ic_home_black_24dp, "hello0000000000000000000000000000000000", images, tags);
        associationArrayList.add(association2);
    }

    @Override
    public void onDestroyView() {
        super.onDestroyView();
        binding = null;
    }


}
