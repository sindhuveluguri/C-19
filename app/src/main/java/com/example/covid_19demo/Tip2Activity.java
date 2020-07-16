package com.example.covid_19demo;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Tip2Activity extends AppCompatActivity {

    Button btn_tip2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tip2);
        btn_tip2 = findViewById(R.id.btn_tip2);
        btn_tip2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(Tip2Activity.this,Tip3Activity.class));
            }
        });
    }
}