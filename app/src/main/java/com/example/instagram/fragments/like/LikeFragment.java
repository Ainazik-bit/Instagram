package com.example.instagram.fragments.like;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.DividerItemDecoration;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.example.instagram.R;

import java.util.ArrayList;

public class LikeFragment extends Fragment {

    private RecyclerView recyclerLike;
    private LikeAdapter likeAdapter;
    private ArrayList<LikeModel> list;

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        initList();
        initRecycler(view);
    }

    private void initRecycler(View view) {
        recyclerLike = view.findViewById(R.id.recycler_like);
        likeAdapter = new LikeAdapter();
        likeAdapter.addList(list);
        recyclerLike.setAdapter(likeAdapter);
        recyclerLike.addItemDecoration(new DividerItemDecoration(requireContext(), LinearLayoutManager.VERTICAL));

    }

    private void initList() {
        list = new ArrayList<>();
        list.add(new LikeModel(R.drawable.photo_like, R.drawable.foto_home1,"Нравится ваша публикация", new Long(System.currentTimeMillis())));
        list.add(new LikeModel(R.drawable.photo_like, R.drawable.foto_home1,"Нравится ваша публикация", new Long(System.currentTimeMillis())));
        list.add(new LikeModel(R.drawable.photo_like, R.drawable.foto_home1,"Нравится ваша публикация", new Long(System.currentTimeMillis())));
        list.add(new LikeModel(R.drawable.photo_like, R.drawable.foto_home1,"Нравится ваша публикация", new Long(System.currentTimeMillis())));
        list.add(new LikeModel(R.drawable.photo_like, R.drawable.foto_home1,"Нравится ваша публикация", new Long(System.currentTimeMillis())));
        list.add(new LikeModel(R.drawable.photo_like, R.drawable.foto_home1,"Нравится ваша публикация", new Long(System.currentTimeMillis())));
        list.add(new LikeModel(R.drawable.photo_like, R.drawable.foto_home1,"Нравится ваша публикация", new Long(System.currentTimeMillis())));
        list.add(new LikeModel(R.drawable.photo_like, R.drawable.foto_home1,"Нравится ваша публикация", new Long(System.currentTimeMillis())));
        list.add(new LikeModel(R.drawable.photo_like, R.drawable.foto_home1,"Нравится ваша публикация", new Long(System.currentTimeMillis())));
        list.add(new LikeModel(R.drawable.photo_like, R.drawable.foto_home1,"Нравится ваша публикация", new Long(System.currentTimeMillis())));
        list.add(new LikeModel(R.drawable.photo_like, R.drawable.foto_home1,"Нравится ваша публикация", new Long(System.currentTimeMillis())));
        list.add(new LikeModel(R.drawable.photo_like, R.drawable.foto_home1,"Нравится ваша публикация", new Long(System.currentTimeMillis())));
        list.add(new LikeModel(R.drawable.photo_like, R.drawable.foto_home1,"Нравится ваша публикация", new Long(System.currentTimeMillis())));
        list.add(new LikeModel(R.drawable.photo_like, R.drawable.foto_home1,"Нравится ваша публикация", new Long(System.currentTimeMillis())));

    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        return inflater.inflate(R.layout.fragment_like, container, false);

    }
}