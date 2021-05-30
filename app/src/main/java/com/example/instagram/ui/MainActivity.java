package com.example.instagram.ui;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentManager;

import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.instagram.R;
import com.example.instagram.fragments.addPhoto.AddPhotoFragment;
import com.example.instagram.fragments.home.HomeFragment;
import com.example.instagram.fragments.like.LikeFragment;
import com.example.instagram.fragments.profile.ProfileFragment;
import com.google.android.material.bottomnavigation.BottomNavigationView;

public class MainActivity extends AppCompatActivity {

    private BottomNavigationView bottomNavigationView;
    private FragmentManager manager;
    private ImageView imageToolbar, imageDirect;
    private TextView textToolbar, textLikeToolbar, textProfileToolbar;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        textLikeToolbar = findViewById(R.id.text_toolbar_like);
        textProfileToolbar = findViewById(R.id.text_toolbar_profile);
        imageDirect = findViewById(R.id.image_direct);
        textToolbar = findViewById(R.id.text_toolbar);
        imageToolbar = findViewById(R.id.image_toolbar);
        imageToolbar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent("android.media.action.IMAGE_CAPTURE");
                startActivity(intent);
            }
        });
        bottomNavigationView = findViewById(R.id.bottom_nav);
        manager = getSupportFragmentManager();
        manager.beginTransaction().replace(R.id.container_main, new HomeFragment()).commit();
        bottomNavigationView.setOnNavigationItemSelectedListener(new BottomNavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem item) {
                switch (item.getItemId()){
                    case R.id.item_home:
                        manager.beginTransaction().replace
                                (R.id.container_main, new HomeFragment()).commit();
                        imageToolbar.setVisibility(View.VISIBLE);
                        imageDirect.setVisibility(View.VISIBLE);
                        textToolbar.setVisibility(View.VISIBLE);
                        textLikeToolbar.setVisibility(View.GONE);
                        textProfileToolbar.setVisibility(View.GONE);
                        break;
                    case R.id.item_addPost:
                        manager.beginTransaction().replace
                                (R.id.container_main, new AddPhotoFragment(mRegistry, mGetContent)).commit();
                        imageToolbar.setVisibility(View.GONE);
                        imageDirect.setVisibility(View.GONE);
                        textToolbar.setVisibility(View.GONE);
                        textLikeToolbar.setVisibility(View.GONE);
                        textProfileToolbar.setVisibility(View.GONE);

                        break;
                    case R.id.item_like:
                        manager.beginTransaction().replace
                                (R.id.container_main, new LikeFragment()).commit();
                        imageToolbar.setVisibility(View.GONE);
                        imageDirect.setVisibility(View.GONE);
                        textToolbar.setVisibility(View.GONE);
                        textLikeToolbar.setVisibility(View.VISIBLE);
                        textProfileToolbar.setVisibility(View.GONE);

                        break;
                    case R.id.item_profile:
                        manager.beginTransaction().replace
                                (R.id.container_main, new ProfileFragment()).commit();
                        imageToolbar.setVisibility(View.GONE);
                        imageDirect.setVisibility(View.GONE);
                        textToolbar.setVisibility(View.GONE);
                        textLikeToolbar.setVisibility(View.GONE);
                        textProfileToolbar.setVisibility(View.VISIBLE);
                        break;
                }
                return true;
            }
        });
    }
}