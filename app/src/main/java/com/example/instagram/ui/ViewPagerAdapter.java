package com.example.instagram.ui;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.viewpager2.adapter.FragmentStateAdapter;

import com.example.instagram.fragments.profile.ProfileFragment;

import java.util.ArrayList;

public class ViewPagerAdapter extends FragmentStateAdapter {

    private ArrayList<Fragment> list = new ArrayList<>();

    public ViewPagerAdapter(@NonNull Fragment fragment) {
        super(fragment);
    }

    public void addListView(ArrayList<Fragment> list){
        this.list.addAll(list);
        notifyDataSetChanged();
    }

    @NonNull
    @Override
    public Fragment createFragment(int position) {
        return list.get(position);
    }

    @Override
    public int getItemCount() {
        return list.size();
    }
}
