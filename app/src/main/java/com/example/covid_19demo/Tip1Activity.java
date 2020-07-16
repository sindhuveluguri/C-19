package com.example.covid_19demo;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Tip1Activity extends AppCompatActivity {

    Button btn_tip1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tip1);

        btn_tip1 = findViewById(R.id.btn_tip1);
        btn_tip1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(Tip1Activity.this,Tip2Activity.class));
            }
        });
    }
}