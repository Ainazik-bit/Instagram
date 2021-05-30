package com.example.instagram.fragments.profile.post;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.instagram.R;

import java.util.ArrayList;
import java.util.Collections;

public class PhotoFragment extends Fragment {


    private RecyclerView recyclerView;
    private PhotoAdapter photoAdapter;
    private ArrayList<Integer> list;

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        initList();
        initRecycler(view);
    }

    private void initRecycler(View view) {
        recyclerView = view.findViewById(R.id.recycler_photo);
        photoAdapter = new PhotoAdapter();
        photoAdapter.addListPhoto(list);
        recyclerView.setAdapter(photoAdapter);
    }

    private void initList() {
        list = new ArrayList<>();
        list.add(R.drawable.foto_home1);
        list.add(R.drawable.foto_home1);
        list.add(R.drawable.foto_home1);
        list.add(R.drawable.foto_home1);
        list.add(R.drawable.foto_home1);
        list.add(R.drawable.foto_home1);
        list.add(R.drawable.foto_home1);
        list.add(R.drawable.foto_home1);
        list.add(R.drawable.foto_home1);
        list.add(R.drawable.foto_home1);
        list.add(R.drawable.foto_home1);
        list.add(R.drawable.foto_home1);
        list.add(R.drawable.foto_home1);
        list.add(R.drawable.foto_home1);
        list.add(R.drawable.foto_home1);
        list.add(R.drawable.foto_home1);
        list.add(R.drawable.foto_home1);
        list.add(R.drawable.foto_home1);
        list.add(R.drawable.foto_home1);
        list.add(R.drawable.foto_home1);
        list.add(R.drawable.foto_home1);
        list.add(R.drawable.foto_home1);
        list.add(R.drawable.foto_home1);
        list.add(R.drawable.foto_home1);
        list.add(R.drawable.foto_home1);
        list.add(R.drawable.foto_home1);
        list.add(R.drawable.foto_home1);
        list.add(R.drawable.foto_home1);
        list.add(R.drawable.foto_home1);
        list.add(R.drawable.foto_home1);
        list.add(R.drawable.foto_home1);
        list.add(R.drawable.foto_home1);
        list.add(R.drawable.foto_home1);
        list.add(R.drawable.foto_home1);
        list.add(R.drawable.foto_home1);
        list.add(R.drawable.foto_home1);
        list.add(R.drawable.foto_home1);
        list.add(R.drawable.foto_home1);
        list.add(R.drawable.foto_home1);
        list.add(R.drawable.foto_home1);

    }
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        return inflater.inflate(R.layout.fragment_photo, container, false);
    }
}