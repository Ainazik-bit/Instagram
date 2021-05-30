package com.example.instagram.fragments.like;

import android.widget.ImageView;
import android.widget.TextView;

public class LikeModel {

    private int imageLikeCircle, imageLike;
    private String textLike;
    private long textData;

    public LikeModel() {
    }

    public LikeModel(int imageLikeCircle, int imageLike, String textLike, long textData) {
        this.imageLikeCircle = imageLikeCircle;
        this.imageLike = imageLike;
        this.textLike = textLike;
        this.textData = textData;
    }

    public int getImageLikeCircle() {
        return imageLikeCircle;
    }

    public void setImageLikeCircle(int imageLikeCircle) {
        this.imageLikeCircle = imageLikeCircle;
    }

    public int getImageLike() {
        return imageLike;
    }

    public void setImageLike(int imageLike) {
        this.imageLike = imageLike;
    }

    public String getTextLike() {
        return textLike;
    }

    public void setTextLike(String textLike) {
        this.textLike = textLike;
    }

    public long getTextData() {
        return textData;
    }

    public void setTextData(long textData) {
        this.textData = textData;
    }
}