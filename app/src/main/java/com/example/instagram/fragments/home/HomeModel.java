package com.example.instagram.fragments.home;

public class HomeModel {

    private int image;
    private String text;
    private long data;
    private int imageAcc;
    private String nameAcc;

    public HomeModel() {
    }

    public HomeModel(int image, String text, long data, int imageAcc, String nameAcc) {
        this.image = image;
        this.text = text;
        this.data = data;
        this.imageAcc = imageAcc;
        this.nameAcc = nameAcc;
    }

    public int getImage() {
        return image;
    }

    public void setImage(int image) {
        this.image = image;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public long getData() {
        return data;
    }

    public void setData(long data) {
        this.data = data;
    }

    public int getImageAcc() {
        return imageAcc;
    }

    public void setImageAcc(int imageAcc) {
        this.imageAcc = imageAcc;
    }

    public String getNameAcc() {
        return nameAcc;
    }

    public void setNameAcc(String nameAcc) {
        this.nameAcc = nameAcc;
    }
}
