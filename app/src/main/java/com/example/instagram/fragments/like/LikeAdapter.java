package com.example.instagram.fragments.like;

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
import java.util.Locale;

public class LikeAdapter extends RecyclerView.Adapter<LikeAdapter.LikeViewHolder> {

    private ArrayList<LikeModel> list = new ArrayList<>();

    public void addList(ArrayList<LikeModel> list){
        this.list.addAll(list);
    }

    @NonNull
    @Override
    public LikeViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_rv_like, parent, false);
        return new LikeViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull LikeViewHolder holder, int position) {
        holder.onBind(list.get(position));
    }

    @Override
    public int getItemCount() {
        return list.size();
    }

    public class LikeViewHolder extends RecyclerView.ViewHolder {

        private TextView textLike, textLikeData;
        private ImageView imageLikeCircle, imageLike;

        public LikeViewHolder(@NonNull View itemView) {
            super(itemView);
            textLike = itemView.findViewById(R.id.text_like);
            textLikeData = itemView.findViewById(R.id.text_like_data);
            imageLike = itemView.findViewById(R.id.image_like);
            imageLikeCircle = itemView.findViewById(R.id.image_like_circle);
        }
        public void onBind(LikeModel likeModel) {
            Glide.with(imageLikeCircle.getContext()).load(likeModel.getImageLikeCircle()).circleCrop().into(imageLikeCircle);

//            Glide.with(imageLikeCircle.getContext())
//                    .load(likeModel.getImageLikeCircle())
//                    .centerCrop()
//                    .circleCrop()
//                    .into(imageLikeCircle);
            textLike.setText(likeModel.getTextLike());
            imageLike.setImageResource(likeModel.getImageLike());
            Date currentDate = new Date();
            SimpleDateFormat timeFormat = new SimpleDateFormat("HH:mm", Locale.getDefault());
            String timeText = timeFormat.format(currentDate);
            textLikeData.setText(timeText);

        }
    }
}
