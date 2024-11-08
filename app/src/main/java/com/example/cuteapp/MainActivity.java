//Cute app
package com.example.cuteapp;

import static android.graphics.Color.BLACK;

import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {
    ImageView imageRight, imageLeft, imageBottom;
    TextView textView1;
    Button clearButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Initialize ImageViews
        imageRight = findViewById(R.id.imageRight);
        imageLeft = findViewById(R.id.imageLeft);
        imageBottom = findViewById(R.id.imageBottom);

        // Initialize TextView
        textView1 = findViewById(R.id.textView1);

        // Initialize Clear Button (fixed declaration)
        clearButton = findViewById(R.id.clearButton);

        // Set click Listener for imageViews left
        imageLeft.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                textView1.setText("You clicked on the cute Dog !");
                clearButton.setVisibility(View.VISIBLE);


                // Check which ImageView was clicked
                if (v.getId() == R.id.imageLeft) {
                    textView1.setTextColor(Color.RED); // Change text color to yellow
                    clearButton.setBackgroundColor(Color.RED); // Change button background color to yellow
                }
            }
        });

        // Set click Listener for imageViews right
        imageRight.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                textView1.setText("You clicked on a Capybara !");
                clearButton.setVisibility(View.VISIBLE);

                // Check which ImageView was clicked
                if (v.getId() == R.id.imageRight) {
                    textView1.setTextColor(BLACK); // Change text color to yellow
                    clearButton.setBackgroundColor(BLACK); // Change button background color to yellow
                }
            }
        });

        // Set click Listener for imageViews bottom
        imageBottom.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                textView1.setText("You clicked on the group of cute Cats !");
                clearButton.setVisibility(View.VISIBLE);

                // Check which ImageView was clicked
                if (v.getId() == R.id.imageBottom) {
                    textView1.setTextColor(Color.BLUE); // Change text color to yellow
                    clearButton.setBackgroundColor(Color.BLUE); // Change button background color to yellow
                }

            }
        });

        // Set click Listener for imageViews
        clearButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                textView1.setText("Please Touch on one of the animal icons");
                clearButton.setVisibility(View.GONE);
                textView1.setTextColor(BLACK);
            }
        });
    }
}
