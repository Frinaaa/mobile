package com.example.program3;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    EditText etnum1,etnum2;
    Button btnAdd,btnSub,btnMul,btnDiv;
    TextView tvResult;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        etnum1=findViewById(R.id.editTextText3);
        etnum2=findViewById(R.id.editTextText4);
        btnAdd=findViewById(R.id.button);
        btnSub=findViewById(R.id.button2);
        btnMul=findViewById(R.id.button3);
        btnDiv=findViewById(R.id.button4);
        tvResult=findViewById(R.id.textView3);

        btnAdd.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                calculate('+');
            }
        });

        btnSub.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                calculate('-');
            }
        });


        btnMul.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                calculate('*');
            }
        });


        btnDiv.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                calculate('/');
            }
        });

    }
    private void calculate(char operator) {
        String input1 = etnum1.getText().toString();
        String input2 = etnum2.getText().toString();

        if (input1.isEmpty() || input2.isEmpty()) {
            Toast.makeText(MainActivity.this, "Please enter both numbers", Toast.LENGTH_SHORT).show();
            return;
        }

        double num1 = Double.parseDouble(input1);
        double num2 = Double.parseDouble(input2);
        double result = 0;

        switch (operator) {
            case '+':
                result = num1 + num2;
                break;
            case '-':
                result = num1 - num2;
                break;
            case '*':
                result = num1 * num2;
                break;
            case '/':
                if (num2 == 0) {
                    Toast.makeText(this, "cannot divided by zero", Toast.LENGTH_SHORT).show();
                    return;
                }
                result = num1 / num2;
                break;
        }

        tvResult.setText("Result: " + result);
    }
}
