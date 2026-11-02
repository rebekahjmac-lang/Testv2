package com.example.myfirstapp;

import android.app.Activity;
import android.os.Bundle;
import android.graphics.Color;
import android.graphics.Typeface;
import android.view.Gravity;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.TextView;

public class MainActivity extends Activity {
    private int taps = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        LinearLayout screen = new LinearLayout(this);
        screen.setOrientation(LinearLayout.VERTICAL);
        screen.setGravity(Gravity.CENTER);
        screen.setPadding(32, 32, 32, 32);
        screen.setBackgroundColor(Color.rgb(245, 242, 250));

        TextView title = new TextView(this);
        title.setText("MY FIRST APP");
        title.setTextSize(29);
        title.setTypeface(Typeface.DEFAULT, Typeface.BOLD);
        title.setTextColor(Color.rgb(45, 35, 65));
        title.setGravity(Gravity.CENTER);

        TextView message = new TextView(this);
        message.setText("Welcome! Your app is working.");
        message.setTextSize(18);
        message.setTextColor(Color.rgb(75, 65, 90));
        message.setGravity(Gravity.CENTER);
        message.setPadding(0, 28, 0, 28);

        Button button = new Button(this);
        button.setText("TAP ME");
        button.setOnClickListener(v -> {
            taps++;
            message.setText("You tapped the button " + taps + (taps == 1 ? " time!" : " times!"));
        });

        screen.addView(title);
        screen.addView(message);
        screen.addView(button);
        setContentView(screen);
    }
}
