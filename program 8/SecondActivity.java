package com.example.program8;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import androidx.appcompat.app.AppCompatActivity;

public class SecondActivity extends AppCompatActivity {

    Button btnBack;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        btnBack = findViewById(R.id.btn);

        btnBack.setOnClickListener(v -> {
                finish(); // go back to MainActivity
            }
        );
    }
}