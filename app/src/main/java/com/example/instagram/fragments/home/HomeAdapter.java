package com.example.instagram.fragments.home;

import android.net.Uri;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.bumptech.glide.Glide;
import com.example.instagram.R;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;

public class HomeAdapter extends RecyclerView.Adapter<HomeAdapter.HomeViewHolder> {

    private ArrayList<HomeModel> list = new ArrayList<>();

    public void addList(ArrayList<HomeModel> list){
        this.list.addAll(list);
        notifyDataSetChanged();
    }
    @NonNull
    @Override
    public HomeViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_rv_home, parent, false);
        return new HomeViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull HomeViewHolder holder, int position) {
        holder.onBind(list.get(position));
    }

    @Override
    public int getItemCount() {
        return list.size();
    }

    public class HomeViewHolder extends RecyclerView.ViewHolder {

        private ImageView imageAcc, imageView;
        private TextView data, textView, nameAcc;

        public HomeViewHolder(@NonNull View itemView) {
            super(itemView);
            imageView = itemView.findViewById(R.id.image_home);
            imageAcc = itemView.findViewById(R.id.image_toolbar_rv);
            textView = itemView.findViewById(R.id.text_home);
            nameAcc = itemView.findViewById(R.id.text_toolbar_rv);
            data = itemView.findViewById(R.id.text_home_data);

        }
        public void onBind(HomeModel homeModel) {
            imageView.setImageResource(homeModel.getImage());
            Glide.with(imageAcc.getContext()).load(homeModel.getImageAcc()).circleCrop().into(imageAcc);
            textView.setText(homeModel.getText());
            nameAcc.setText(homeModel.getText());
            SimpleDateFormat formatter = new SimpleDateFormat("HH:mm  yyyy/MM/dd");
            Date date = new Date(System.currentTimeMillis());
            data.setText(formatter.format(date));
        }
    }
}
