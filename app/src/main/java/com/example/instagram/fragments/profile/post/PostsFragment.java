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

public class PostsFragment extends Fragment {

    private RecyclerView recyclerView;
    private PostsAdapter postsAdapter;
    private ArrayList<Integer> list;

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        initList();
        initRecycler(view);
    }

    private void initRecycler(View view) {
        recyclerView = view.findViewById(R.id.recycler_posts);
        postsAdapter = new PostsAdapter();
        postsAdapter.addListPhoto(list);
        recyclerView.setAdapter(postsAdapter);
    }

    private void initList() {
        list = new ArrayList<>();
        list.add(R.drawable.profile_foto);
        list.add(R.drawable.profile_foto);
        list.add(R.drawable.profile_foto);
        list.add(R.drawable.profile_foto);
        list.add(R.drawable.profile_foto);
        list.add(R.drawable.profile_foto);
        list.add(R.drawable.profile_foto);
        list.add(R.drawable.profile_foto);
        list.add(R.drawable.profile_foto);
        list.add(R.drawable.profile_foto);
        list.add(R.drawable.profile_foto);
        list.add(R.drawable.profile_foto);
        list.add(R.drawable.profile_foto);
        list.add(R.drawable.profile_foto);
        list.add(R.drawable.profile_foto);
        list.add(R.drawable.profile_foto);
        list.add(R.drawable.profile_foto);
        list.add(R.drawable.profile_foto);
        list.add(R.drawable.profile_foto);
        list.add(R.drawable.profile_foto);
        list.add(R.drawable.profile_foto);

    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        return inflater.inflate(R.layout.fragment_posts, container, false);
    }
}