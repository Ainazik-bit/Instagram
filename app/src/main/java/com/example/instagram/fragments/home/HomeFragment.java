package com.example.instagram.fragments.home;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.instagram.R;

import java.util.ArrayList;
import java.util.Date;

public class HomeFragment extends Fragment {

    private RecyclerView recyclerView;
    private HomeAdapter homeAdapter;
    private ArrayList<HomeModel> list;

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        initList();
        initRecycler(view);
    }

    private void initRecycler(View view) {
        recyclerView = view.findViewById(R.id.recycler_home);
        //recyclerView.setLayoutManager(new LinearLayoutManager(getContext()));
        homeAdapter = new HomeAdapter();
        homeAdapter.addList(list);
        recyclerView.setAdapter(homeAdapter);
    }

    private void initList() {
        list = new ArrayList<>();
        list.add(new HomeModel(R.drawable.foto_home1, "Manas University",  new Long(System.currentTimeMillis()), R.drawable.foto_home1, "lonnar"));
        list.add(new HomeModel(R.drawable.foto_home1, "Manas University",  new Long(System.currentTimeMillis()), R.drawable.foto_home1, "lonnar"));
        list.add(new HomeModel(R.drawable.foto_home1, "Manas University",  new Long(System.currentTimeMillis()), R.drawable.foto_home1, "lonnar"));
        list.add(new HomeModel(R.drawable.foto_home1, "Manas University",  new Long(System.currentTimeMillis()), R.drawable.foto_home1, "lonnar"));
        list.add(new HomeModel(R.drawable.foto_home1, "Manas University",  new Long(System.currentTimeMillis()), R.drawable.foto_home1, "lonnar"));
        list.add(new HomeModel(R.drawable.foto_home1, "Manas University",  new Long(System.currentTimeMillis()), R.drawable.foto_home1, "lonnar"));
        list.add(new HomeModel(R.drawable.foto_home1, "Manas University",  new Long(System.currentTimeMillis()), R.drawable.foto_home1, "lonnar"));
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        return inflater.inflate(R.layout.fragment_home, container, false);

    }

}