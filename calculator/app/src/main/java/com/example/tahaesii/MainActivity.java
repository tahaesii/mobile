package com.example.tahaesii;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });
        TextView answerText = findViewById(R.id.anwserField);
        EditText firstNumIn = findViewById(R.id.firstInput);
        EditText secNumIn = findViewById(R.id.secInput);
        Button plus = findViewById(R.id.plusBtn);
        Button div = findViewById(R.id.divisionBtn);
        Button minus = findViewById(R.id.minusBtn);
        Button multi = findViewById(R.id.multiBtn);
        plus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int firstNum = Integer.valueOf(firstNumIn.getText().toString());
                int secNum = Integer.valueOf(secNumIn.getText().toString());
                int a = firstNum + secNum;
                answerText.setText(""+a);
            }
        });
        div.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int firstNum = Integer.valueOf(firstNumIn.getText().toString());
                int secNum = Integer.valueOf(secNumIn.getText().toString());
                int b = firstNum / secNum;
                answerText.setText(""+b);
            }
        });

        minus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int firstNum = Integer.valueOf(firstNumIn.getText().toString());
                int secNum = Integer.valueOf(secNumIn.getText().toString());
                int c = firstNum - secNum;
                answerText.setText(""+c);
            }
        });

        multi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int firstNum = Integer.valueOf(firstNumIn.getText().toString());
                int secNum = Integer.valueOf(secNumIn.getText().toString());
                int d = firstNum * secNum;
                answerText.setText(""+d);
            }
        });
    }
}