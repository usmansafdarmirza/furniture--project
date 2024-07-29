package com.shashank.platform.furnitureecommerceappui;

import android.content.Intent;
import android.os.Bundle;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.ImageButton;
import android.widget.LinearLayout;
import android.widget.PopupMenu;
import android.widget.RelativeLayout;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import com.google.android.material.floatingactionbutton.FloatingActionButton;

public class Main2Activity extends AppCompatActivity {

    LinearLayout personLinearLayout;
    FloatingActionButton favorite;
    CardView cactusCardView;
    RelativeLayout chairRelativeLayout;
    ImageButton menuButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        personLinearLayout = findViewById(R.id.person_linear_layout);
        favorite = findViewById(R.id.favorite);
        cactusCardView = findViewById(R.id.cactus_card_view);
        chairRelativeLayout = findViewById(R.id.chair_relative_layout);
        menuButton = findViewById(R.id.menu_button);

        personLinearLayout.setOnClickListener(view -> {
            Intent intent = new Intent(getApplicationContext(), Main3Activity.class);
            startActivity(intent);
        });

        favorite.setOnClickListener(view -> {
            Intent intent = new Intent(getApplicationContext(), Main4Activity.class);
            startActivity(intent);
        });

        cactusCardView.setOnClickListener(view -> {
            Intent intent = new Intent(getApplicationContext(), Main5Activity.class);
            startActivity(intent);
        });

        chairRelativeLayout.setOnClickListener(view -> {
            Intent intent = new Intent(getApplicationContext(), Main5Activity.class);
            startActivity(intent);
        });

        menuButton.setOnClickListener(this::onMenuButtonClick); // Set click listener for menu button
    }

    public void onMenuButtonClick(View view) {
        PopupMenu popupMenu = new PopupMenu(this, view);
        MenuInflater inflater = popupMenu.getMenuInflater();
        inflater.inflate(R.menu.contextmenu, popupMenu.getMenu());

        // Set item click listener for the menu items
        popupMenu.setOnMenuItemClickListener(this::onMenuItemClick);

        // Show the popup menu
        popupMenu.show();
    }

    private boolean onMenuItemClick(MenuItem item) {
        switch (item.getItemId()) {
            case R.id.menu_item_home:
                // Handle Home menu item click
                // Example: Navigate to HomeActivity
                Intent homeIntent = new Intent(getApplicationContext(), Main2Activity.class);
                startActivity(homeIntent);
                return true;
            case R.id.menu_item_profile:
                // Handle Profile menu item click
                // Example: Navigate to ProfileActivity
                Intent profileIntent = new Intent(getApplicationContext(), Main3Activity.class);
                startActivity(profileIntent);
                return true;
            default:
                return false;
        }
    }
}
