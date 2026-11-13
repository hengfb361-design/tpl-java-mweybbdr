package com.example.tjava;

import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {
    private int taps = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        final TextView label = findViewById(R.id.label);
        Button action = findViewById(R.id.action);
        action.setOnClickListener(v -> {
            taps++;
            label.setText("Taps: " + taps);
        });
    }
}
