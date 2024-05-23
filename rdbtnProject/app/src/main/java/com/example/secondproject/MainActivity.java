package com.example.secondproject;

import android.os.Bundle;
import android.widget.CompoundButton;
import android.widget.ImageView;
import android.widget.RadioButton;
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
        RadioButton apple = findViewById(R.id.appleBtn);
        RadioButton lamp = findViewById(R.id.lampBtn);
        RadioButton glasses = findViewById(R.id.glassesBtn);
        RadioButton tv = findViewById(R.id.tvBtn);
        TextView text = findViewById(R.id.meaningText);
        ImageView image = findViewById(R.id.imagePlace);

        apple.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if(isChecked){
                    text.setText("سیب");
                    image.setImageResource(R.drawable.apple);
                }
            }
        });

        lamp.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if(isChecked){
                    text.setText("لامپ");
                    image.setImageResource(R.drawable.lamp);
                }
            }
        });

        glasses.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if(isChecked){
                    text.setText("عینک");
                    image.setImageResource(R.drawable.glasses);
                }
            }
        });

        tv.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if(isChecked){
                    text.setText("تلویزیون");
                    image.setImageResource(R.drawable.tv);
                }
            }
        });
    }
}