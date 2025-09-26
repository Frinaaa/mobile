package com.example.program8;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button btnSecond = findViewById(R.id.btnSecond);

        btnSecond.setOnClickListener(v-> {
                // Navigate to SecondActivity
                startActivity(new Intent(MainActivity.this, SecondActivity.class));
            }
        );
    }
}