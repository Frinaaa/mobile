package com.example.program3;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    private static String TAG="ACTIVITY";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Toast.makeText(this,"onCreate",Toast.LENGTH_SHORT).show();
        Button btn = findViewById(R.id.button);
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(MainActivity.this,MainActivity2.class));
            }
        });
        Log.d(TAG,"onCreate");
    }
    private  void butOnClick(){
        startActivity(new Intent(MainActivity.this,MainActivity2.class));
    }
    @Override
    protected void onStart() {
        super.onStart();
        Log.d(TAG,"Activity is about to become visible");
        Toast.makeText(this,"onStart",Toast.LENGTH_SHORT).show();
    }
    @Override
    protected void onResume() {
        super.onResume();
        Log.d(TAG,"onResume:Activity has become visible(resumed)");
        Toast.makeText(this,"onResume",Toast.LENGTH_SHORT).show();
    }
    @Override
    protected void onPause() {
        super.onPause();
        Log.d(TAG,"another activity taking focus(this activity about to be paused)");
        Toast.makeText(this,"onPause",Toast.LENGTH_SHORT).show();
    }
    @Override
    protected void onStop() {
        super.onStop();
        Log.d(TAG,"onStop:Activity is no longer visible(it is now stopped)");
        Toast.makeText(this,"onStop",Toast.LENGTH_SHORT).show();
    }
    @Override
    protected void onRestart() {
        super.onStop();
        Log.d(TAG,"onRestart:Activity is being restarted after being stopped");
        Toast.makeText(this,"onRestart",Toast.LENGTH_SHORT).show();
    }
    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.d(TAG,"onDestroy:Activity is about to be destroyed");
        Toast.makeText(this,"onDestroy",Toast.LENGTH_SHORT).show();
    }
}