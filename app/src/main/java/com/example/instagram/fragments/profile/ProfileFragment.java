package com.example.instagram.fragments.profile;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.viewpager2.widget.ViewPager2;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import com.bumptech.glide.Glide;
import com.example.instagram.R;
import com.example.instagram.fragments.profile.post.PhotoFragment;
import com.example.instagram.fragments.profile.post.PostsFragment;
import com.example.instagram.ui.ViewPagerAdapter;
import com.google.android.material.tabs.TabLayout;
import com.google.android.material.tabs.TabLayoutMediator;

import java.util.ArrayList;

public class ProfileFragment extends Fragment {

    private ViewPager2 viewPager2;
    private ViewPagerAdapter viewPagerAdapter;
    private TabLayout tabLayout;
    private ArrayList<Fragment> list = new ArrayList<>();
    private ImageView imageProfile;

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        imageProfile = view.findViewById(R.id.image_profile);
        Glide.with(requireContext()).load(R.drawable.profile_foto).centerCrop().circleCrop().into(imageProfile);
        initLIst();
        initViewPager(view);
    }

    private void initLIst() {
        list.add(new PostsFragment());
        list.add(new PhotoFragment());
    }

    private void initViewPager(View view) {
       tabLayout = view.findViewById(R.id.tablayout);
       viewPager2 = view.findViewById(R.id.view_pager);
       viewPagerAdapter = new ViewPagerAdapter(this);
       viewPagerAdapter.addListView(list);
       viewPager2.setAdapter(viewPagerAdapter);
       new TabLayoutMediator(tabLayout, viewPager2, (tab, position) -> tab.setText(initFragment(position))).attach();
    }

    private String initFragment(int position) {
        String value = "";
        switch (position){
            case 0:
                value = "Posts";
                break;
                case 1:
                value = "Photo";
                break;
        }
        return value;
    }



    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        return inflater.inflate(R.layout.fragment_profile, container, false);
    }
}