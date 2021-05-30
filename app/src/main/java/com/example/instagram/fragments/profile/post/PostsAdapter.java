package com.example.instagram.fragments.profile.post;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.instagram.R;

import java.util.ArrayList;

public class PostsAdapter extends RecyclerView.Adapter<PostsAdapter.PostViewHolder> {

    private ArrayList<Integer> list = new ArrayList<>();

    public void addListPhoto(ArrayList<Integer> list){
        this.list.addAll(list);
    }
    @NonNull
    @Override
    public PostViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_rv_posts, parent, false);
        return new PostViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull PostViewHolder holder, int position) {
        holder.onBind(list.get(position));
    }

    @Override
    public int getItemCount() {
        return list.size();
    }

    public class PostViewHolder extends RecyclerView.ViewHolder {

        private ImageView imagePosts;

        public PostViewHolder(@NonNull View itemView) {
            super(itemView);
            imagePosts = itemView.findViewById(R.id.image_posts);
        }


        public void onBind(Integer integer) {
            imagePosts.setImageResource(integer);
        }
    }
}
