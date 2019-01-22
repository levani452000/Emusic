package com.example.firebaseauthentication;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.LinearLayout;

public class HomePageActivity extends AppCompatActivity {
    private ImageButton buttonprofile;
    private ImageButton buttonmusic;
    private ImageButton buttonfavourites;
    private ImageButton buttonsettings;
    private ImageButton buttonalbums;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home_page);
        buttonprofile = findViewById(R.id.profile_button);
        buttonprofile.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openProfileActivity();

            }
        });
        buttonmusic = findViewById(R.id.music_button);
        buttonmusic.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openMusicActivity();

            }
        });
        buttonfavourites = findViewById(R.id.favourites_button);
        buttonfavourites.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openFavouritesActivity();
            }
        });

        buttonalbums = findViewById(R.id.albums_button);
        buttonalbums.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openAlbumsActivity();
            }
        });
        buttonsettings = findViewById(R.id.settings_button);
        buttonsettings.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openSettingsActivity();
            }
        });
    }

    public void openProfileActivity() {
        Intent intent = new Intent(this, ProfileActivity.class);
        startActivity(intent);
    }

    public void openMusicActivity() {
        Intent intent = new Intent(this, MusicActivity.class);
        startActivity(intent);
    }

    public void openFavouritesActivity() {
        Intent intent = new Intent(this, FavouritesActivity.class);
        startActivity(intent);
    }
    public void openAlbumsActivity() {
        Intent intent = new Intent(this, AlbumsActivity.class);
        startActivity(intent);
    }
    public void openSettingsActivity() {
        Intent intent = new Intent(this, SettingsActivity.class);
        startActivity(intent);
    }
}

