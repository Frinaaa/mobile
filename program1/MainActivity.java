package com.example.program1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    Button button2;
    EditText editTextText3;
    EditText editTextTextPassword2;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        button2=findViewById(R.id.button2);
        editTextText3=findViewById(R.id.editTextText3);
        editTextTextPassword2=findViewById(R.id.editTextTextPassword2);
        final String uname="frina";
        final String pass="frina@123";

        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(editTextText3.getText().toString().equals(uname) && editTextTextPassword2.getText().toString().equals(pass)) {
                    Toast.makeText( MainActivity.this,"login successful",Toast.LENGTH_SHORT).show();
                } else {
                    Toast.makeText(MainActivity.this,"login failed",Toast.LENGTH_SHORT).show();
                }
            }
        });
        
    }
}