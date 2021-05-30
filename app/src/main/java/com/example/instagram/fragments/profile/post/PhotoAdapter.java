package com.example.instagram.fragments.profile.post;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.instagram.R;

import java.util.ArrayList;

public class PhotoAdapter extends RecyclerView.Adapter<PhotoAdapter.PhotoViewHolder> {

    private ArrayList<Integer> list = new ArrayList<>();

    public void addListPhoto(ArrayList<Integer> list){
        this.list.addAll(list);
    }

    @NonNull
    @Override
    public PhotoViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_rv_photo, parent, false);
        return new PhotoViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull PhotoViewHolder holder, int position) {
        holder.onBind(list.get(position));
    }

    @Override
    public int getItemCount() {
        return list.size();
    }

    public class PhotoViewHolder extends RecyclerView.ViewHolder {

        private ImageView imagePhoto;

        public PhotoViewHolder(@NonNull View itemView) {
            super(itemView);
            imagePhoto = itemView.findViewById(R.id.image_photo);
        }

        public void onBind(Integer integer) {
            imagePhoto.setImageResource(integer);
        }
    }
}
